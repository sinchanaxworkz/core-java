class TvRunner{
  public static void main(String tv[]){
  System.out.println("Main started");
  
  boolean connect=Tv.onOrOff();
  System.out.println("Is connected :"+ connect);
  
  Tv.increaseVolume();
  Tv.increaseVolume();
  Tv.increaseVolume();
  Tv.increaseVolume();
  Tv.increaseVolume();
  Tv.increaseVolume();
  Tv.increaseVolume();
  Tv.increaseVolume();
  
  Tv.increaseVolume();
  Tv.decreaseVolume();
  Tv.decreaseVolume();
  Tv.decreaseVolume();
  Tv.decreaseVolume();
  Tv.decreaseVolume();
  Tv.decreaseVolume();
  Tv.decreaseVolume();
  Tv.decreaseVolume();
  
  connect=Tv.onOrOff();
  System.out.println("Is connected :"+ connect);
  Tv.increaseVolume();
  Tv.decreaseVolume();
  
  
  System.out.println("Main Ended");
  }

}