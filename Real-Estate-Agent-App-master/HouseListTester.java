package individualProject;

/**
 * This is a tester class that tests the code and check if the results are correct
 * 
 * @author Emmanuel 
 *
 */

public class HouseListTester {
	
	public static void main(String[] args) {
		
		//Read file
		HouseList availableHouses = new HouseList("C:\\Users\\emman\\Downloads\\CSC205\\CSC205\\src\\houses.txt");
		
		
		// Create new criterion
		Criteria c1 = new Criteria(1000, 500000, 100, 5000, 0, 10);
		Criteria c2 = new Criteria(1000, 100000, 500, 1200, 0, 3);
		Criteria c3 = new Criteria(100000, 200000, 1000, 2000, 2, 3);
		Criteria c4 = new Criteria(200000, 300000, 1500, 4000, 3, 6);
		Criteria c5 = new Criteria(100000, 500000, 2500, 5000, 3, 6);
		Criteria c6 = new Criteria(150000, 300000, 1500, 5000, 3, 6);
		Criteria c7 = new Criteria(100000, 200000, 2500, 5000, 4, 6);
		
		
		//Print out results for criterion
		System.out.println("test1");
		availableHouses.printHouses(c1);
		System.out.println();
		
		
		System.out.println("test2");
		availableHouses.printHouses(c2);
		System.out.println();
		
		System.out.println("test3");
		availableHouses.printHouses(c3);
		System.out.println();
		
		System.out.println("test4");
		availableHouses.printHouses(c4);
		System.out.println();
		
		System.out.println("test5");
		availableHouses.printHouses(c5);
		System.out.println();
		
		System.out.println("test6");
		availableHouses.printHouses(c6);
		System.out.println();
		
		System.out.println("test7");
		availableHouses.printHouses(c7);
		System.out.println();
		
	}

}
