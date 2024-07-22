
class LoanApplicationRunner{

    public static void main(String[]loan){
		
		System.out.println("Main Started");
		boolean isLoanCreated=LoanApplication.createLoanAccount(null,"Personal","Sinchana","kenara Bank","9.8","5 years");
		if(isLoanCreated == true)
		LoanApplication.readLoanAccount();
		System.out.println("Main ended");
	}
}
