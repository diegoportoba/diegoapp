package reto2.Repositories.Interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import reto2.Repositories.Entities.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {

}
