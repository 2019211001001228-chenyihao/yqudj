package com.chenyihao.dao;
import com.chenyihao.model.Item;
import com.chenyihao.model.Order;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public interface IOrderDao {


    int save(Connection con, Order order) throws SQLException;


    int delete(Connection con, Order order);


    int update(Connection con, Order order);


    Order findById(Connection con, int id);


    List<Order> findByProperty(Connection con, String propertyName, Object value);


    List<Order> findByFirstName(Connection con, Object firstName);


    List<Order> findByLastName(Connection con, Object lastName);


    List<Order> findByAddress1(Connection con, Object address1);


    List<Order> findByAddress2(Connection con, Object address2);


    List<Order> findByCity(Connection con, Object city);


    List<Order> findByState(Connection con, Object state);


    List<Order> findByPostalCode(Connection con, Object postalCode);


    List<Order> findByCountry(Connection con, Object country);


    List<Order> findByPhone(Connection con, Object phone);


    List<Order> findByNotes(Connection con, Object notes);


    List<Order> findByOrderTotal(Connection con, Object orderTotal);


    List<Order> findAll(Connection con);


    List<Order> findByUserId(Connection con, Object value);

    List<Item> findItemsByOrderId(Connection con, int orderId);
}