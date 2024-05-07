package com.Bridgelabez.Level1;

public class Student {
    //Instance variable
    String name;
    int age;
    int ID;

    //Constructor with argument
    public Student(String name,int age,int ID){
        this.name=name;
        this.age=age;
        this.ID=ID;
    }

    //Method to print Student name,age,ID
    public void printNameAndAge(){
        System.out.println("Student name: "+name);
        System.out.print("Student age: "+age);
    }


    public static void main(String[] args) {
        //Create object for class Student
        Student stud1=new Student("sanvi",20,43110);
        stud1.printNameAndAge();
    }
}
