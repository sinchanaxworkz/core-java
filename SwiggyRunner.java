class SwiggyRunner{
	
  public static void main(String[] fd){
	
  System.out.println("Main started");	
  String name = "Pizza";
  double price = Swiggy.getswiggyMenunName(name,2);
  System.out.println("The price for " + name + " is " + price);
  System.out.println("Main Ended");
  
  }
  
}

