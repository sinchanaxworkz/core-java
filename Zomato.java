class Zomato{

public static double getzomatoMenunName(String foodName){
	 
	 double ZomatoPrice = 0.0;
	 
    System.out.println("getzomatoMenunName started");
	
	
	 if(foodName == "Chicken Fajitas"){
     ZomatoPrice  = 300.87;
	 return ZomatoPrice ;
   }
  
   else if(foodName == "Beef Tacos"){
     ZomatoPrice  = 2000.89;
	 return ZomatoPrice ;
   }
  
  else if(foodName == "Shrimp Scampi"){
	  ZomatoPrice = 539.09;
	  return ZomatoPrice;
   }
  
  else if(foodName == "Lamb Kofta"){
	  ZomatoPrice = 4969.09;
	  return ZomatoPrice;
  }
  
  else if(foodName == "Shrimp Scampi"){
	  ZomatoPrice = 3673.98;
	  return ZomatoPrice;
  }
  
  else if(foodName == "Beef Tacos"){
	  ZomatoPrice = 573.45;
	  return ZomatoPrice;
  }
  
  else if(foodName == "Shrimp Scampi"){
	  ZomatoPrice =589.98;
	  return ZomatoPrice;
  }
  
  else if(foodName == "Fish Fry"){
	  ZomatoPrice = 4492.09;
	  return ZomatoPrice;
  }
  
  else if(foodName == "Crab Cakes"){
	  ZomatoPrice = 989.78;
	  return ZomatoPrice;
  }
  
  else if(foodName == "Chicken Fajitas"){
	  ZomatoPrice = 3773.98;
	  return ZomatoPrice;
  }
  
  else if(foodName == "Vegetable Quinoa Bowl") {
	  ZomatoPrice = 4456.45;
	  return ZomatoPrice;
  }
  
  else if(foodName == "Artichoke Dip"){
	  ZomatoPrice = 3347.56;
	  return ZomatoPrice;
  }
  
  else if(foodName == "Grilled Portobello Mushrooms"){
	  ZomatoPrice = 4399.34;
	  return ZomatoPrice;
  }
  
  else if(foodName == "Roasted Vegetable Wrap"){
	  ZomatoPrice = 4993.00;
	  return ZomatoPrice;
  }
  
  else if(foodName == "Lentil Soup"){
	  ZomatoPrice = 3299.0;
	  return ZomatoPrice;
  }
  else if(foodName == "Vegetable Spring Rolls"){
    ZomatoPrice  = 2104.89;
	return ZomatoPrice ;
   }
   else if(foodName == "Tofu Skewers"){
    ZomatoPrice  = 1234.89;
	return ZomatoPrice ;
   }
   else if(foodName == "Quiche Lorrain"){
    ZomatoPrice  = 156.89;
	return ZomatoPrice ;
   }
   else if(foodName == "Stuffed Bell Peppers"){
    ZomatoPrice  = 4356.89;
	return ZomatoPrice ;
   }
   else if(foodName == "Egg plant Parmesan"){
    ZomatoPrice  = 2303.89;
	return ZomatoPrice ;
   }
  
 else{
  System.out.println(foodName + "Not found");
  }
  
  System.out.println("getzomatoMenunName Ended");
  return ZomatoPrice ;
  
  }
  
}


