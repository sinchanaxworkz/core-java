
class j{
	
	public static void main(String[]institute){
		
		System.out.println("Main Started");
		boolean isXworkzCreated=XWorkz.createXWorkzAccount("Sinchan V Shetty","98765432",null,"Sinchana@gmail.com","4SU20IS041","BE","ISE","SDMIT");
		if(isXworkzCreated == true)
		XWorkz.readXWorkzAccount();
		System.out.println("Main ended");
	}
}
