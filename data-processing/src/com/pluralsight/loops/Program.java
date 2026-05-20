package com.pluralsight.loops;

import java.util.ArrayList;
import java.util.Scanner;

public class Program
{
//  [ STEP 1 ]
//  In your main method create a list of at least 10 people.
    public static void main(String[] args) {
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

//      [ STEP 2 ]
//      Prompt the user for a name to search (first or last).
//      Using a for loop, create a new List of people whose name was a match, display the names of the people in that list

        // Prompt user input and then loop that input to filter into a new List. Then display
        Scanner scanner = new Scanner(System.in);

        System.out.print("Search name: ");
        String search = scanner.nextLine();

        // Creating an ArrayList that will contain the elements that pass through the for-if loop
        ArrayList<Person> filterSearch = new ArrayList<>();

        for (int i = 0; i < person.size(); i++)
        {
            Person p = person.get(i);
            if (p.getFirstName().equalsIgnoreCase(search) || p.getLastName().equalsIgnoreCase(search))
            {
                filterSearch.add(p);
            }
        }
    // -----------------------------------------------------------------------------------------------------------------
        // Display filtered 'person' list
        if (!filterSearch.isEmpty())
        {
            for(int i = 0; i < filterSearch.size(); i++)
            {
                Person filter = filterSearch.get(i);
                System.out.println("Filter Results:");
                System.out.println(filter.getFirstName() + " " + filter.getLastName());
            }
        }
        else
        {
            System.out.println("Search entry does not match our records. System shutting down... (you broke the application you absolute GOOF.)");
        }
//        [ STEP 3 ]
//        Calculate the average age of all people in the original list and display it.
//        Display the age of the oldest person in the list.
//        Display the age of the youngest person in the list.

        // Calculate average age [ Get each age of the elements in 'person' and divide it by .size() ]
        int allAges = 0;

        for (int i = 0; i < person.size(); i++)
        {
            allAges += person.get(i).getAge();
        }
            int average = allAges / person.size();
            System.out.println("The average age is: " + average );

        // Display oldest age
        int oldestAge = person.get(0).getAge();
        for (int i = 0; i < person.size(); i++)
        {
            if (person.get(i).getAge() > oldestAge)
            {
                oldestAge = person.get(i).getAge();
            }
        }
        System.out.println("The oldest age is: " + oldestAge);

        // Display youngest age
        int youngestAge = person.get(0).getAge();
        for (int i = 0; i < person.size(); i++)
        {
            if (person.get(i).getAge() < youngestAge)
            {
                youngestAge = person.get(i).getAge();
            }
        }
        System.out.println("The youngest age is: " + youngestAge);
    }
}

