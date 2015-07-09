package abstractFactory;

public class SpanishRestaurant implements Restaurant {

	public Menu serveMenu() {
		// TODO Auto-generated method stub
		return new SpanishMenu();
	}

	public Drink serveDrink() {
		// TODO Auto-generated method stub
		return new SpanishDrink();
	}

}
