class BillRunner{
	public static void main(String billing[]){
		// ClassName ref = new ClassName();
		Bill ref = new Bill();
		
		ref.billReferenceId = 100;
		ref.billSequenceNo = 1;
		ref.billIssueDate = "14-07-2024";
		ref.billDueDate = "31-07-2024";
		ref.isBillPaid = false;
		ref.isLatestBill = true;
		ref.isFinalBill = false;
		ref.billAmount = 345.90;
		ref.taxInclusiveBill = true;
		
		System.out.println("Bill generated for 14-07-2024 month is :");
		
		System.out.println("Bill Reference Id is " + ref.billReferenceId);
		System.out.println("Bill Sequence Number is " + ref.billSequenceNo);
		System.out.println("Bill is Issued on " + ref.billIssueDate);
		System.out.println("Bill due date is " + ref.billDueDate);
		System.out.println("Bill is paid or not " + ref.isBillPaid);
		System.out.println("Is the bill is latest " + ref.isLatestBill);
		System.out.println("Is this bill is Final " + ref.isFinalBill);
		System.out.println("Bill amount is " + ref.billAmount);
		System.out.println("Is bill is tax Inclusive " + ref.taxInclusiveBill);
		
		Bill bill = new Bill();
		
		bill.billReferenceId = 101;
		bill.billSequenceNo = 2;
		bill.billIssueDate = "14-08-2024";
		bill.billDueDate = "31-08-2024";
		bill.isBillPaid = false;
		bill.isLatestBill = true;
		bill.isFinalBill = false;
		bill.billAmount = 567.90;
		bill.taxInclusiveBill = true;
		
		System.out.println("Bill generated for 14-08-2024 month is :");
		
		System.out.println("Bill Reference Id is " + bill.billReferenceId);
		System.out.println("Bill Sequence Number is " + bill.billSequenceNo);
		System.out.println("Bill is Issued on " + bill.billIssueDate);
		System.out.println("Bill due date is " + bill.billDueDate);
		System.out.println("Bill is paid or not " + bill.isBillPaid);
		System.out.println("Is the bill is latest " + bill.isLatestBill);
		System.out.println("Is this bill is Final " + bill.isFinalBill);
		System.out.println("Bill amount is " + bill.billAmount);
	
		System.out.println("Is bill is tax Inclusive " + bill.taxInclusiveBill);
		
	}
}