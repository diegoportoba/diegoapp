package reto2.Web.Config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import reto2.Repositories.Entities.OrderEntity;
import reto2.Repositories.Entities.OrderProductEntity;
import reto2.Repositories.Entities.ProductEntity;
import reto2.Repositories.Interfaces.OrderProductRepository;
import reto2.Repositories.Interfaces.OrderRepository;
import reto2.Repositories.Interfaces.ProductRepository;

@Configuration
public class InitDB {

    @Bean
    CommandLineRunner initDataBase(OrderRepository repository1){

        return args ->{
            repository1.save(new OrderEntity("2020","Pepe","Entregado"));
            repository1.save(new OrderEntity("2020","Paco","Entregado"));
            repository1.save(new OrderEntity("2020","Papo","Entregado"));
        };
    }

    @Bean
    CommandLineRunner initDataBase2(ProductRepository repository2){
        return args ->{
            repository2.save(new ProductEntity("Portatil",400,"https://m.media-amazon.com/images/I/61jxrBxN2YL._AC._SR360,460.jpg","Pantalla de 14, FullHD 1920x1080 pixeles, IPS"));
            repository2.save(new ProductEntity("Tablet",189,"https://m.media-amazon.com/images/I/61x4rXNY40L._AC._SR360,460.jpg","Expansion de 128 GB. El procesador octa-core junto con 3 GB de RAM"));
            repository2.save(new ProductEntity("Pantalla Samsumg",150,"https://m.media-amazon.com/images/I/81wUcWSezRL._AC._SR360,460.jpg","Monitor 24, con panel IPS y angulo de vision de 178 grados"));
            repository2.save(new ProductEntity("Servidor alta potencia",1200,"https://m.media-amazon.com/images/I/61AcXVO14nL._AC._SR360,460.jpg","Soporta el estandar 802/11ac, Wi-Fi"));
            repository2.save(new ProductEntity("Mochila electrica",340,"https://images-na.ssl-images-amazon.com/images/I/51Zetm9LFHL._AC._SR360,460.jpg","Lanza extensible realizada en acero inoxidable. Extensible de 75 a 120 cm."));
            repository2.save(new ProductEntity("WebCam",25,"https://m.media-amazon.com/images/I/71vPDq1rWDL._AC._SR360,460.jpg","Excelente Calidad De Video - lente de vidrio optico de alta calidad"));
            repository2.save(new ProductEntity("Muebles de Jardin",620,"https://m.media-amazon.com/images/I/71Md7NUCWtL._AC._SR360,460.jpg","Muebles de jardin de diseno moderno,1 Sofa doble 58 * 110 * 75 cm."));
            repository2.save(new ProductEntity("SmartWatch",69,"https://m.media-amazon.com/images/I/71ghEdsdJ0L._AC._SR360,460.jpg","Reloj inteligente con pantalla tactil IPS redonda de 1,3 pulgadas con una pantalla a color de alta gama"));
        };
    }

    @Bean
    CommandLineRunner initDataBase3(OrderProductRepository repository3){
        return args ->{
            repository3.save(new OrderProductEntity(1,4,20));
            repository3.save(new OrderProductEntity(2,5,20));
            repository3.save(new OrderProductEntity(1,6,40));
            repository3.save(new OrderProductEntity(2,7,40));
        };
    }
    
}
