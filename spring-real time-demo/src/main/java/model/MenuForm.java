package model;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter @Setter @ToString 
public class MenuForm {
private List<Menu>menu;

public List<Menu> getMenu() {
	return menu;
}

public void setMenu(List<Menu> menu) {
	this.menu = menu;
}

public MenuForm() {
	
}

}
