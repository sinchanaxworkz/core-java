
class StateBankRunner{
	
	public static void main(String[]bank){
		
		System.out.println("Main Started");
		
		boolean isSbiCreated = Sbi.createSbiAccount("89976895",null,"SBIN04103","8431159356","India","UI887v2");
		if(isSbiCreated == true)
		Sbi.readSbiAccount();
		
		System.out.println("Main ended");
	}
}
