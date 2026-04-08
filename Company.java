class Company {
    int getEmployeeCount() {
        int totalEmployees = 500;
        System.out.println("Total Employees: " + totalEmployees);
        return totalEmployees;
    }

    
	
    void displayCompanyName(String companyTitle) {
        System.out.println("Company Name: " + companyTitle);

       
	   
        int employees = getEmployeeCount();
        System.out.println("Returned Employees: " + employees);
    }

   
   
    void showDetails() {
        System.out.println("Company details");

      
	  
        displayCompanyName("Tech Solutions");
    }
}



