package abstractFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RestaurantSelector {

	public static void main(String[] args){
		new Application( selectRestaurant() );
	}
	
	public static Restaurant selectRestaurant(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println( "What kind of restaurant do you prefer today?" );
        System.out.println( "1. Spanish" );
        System.out.println( "2. German" );

        int lInput;
		try {
			lInput = Integer.parseInt(br.readLine());
	        switch( lInput ){
	        case 1:
	        	return new SpanishRestaurant();
	        case 2:
	        	return new GermanRestaurant();
	        default:
	        	return new RegularRestaurant();
	        }
		} catch ( NumberFormatException eNFE ) {
        	return new RegularRestaurant();
		} catch  (IOException e ) {
        	return new RegularRestaurant();
		}
	}
}
