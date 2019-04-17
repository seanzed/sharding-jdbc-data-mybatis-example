package com.sharding.jdbc.example.dto;

import java.util.List;
import javax.persistence.Table;
import javax.persistence.Transient;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Table(name = "t_order")
public class Order {

    private long orderId;

    private long userId;

    private String status;

    @Transient
    private List<OrderItem> orderItemList;
//    private OrderItem orderItemList;
}
