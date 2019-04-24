package controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import model.Menu;
import service.MenuService;
@RestController

public class MainController {
	private static List<Menu>menu=new ArrayList<Menu>();

	static{
		menu.add(new Menu("Burger",10,0,3.75));
		menu.add(new Menu("Fries",10,0,2.95));
		menu.add(new Menu("Salad",10,0,1.50));
		menu.add(new Menu("Cofee",10,0,1.50));
		
	}
	private final MenuService menuService;

    public MainController(MenuService menuService) {
        this.menuService = menuService;
    }

    @GetMapping("/menu")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void menu() {
    	//Menu m = new Menu();
        Menu menu = Menu.builder()
        		.foodItem("Burger")
        		.available(10)
        		.quantity(2)
        		.price(5.95)
           .build();

        menuService.sendMenu(menu);
        
    }
   
    	
    
    @RequestMapping(value = { "/order" }, method = RequestMethod.GET)
    public ModelAndView order(@ModelAttribute("menu") Menu menu) {
	
    	String foodItem=menu.getFoodItem();
        Integer available=menu.getAvailable();
        Integer quantity=menu.getQuantity();
        Double price=menu.getPrice();	
        Integer x=available-quantity;//x is temp value to update quantity
        available=x;
        if(x<=0) {System.out.print("***********FOOD ITEM OUT OF ORDER!************");}
         menu = Menu.builder()
        		.foodItem(foodItem)
        		.available(available)
        		.quantity(quantity)
        		.price(price)
           .build();

        menuService.sendMenu(menu);
        return new ModelAndView("order", "menu", menu);
	}
   
	
    
}
	

