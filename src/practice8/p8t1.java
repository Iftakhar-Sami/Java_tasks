public class p8t1 {
    
}
class FullTimeEmployee extends Employee {
    double fixedSalary;
}
class PartTimeEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;
}
class ContractEmployee extends Employee {
    String projectName;
    double ContractAmount;
}

class Employee{
    String name;
    int id;
    String department;
    void calculatePay(){
        
    }
}