package lesson_3;

import org.jetbrains.annotations.NotNull;

import static lesson_3.Employee.employeeInfo;

public class Employee {

    public final String fio;
    public final String position;
    public final String email;
    public final String phoneNumber;
    public final double salary;
    public final int age;

    Employee(String fio, String position, String email, String phoneNumber, double salary, int age){
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public static void employeeInfo(@NotNull Employee emp){
        System.out.println(emp.fio + " " + emp.position + " " + emp.email + " " + emp.phoneNumber + " " + emp.salary + " " + emp.age);
    }
}

class EmployeeTest{
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Petrov Petr","Developer","qw@qw.com","+275203",1200,40);
        employees[1] = new Employee("Danilov Daniil","QA","qw2@qw.com","+275202",800,25);
        employees[2] = new Employee("Zaurov Zaur","CEO","qw1@qw.com","+275223",2400,58);
        employees[3] = new Employee("Dmitrov Dmitry","Trainee","qw3@qw.com","+275205",200,18);
        employees[4] = new Employee("Ivanov Ivan","DevOPS","qw4@qw.com","+275208",1500,44);
        for (int i = 0; i < employees.length;i++){
            if (employees[i].age >= 40) {
                employeeInfo(employees[i]);
            }
        }
    }
}
