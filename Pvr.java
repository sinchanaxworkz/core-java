class Pvr{

public static double getMoviePriceByName(String movieName){
	 
	 double moviePrice = 0.0;
	 
    System.out.println("getMoviePriceByName started");
	
	
	 if(movieName == "Avtar"){
     moviePrice  = 300.87;
	 return moviePrice ;
   }
  
   else if(movieName == "titanic"){
     moviePrice  = 9000.89;
	 return moviePrice ;
   }
  
  else if(movieName == "inception"){
	  moviePrice = 5349.09;
	  return moviePrice;
   }
  
  else if(movieName == "Lovli"){
	  moviePrice = 4396.09;
	  return moviePrice;
  }
  
  else if(movieName == "dark knignt"){
	  moviePrice = 367.98;
	  return moviePrice;
  }
  
  else if(movieName == "Inside out"){
	  moviePrice = 903.45;
	  return moviePrice;
  }
  
  else if(movieName == "Lord of the ringd"){
	  moviePrice =578.98;
	  return moviePrice;
  }
  
  else if(movieName == "the god father"){
	  moviePrice = 944.09;
	  return moviePrice;
  }
  
  else if(movieName == "sho"){
	  moviePrice = 900.78;
	  return moviePrice;
  }
  
  else if(movieName == "fight club"){
	  moviePrice = 377.98;
	  return moviePrice;
  }
  
  else if(movieName == "the matrix") {
	  moviePrice = 445.45;
	  return moviePrice;
  }
  
  else if(movieName == "star wars"){
	  moviePrice = 334.56;
	  return moviePrice;
  }
  
  else if(movieName == "the avengers "){
	  moviePrice = 439.34;
	  return moviePrice;
  }
  
  else if(movieName == "family man"){
	  moviePrice = 300.00;
	  return moviePrice;
  }
  
  else if(movieName == "Animal"){
	  moviePrice = 299.0;
	  return moviePrice;
  }
  else if(movieName == "kalki"){
    moviePrice  = 414.89;
	return moviePrice ;
   }
   else if(movieName == "Arundathi"){
    moviePrice  = 624.89;
	return moviePrice ;
   }
   else if(movieName == "frozen"){
    moviePrice  = 356.89;
	return moviePrice ;
   }
   else if(movieName == "the nun"){
    moviePrice  = 2005.89;
	return moviePrice ;
   }
   else if(movieName == "forrest gump"){
    moviePrice  =3233.89;
	return moviePrice ;
   }
  
 else{
  System.out.println(movieName + "Not found");
  }
  
  System.out.println("getMoviePriceByName Ended");
  return moviePrice ;
  
  }
  
}

