package com.Bridgelabez.Level1;

public class TV {
    String brand;
    double size;
    double price;
    double discount_price;

    public TV(double size, double price, String brand){
        this.size=size;
        this.brand=brand;
        this.price=price;
    }

    public double calculatetvDiscount(double discount_percentage){
        discount_price = price * (discount_percentage /100);

        if(size == 32){
            return price - discount_price;
        }
        else if(size == 42)
            return price - discount_price;
        return discount_price;

    }

    public void TvInfo(){

        System.out.println("Tv Brand : "+brand);
        System.out.println("Tv Size : "+size);
        System.out.println("Price of the Tv : "+price);
        System.out.println("Discount Price : "+discount_price);
    }
    public static void main(String[] args) {
        TV t1=new TV( 32, 25000,"Samsung");
        System.out.println("Tv price with discount : "+t1.calculatetvDiscount(15));
        t1.TvInfo();
    }
}


