package idioms;

import java.io.Closeable;
import java.io.IOException;

public class CloseResource {

	private CloseResource(){
	}

	public void closeQuietly( Closeable iCloseable ) {
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
	
}
