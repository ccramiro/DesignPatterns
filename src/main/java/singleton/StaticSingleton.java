package singleton;

public class StaticSingleton {

	// Instantiation forbidden
	private StaticSingleton() { };
	// Static will be created only once
	public static final StaticSingleton INSTANCE = new StaticSingleton();

}
