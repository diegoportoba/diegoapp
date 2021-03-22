package reto2.Repositories.Interfaces;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import org.springframework.data.jpa.repository.Query;

import reto2.Repositories.Entities.OrderProductEntity;

public interface OrderProductRepository extends JpaRepository<OrderProductEntity, Long> {
    @Query(value = "SELECT op,p.name,p.price FROM OrderProducts op INNER JOIN Products p ON p.productId=op.productId WHERE op.orderId=:orderId")
    Collection<OrderProductEntity> findByOrderId(
            @Param("orderId") int orderId);
}
