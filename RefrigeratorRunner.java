class RefrigeratorRunner{
	public static void main(String args[]){
		System.out.println("Main Started");
		boolean connect=Refrigerator.onOrOff();
		System.out.println("isconnected :"+ connect);
		connect=Refrigerator.onOrOff();
		System.out.println("isconnected :"+ connect);
		
		System.out.println("Main Started");
}
}