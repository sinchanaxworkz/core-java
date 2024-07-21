
class LicRegestration{
        
	    static long aadhaarNo ;
		static String givenName ;
		static String surName ;
		static long iD ;
		static String password ;
		static String confirmPassword ;
		static long phoneNumber ;
		static String reli ;
		static String cate ;
		static String dateOfBirth ;
		static String emailId ;
		static String tal ;
		static String dis ;                         
	
		
		

    public static boolean createLicRegestration(long aadhaarNumber, String firstName, String lastName, long userID, String pwd, String confirmPwd, long mobileNumber, String religion, String category, String dob, String email, String taluk, String district){
	
	    boolean isLicRegestration = false ;
		    aadhaarNo = aadhaarNumber ;
			givenName = firstName ;
			surName = lastName;
			iD = userID ;
			password = pwd ;
			confirmPassword = confirmPwd ;
			phoneNumber = mobileNumber ;
			reli = religion ;
			cate = category ;
			dateOfBirth = dob ;
			emailId = email ;
			tal = taluk ;
			dis = district ;
		    
			isLicRegestration = true ;
		
		
		
		
		
		return isLicRegestration;
	}
    
	public static void readLicRegestrationDetails(){
		
		 
		System.out.println("fetching... Student Details...");
		System.out.println("The Student Aadhaar Number is :" + aadhaarNo);
		System.out.println("The Student First Name is :" + givenName);
        System.out.println("The Student Last Name is :" + surName);
        System.out.println("The Student User Id is :" + iD);
        System.out.println("The Student User Password is :" + password);	
		System.out.println("The Student User Confirm Password is :" + confirmPassword);
		System.out.println("The Student Phone Number is :" + phoneNumber);
		System.out.println("The Student Religion is :" + reli);
		System.out.println("The Student Category is:" + cate);
		System.out.println("The Student Date of Birth is :" + dateOfBirth);
		System.out.println("The Student email Id is :" + emailId);
		System.out.println("The Student Taluk is :" + tal);
		System.out.println("The Student District is :" + dis);
		
		
	}
}
