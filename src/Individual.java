/*
Written by Dexter Jones
Date: 12/16/2023

Pseudocode:
An application that will print the following information for a fictional character:

User input:
First Name (string)
Last Name (string)
Street Address (string)
City (string)
Zip code (string)

Output:
Result (combination of the above information)
 */

import java.util.Scanner;

public class Individual {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String fName, lName, address, city, zip;
        String result[] = new String[5];

        System.out.println("Fictional Character Information\n");

        System.out.println("First name: ");
        fName = scnr.nextLine();
        result[0] = fName;
        System.out.println("Last name: ");
        lName = scnr.nextLine();
        result[1] = lName;
        System.out.println("Street address: ");
        address = scnr.nextLine();
        result[2] = address;
        System.out.println("City: ");
        city = scnr.nextLine();
        result[3] = city;
        System.out.println("Zip code: ");
        zip = scnr.nextLine();
        result[4] = zip;

        System.out.println("The fictional character information is: ");
        for (int i = 0; i < result.length; i++) {
            if (i == 0)
                System.out.print("First Name: ");
            else if (i == 1)
                System.out.print("Last Name: ");
            else if (i == 2)
                System.out.print("Street Address: ");
            else if (i == 3)
                System.out.print("City: ");
            else
                System.out.print("Zip Code: ");
            System.out.println(result[i]);
        }
    }
}