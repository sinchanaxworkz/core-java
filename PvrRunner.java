class PvrRunner{
	
  public static void main(String[] phn){
	
  System.out.println("Main started");	
  String name = "kalki";
  double price = Pvr.getMoviePriceByName(name);
  System.out.println("The price for " + name + " is " + price);
  System.out.println("Main Ended");
  
  }
  
}

