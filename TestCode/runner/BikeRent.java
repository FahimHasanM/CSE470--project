package runner;

import java.util.*;
public class BikeRent{
  public Bikes b[];
  public int check = 0;
  
  public BikeRent(){
	  b = new Bikes[100];
  }
  
  
  
 public String searchBike(String sb){
	      int i = 0;
	      if(check == 0){
	        System.out.println("No bikes to show");
	      }
	      else{
	        while(b[i] != null){
	          if(b[i].model.equalsIgnoreCase(sb)){
	            System.out.println("Serial no: "+(i+1));
	            System.out.println("Brand: "+b[i].brand);
	            System.out.println("Model: "+b[i].model);
	            System.out.println("Rent Per Hour: "+b[i].rentPH);
	            System.out.print("Availability Status: ");
	            if(b[i].avCheck) System.out.println("Available");
	            else System.out.println("Booked");
	            System.out.println();
	        	return "Found it";
	            
	          }
	          i++;
	        }
	      }
	      return "Not Found it";
  }
  
 
  
  /*static void searchBike(){
    Scanner sc = new Scanner(System.in);
    System.out.println("1. Press 1 to search by brand. \n2.Press 2 to search by model.");
    int z = sc.nextInt();
    sc.nextLine();
    if(z == 1){
      int i = 0;
      System.out.println("Enter the brand name.");
      String sb = sc.nextLine();
      if(check == 0){
        System.out.println("No bikes to show");
      }
      else{
        while(b[i] != null){
          if(b[i].brand.equalsIgnoreCase(sb)){
            System.out.println("Serial no: "+(i+1));
            System.out.println("Brand: "+b[i].brand);
            System.out.println("Model: "+b[i].model);
            System.out.println("Rent Per Hour: "+b[i].rentPH);
            System.out.print("Availability Status: ");
            if(b[i].avCheck) System.out.println("Available");
            else System.out.println("Booked");
            System.out.println();
            
          }
          i++;
        }
      }
      
    }
    if(z == 2){
      int i = 0;
      System.out.println("Enter the model name.");
      String sb = sc.nextLine();
      if(check == 0){
        System.out.println("No bikes to show");
      }
      else{
        while(b[i] != null){
          if(b[i].model.equalsIgnoreCase(sb)){
            System.out.println("Serial no: "+(i+1));
            System.out.println("Brand: "+b[i].brand);
            System.out.println("Model: "+b[i].model);
            System.out.println("Rent Per Hour: "+b[i].rentPH);
            System.out.print("Availability Status: ");
            if(b[i].avCheck) System.out.println("Available");
            else System.out.println("Booked");
            System.out.println();
            
          }
          i++;
        }
      }
    }
  }*/
  
  
  
  
  
   public Bikes addBike(String brand, String model,int rent){
    /*Scanner sc = new Scanner(System.in);
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
    System.out.println();
    boolean stat = true;*/
    b[check] = new Bikes();
    b[check].setBrand(brand);
    b[check].setModel(model);
    b[check].setRPH(rent);
    b[check].setStatus(true);
    
    System.out.println("Added a bike successfully");   
    check++;
    return b[check-1];
  }
  
  public String bookBike(int sn){
    
    if(b[sn-1] != null) {
    	if(b[sn-1].avCheck) {
        	b[sn-1].avCheck = false;
        	return ("Booked successfully.");
        }
        else {
            return "Not Available";
        }
    }
    else return "Wrong Input.";
    
    
  }
  void showAvailableBikes(){
    int i = 0;
    if(check == 0){
      System.out.println("No bikes to show");
    }
    else{
      while(b[i] != null ){
        if(b[i].avCheck){
          System.out.println("Serial no: "+(i+1));
          System.out.println("Brand: "+b[i].brand);
          System.out.println("Model: "+b[i].model);
          System.out.println("Rent Per Hour: "+b[i].rentPH);
          System.out.println();
        }
        
        i++;
        
      }
    }
  }
  
  
  String showAllBikes(){
    int i = 0;
    if(check == 0){
      System.out.println("No bikes to show");
    }
    else{
      while(b[i] != null ){
        System.out.println("Serial no: "+(i+1));
        System.out.println("Brand: "+b[i].brand);
        System.out.println("Model: "+b[i].model);
        System.out.println("Rent Per Hour: "+b[i].rentPH);
        System.out.print("Availability Status: ");
        if(b[i].avCheck) System.out.println("Available");
        else System.out.println("Booked");
        System.out.println();
        i++;
        
      }
    }
    if(i == check) return "Done!!!";
    
    else return "Not Done!!";
  }
  
  
  
  
}
