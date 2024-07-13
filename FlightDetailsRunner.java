class FlightDetailsRunner{
	
  public static void main(String[] phn){
	
  System.out.println("Main started");	
  String name = "Mumbai to shivmogga";
  double price = FlightDetails.getFlightPriceByDestinationName(name);
  System.out.println("The price for " + name + " is " + price);
  System.out.println("Main Ended");
  
  }
  
}

