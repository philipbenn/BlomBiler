package com.example.blombiler.repository;

import com.example.blombiler.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerRepo {
    @Autowired
    JdbcTemplate template;

    public void addCustomerAccount(Customer customer){
        String sql = "INSERT INTO customer (customer_id, customer_first_name, customer_last_name, customer_password, customer_email) VALUES (?, ?, ?, ?, ?)";
        template.update(sql, customer.getCustomer_id(), customer.getCustomer_first_name(), customer.getCustomer_last_name(), customer.getCustomer_password(), customer.getCustomer_email());
    }

    public Customer logIn(String customer_email, String customer_password) {
        String sql = "SELECT * FROM customer WHERE customer_email = ? AND customer_password = ?";
        try {
            RowMapper<Customer> rowMapper = new BeanPropertyRowMapper<>(Customer.class);
            Customer customer = template.queryForObject(sql,rowMapper, customer_email, customer_password);
            return customer;
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }

}
