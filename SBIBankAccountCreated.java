
class SBIBankAccountCreated{
        
	    static String gName ;
		static String mName ;
		static String MName ;
		static String fName ;
		static long AaNo ;
		static String cB ;
		static String cityB ;
		static String nat;
		static String dis ;
		static String st ;
		static long pN ;
		static String address ;
		
    public static boolean createBankAccount(String firstName, String middleName, String mothersName, String fathersName, long AadhaarNumber, String countryOfBirth, String cityOfBirth, String nationality, String district, String state, long mobileNumber, String permanentAddress){
	
	     boolean isBankAccountCreated = false ;
		 gName = firstName ;
		 mName = middleName ;
		 MName = mothersName ;
		 fName = fathersName ;
		 AaNo = AadhaarNumber ;
		 cB = countryOfBirth ;
		 cityB = cityOfBirth ;
		 nat = nationality ;
		 dis = district ;
		 st = state ;
		 pN = mobileNumber ;
		 address = permanentAddress ;
		 isBankAccountCreated = true ;
		 
		 return isBankAccountCreated ;
	
	}
    
	public static void readBankAccountDetails(){
	
	    System.out.println("fetching... Student Details...");
		System.out.println("The Customer First Name is :" + gName);
		System.out.println("The Customer Middle Name is :" + mName);
		System.out.println("The Customer Mother Name is :" + MName);
		System.out.println("The Customer Father Name is :" + fName);
		System.out.println("The Customer Aadhaar Number is :" + AaNo);
		System.out.println("The Customer Country of Birth is :" + cB);
		System.out.println("The Customer City of Birth is :" + cityB);
		System.out.println("The Customer Nationality is :" +nat);
		System.out.println("The Customer District is :" + dis);
		System.out.println("The Customer State is :" + st);
		System.out.println("The Customer Mobile Number is :" + pN);
		System.out.println("The Customer Permanent Address is :" + address);
		
		
	
	}
}
