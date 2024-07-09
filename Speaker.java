class Speaker{
static boolean isConnected=false;
public static void onOrOff(){
  System.out.println("Start of onOrOff");
  if(isConnected==false){
  isConnected=true;
  System.out.println("Speaker is turned on");
  }
  else if(isConnected==true){
  isConnected=false;
  System.out.println("Speaker is turned off");
  }
  System.out.println("End of onOrOff");
  return;


}



}