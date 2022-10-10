
/*
12) Create an Association class that encapsulates two objects of different types. Similar
to Exercise above, create a Transition class that does the same of Association class
with three objects.

name:haril ankleshwariya
ID:21ce003


*/
class hospital {

    private String name;

    // Constructor of this class
    hospital(String name) {

        this.name = name;
    }

    // Method of Bank class
    public String gethospitalName() {
        // Returning name of bank
        return this.name;
    }
}

class Employee {
    // Attributes of employee
    private String name;

    // Employee name
    Employee(String name) {
        // This keyword refers to current instance itself
        this.name = name;
    }

    // Method of Employee class
    public String getEmployeeName() {
        // returning the name of employee
        return this.name;
    }
}

class pr12 {

    // Main driver method
    public static void main(String[] args) {

        // Creating objects of bank and Employee class
        hospital bank = new hospital("manta hospital");
        Employee emp = new Employee("haril ankleshwariya");
        System.out.println(emp.getEmployeeName()
                + " is employee of "
                + bank.gethospitalName());
    }
}
