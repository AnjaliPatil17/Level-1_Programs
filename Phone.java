package com.Bridgelabez.Level1;

public class Phone {
    //Instance variable
    int storage;
    String make;
    String model;
    //Constructor with argument
    public Phone(String make,String model,int storage){
        this.make=make;
        this.model=model;
        this.storage=storage;
    }

    public void printPhoneDetails(){
        System.out.println("The make is "+make);
        System.out.println("The model is "+model);
        System.out.println("The Storage is "+storage);
    }

    public double calculatePrice(){
        double base_price=7000;
        double base_storage_price = 400 * storage;
        double make_model_price = 0.0;

        if(make.equalsIgnoreCase("Apple") && model.equalsIgnoreCase("iPhone")){
            make_model_price = 45000;
        }
        else if(make.equalsIgnoreCase("Samsung") && model.equalsIgnoreCase("Galexy")){
            make_model_price = 20000;
        }
        else if(make.equalsIgnoreCase("MI") && model.equalsIgnoreCase("Xiomi")){
            make_model_price = 12000;
        }

        return (base_price + base_storage_price + make_model_price);
    }

    public void printPhoneInfo(){

        System.out.println("Phone model is : "+model);
        System.out.println("Phone Make is : "+make);
        System.out.println("Phone Storage Capacity is : "+storage);
    }
    public static void main(String[] args) {
        Phone p1 = new Phone("Apple", "iPhone", 256);
        p1.printPhoneInfo();
        System.out.println("Price of Phone :"+p1.calculatePrice());

    }
}
