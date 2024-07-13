class SangeethaMobiles{

public static double getMobilePriceByName(String MobileName){
	 
	 double MobilePrice = 0.0;
	 System.out.println("getMobilePriceByName started");
	 
   if(MobileName == "Xiaomi"){
    MobilePrice  = 6299.87;
	return MobilePrice ;
   }
  
  else if(MobileName == "Vivo"){
    MobilePrice  = 7000.00;
	return MobilePrice ;
   }
  
  else if(MobileName == " Samsung"){
	  MobilePrice = 1500.0;
	  return MobilePrice;
   }
  
  else if(MobileName == "Realme"){
	  MobilePrice = 6699.09;
	  return MobilePrice;
  }
  
  else if(MobileName == " OPPO"){
	  MobilePrice = 134999.00;
	  return MobilePrice;
  }
  
  else if(MobileName == "OnePlus"){
	  MobilePrice = 70000.0;
	  return MobilePrice;
  }
  
  else if(MobileName == " Huawei"){
	  MobilePrice = 10000.0;
	  return MobilePrice;
  }
  
  else if(MobileName == " Google"){
	  MobilePrice = 26000.0;
	  return MobilePrice;
  }
  
  else if(MobileName == "Motorola"){
	  MobilePrice = 9894.78;
	  return MobilePrice;
  }
  
  else if(MobileName == "Lenovo"){
	  MobilePrice = 3456.98;
	  return MobilePrice;
  }
  
  else if(MobileName == "Asus") {
	  MobilePrice = 3455.45;
	  return MobilePrice;
  }
  
  else if(MobileName == "Nokia"){
	  MobilePrice = 3456.00;
	  return MobilePrice;
  }
  
  else if(MobileName == "Sony"){
	  MobilePrice = 1567.34;
	  return MobilePrice;
  }
  
  else if(MobileName == "Nothing"){
	  MobilePrice = 26000.00;
	  return MobilePrice;
  }
  
  else if(MobileName == "oppoA16"){
	  MobilePrice = 13000.0;
	  return MobilePrice;
  }
  
  else{
  System.out.println(MobileName + "Not found");
  }
  
  System.out.println("getMobilePriceByName Ended");
  return MobilePrice;
  
  }
  
}

