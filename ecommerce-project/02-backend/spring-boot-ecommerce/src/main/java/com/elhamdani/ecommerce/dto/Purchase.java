package com.elhamdani.ecommerce.dto;

import com.elhamdani.ecommerce.entity.Address;
import com.elhamdani.ecommerce.entity.Customer;
import com.elhamdani.ecommerce.entity.Order;
import com.elhamdani.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;
}
