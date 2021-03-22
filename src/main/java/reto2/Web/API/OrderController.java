package reto2.Web.API;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reto2.Services.OrdersService;
import reto2.Services.Models.OrderDTO;

@RestController
@RequestMapping("orders/v1")
public class OrderController {
    
    private final OrdersService ordersService;

    OrderController(OrdersService ordersService){
        this.ordersService = ordersService;
    }

    @GetMapping()
    public List<OrderDTO> GetOrders(){
        return ordersService.getAll();
    }
}
