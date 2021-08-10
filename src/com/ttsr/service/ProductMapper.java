package com.ttsr.service;

import com.ttsr.model.Product;
import com.ttsr.model.ProductImpl;
import com.ttsr.thirdParty.ProductItemAdapter;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;

public class ProductMapper {

    private final Connection connection;

    public ProductMapper(Connection connection) {
        this.connection = connection;
    }

    public ProductImpl findById(Long id) throws SQLException {
        PreparedStatement ps = this.connection.prepareStatement("SELECT uuid, name, price FROM products WHERE id = ?");
        ps.setLong(1,id);
        try(ResultSet resultSet = ps.executeQuery()){
            while (resultSet.next()){
                ProductImpl product = new ProductImpl(resultSet.getLong(1),resultSet.getString(2),resultSet.getBigDecimal(3));
                return product;
            }
        }
        return null;
    }

    public void insert(ProductImpl product) throws SQLException {
        PreparedStatement ps = this.connection.prepareStatement("INSERT INTO Products (id, name, price) Values (?, ?, ?)";
        ps.setLong(1,product.getId());
        ps.setString(2,product.getName());
        ps.setBigDecimal(3,product.getPrice());
        ps.executeUpdate();
    }

    public void deleteById(Long id) throws SQLException {
        PreparedStatement ps = this.connection.prepareStatement("DELETE FROM products WHERE id = ?");
        ps.setLong(1,id);
        ps.executeUpdate();
    }
}
