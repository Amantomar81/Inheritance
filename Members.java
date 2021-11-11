/*
Q. Create a class named 'Member' having the following members:

Data members
1 - Name
2 - Age
3 - Phone number
4 - Address
5 - Salary
It also has a method named 'printSalary' which prints the salary of the members.
Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' and 'Manager' classes
have data members 'specialization' and 'department' respectively. Now, assign name, age, phone number,
address and salary to an employee and a manager by making an object of both of these classes and print the same.
 */
public class Members {
    String Name;
    int Age;
    int Phn_No;
    String Address;
    int Salary;

    public void printSalary() {
        System.out.println("The salary of the members");
    }

    static class Employee extends Members {
        String specialization;
        String department;

        Employee() {
            System.out.println(Name = "Aman Kumar");
            System.out.println(Age = 20);
            System.out.println(Phn_No = 817159808);
            System.out.println(Address = "Aligarh");
            System.out.println(Salary = 999999);
        }
    }

    static class Manager extends Members {
        String Specialization;
        String Department;

        Manager() {

            System.out.println(Name = "Dracula");
            System.out.println(Age = 18);
            System.out.println(Phn_No = 654389261);
            System.out.println(Address = "Delhi");
            System.out.println(Salary = 999);
        }
    }

    public static void main(String[] args) {
        Employee obj= new Employee();
        Manager obj1= new Manager();

    }
}
