class Dominos{

public static double getDominosMenunName(String foodName){
	 
	 double DominosPrice = 0.0;
	 
    System.out.println("getDominosMenunName started");
	
	
	 if(foodName == "Sausage Pizza")return DominosPrice  = 300.87 ;
   
  
   else if(foodName == " Beef Taco Pizza") return DominosPrice  = 2000.89 ;
   
  
  else if(foodName == "Margherita Pizza")return DominosPrice = 539.09;
   
  
  else if(foodName == "Veggie Pizza")return DominosPrice = 4969.09;
  
  
  else if(foodName == "MeatZZa Pizza")return DominosPrice = 3673.98;
  
  
  else if(foodName == "Chicken Burger")return DominosPrice = 573.45;
	  
  
  
  else if(foodName == "Chicken Tikka Pizza") return  DominosPrice =589.98;
  
  
  else if(foodName == "Chicken Sausage Burger")return DominosPrice = 4492.09;
  
  
  else if(foodName == "Bacon Cheeseburger Pizza")return DominosPrice = 989.78;
  
  
  else if(foodName == "Chicken Fajita Pizza")return DominosPrice = 3773.98;
  
  
  else if(foodName == "Green Chile Chicken Pizza")  return DominosPrice = 4456.45;
  
  
  else if(foodName == "Mushroom Swiss Burger Pizza")return DominosPrice = 3347.56;
  
  
  else if(foodName == "Deluxe Pizza")return DominosPrice = 4399.34;
  
  
  else if(foodName == "Hawaiian Pizza")return DominosPrice = 4993.00;
  
  
  else if(foodName == "Chicken Bacon Ranch Pizza")return DominosPrice = 3299.0;
  
  else if(foodName == "Vegi Deluxe Pizza")return DominosPrice  = 214.89;
   
   else if(foodName == "Handi Paneer Pizza")return DominosPrice  = 624.89 ;
   
   else if(foodName == "Golden Corn Pizza")	return DominosPrice  = 956.89 ;
   
   else if(foodName == "Jalapeno Pizza")return DominosPrice  = 435.00;
   
   else if(foodName == "Garlic Parmesan Wings")return DominosPrice  = 233.89;
   
  
 else{
  System.out.println(foodName + "Not found");
  }
  
  System.out.println("getDominosMenunName Ended");
  return DominosPrice ;
  
  }
  public static double getDominosMenunName(String foodName,int quantity){
   double DominosPrice = 0.0;
	 
    System.out.println("getDominosMenunName started");
	
	
	 if(foodName == "Sausage Pizza")return DominosPrice  = 300.87*quantity ;
   
  
   else if(foodName == " Beef Taco Pizza") return DominosPrice  = 2000.89*quantity ;
   
  
  else if(foodName == "Margherita Pizza")return DominosPrice = 539.09*quantity;
   
  
  else if(foodName == "Veggie Pizza")return DominosPrice = 4969.09*quantity;
  
  
  else if(foodName == "MeatZZa Pizza")return DominosPrice = 3673.98*quantity;
  
  
  else if(foodName == "Chicken Burger")return DominosPrice = 573.45*quantity;
	  
  
  
  else if(foodName == "Chicken Tikka Pizza") return  DominosPrice =589.98*quantity;
  
  
  else if(foodName == "Chicken Sausage Burger")return DominosPrice = 4492.09*quantity;
  
  
  else if(foodName == "Bacon Cheeseburger Pizza")return DominosPrice = 989.78*quantity;
  
  
  else if(foodName == "Chicken Fajita Pizza")return DominosPrice = 3773.98*quantity;
  
  
  else if(foodName == "Green Chile Chicken Pizza")  return DominosPrice = 4456.45*quantity;
  
  
  else if(foodName == "Mushroom Swiss Burger Pizza")return DominosPrice = 3347.56*quantity;
  
  
  else if(foodName == "Deluxe Pizza")return DominosPrice = 4399.34*quantity;
  
  
  else if(foodName == "Hawaiian Pizza")return DominosPrice = 4993.00*quantity;
  
  
  else if(foodName == "Chicken Bacon Ranch Pizza")return DominosPrice = 3299.0*quantity;
  
  else if(foodName == "Vegi Deluxe Pizza")return DominosPrice  = 214.89*quantity ;
   
   else if(foodName == "Handi Paneer Pizza")return DominosPrice  = 624.89*quantity ;
   
   else if(foodName == "Golden Corn Pizza")	return DominosPrice  = 956.89*quantity ;
   
   else if(foodName == "Jalapeno Pizza")return DominosPrice  = 435.89*quantity;
   
   else if(foodName == "Garlic Parmesan Wings")return DominosPrice  = 233.89*quantity;
   
  
 else{
  System.out.println(foodName + "Not found");
  }
  
  System.out.println("getDominosMenunName Ended");
  return DominosPrice ;
  }
  
}








