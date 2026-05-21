package com.pluralsight.streams;

import com.pluralsight.loops.Person;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

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

        // Creating a 'Person' Arraylist and calling the list 'person'
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

        // In your name search logic, replace your for loop with a stream and filter function.
        // Ensure that your new list of names still contains the correct results
        Scanner scanner = new Scanner(System.in);

        System.out.print("Search name: ");
        String search = scanner.nextLine();

        ArrayList<Person> filter = person.stream()
                .filter(per -> per.getFirstName().equalsIgnoreCase(search)|| per.getLastName().equalsIgnoreCase(search))
                .collect(Collectors.toCollection(ArrayList::new));

    }
}



