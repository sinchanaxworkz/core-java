class FlightDetails{

public static double getFlightPriceByDestinationName(String DestinationName){
	 
	 double DestinationPrice = 0.0;
	 
    System.out.println("getFlightPriceByDestinationName started");
	
	
	 if(DestinationName == "Mumbai to New York"){
     DestinationPrice  = 30000.87;
	 return DestinationPrice ;
   }
  
   else if(DestinationName == "Mumbai to London"){
     DestinationPrice  = 90000.89;
	 return DestinationPrice ;
   }
  
  else if(DestinationName == "Mumbai to Banglore"){
	  DestinationPrice = 53349.09;
	  return DestinationPrice;
   }
  
  else if(DestinationName == "Mumbai to Kerla"){
	  DestinationPrice = 43969.09;
	  return DestinationPrice;
  }
  
  else if(DestinationName == "Mumbai to gujrath"){
	  DestinationPrice = 36733.98;
	  return DestinationPrice;
  }
  
  else if(DestinationName == "Mumbai to darjling"){
	  DestinationPrice = 90573.45;
	  return DestinationPrice;
  }
  
  else if(DestinationName == "Mumbai to kashmir"){
	  DestinationPrice =57889.98;
	  return DestinationPrice;
  }
  
  else if(DestinationName == "Mumbai to shivmogga"){
	  DestinationPrice = 94492.09;
	  return DestinationPrice;
  }
  
  else if(DestinationName == "Mumbai to manglore"){
	  DestinationPrice = 9000.78;
	  return DestinationPrice;
  }
  
  else if(DestinationName == "Mumbai to Hubli"){
	  DestinationPrice = 3773.98;
	  return DestinationPrice;
  }
  
  else if(DestinationName == "Mumbai to Rio de Janeiro ") {
	  DestinationPrice = 4456.45;
	  return DestinationPrice;
  }
  
  else if(DestinationName == "Mumbai to Korea"){
	  DestinationPrice = 3347.56;
	  return DestinationPrice;
  }
  
  else if(DestinationName == "Mumbai to Hong Kong "){
	  DestinationPrice = 4399.34;
	  return DestinationPrice;
  }
  
  else if(DestinationName == "Mumbai to Bangkok"){
	  DestinationPrice = 3000.00;
	  return DestinationPrice;
  }
  
  else if(DestinationName == "Mumbai to Bali"){
	  DestinationPrice = 63299.0;
	  return DestinationPrice;
  }
  else if(DestinationName == "Mumbai to tokyo"){
    DestinationPrice  = 4214.89;
	return DestinationPrice ;
   }
   else if(DestinationName == "Mumbai to paris"){
    DestinationPrice  = 5624.89;
	return DestinationPrice ;
   }
   else if(DestinationName == "Mumbai to Dubai"){
    DestinationPrice  = 9556.89;
	return DestinationPrice ;
   }
   else if(DestinationName == "Mumbai to Singapore"){
    DestinationPrice  = 33435.89;
	return DestinationPrice ;
   }
   else if(DestinationName == "Mumbai to Chicago"){
    DestinationPrice  =45233.89;
	return DestinationPrice ;
   }
  
 else{
  System.out.println(DestinationName + "Not found");
  }
  
  System.out.println("getFlightPriceByDestinationName Ended");
  return DestinationPrice ;
  
  }
  
}







