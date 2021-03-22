package reto2.Services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import reto2.Repositories.Entities.OrderEntity;
import reto2.Repositories.Interfaces.OrderRepository;
import reto2.Services.Models.OrderDTO;

public class OrdersService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private ModelMapper modelMapper;

    public List<OrderDTO> getAll() {
        return orderRepository.findAll().stream()
                .map(x -> modelMapper.map(x, OrderDTO.class))
                .collect(Collectors.toList());
    }

}
