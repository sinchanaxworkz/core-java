class FlightDetails{

public static double getFlightPriceByDestinationName(String DestinationName,int quantity){
	 
	 double DestinationPrice = 0.0;
	 
    System.out.println("getFlightPriceByDestinationName started");
	
	
	 if(DestinationName == "Mumbai to New York") return DestinationPrice=30000.87*quantity ;
  
   else if(DestinationName == "Mumbai to London") return DestinationPrice  = 90000.89*quantity;
  
  else if(DestinationName == "Mumbai to Banglore")return DestinationPrice = 53349.09*quantity;
   
  
  else if(DestinationName == "Mumbai to Kerla")return DestinationPrice = 43969.09*quantity;
  
  
  else if(DestinationName == "Mumbai to gujrath")return  DestinationPrice = 36733.98*quantity;
  
  
  else if(DestinationName == "Mumbai to darjling") return DestinationPrice = 90573.45*quantity;
  
  
  else if(DestinationName == "Mumbai to kashmir")return DestinationPrice =57889.98*quantity;
  
  
  else if(DestinationName == "Mumbai to shivmogga")return DestinationPrice =57889.98*quantity;
  
  
  else if(DestinationName == "Mumbai to manglore")return DestinationPrice = 9000.78*quantity;
  
  
  else if(DestinationName == "Mumbai to Hubli")return DestinationPrice = 3773.98*quantity;
  
  
  else if(DestinationName == "Mumbai to Rio de Janeiro ")return  DestinationPrice = 4456.45*quantity;
  
  
  else if(DestinationName == "Mumbai to Korea")return DestinationPrice = 3347.56*quantity;
  
  
  else if(DestinationName == "Mumbai to Hong Kong ")return DestinationPrice = 4399.34*quantity;
  
  
  else if(DestinationName == "Mumbai to Bangkok")return  DestinationPrice = 3000.00*quantity;
  
  
  else if(DestinationName == "Mumbai to Bali") return DestinationPrice = 63299.0*quantity;
  
  else if(DestinationName == "Mumbai to tokyo")return DestinationPrice  = 4214.89*quantity;
   
   else if(DestinationName == "Mumbai to paris")return DestinationPrice  = 5624.89*quantity ;
   
   else if(DestinationName == "Mumbai to Dubai")return DestinationPrice  = 9556.89*quantity;
   
   else if(DestinationName == "Mumbai to Singapore")return DestinationPrice  = 33435.89*quantity;
   
   else if(DestinationName == "Mumbai to Chicago")return DestinationPrice  =45233.89*quantity;
  
  else{
  System.out.println(DestinationName + "Not found");
  }
  
  System.out.println("getFlightPriceByDestinationName Ended");
  return DestinationPrice ;
  
  }
  
}







