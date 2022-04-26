package individualProject;

/**
 *This class is used to make comparisons and match
 *the users options
 * @author Emmanuel 
 */

public class Criteria {
	
	// Declare variables for bedrooms, prices, and areas.
	double minimumPrice, maximumPrice, minimumArea, maximumArea;
	int minimumNumberOfBedrooms, maximumNumberOfBedrooms;
	
	
	/**
	 * constructor:
	 * This takes in the minimum and maximum numbers of the 
	 * area, prices, and the number of bedrooms and return them.
	 * 
	 * @param minP
	 * @param maxP
	 * @param minA
	 * @param maxA
	 * @param minB
	 * @param maxB
	 */
	public Criteria(double minP, double maxP, double minA, double maxA, int minB, int maxB) {
		
		minimumPrice = minP;
		maximumPrice = maxP;
		minimumArea = minA;
		maximumArea = maxA;
		minimumNumberOfBedrooms = minB;
		maximumNumberOfBedrooms = maxB;
		
	}

	//--------------------------------------------------

	public double getMinimumPrice() {
		return minimumPrice;
	}

	//--------------------------------------------------

	public double getMaximumPrice() {
		return maximumPrice;
	}
	
	//--------------------------------------------------


	public double getMinimumArea() {
		return minimumArea;
	}

	//--------------------------------------------------

	public double getMaximumArea() {
		return maximumArea;
	}
	
	//--------------------------------------------------


	public int getMinimumNumberOfBedrooms() {
		return minimumNumberOfBedrooms;
	}

	//--------------------------------------------------

	public int getMaximumNumberOfBedrooms() {
		return maximumNumberOfBedrooms;
	}
	
	//--------------------------------------------------
}
