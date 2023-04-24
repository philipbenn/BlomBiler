package com.example.blombiler.repository;

import com.example.blombiler.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CarRepo {
    @Autowired
    JdbcTemplate template;

    public List<Car> getCars() {
        String sql = "SELECT * FROM car";
        return template.query(sql, new BeanPropertyRowMapper<>(Car.class));
    }

    public Car getCar(int car_id) {
        String sql = "SELECT * FROM car WHERE car_id = ?";
        Car car = template.queryForObject(sql, new BeanPropertyRowMapper<>(Car.class), car_id);
        return car;
    }
}
