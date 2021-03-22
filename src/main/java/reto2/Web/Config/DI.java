package reto2.Web.Config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import reto2.Services.OrderProductsService;
import reto2.Services.OrdersService;
import reto2.Services.ProductsService;

@Configuration
public class DI {

    @Bean
    OrdersService createOrdersService() {
        return new OrdersService();
    }

    @Bean
    ProductsService createProductsService() {
        return new ProductsService();
    }

    @Bean
    OrderProductsService createOrderProductsService() {
        return new OrderProductsService();
    }

    @Bean
    ModelMapper createModelMapper() {
        return new ModelMapper();
    }

}
