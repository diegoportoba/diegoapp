package reto2.Web.API;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import reto2.Services.OrderProductsService;
import reto2.Services.Models.OrderProductDTO;

@RestController
@RequestMapping("orderProducts/v1")
public class OrderProductController {
    
    private final OrderProductsService orderProductsService;

    OrderProductController(OrderProductsService orderProductsService){
        this.orderProductsService = orderProductsService;
    }

    @GetMapping("/getAll")
    public List<OrderProductDTO> Get(){
        return orderProductsService.getAll();
    }

    @GetMapping()
    public List<OrderProductDTO> GetOrders(@RequestParam (name="orderId", required=false, defaultValue = "0") int orderId){      
        return orderProductsService.findByOrderId(orderId);
    }

    @PostMapping
    public OrderProductDTO AddOrder(@RequestBody OrderProductDTO orderProduct){
        return orderProductsService.add(orderProduct);
    }

    @PutMapping("/{id}")
    public OrderProductDTO Update(@RequestBody OrderProductDTO orderProduct, @PathVariable("id") Long id)
    {
        return orderProductsService.update(id,orderProduct);

        
    }

    @DeleteMapping("/{id}")
    public void DeleteMovie(@PathVariable("id") Long id){
        orderProductsService.delete(id);
    }


}
