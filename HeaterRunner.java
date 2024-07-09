class HeaterRunner{
	public static void main(String args[]){
		System.out.println("Main Started");
		Heater.turnOn();
		Heater.turnOff();
		Heater.turnOn();
		Heater.turnOff();
		System.out.println("End Started");
}
}