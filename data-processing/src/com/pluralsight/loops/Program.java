package com.pluralsight.loops;

import java.util.ArrayList;
import java.util.Scanner;

public class Program
{
    public static void main(String[] args)
    {


        // Manually creating instances of 'Person' class.
        Person gon = new Person("Gon", "Freecss", 12);
        Person killua = new Person("Killua", "Zoldyck", 12);
        Person kurapika = new Person("Kurapika", "Kurta", 17);
        Person leorio = new Person("Leorio", "Paradinight", 19);
        Person hisoka = new Person("Hisoka", "Morow", 28);
        Person illumi = new Person("Illumi", "Zoldyck", 24);
        Person chrollo = new Person("Chrollo", "Lucilfer", 26);
        Person biscuit = new Person("Biscuit", "Krueger", 57);
        Person ging = new Person("Ging", "Freecss", 32);
        Person alluka = new Person("Alluka", "Zoldyck", 11);

        // Creating an 'Person' Arraylist and calling the list 'name'
        ArrayList<Person> name = new ArrayList<>();

        // Manually adding the 'Person' objects to our 'name' ArrayList
        name.add(gon);
        name.add(killua);
        name.add(kurapika);
        name.add(leorio);
        name.add(hisoka);
        name.add(illumi);
        name.add(chrollo);
        name.add(biscuit);
        name.add(ging);
        name.add(alluka);
    }

    }

