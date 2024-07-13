class SangeethaMobilesRunner{
	
  public static void main(String[] phn){
	
  System.out.println("Main started");	
  String name = "oppoA16";
  double price = SangeethaMobiles.getMobilePriceByName(name);
  System.out.println("The price for " + name + " is " + price);
  System.out.println("Main Ended");
  
  }
  
}

