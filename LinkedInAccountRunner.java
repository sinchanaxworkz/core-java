class LinkedInAccountRunner {
    public static void main(String[] args) {
        boolean isAccountCreated = LinkedInAccount.createAccount("sinchana", "sinchu@gmail.com", "sinchu321", "sinchu321", "098765432","Software Engineer", "xworkz", "sdm", "engineering",
       "ISE", "2024", "Java,html,css");

        if (isAccountCreated) {
            LinkedInAccount.readAccountData();
        } else {
            System.out.println("Account creation failed. Please check the input parameters.");
        }
    }
}