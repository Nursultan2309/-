package com.company;

public class Main {

    public static void main(String[] args) {

        Police police= new Police("Jake", "black", "gun");
        System.out.println(police.getName());
        Fireman fireman=new Fireman("Monro", "red", "water");

        Doctor doctor =new Doctor("House", "white");

        Rescure[] rescures={police, fireman,doctor};

        doctor.safelife();

        doctor.safelife(100);
        System.out.println(police);

    }
}
