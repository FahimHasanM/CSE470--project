package runner;

import java.util.Scanner;

public class BikeRentManager {
	
	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
	    BikeRent brm = new BikeRent();
	    
	    
	    while(true){
	      System.out.println("Choose an option from below:");
	      System.out.println("1.Search for a bike.");
	      System.out.println("2.Add a Bike.");
	      System.out.println("3.Show all bikes.");
	      System.out.println("4.Book a bike.");
	      System.out.println("5.Show available bikes.");
	      System.out.println("6.Close the program.");
	      
	      System.out.println("Press 1-6 to choose your desired action.");
	      int choice = sc.nextInt();
	      
	      if(choice == 1){
	    	System.out.println("Enter the model you want to search.");
	        String model = sc.nextLine();
	        System.out.println(brm.searchBike(model));
	        
	      }
	      
	      if(choice == 2){
	    	  System.out.print("Brand: ");
	    	  String brand = sc.nextLine();
	    	  brand = brand.substring(0,1).toUpperCase()+brand.substring(1).toLowerCase();
	    	  System.out.println();
	    	  System.out.print("Model: ");
	    	  String model = sc.nextLine();
	    	  model = model.substring(0,1).toUpperCase()+model.substring(1).toLowerCase();
	    	  System.out.println();
	    	  System.out.print("Rent Per Hour: ");
	    	  int rent = sc.nextInt();
	          brm.addBike(brand,model,rent);
	      }
	      
	      if(choice == 3){
	        brm.showAllBikes();
	      }
	      
	      if(choice == 4){
	       String trash = brm.showAllBikes();
	       System.out.println();
	       System.out.println("Enter the serial number of bike you want to book");
	       int sn = sc.nextInt();
	       System.out.println(brm.bookBike(sn));
	      }
	      
	      if(choice == 5){
	        brm.showAvailableBikes();
	      }
	      
	      if(choice == 6){
	        break;
	      }    
	    }
	  }

}
