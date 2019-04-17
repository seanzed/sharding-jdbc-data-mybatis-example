package com.sharding.jdbc.example.service.impl;

import com.google.common.collect.Lists;
import com.sharding.jdbc.example.dto.Order;
import com.sharding.jdbc.example.dto.OrderItem;
import com.sharding.jdbc.example.mapper.OrderItemMapper;
import com.sharding.jdbc.example.mapper.OrderMapper;
import com.sharding.jdbc.example.service.DemoService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {

    @Resource
    private OrderMapper orderMapper;

    @Resource
    private OrderItemMapper orderItemMapper;

    @Override
    public Order insert(Long userId) {
        Order order = new Order();
        order.setUserId(userId);
        order.setStatus("INSERT_TEST");
        orderMapper.insert(order);

        long orderId = order.getOrderId();
        OrderItem item = new OrderItem();
        item.setOrderId(orderId);
        item.setUserId(userId);
        item.setStatus("INSERT_TEST");
        orderItemMapper.insert(item);

//        ArrayList<OrderItem> orderItemList = new ArrayList<>();
//        orderItemList.add(item);
//        order.setOrderItemList(orderItemList);

        return order;
    }

    @Override
    public List<Order> selectAll() {
        return orderMapper.selectAll();
    }

    @Override
    public List<Order> selectOrderByCondition() {
        return orderMapper.selectOrderByCondition();
    }
}
