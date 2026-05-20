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

        // Creating an 'Person' Arraylist and calling the list 'person'
        ArrayList<Person> person = new ArrayList<>();

        // Manually adding the 'Person' objects to our 'person' ArrayList
        person.add(gon);
        person.add(killua);
        person.add(kurapika);
        person.add(leorio);
        person.add(hisoka);
        person.add(illumi);
        person.add(chrollo);
        person.add(biscuit);
        person.add(ging);
        person.add(alluka);

        // Prompt user input and then loop that input to filter into a new List. Then display
        Scanner scanner = new Scanner(Sytem.in);
        System.out.println("Search name: ");
        String search = scanner.nextLine();

        ArrayList<Person> filterSearch = new ArrayList<>();

        for (i = 0; i < person.size(); i++)
        {
            Person p = person.get(i);
            if (p.getFirstName().equalsIgnoreCase(search) || p.getLastName().equalsIgnoreCase(search))
            {
                filterSearch.add(p);
            }


        }
    }

    }

