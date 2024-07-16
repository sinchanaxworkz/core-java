class Zomato{

public static double getzomatoMenunName(String foodName, int quantity){
	 
	 double ZomatoPrice = 0.0;
	 
    System.out.println("getzomatoMenunName started");
	
	
	 if(foodName == "Chicken Fajitas")return  ZomatoPrice  = 300.87*quantity ;
   
  
   else if(foodName == "Beef Tacos")return ZomatoPrice  = 2000.89*quantity ;
   
  
  else if(foodName == "Shrimp Scampi") return  ZomatoPrice = 539.0*quantity ;
   
  
  else if(foodName == "Lamb Kofta")return  ZomatoPrice = 4969.09*quantity ;
  
  
  else if(foodName == "Shrimp Scampi")return  ZomatoPrice = 3673.98*quantity ;

  
  else if(foodName == "Beef Tacos") return  ZomatoPrice = 573.4*quantity 
  
  
  else if(foodName == "Shrimp Scampi")return ZomatoPrice =589.98*quantity ;
  
  
  else if(foodName == "Fish Fry") return ZomatoPrice = 4492.09*quantity ;
  
  
  else if(foodName == "Crab Cakes") return ZomatoPrice = 989.78*quantity ;
  
  
  else if(foodName == "Chicken Fajitas")return ZomatoPrice = 3773.98*quantity ;
  
  
  else if(foodName == "Vegetable Quinoa Bowl") return  ZomatoPrice = 4456.45*quantity ;
  
  
  else if(foodName == "Artichoke Dip") return ZomatoPrice = 3347.56*quantity ;
  
  
  else if(foodName == "Grilled Portobello Mushrooms") return  ZomatoPrice = 4399.34*quantity ;
  
  
  else if(foodName == "Roasted Vegetable Wrap")return ZomatoPrice = 4993.0*quantity ;
 
  
  else if(foodName == "Lentil Soup") return ZomatoPrice = 3299.0*quantity;
  
  else if(foodName == "Vegetable Spring Rolls")return ZomatoPrice  = 2104.8*quantity ;
   
   else if(foodName == "Tofu Skewers")return ZomatoPrice  = 1234.89*quantity  ;
   
   else if(foodName == "Quiche Lorrain")return  ZomatoPrice  = 156.89*quantity  ;
   
   else if(foodName == "Stuffed Bell Peppers")return  ZomatoPrice  = 4356.89*quantity ;
   
   else if(foodName == "Egg plant Parmesan")return ZomatoPrice  = 2303.89*quantity  ;
   
  
 else{
  System.out.println(foodName + "Not found");
  }
  
  System.out.println("getzomatoMenunName Ended");
  return ZomatoPrice ;
  
  }
  
}


