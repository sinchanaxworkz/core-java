class ZomatoRunner{
	
  public static void main(String[] zt){
	
  System.out.println("Main started");	
  String name = "Grilled Portobello Mushrooms";
  double price = Zomato.getzomatoMenunName(name);
  System.out.println("The price for " + name + " is " + price);
  System.out.println("Main Ended");
  
  }
  
}

