package com.Bridgelabez.Level1;

public class Employee {
    //instance variable
     String name;
     double salary;
     int ID;

     //constructor with argument
     public Employee(String name,double salary,int ID){
         this.name=name;
         this.salary=salary;
         this.ID=ID;
     }

    public double yearlySalary(){
        return salary*12;
    }

    public void printEmplyoee(){
        System.out.println("Emplyoee name: "+name+" Salary: "+salary);
    }

    public static void main(String[] args) {
       Employee emp=new Employee("Sanvi",35000,14310);
       emp.printEmplyoee();
    }
}
