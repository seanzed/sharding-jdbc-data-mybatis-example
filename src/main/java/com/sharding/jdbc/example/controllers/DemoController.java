package com.sharding.jdbc.example.controllers;

import com.sharding.jdbc.example.dto.Order;
import com.sharding.jdbc.example.service.DemoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class DemoController {

    @Autowired
    private DemoService demoService;

    @PostMapping
    public Order insertOrder(Long userId) {
        return demoService.insert(userId);
    }

    @GetMapping("/selectAll")
    public List<Order> insertOrder() {
        return demoService.selectAll();
    }

    @GetMapping("/selectOrderByCondition")
    public List<Order> selectOrderByCondition() {
        return demoService.selectOrderByCondition();
    }
}
