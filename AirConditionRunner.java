class AirConditionRunner{
  public static void main(String as[]){
  System.out.println("Main started");
  
  boolean connect=AirCondition.onOrOff();
  System.out.println("Is connected :"+ connect);
  
  AirCondition.increaseVolume();
  AirCondition.increaseVolume();
  AirCondition.increaseVolume();
  AirCondition.increaseVolume();
  AirCondition.increaseVolume();
  AirCondition.increaseVolume();
  AirCondition.increaseVolume();
  AirCondition.increaseVolume();
  
  AirCondition.increaseVolume();
  AirCondition.decreaseVolume();
  AirCondition.decreaseVolume();
  AirCondition.decreaseVolume();
  AirCondition.decreaseVolume();
  AirCondition.decreaseVolume();
  AirCondition.decreaseVolume();
  AirCondition.decreaseVolume();
  AirCondition.decreaseVolume();
  
  connect=AirCondition.onOrOff();
  System.out.println("Is connected :"+ connect);
  AirCondition.increaseVolume();
  AirCondition.decreaseVolume();
  
  
  System.out.println("Main Ended");
  }

}