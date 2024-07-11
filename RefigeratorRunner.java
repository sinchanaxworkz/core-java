class RefigeratorRunner{
  public static void main(String as[]){
  System.out.println("Main started");
  
  boolean connect=Refigerator.onOrOff();
  System.out.println("Is connected :"+ connect);
  
  Refigerator.increaseVolume();
  Refigerator.increaseVolume();
  Refigerator.increaseVolume();
  Refigerator.increaseVolume();
  Refigerator.increaseVolume();
  Refigerator.increaseVolume();
  Refigerator.increaseVolume();
  Refigerator.increaseVolume();
  
  Refigerator.increaseVolume();
  Refigerator.decreaseVolume();
  Refigerator.decreaseVolume();
  Refigerator.decreaseVolume();
  Refigerator.decreaseVolume();
  Refigerator.decreaseVolume();
  Refigerator.decreaseVolume();
  Refigerator.decreaseVolume();
  Refigerator.decreaseVolume();
  
  connect=Refigerator.onOrOff();
  System.out.println("Is connected :"+ connect);
  Refigerator.increaseVolume();
  Refigerator.decreaseVolume();
  
  
  System.out.println("Main Ended");
  }

}