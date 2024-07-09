class CoolerRunner{
	public static void main(String args[]){
		System.out.println("Main Started");
		boolean connect=Cooler.onOrOff();
		System.out.println("isconnected :"+ connect);
		connect=Cooler.onOrOff();
		System.out.println("isconnected :"+ connect);
		
		System.out.println("Main Started");
}
}