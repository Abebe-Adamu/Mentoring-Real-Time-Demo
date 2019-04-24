package model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter @Setter @ToString @Builder
public class Menu {
	
	
	
	public Menu() {
	
	}

	
	private String foodItem;
    private Integer available;
    private Integer quantity;
    private Double price;
   
	public Menu( String foodItem, Integer available, Integer quantity, Double price) {
		super();
		
		this.foodItem = foodItem;
		this.available = available;
		this.quantity = quantity;
		this.price = price;
	}
	
	//in new Menu class NOT menuItem class
	
    
	
   
   
}
