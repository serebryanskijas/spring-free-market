package com.example.springfreemarket.city;

import com.example.springfreemarket.country.Country;
import com.example.springfreemarket.state.State;
import com.example.springfreemarket.views.CityState;
import com.example.springfreemarket.views.StateCountry;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {
    private final JdbcTemplate jdbcTemplate;


    public CityService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<City> findAll(){
        String sql = "select * from cities limit 100";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(City.class));
    }

    public List<CityState> findCitiesStates(){
        String sql = "select c.id, c.name, c.latitude, c.longitude, s.name as stateName from cities c join states s on s.id=c.state_id limit 100;";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(CityState.class));
    }

    public List<City> search(String name){
        String sql = "select * from cities where name like '"+name+"%'";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(City.class));
    }
}
