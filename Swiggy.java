class Swiggy{

public static double getswiggyMenunName(String foodName){
	 
	 double swiggyfoodPrice = 0.0;
	 
    System.out.println("getswiggyMenunName started");
	
	
	 if(foodName == "Biryani") return  swiggyfoodPrice  = 37.87;
   
  
   else if(foodName == "Pizza") return swiggyfoodPrice  = 107.89;
   
  
  else if(foodName == "Chicken Wings")return swiggyfoodPrice = 69.09;
   
  
  else if(foodName == "Samosas")return swiggyfoodPrice = 99.0;
  
  else if(foodName == "Dosa")return swiggyfoodPrice = 67.9;
  
  
  else if(foodName == "Idli") return swiggyfoodPrice = 57.45;
  
  
  else if(foodName == "Veg Momos")return  swiggyfoodPrice = 89.98;
  
  
  else if(foodName == "Chole Bhature")return   swiggyfoodPrice = 49.09;
  
  else if(foodName == "Pav Bhaji")return  swiggyfoodPrice = 989.78;
  
  else if(foodName == "Rajma Chawal")return swiggyfoodPrice=200.0;
  
  
  else if(foodName == "Dal Makhani")  return  swiggyfoodPrice = 345.45;
  
  else if(foodName == "Garlic Naan") return swiggyfoodPrice = 147.56;
  
  else if(foodName == "Palak Paneer") return swiggyfoodPrice = 399.34;
  
  else if(foodName == "Butter Chicken") return swiggyfoodPrice = 299.00;
  
  else if(foodName == "Chicken Tikka Masala") return swiggyfoodPrice = 199.0;
  
  else if(foodName == "Sizzlers")return swiggyfoodPrice  = 107.89;
   
   else if(foodName == "Fried Rice:")return  swiggyfoodPrice  = 107.89;
   
   else if(foodName == "Tacos")return  swiggyfoodPrice  = 107.89;
   
   else if(foodName == "Onion Dosa")return  swiggyfoodPrice  = 107.89 ;
   
   else if(foodName == "IdliVada")return swiggyfoodPrice  = 107.89;
  
 else{
  System.out.println(foodName + "Not found");
  }
  
  System.out.println("getswiggyMenunName Ended");
  return swiggyfoodPrice;
  
  }
  public static double getswiggyMenunName(String foodName,int quantity){
	  	 
	 double swiggyfoodPrice = 0.0;
	 
    System.out.println("getswiggyMenunName started");
	
	
	 if(foodName == "Biryani") return  swiggyfoodPrice  = 37.87*quantity;
   
  
   else if(foodName == "Pizza") return swiggyfoodPrice  = 107.89*quantity;
   
  
  else if(foodName == "Chicken Wings")return swiggyfoodPrice = 69.09*quantity;
   
  
  else if(foodName == "Samosas")return swiggyfoodPrice = 99.0*quantity;
  
  else if(foodName == "Dosa")return swiggyfoodPrice = 67.9*quantity;
  
  
  else if(foodName == "Idli") return swiggyfoodPrice = 57.45*quantity;
  
  
  else if(foodName == "Veg Momos")return  swiggyfoodPrice = 89.98*quantity;
  
  
  else if(foodName == "Chole Bhature")return   swiggyfoodPrice = 49.09*quantity;
  
  else if(foodName == "Pav Bhaji")return  swiggyfoodPrice = 989.78*quantity;
  
  else if(foodName == "Rajma Chawal")return swiggyfoodPrice=200.0*quantity;
  
  
  else if(foodName == "Dal Makhani")  return  swiggyfoodPrice = 345.45*quantity;
  
  else if(foodName == "Garlic Naan") return swiggyfoodPrice = 147.56*quantity;
  
  else if(foodName == "Palak Paneer") return swiggyfoodPrice = 399.34*quantity;
  
  else if(foodName == "Butter Chicken") return swiggyfoodPrice = 299.00*quantity;
  
  else if(foodName == "Chicken Tikka Masala") return swiggyfoodPrice = 199.0*quantity;
  
  else if(foodName == "Sizzlers")return swiggyfoodPrice  = 107.89*quantity;
   
   else if(foodName == "Fried Rice:")return  swiggyfoodPrice  = 107.89*quantity;
   
   else if(foodName == "Tacos")return  swiggyfoodPrice  = 107.89*quantity;
   
   else if(foodName == "Onion Dosa")return  swiggyfoodPrice  = 107.89*quantity ;
   
   else if(foodName == "IdliVada")return swiggyfoodPrice  = 107.89*quantity;
  
 else{
  System.out.println(foodName + "Not found");
  }
  
  System.out.println("getswiggyMenunName Ended");
  return swiggyfoodPrice;
  
  }
  
}