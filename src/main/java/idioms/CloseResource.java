package idioms;

import java.io.Closeable;
import java.io.IOException;

public class CloseResource {

	private CloseResource(){
	}

	public static void closeQuietly( Closeable iCloseable ) {
		// closing closeable object quietly idiom
	     if ( null == iCloseable ){
	    	 return;
	     }
	     try {
	    	 iCloseable.close();
	     } catch ( IOException lIOException ) {
	         System.err.println( "Error while closing quietly" );
	     }
	}

	public static void closeQuietly( AutoCloseable iCloseable ) {
		// closing AutoCloseable object quietly idiom
	     if ( null == iCloseable ){
             return;
	     }
	     try {
             iCloseable.close();
	     } catch ( IOException lIOException ) {
	         System.err.println( "I/O error while closing quietly" );
	     } catch (Exception e) {
	         System.err.println( "Unknown error while closing quietly" );
		}
	}

}
