package com.company;

public class Doctor extends Rescure{
    public Doctor(String name, String uniform) {
        super(name, uniform);
    }
    public Doctor(String name, String uniform, String instrument) {
        super(name, uniform, instrument);
    }
    public void safelife(){
        System.out.println("Я лечу людей за сумму : ");
    }
    public void safelife(double sum){
        System.out.println("Я лечу людей за сумму : "+sum);
    }
}
