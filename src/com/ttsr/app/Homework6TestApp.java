package com.ttsr.app;

import com.ttsr.model.ProductImpl;
import com.ttsr.service.ProductIdentityMap;
import com.ttsr.service.ProductMapService;
import com.ttsr.service.ProductMapper;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Homework6TestApp {

    public static void main(String[] args) throws SQLException {

        Connection connection = null;
        try{
            connection = DriverManager.getConnection("jdbc:sqlite:db/test.db");

        } catch (SQLException e) {
            e.printStackTrace();
        }
        var productMapper = new ProductMapper(connection);
        var productMapService = new ProductMapService(productMapper);
        productMapper.insert(new ProductImpl(1l,"shoes",new BigDecimal(500)));
    }
}
