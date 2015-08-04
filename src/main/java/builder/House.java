package builder;

public class House {

	@SuppressWarnings("unused")
	private final int mBedrooms;
	@SuppressWarnings("unused")
	private final int mToilets;
	@SuppressWarnings("unused")
	private final boolean mTerrace;
	@SuppressWarnings("unused")
	private final int mSquareMeters;

	private House( Builder iBuilder ){
		mBedrooms = iBuilder.mBedrooms;
		mToilets = iBuilder.mToilets;
		mTerrace = iBuilder.mTerrace;
		mSquareMeters = iBuilder.mSquareMeters;
	}

	public static class Builder{

		// Required parameters
		private final int mBedrooms;
		private final int mToilets;
		// Not required parameters
		private boolean mTerrace = false;
		private int mSquareMeters = 0;

		public Builder( int iBedrooms, int iToilets ){
			this.mBedrooms = iBedrooms;
			this.mToilets = iToilets;
		}

		public Builder Terrace( boolean iTerrace ){
			this.mTerrace = iTerrace;
			return this;
		}

		public Builder SquareMeters( int iSquareMeters ){
			this.mSquareMeters = iSquareMeters;
			return this;
		}

		public House build(){
			return new House( this );
		}

	}

	public static void main( String[] args ){
		House lHouse = new House.Builder( 3, 2 ).SquareMeters( 112 ).build();
	}

}
