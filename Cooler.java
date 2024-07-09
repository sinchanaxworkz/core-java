class Cooler{
static boolean isConnected=false;
  public static boolean onOrOff(){
  System.out.println("start of onOrOff");
  if(isConnected==false){
  isConnected=true;
  System.out.println(" Cooler is turned on");
  }
  else if(isConnected==true){
  isConnected=false;
  System.out.println(" Cooler is turned on");
  }
  System.out.println("End of onoroff");
  return isConnected;
   }
}