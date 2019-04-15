package com.mccl.mulepoc.orderservice.controller;

import com.mccl.mulepoc.orderservice.dto.OrderDTO;
import com.mccl.mulepoc.orderservice.dto.OrderDetailDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController("orders")
public class OrderController {

    @GetMapping
    public OrderDTO getOrder() {
        List<OrderDetailDTO> orderDetailDTOList = new ArrayList<>();
        OrderDTO orderDTO = new OrderDTO();
        OrderDetailDTO orderDetailDTO = new OrderDetailDTO();
        orderDTO.setId(100L);
        orderDTO.setClientName("Acme Factory");
        orderDetailDTO.setId(200L);
        orderDetailDTO.setOrderId(100L);
        orderDetailDTO.setProductId(3L);
        orderDetailDTO.setQuantity(2);
        orderDetailDTOList.add(orderDetailDTO);
        orderDTO.setOrderDetailDTOList(orderDetailDTOList);
        return orderDTO;
    }
}
