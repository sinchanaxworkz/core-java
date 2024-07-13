class NandiniParlour{

public static double getProductPriceByName (String milkProductName){
	 
	 double milkProductPrice = 0.0;
	 System.out.println("getProductPriceByName started");
	 
   if(milkProductName == "Good Life Milk"){
    milkProductPrice  = 37.87;
	return milkProductPrice ;
   }
  
  else if(milkProductName == "Milk Shrikhand"){
    milkProductPrice  = 47.89;
	return milkProductPrice ;
   }
  
  else if(milkProductName == "Good Life Curd"){
	  milkProductPrice = 69.09;
	  return milkProductPrice;
   }
  
  else if(milkProductName == "Cheese Cube"){
	  milkProductPrice = 99.09;
	  return milkProductPrice;
  }
  
  else if(milkProductName == "Butter"){
	  milkProductPrice = 67.98;
	  return milkProductPrice;
  }
  
  else if(milkProductName == "Paneer"){
	  milkProductPrice = 57.45;
	  return milkProductPrice;
  }
  
  else if(milkProductName == "Ghee"){
	  milkProductPrice = 89.98;
	  return milkProductPrice;
  }
  
  else if(milkProductName == "Lassi"){
	  milkProductPrice = 49.09;
	  return milkProductPrice;
  }
  
  else if(milkProductName == "Chaas"){
	  milkProductPrice = 89.78;
	  return milkProductPrice;
  }
  
  else if(milkProductName == "Yoghurt"){
	  milkProductPrice = 77.98;
	  return milkProductPrice;
  }
  else{
  System.out.println(milkProductName + "Not found");
  }
  
  System.out.println("getProductPriceByName Ended");
  return milkProductPrice;
  
  }
  
}


