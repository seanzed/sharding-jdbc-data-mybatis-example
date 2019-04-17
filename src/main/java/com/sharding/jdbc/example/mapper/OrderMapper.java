package com.sharding.jdbc.example.mapper;

import com.sharding.jdbc.example.dto.Order;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper {

    Long insert(Order order);

    List<Order> selectAll();

    List<Order> selectOrderByCondition();
}
