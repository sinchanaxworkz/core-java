
class TwiterAccountGenerated{
        
		static String email ;
		static String pwd ;
		static String givenName ;
	    
		
    public static boolean createUserAccount(String emailId, String password, String userName){
	
	     boolean isTwiterAccountGenerated = false ;
		 
		 email = emailId ;
		 pwd = password ;
		 givenName = userName ;
		 
		 isTwiterAccountGenerated = true ;
		 
		 return isTwiterAccountGenerated ;
	
	}
    
	public static void readUserAccountDetails(){
	
	    System.out.println("fetching... Lic Details...");
		System.out.println("The User email address is :" + email);
		System.out.println("The User Password is :" + pwd);
		System.out.println("The User Name is :" + givenName);
		
	}
}
