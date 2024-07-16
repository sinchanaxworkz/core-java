class SangeethaMobiles{

public static double getMobilePriceByName(String MobileName,int quantity){
	 
	 double MobilePrice = 0.0;
	 System.out.println("getMobilePriceByName started");
	 
   if(MobileName == "Xiaomi")return MobilePrice = 6299.87*quantity;
   
  
  else if(MobileName == "Vivo")return MobilePrice  = 7000.00*quantity;
  
  
  else if(MobileName == " Samsung")return MobilePrice = 1500.0*quantity;
   
  
  else if(MobileName == "Realme") return MobilePrice = 6699.09*quantity;
  
  
  else if(MobileName == " OPPO")return MobilePrice = 134999.00*quantity;
  
  
  else if(MobileName == "OnePlus")return MobilePrice = 70000.0*quantity;
  
  
  else if(MobileName == " Huawei") return MobilePrice = 10000.0*quantity;
  
  
  else if(MobileName == " Google")return  MobilePrice = 26000.0*quantity;
  
  
  else if(MobileName == "Motorola")return MobilePrice = 9894.78*quantity;
  
  
  else if(MobileName == "Lenovo") return  MobilePrice = 3456.98*quantity;
  
  
  else if(MobileName == "Asus")return MobilePrice = 3455.45*quantity;
  
  
  else if(MobileName == "Nokia") return MobilePrice = 3456.00*quantity;
  
  
  else if(MobileName == "Sony") return  MobilePrice = 1567.34*quantity;
  
  
  else if(MobileName == "Nothing") return MobilePrice = 26000.00*quantity;
  
  
  else if(MobileName == "oppoA16")return MobilePrice = 13000.0*quantity;
  
  
  else{
  System.out.println(MobileName + "Not found");
  }
  
  System.out.println("getMobilePriceByName Ended");
  return MobilePrice;
  
  }
  
}

