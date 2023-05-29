package com.bridgelabz.addressbook;

import java.util.Scanner;

public class AddressBookMain {
    Scanner scanner=new Scanner(System.in);
    Contact contects = new Contact();
    public static void main(String[] args){
        AddressBookMain addressBookMain=new AddressBookMain();
        addressBookMain.addContect();
        addressBookMain.displayContacts();
            }
    private void addContect() {
            System.out.println("Please enter your first name");
            contects.setFirstName(scanner.next());
            System.out.println("Please enter your last name");
            contects.setLastName(scanner.next());
            System.out.println("Please enter your Address");
            contects.setAddress(scanner.next());
            System.out.println("Please enter your city name");
            contects.setCity(scanner.next());
            System.out.println("Please enter your state name");
            contects.setState(scanner.next());
            System.out.println("Please enter your zip number only six digit");
            contects.setZip(scanner.nextInt());
            System.out.println("Please enter your mobile number");
            contects.setPhoneNumber(scanner.nextInt());
            System.out.println("Please enter your email");
            contects.setEmail(scanner.next());
        }

            public void displayContacts() {
            System.out.println("First Name : " +contects.getFirstName() + "    Last Name: " + contects.getLastName());
            System.out.println("Address   : " + contects.getAddress() + "           City: " + contects.getCity());
            System.out.println("State     : " + contects.getState() + "        Zip Code : " + contects.getZip());
            System.out.println("Phone No. : " + contects.getPhoneNumber() + "      Email: " + contects.getEmail());
        }

    }

