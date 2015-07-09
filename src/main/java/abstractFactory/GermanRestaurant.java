package abstractFactory;

public class GermanRestaurant implements Restaurant {

	public Menu serveMenu() {
		return new GermanMenu();
	}

	public Drink serveDrink() {
		return new GermanDrink();
	}

}
