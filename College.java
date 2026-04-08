class College {

    int getDepartments() {
        int totalDepartments = 12;
        System.out.println("Total Departments: " + totalDepartments);
        return totalDepartments;
    }

    void displayCollegeName(String collegeName) {
	
        System.out.println("College Name: " + collegeName);
        int dept = getDepartments();
        System.out.println("Returned Departments: " + dept);
    }
    void showInfo() {
        System.out.println("College details");

        displayCollegeName("ABC College");
    }
}

