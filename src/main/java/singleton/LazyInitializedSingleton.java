package singleton;

public class LazyInitializedSingleton {

	// Holder idiom - This is thread safe
	private LazyInitializedSingleton() {}
	 
    private static class LazyHolder {
        private static final LazyInitializedSingleton INSTANCE = new LazyInitializedSingleton();
    }
 
    public static LazyInitializedSingleton getInstance() {
        return LazyHolder.INSTANCE;
    }
}
