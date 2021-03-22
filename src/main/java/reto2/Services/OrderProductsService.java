package reto2.Services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import reto2.Repositories.Entities.OrderEntity;
import reto2.Repositories.Entities.OrderProductEntity;
import reto2.Repositories.Interfaces.OrderProductRepository;
import reto2.Repositories.Interfaces.OrderRepository;
import reto2.Services.Models.OrderProductDTO;

public class OrderProductsService {

    @Autowired
    private OrderProductRepository orderProductRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private ModelMapper modelMapper;

    public List<OrderProductDTO> getAll() {
        return orderProductRepository.findAll().stream()
                .map(x -> modelMapper.map(x, OrderProductDTO.class))
                .collect(Collectors.toList());
    }

    public List<OrderProductDTO> findByOrderId(int orderId) {
        return orderProductRepository.findByOrderId(orderId).stream()
                .map(x -> modelMapper.map(x, OrderProductDTO.class))
                .collect(Collectors.toList());
    }

    public OrderProductDTO add(OrderProductDTO orderProduct) {
        OrderProductEntity entityToInsert = modelMapper.map(orderProduct, OrderProductEntity.class);
        OrderProductEntity result = orderProductRepository.save(entityToInsert);
        return modelMapper.map(result, OrderProductDTO.class);
    }

    public OrderProductDTO update(Long idProduct, OrderProductDTO orderProduct) {
        OrderProductEntity entityToUpdate = modelMapper.map(orderProduct, OrderProductEntity.class);
        OrderProductEntity result = orderProductRepository.save(entityToUpdate);
        return modelMapper.map(result, OrderProductDTO.class);
    }

    public void delete(Long id) {
        Optional<OrderProductEntity> entityToDelete = orderProductRepository.findById(id);
        if (entityToDelete.isPresent()) {
            orderProductRepository.delete(entityToDelete.get());
        }

    }
}
