class HeaterRunner{
  public static void main(String as[]){
  System.out.println("Main started");
  
  boolean connect=Heater.onOrOff();
  System.out.println("Is connected :"+ connect);
  
  Heater.increaseVolume();
  Heater.increaseVolume();
  Heater.increaseVolume();
  Heater.increaseVolume();
  Heater.increaseVolume();
  Heater.increaseVolume();
  Heater.increaseVolume();
  Heater.increaseVolume();
  
  Heater.increaseVolume();
  Heater.decreaseVolume();
  Heater.decreaseVolume();
  Heater.decreaseVolume();
  Heater.decreaseVolume();
  Heater.decreaseVolume();
  Heater.decreaseVolume();
  Heater.decreaseVolume();
  Heater.decreaseVolume();
  
  connect=Heater.onOrOff();
  System.out.println("Is connected :"+ connect);
  Heater.increaseVolume();
  Heater.decreaseVolume();
  
  
  System.out.println("Main Ended");
  }

}