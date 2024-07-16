class FoodPanda{

public static double getfoodPandaMenunName(String foodName,int quantity){
	 
	 double foodPandaPrice = 0.0;
	 
    System.out.println("getfoodPandaMenunName started");
	
	
	 if(foodName == "Chicken Tikka")return foodPandaPrice  = 100.87*quantity;
   
  
   else if(foodName == "Palak Tofu")return foodPandaPrice=200.0*quantity ;
   
  
  else if(foodName == "Saag Aloo")return foodPandaPrice = 469.09*quantity;
   
  
  else if(foodName == "Chicken 65")return  foodPandaPrice = 499.09*quantity;
  
  
  else if(foodName == "Mutton Korma")return foodPandaPrice = 367.98*quantity;
  
  
  else if(foodName == "Gobi Manchurian") return foodPandaPrice = 389.98*quantity;
  
  
  else if(foodName == "Beef Burgers")return foodPandaPrice = 389.98*quantity;
  
  
  else if(foodName == "Chicken Quesadilla")return foodPandaPrice = 449.09*quantity;
  
  
  else if(foodName == "Paneer Tikka")return foodPandaPrice = 989.78*quantity;
  
  
  else if(foodName == "Egg Fried Rice")return foodPandaPrice = 377.98*quantity;
  
  
  else if(foodName == "Vegetable Fried Rice") return  foodPandaPrice = 445.45*quantity;
  
  
  else if(foodName == "Fish Tikka Masala")return   foodPandaPrice = 347.56*quantity;
  
  
  else if(foodName == "Noodels") return foodPandaPrice = 499.34*quantity;
 
  
  else if(foodName == "Masala Manchurian")return foodPandaPrice = 499.00*quantity;
  
  
  else if(foodName == "Mushroom Rice") return foodPandaPrice  = 204.89*quantity;
  
  else if(foodName == "kabab")return foodPandaPrice  = 104.89*quantity;
   
   else if(foodName == "Fish Fry")return foodPandaPrice  = 134.89*quantity;
   
   else if(foodName == "Dal Fry")return  foodPandaPrice  = 156.89*quantity;
   else if(foodName == " Prawn Biryani")return foodPandaPrice  = 456.89*quantity ;
   
   else if(foodName == "Lamb Chops")return foodPandaPrice=400.0*quantity;
   
  
 else{
  System.out.println(foodName + "Not found");
  }
  
  System.out.println("getfoodPandaMenunName Ended");
  return foodPandaPrice ;
  
  }
  
}




