package com.example.springfreemarket.country;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {
    private final JdbcTemplate jdbcTemplate;


    public CountryService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Country> findAll(){
        String sql = "select * from countries";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Country.class));
    }
}
