/*
	Josiah Brooks
	10/7/2018
	Vehicle and add Method a7
*/


class Vehicle {
	int passengers;
	int fuelcup;
	int mpg;
	
	
	void range() {
		System.out.println("Range is " + fuelcup * mpg);
	}
}

class AddMeth {
	public static void  main(String args[]) {
		Vehicle minivan = new Vehicle();
		Vehicle sportscar = new Vehicle();
		
		int range1, range2;
		
		minivan.passengers = 7;
		minivan.fuelcup = 16;
		minivan.mpg = 21;
		
		sportscar.passengers = 2;
		sportscar.fuelcup = 14;
		sportscar.mpg = 12;
		
		
		System.out.print("Minivan can carry " + minivan.passengers +
							". ");
		minivan.range();
		
		System.out.print("Sportscar can carry " + sportscar.passengers +
							". ");
		
		sportscar.range();
	}
}
