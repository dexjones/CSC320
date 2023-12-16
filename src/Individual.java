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
Zip code (int)

Output:
Result (combination of the above information)
 */

import java.util.Scanner;

public class Individual {
    public static void main(String[] args) {
        String fName, lName, address, city;
        int zip;

        System.out.println("Fictional Character Information");

        fName = "Dexter";
        lName = "Jones";
        address = "123 Sunshine Road";
        city = "Laramie";
        zip = 82072;

        System.out.println(fName);
        System.out.println(lName);
        System.out.println(address);
        System.out.println(city);
        System.out.println(zip);
    }
}