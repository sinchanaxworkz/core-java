class Jioplans{

public static double getJioPriceByPlan(String jioPlansName){
	 
	 double jioPlansPrice = 0.0;
	 System.out.println("getJioPriceByPlan started");
	 
   if(jioPlansName == "30 Days Validity"){
    jioPlansPrice  = 37.87;
	return jioPlansPrice ;
   }
  
  else if(jioPlansName == "3GB free data"){
    jioPlansPrice  = 107.89;
	return jioPlansPrice ;
   }
  
  else if(jioPlansName == "200 Min free voice anynet Local"){
	  jioPlansPrice = 69.09;
	  return jioPlansPrice;
   }
  
  else if(jioPlansName == "Roming incl MTNL network"){
	  jioPlansPrice = 99.09;
	  return jioPlansPrice;
  }
  
  else if(jioPlansName == "BSNl Tune STD"){
	  jioPlansPrice = 67.98;
	  return jioPlansPrice;
  }
  
  else if(jioPlansName == "35 days"){
	  jioPlansPrice = 57.45;
	  return jioPlansPrice;
  }
  
  else if(jioPlansName == "unlimited Local"){
	  jioPlansPrice = 89.98;
	  return jioPlansPrice;
  }
  
  else if(jioPlansName == "STD calls to Any Networkin Home"){
	  jioPlansPrice = 49.09;
	  return jioPlansPrice;
  }
  
  else if(jioPlansName == "10GB data"){
	  jioPlansPrice = 989.78;
	  return jioPlansPrice;
  }
  
  else if(jioPlansName == "Voice calss"){
	  jioPlansPrice = 777.98;
	  return jioPlansPrice;
  }
  
  else if(jioPlansName == "Unlimited Data") {
	  jioPlansPrice = 345.45;
	  return jioPlansPrice;
  }
  
  else if(jioPlansName == "100 SMS"){
	  jioPlansPrice = 147.56;
	  return jioPlansPrice;
  }
  
  else if(jioPlansName == "40Kbps after 2GB day"){
	  jioPlansPrice = 399.34;
	  return jioPlansPrice;
  }
  
  else if(jioPlansName == "3GB"){
	  jioPlansPrice = 299.00;
	  return jioPlansPrice;
  }
  
  else if(jioPlansName == "Validity 30"){
	  jioPlansPrice = 199.0;
	  return jioPlansPrice;
  }
  
  else{
  System.out.println(jioPlansName + "Not found");
  }
  
  System.out.println("getJioPriceByPlan Ended");
  return jioPlansPrice;
  
  }
  
}