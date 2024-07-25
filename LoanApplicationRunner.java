
class LoanApplicationRunner {
    public static void main(String[] args) {
        boolean isLoanApplied = LoanApplication.applyForLoan("sinchana", "13-02-2003", "shimogga", 9876564321L,"sinchu.doe@example.com", 60000, "bike Renovation", 200000, 450);

        if (isLoanApplied) {
            LoanApplication.readLoanApplicationData();
        } else {
            System.out.println("Loan application failed. Please check the input parameters.");
        }
    }
}
