
class MeeshoCreateAccount{
        
	    static String gName ;
		static String sName ;
		static long phnum ;
		static String mi ;
		static String pwd;
		static String confrmpwd ;
		
    public static boolean createUserAccount(String firstName, String lastName, long mobileNumber, String email, String password, String confirmPassword){
	
	     boolean isMeeshoCreateAccount = false ;
		 gName = firstName ;
		 sName = lastName;
		 phnum = mobileNumber ;
		 mi = email ;
		 pwd = password ;
		 confrmpwd = confirmPassword ;
		 isMeeshoCreateAccount = true ;
		 
		 return isMeeshoCreateAccount ;
	
	}
    
	public static void readUserAccountDetails(){
	
	    System.out.println("fetching... Student Details...");
		System.out.println("The User First Name is :" + gName);
		System.out.println("The User Last Name is :" + sName);
		System.out.println("The User Phone Number is :" + phnum);
		System.out.println("The User email Id is :" + mi);
		System.out.println("The User Password is :" + pwd);
		System.out.println("The User Confirm Password is :" + confrmpwd);
	
	}
}
