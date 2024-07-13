class JioplansRunner{
	
  public static void main(String[] pln){
	
  System.out.println("Main started");	
  String name = "200 Min free voice anynet Local";
  double price = Jioplans.getJioPriceByPlan(name);
  System.out.println("The price for " + name + " is " + price);
  System.out.println("Main Ended");
  
  }
  
}

