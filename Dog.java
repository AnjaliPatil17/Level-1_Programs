package com.Bridgelabez.Level1;

public class Dog {
    //Instance Variable
    int age;
    String breed;
    double weight;
    int humanage;

    //constructor with argument
    public Dog(String breed,int age,double weight){
        this.breed=breed;
        this.age=age;
        this.weight=weight;
    }

    public int humanAgeYears() {
        if(this.age>=2){
            humanage = age * 7;
        }
        else{
            humanage = 22 + (age-2)*5;
        }
        return humanage;
    }
    public void printDogInfo(){
        System.out.println("The breed is "+breed);
        System.out.println("The age is "+age + "\nHuman year :"+humanAgeYears());
        System.out.println("The weight is "+weight);
    }

    public static void main(String[] args) {
      Dog d1=new Dog("bulldog",12,25);
      d1.printDogInfo();
    }
}
