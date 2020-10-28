abstract class Employee
{
    String name, phoneNumber, address;
    int age, salary;
    void printSalary(int salary)
    {
        System.out.println("Salary: "+salary);
    }
}
class Officer extends Employee
{
    
    String specialization;
}
class Manager extends Employee
{
    String department;
    
}
public class emp
{
    public static void main(String[] arg)
    {
        Officer offcr = new Officer();
        Manager mngr = new Manager();
        offcr.name = "OfficerName";
        offcr.age = 25;
        offcr.phoneNumber = "0123456789";
        offcr.address = "HouseNumber, PO, place";
        offcr.salary = 30000;
        offcr.specialization = "technician";
        
        mngr.name = "ManagerName";
        mngr.age = 30;
        mngr.phoneNumber = "0123456789";
        mngr.address = "HouseNumber, PO, place";
        mngr.salary = 45000;
        mngr.department = "sales";

        //displaying details
        
        //Details of officer
        System.out.println("\nDetails of officer:");
        System.out.println("Name: "+ offcr.name);
        System.out.println("Age: "+ offcr.age);
        System.out.println("Ph.no: "+ offcr.phoneNumber);
        System.out.println("Address: "+ offcr.address);
        offcr.printSalary(offcr.salary);
        //System.out.println("Salary: "+ offcr.salary);
        System.out.println("Specialization: "+ offcr.specialization);

        //Details of manager
        System.out.println("\nDetails of Manager:");
        System.out.println("Name: "+ mngr.name);
        System.out.println("Age: "+ mngr.age);
        System.out.println("Ph.no: "+ mngr.phoneNumber);
        System.out.println("Address: "+ mngr.address);
        mngr.printSalary(mngr.salary);
        //System.out.println("Salary: "+ mngr.salary);
        System.out.println("Specialization: "+ mngr.department);

    }
}