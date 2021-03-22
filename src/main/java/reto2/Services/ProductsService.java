package reto2.Services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import reto2.Repositories.Interfaces.ProductRepository;

import reto2.Services.Models.ProductDTO;
import reto2.Repositories.Entities.ProductEntity;

public class ProductsService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ModelMapper modelMapper;

    public List<ProductDTO> getAll() {
        return productRepository.findAll().stream()
                .map(x -> modelMapper.map(x, ProductDTO.class))
                .collect(Collectors.toList());
    }
    
    
    public Optional<ProductDTO> findById(Long productId){
        Optional<ProductEntity> entity = productRepository.findById(productId);
        if(entity.isPresent())
            return Optional.of(modelMapper.map(entity.get(), ProductDTO.class));
        else
            return Optional.empty();
    }

}
