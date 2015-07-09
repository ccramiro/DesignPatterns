package abstractFactory;

public class RegularRestaurant implements Restaurant{

	public Menu serveMenu() {
		return new RegularMenu();
	}

	public Drink serveDrink() {
		return new RegularDrink();
	}

}
