package individualProject;


/**
 *This represents a house object and contains the details of 
 *a house like a the price, the bedrooms, area and address.
 *It contains the logic that validates a user's input
 *and give them back what is available.
 * @author Emmanuel 
 */

public class House {

	String address;
	double price, area;
	int numberOfBedrooms;

	/**
	 * Pass in house properties and creates house object.
	 * 
	 * Constructor
	 * 
	 * @param ad
	 * @param p
	 * @param a
	 * @param nb
	 */
	public House(String ad, double p, double a, int nb) {

		address = ad;
		price = p;
		area = a;
		numberOfBedrooms = nb;

	}
	
	//--------------------------------------------------

	public String getAddress() {

		return address;
	}
	
	//--------------------------------------------------

	public double getPrice() {

		return price;
	}
	
	//--------------------------------------------------

	public double getArea() {

		return area;
	}
	
	//--------------------------------------------------

	public int numberOfBedrooms() {

		return numberOfBedrooms;
	}
	
	//--------------------------------------------------

	/**
	 * Passes in a Criteria object and compare the minimum and maximum of all the properties of the house.
	 * @param c
	 * @return Boolean
	 */
	public boolean satisfies(Criteria c) {
		if((price >= c.getMinimumPrice() && price <= c.getMaximumPrice()) &&
				(area >= c.getMinimumArea() && area <= c.getMaximumArea()) &&
				(numberOfBedrooms >= c.getMinimumNumberOfBedrooms() && numberOfBedrooms <= c.getMaximumNumberOfBedrooms())) 
			return true;

		else 
			return false;
	}
	
	//--------------------------------------------------

	/**
	 * Formats the house objects and prints them out.
	 */
	public String toString() {
		
		return String.format("-------House Info--------\nAddress: %s \nPrice: %.2f \nArea: %.2f \nBedrooms: %d\n---------------------------\n",
				address, price, area, numberOfBedrooms);
		                      
	}
	
	//--------------------------------------------------

}
