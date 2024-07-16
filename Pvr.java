class Pvr{

public static double getMoviePriceByName(String movieName,int quantity){
	 
	 double moviePrice = 0.0;
	 
    System.out.println("getMoviePriceByName started");
	
	
	 if(movieName == "Avtar") return moviePrice= 300.87*quantity;
   
  
   else if(movieName == "titanic")return moviePrice= 9000.89*quantity ;
   
  
  else if(movieName == "inception")return moviePrice= 5349.09*quantity;
     
  else if(movieName == "Lovli")return moviePrice= 4396.09*quantity;
   
   
  else if(movieName == "dark knignt")return moviePrice=3233.00*quantity;
  
  
  else if(movieName == "Inside out") return moviePrice = 903.45*quantity;
  
  
  else if(movieName == "Lord of the ringd")return moviePrice =578.98*quantity;
  
  
  else if(movieName == "the god father")return moviePrice = 944.09*quantity;
  
  
  else if(movieName == "sho") return  moviePrice = 900.78*quantity;
  
  
  else if(movieName == "fight club")return moviePrice = 377.98*quantity;
 
  
  else if(movieName == "the matrix") return moviePrice = 445.45*quantity;
  
  
  else if(movieName == "star wars")return  moviePrice = 334.56*quantity;
  
  
  else if(movieName == "the avengers ")return moviePrice = 439.3*quantity4;
  
  
  else if(movieName == "family man")return moviePrice = 300.00*quantity;
  
  
  else if(movieName == "Animal")return moviePrice = 299.0*quantity;
  
  else if(movieName == "kalki")return moviePrice  = 414.89*quantity;
   
   else if(movieName == "Arundathi")return moviePrice  = 624.89*quantity;
   
   else if(movieName == "frozen")returnmoviePrice  = 356.89*quantity ;
   
   else if(movieName == "the nun")return moviePrice =400.0*quantity ;
   
   else if(movieName == "forrest gump")return moviePrice  =323.89 *quantity;
   
  
 else{
  System.out.println(movieName + "Not found");
  }
  
  System.out.println("getMoviePriceByName Ended");
  return moviePrice ;
  
  }
  
}

