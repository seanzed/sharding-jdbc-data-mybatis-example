package com.sharding.jdbc.example.mapper;

import com.sharding.jdbc.example.dto.OrderItem;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderItemMapper {

    Long insert(OrderItem orderItem);
}
