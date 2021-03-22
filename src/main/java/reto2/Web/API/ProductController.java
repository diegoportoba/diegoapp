package reto2.Web.API;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import reto2.Services.ProductsService;

import reto2.Services.Models.ProductDTO;

@RestController
@RequestMapping("products")
public class ProductController {

    private final ProductsService productsService;

    ProductController(ProductsService productsService) {
        this.productsService = productsService;
    }
    
    @GetMapping
    public ModelAndView listadoProductos() {
        ModelAndView pd = new ModelAndView("index");
        pd.addObject("productos", productsService.getAll());
        return pd;
    }
    
    @GetMapping("/detail/{productId}")
    public ModelAndView detalleProducto(@PathVariable("productId") Long productId) {
        Optional<ProductDTO> product = productsService.findById(productId);
        ModelAndView pd = new ModelAndView("detailProduct");
        pd.addObject("product", product.get());                          
        return pd;
    }

}
