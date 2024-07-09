class Tv{
static boolean isConnected=false;
  public static void turnOn(){
  System.out.println("start of turnOn");
  if(isConnected==false){
  isConnected=true;
  System.out.println("Tv is turned on");
  }
  System.out.println("End of turnOn");
  }
  
  public static void turnOff(){
  System.out.println("start of turnOff");
  if(isConnected==true){
  isConnected=false;
  System.out.println("Tv is turned on");
  }
  System.out.println("End of turnOn");
   }
}