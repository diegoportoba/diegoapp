package reto2.Repositories.Interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import reto2.Repositories.Entities.OrderEntity;

public interface OrderRepository extends JpaRepository<OrderEntity, Long>{
    
    
}
