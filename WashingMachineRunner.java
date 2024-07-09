class WashingMachineRunner{
	public static void main(String args[]){
		System.out.println("Main Started");
		boolean connect=WashingMachine.onOrOff();
		System.out.println("isconnected :"+ connect);
		connect=WashingMachine.onOrOff();
		System.out.println("isconnected :"+ connect);
		
		System.out.println("Main Started");
}
}