class InsurancePackage{
	
 public static double getInsurancePriceByName(String insuraneceName){
	 
	 double insurancePrice = 0.0;
	 System.out.println("getInsurancePriceByName started");
	 
   if(insuraneceName == "HDFC Life Insurance"){
    insurancePrice = 9000.87;
	return insurancePrice;
   }
  
  else if(insuraneceName == "Max Life"){
    insurancePrice = 10000.89;
	return insurancePrice;
   }
  
  else if(insuraneceName == "SBI Smart Shield"){
	  insurancePrice = 6900.09;
	  return insurancePrice;
   }
  
  else if(insuraneceName == "Max Online Term Plan Plus"){
	  insurancePrice = 8799.09;
	  return insurancePrice;
  }
  
  else if(insuraneceName == "ICICI Prudential"){
	  insurancePrice = 6789.98;
	  return insurancePrice;
  }
  
  else if(insuraneceName == "Bajaji Alliance Life"){
	  insurancePrice = 5789.45;
	  return insurancePrice;
  }
  
  else if(insuraneceName == "SBI Life Insurance"){
	  insurancePrice = 8908.98;
	  return insurancePrice;
  }
  
  else if(insuraneceName == "Aditya Birla Sun Life Insurance"){
	  insurancePrice = 4989.09;
	  return insurancePrice;
  }
  
  else if(insuraneceName == "Tata Life Insurance"){
	  insurancePrice = 9899.78;
	  return insurancePrice;
  }
  
  else if(insuraneceName == "Bandhan Life Insurance"){
	  insurancePrice = 7777.98;
	  return insurancePrice;
  }
  
  else if(insuraneceName == "Birla DigiFileld Plan") {
	  insurancePrice = 3499.45;
	  return insurancePrice;
  }
  
  else if(insuraneceName == "Kotak Life e-term Plan"){
	  insurancePrice = 6098.56;
	  return insurancePrice;
  }
  
  else if(insuraneceName == "Canara iSelect smart 360"){
	  insurancePrice = 9898.34;
	  return insurancePrice;
  }
  
  else if(insuraneceName == "Edelweiss life Total Protect Plus"){
	  insurancePrice = 5876.00;
	  return insurancePrice;
  }
  
  else if(insuraneceName == "LIC SIIP Plan"){
	  insurancePrice = 8789.45;
	  return insurancePrice;
  }
  
  else{
  System.out.println(insuraneceName + "Not found");
  }
  
  System.out.println("getInsurancePriceByName Ended");
  return insurancePrice;
  
  }
  
}