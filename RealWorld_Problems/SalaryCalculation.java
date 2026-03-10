/*
Program: Salary System using Multilevel Inheritance and Method Overriding

Class Hierarchy:
Employee → Manager → Director

Description:
This program demonstrates method overriding along with the use of
super keyword in a multilevel inheritance structure.

Rules Implemented:
1. Employee class defines the base salary using getSalary() method.
   Base Salary = ₹50,000

2. Manager class extends Employee and overrides getSalary().
   Manager salary = Employee salary + 20% bonus.

3. Director class extends Manager and overrides getSalary().
   Director salary = Manager salary + 50% bonus.

Important Conditions:
- Each overridden method calls super.getSalary() to obtain the salary
  from its parent class.
- No hardcoded salary values are used in child classes.
- The salary is calculated step by step through the inheritance chain.

Objective:
Create a Director object and call getSalary() to observe how salary
is calculated at each level of inheritance.
*/


class Employee{
    double getSalary()
    {
       return 50000;
    }
}
class Manager extends Employee{
    @Override
    double getSalary()
    {
       double base = super.getSalary();
       return base + base*0.2;
    }
}

class Director extends Manager{
    @Override
    double getSalary()
    {
      double base = super.getSalary();
      return base + base*0.5;
    }
}

public class SalaryCalculation{
    public static void main(String[] args)
    {
        System.out.println("Employee  : " +        new Employee().getSalary());
        System.out.println("Manager   : " + new Manager().getSalary());
        System.out.println("Director  : " + new Director().getSalary());
    }
} 
