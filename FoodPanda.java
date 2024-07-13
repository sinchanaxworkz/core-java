class FoodPanda{

public static double getfoodPandaMenunName(String foodName){
	 
	 double foodPandaPrice = 0.0;
	 
    System.out.println("getfoodPandaMenunName started");
	
	
	 if(foodName == "Chicken Tikka"){
     foodPandaPrice  = 100.87;
	 return foodPandaPrice ;
   }
  
   else if(foodName == "Palak Tofu"){
     foodPandaPrice  = 200.89;
	 return foodPandaPrice ;
   }
  
  else if(foodName == "Saag Aloo"){
	  foodPandaPrice = 469.09;
	  return foodPandaPrice;
   }
  
  else if(foodName == "Chicken 65"){
	  foodPandaPrice = 499.09;
	  return foodPandaPrice;
  }
  
  else if(foodName == "Mutton Korma"){
	  foodPandaPrice = 367.98;
	  return foodPandaPrice;
  }
  
  else if(foodName == "Gobi Manchurian"){
	  foodPandaPrice = 57.45;
	  return foodPandaPrice;
  }
  
  else if(foodName == "Beef Burgers"){
	  foodPandaPrice = 389.98;
	  return foodPandaPrice;
  }
  
  else if(foodName == "Chicken Quesadilla"){
	  foodPandaPrice = 449.09;
	  return foodPandaPrice;
  }
  
  else if(foodName == "Paneer Tikka"){
	  foodPandaPrice = 989.78;
	  return foodPandaPrice;
  }
  
  else if(foodName == "Egg Fried Rice"){
	  foodPandaPrice = 377.98;
	  return foodPandaPrice;
  }
  
  else if(foodName == "Vegetable Fried Rice") {
	  foodPandaPrice = 445.45;
	  return foodPandaPrice;
  }
  
  else if(foodName == "Fish Tikka Masala"){
	  foodPandaPrice = 347.56;
	  return foodPandaPrice;
  }
  
  else if(foodName == "Noodels"){
	  foodPandaPrice = 499.34;
	  return foodPandaPrice;
  }
  
  else if(foodName == "Masala Manchurian"){
	  foodPandaPrice = 499.00;
	  return foodPandaPrice;
  }
  
  else if(foodName == "Mushroom Rice"){
	  foodPandaPrice = 399.0;
	  return foodPandaPrice;
  }
  else if(foodName == "kabab"){
    foodPandaPrice  = 104.89;
	return foodPandaPrice ;
   }
   else if(foodName == "Fish Fry"){
    foodPandaPrice  = 134.89;
	return foodPandaPrice ;
   }
   else if(foodName == "Dal Fry"){
    foodPandaPrice  = 156.89;
	return foodPandaPrice ;
   }
   else if(foodName == " Prawn Biryani"){
    foodPandaPrice  = 456.89;
	return foodPandaPrice ;
   }
   else if(foodName == "Lamb Chops"){
    foodPandaPrice  = 203.89;
	return foodPandaPrice ;
   }
  
 else{
  System.out.println(foodName + "Not found");
  }
  
  System.out.println("getfoodPandaMenunName Ended");
  return foodPandaPrice ;
  
  }
  
}




