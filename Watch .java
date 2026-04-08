class Watch {

    int getAmount() {
        int amount = 8000;
        System.out.println("Amount is: " + amount);
        return amount;
    }

  
    void displayCompany(String companyName) {
        System.out.println("Company Name is: " + companyName);

     
        int a = getAmount();
        System.out.println("Returned Amount: " + a);
    }

  
    void showInfo() {
        System.out.println("Watch details");

     
        displayCompany("Titan");
    }
}