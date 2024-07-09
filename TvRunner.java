class TvRunner{
	public static void main(String args[]){
		System.out.println("Main Started");
		boolean connect=Tv.onOrOff();
		System.out.println("isconnected :"+ connect);
		connect=Tv.onOrOff();
		System.out.println("isconnected :"+ connect);
		
		System.out.println("Main Started");
}
}