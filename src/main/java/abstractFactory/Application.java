package abstractFactory;

public class Application {

	public Application( Restaurant iRestaurant ){
		Menu lMenu = iRestaurant.serveMenu();
		Drink lDrink = iRestaurant.serveDrink();
		lMenu.serve();
		lDrink.serve();
	}
}
