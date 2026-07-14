package project;
class Employee {
    double calculateSalary() {
        return 0;
    }
}

class FullTimeEmployee extends Employee {
    double monthlySalary;

    FullTimeEmployee(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    int hoursWorked;
    double hourlyRate;

    PartTimeEmployee(int hoursWorked, double hourlyRate) {
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

class Freelancer extends Employee {
    int projects;
    double paymentPerProject;

    Freelancer(int projects, double paymentPerProject) {
        this.projects = projects;
        this.paymentPerProject = paymentPerProject;
    }

    double calculateSalary() {
        return projects * paymentPerProject;
    }
}

public class polymorphism1 {
    public static void main(String[] args) {
        Employee[] employees = {
            new FullTimeEmployee(50000),
            new PartTimeEmployee(80, 350),
            new Freelancer(5, 12000)
        };

        for (Employee e : employees) {
            System.out.println("Salary: " + e.calculateSalary());
        }
    }
}



