class JuiceShopRunner{
 public static void main(String[] juice){
 
   boolean addedJuice = JuiceShop.addJuiceName("Lime");
   System.out.println("Added juice" + addedJuice );
   
   JuiceShop.addJuiceName("chiku");
   System.out.println("Added juice" + addedJuice );
   
   JuiceShop.addJuiceName("Mango");
   System.out.println("Added juice" + addedJuice );
   
   JuiceShop.addJuiceName("Apple");
   System.out.println("Added juice" + addedJuice );
   
   JuiceShop.addJuiceName("choclate");
   System.out.println("Added juice" + addedJuice );
   
   JuiceShop.addJuiceName("bannana");
   System.out.println("Added juice" + addedJuice );
   
   JuiceShop.addJuiceName("kiwi");
   System.out.println("Added juice" + addedJuice );
   
   JuiceShop.showJuiceNames();
 
 }




}