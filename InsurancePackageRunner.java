class InsurancePackageRunner{
	
  public static void main(String[] ins){
	
  System.out.println("Main started");	
  String name = "SBI Smart Shield";
  double price = InsurancePackage.getInsurancePriceByName(name);
  System.out.println("The price for " + name + " is " + price);
  System.out.println("Main Ended");
  
  }
  
}

// Airtel/jio -15 search plans and get price
// Sangeetha mobiles -15 get mbl brand and return price
// FlightsInfo - flightprice -- getflightpricebydestination - 20
// pvr - getmoviepricebyname --20
// nandiniparlour - getproductpricebyname-10
// swiggy,foodpanda,zomato,Dominos -- 20