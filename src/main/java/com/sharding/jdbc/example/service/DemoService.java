package com.sharding.jdbc.example.service;

import com.sharding.jdbc.example.dto.Order;
import java.util.List;

public interface DemoService {

    Order insert(Long userId);

    List<Order> selectAll();

    List<Order> selectOrderByCondition();
}
