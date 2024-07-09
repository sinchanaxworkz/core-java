class HeaterRunner{
	public static void main(String args[]){
		System.out.println("Main Started");
		boolean connect=Heater.onOrOff();
		System.out.println("isconnected :"+ connect);
		connect=Heater.onOrOff();
		System.out.println("isconnected :"+ connect);
		
		System.out.println("Main Started");
}
}