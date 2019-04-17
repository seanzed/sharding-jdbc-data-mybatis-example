package com.sharding.jdbc.example.dto;

import javax.persistence.Table;
import lombok.Data;

@Data
@Table(name = "t_order_item")
public class OrderItem {

    private long orderItemId;

    private long orderId;

    private long userId;

    private String status;

}
