package individualProject;

/**
 *This represents a house object and contains the details of 
 *a house like a the price, the bedrooms, area and address.
 *It contains the logic that validates a user's input
 *and give them back what is available.
 * @author Emmanuel 
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class HouseList {

	//Array list variable for houses
	ArrayList<House> houseList = new ArrayList<House>();

	public HouseList(String houseLists) {
		
		// Instantiate house list as an arrayList
		houseList = new ArrayList<House>();

		// set file to null
		Scanner myFileInput = null;

		// read the file
		try {
			myFileInput = new Scanner(new File(houseLists));
		} catch (FileNotFoundException e) {

			System.out.println("File: " + houseLists + " is not found!");
		}
		

		// Declare the variables for house
		String fHouse;
		double fPrice;
		double fArea;
		int fNumBed;
		House house;
		
		

		//read in the properties into the declared variables
		while (myFileInput.hasNext()) {

			fHouse = myFileInput.next();
			fPrice = myFileInput.nextDouble();
			fArea = myFileInput.nextDouble();
			fNumBed = myFileInput.nextInt();

			house = new House(fHouse, fPrice, fArea, fNumBed);

			houseList.add(house);
		}
	}
	
	//--------------------------------------------------
	

	// Print individual houses with it's properties that satisfies criteria
	public void printHouses(Criteria c) {

		for (int i = 0; i < houseList.size(); i++) {

			if (houseList.get(i).satisfies(c))
				System.out.println(houseList.get(i).toString());
		}
	}
	
	//--------------------------------------------------
	
	// Return all the houses that satisfies the criteria
	public String getHouses(Criteria c) {

		String name = "";
		for (int i = 0; i < houseList.size(); i++) {
			if (houseList.get(i).satisfies(c))
				name = name + houseList.get(i).toString() + "\n";
		}
		return name;
	}
	
	//--------------------------------------------------
}
