class Dominos{

public static double getDominosMenunName(String foodName){
	 
	 double DominosPrice = 0.0;
	 
    System.out.println("getDominosMenunName started");
	
	
	 if(foodName == "Sausage Pizza"){
     DominosPrice  = 300.87;
	 return DominosPrice ;
   }
  
   else if(foodName == " Beef Taco Pizza"){
     DominosPrice  = 2000.89;
	 return DominosPrice ;
   }
  
  else if(foodName == "Margherita Pizza"){
	  DominosPrice = 539.09;
	  return DominosPrice;
   }
  
  else if(foodName == "Veggie Pizza"){
	  DominosPrice = 4969.09;
	  return DominosPrice;
  }
  
  else if(foodName == "MeatZZa Pizza"){
	  DominosPrice = 3673.98;
	  return DominosPrice;
  }
  
  else if(foodName == "Chicken Burger"){
	  DominosPrice = 573.45;
	  return DominosPrice;
  }
  
  else if(foodName == "Chicken Tikka Pizza"){
	  DominosPrice =589.98;
	  return DominosPrice;
  }
  
  else if(foodName == "Chicken Sausage Burger"){
	  DominosPrice = 4492.09;
	  return DominosPrice;
  }
  
  else if(foodName == "Bacon Cheeseburger Pizza"){
	  DominosPrice = 989.78;
	  return DominosPrice;
  }
  
  else if(foodName == "Chicken Fajita Pizza"){
	  DominosPrice = 3773.98;
	  return DominosPrice;
  }
  
  else if(foodName == "Green Chile Chicken Pizza") {
	  DominosPrice = 4456.45;
	  return DominosPrice;
  }
  
  else if(foodName == "Mushroom Swiss Burger Pizza"){
	  DominosPrice = 3347.56;
	  return DominosPrice;
  }
  
  else if(foodName == "Deluxe Pizza"){
	  DominosPrice = 4399.34;
	  return DominosPrice;
  }
  
  else if(foodName == "Hawaiian Pizza"){
	  DominosPrice = 4993.00;
	  return DominosPrice;
  }
  
  else if(foodName == "Chicken Bacon Ranch Pizza"){
	  DominosPrice = 3299.0;
	  return DominosPrice;
  }
  else if(foodName == "Vegi Deluxe Pizza"){
    DominosPrice  = 214.89;
	return DominosPrice ;
   }
   else if(foodName == "Handi Paneer Pizza"){
    DominosPrice  = 624.89;
	return DominosPrice ;
   }
   else if(foodName == "Golden Corn Pizza"){
    DominosPrice  = 956.89;
	return DominosPrice ;
   }
   else if(foodName == "Jalapeno Pizza"){
    DominosPrice  = 435.89;
	return DominosPrice ;
   }
   else if(foodName == "Garlic Parmesan Wings"){
    DominosPrice  = 233.89;
	return DominosPrice ;
   }
  
 else{
  System.out.println(foodName + "Not found");
  }
  
  System.out.println("getDominosMenunName Ended");
  return DominosPrice ;
  
  }
  
}








