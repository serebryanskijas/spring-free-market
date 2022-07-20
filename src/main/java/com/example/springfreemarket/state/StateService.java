package com.example.springfreemarket.state;

import com.example.springfreemarket.country.Country;
import com.example.springfreemarket.views.StateCountry;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StateService {
    private final JdbcTemplate jdbcTemplate;

    public StateService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<State> findAll(){
        String sql = "select * from states";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(State.class));
    }

    public List<StateCountry> findStatesCountries(){
        String sql = "select s.id, s.name, c.name as countryName from states s join countries c on c.id=s.country_id order by s.id;";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(StateCountry.class));
    }

    public List<State> search(String name){
        String sql = "select * from states where name like '"+name+"'";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(State.class));
    }
}
