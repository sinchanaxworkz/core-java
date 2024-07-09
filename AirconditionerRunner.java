class AirConditionerRunner{
	public static void main(String args[]){
		System.out.println("Main Started");
		boolean connect=AirConditioner.onOrOff();
		System.out.println("isconnected :"+ connect);
		connect=AirConditioner.onOrOff();
		System.out.println("isconnected :"+ connect);
		
		System.out.println("Main Started");
}
}