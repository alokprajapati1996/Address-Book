package com.bridgelabz.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {
    ArrayList<Contact> contectList = new ArrayList<Contact>();
    Scanner scanner = new Scanner(System.in);
    Contact contects = new Contact();
    final static int ADD_CONTACT = 1;
    final static int EDIT_CONTACT = 2;
    final static int DISPLAY = 3;
    final static int DELETE_CONTACT=4;
    final static int EXIT=5;

    private void addContect() {
        System.out.println("Please enter the number of person contacts want to add ");
        int numberOfPersonContact = scanner.nextInt();
        for (int i = 0; i < numberOfPersonContact; i++) {
            Contact contects = new Contact();

            System.out.println("Please enter your first name");
            contects.setFirstName(scanner.next());
            System.out.println("Please enter your last name");
            contects.setLastName(scanner.next());
            System.out.println("Please enter your Address");
            contects.setAddress(scanner.next());
            scanner.nextLine();
            System.out.println("Please enter your city name");
            contects.setCity(scanner.next());
            System.out.println("Please enter your state name");
            contects.setState(scanner.next());
            System.out.println("Please enter your zip number only six digit");
            contects.setZip(scanner.nextInt());
            System.out.println("Please enter your mobile number");
            contects.setPhoneNumber(scanner.nextLong());
            System.out.println("Please enter your email");
            contects.setEmail(scanner.next());
            contectList.add(contects);
            System.out.println("<______________________________________________________________________________________>");
        }
    }
    void editContact() {
        System.out.println("please enter first name of person to edit");
        String firstName = scanner.next().toLowerCase();
        System.out.println("please enter last name of person to edit");
        String lastName = scanner.next().toLowerCase();
        for (int i = 0; i < contectList.size(); i++) {
        if (firstName.equals(contectList.get(i).getFirstName().toLowerCase())&&(lastName.equals(contectList.get(i).getLastName().toLowerCase()))) {
                System.out.println("Enter the new first name");
                contectList.get(i).setFirstName(scanner.next());

                System.out.println("Enter the new last name ");
                contectList.get(i).setLastName(scanner.next());
               return;
            }
        }
        System.out.println("Enter your details : '"+firstName+" "+lastName+ "' is not find in this list please check and try again!");
        System.out.println("<_______________________________________________________________>");
    }
void deleteContact(){
    System.out.println("Enter the full name for delete ");
    System.out.println("____________________________________________>");
    System.out.println("please enter first name ");
    String firstName=scanner.next().toLowerCase();

    System.out.println("please enter last name ");
    String lastName=scanner.next().toLowerCase();
    for (int i = 0; i <contectList.size() ; i++) {
        if (firstName.equals(contectList.get(i).getFirstName().toLowerCase()) && (lastName.equals(contectList.get(i).getLastName().toLowerCase()))) {
         contectList.remove(i);
         return;
        }
    }
    System.out.println("Enter your details is not find in this list please check and try again!");
    System.out.println("<_______________________________________________________________>");
}
    public void displayContacts() {
        if(contectList.isEmpty()){
            System.out.println("Contact is empty");
            return;
        }
        for (int i = 0; i < contectList.size(); i++) {
            Contact contact = new Contact();
            System.out.println("Full Name : " + contectList.get(i).getFirstName() + "    Last Name: " + contectList.get(i).getLastName());
            System.out.println("Address   : " + contectList.get(i).getAddress() + "           City: " + contectList.get(i).getCity());
            System.out.println("State     : " + contectList.get(i).getState() + "        Zip Code : " + contectList.get(i).getZip());
            System.out.println("Phone No. : " + contectList.get(i).getPhoneNumber() + "      Email: " + contectList.get(i).getEmail());
        
            System.out.println("<_______________________________________________________________________________________________________>");
    }
    }
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AddressBookMain addressBookMain = new AddressBookMain();
        boolean loopExit=true;
        while (loopExit) {
            System.out.println("please enter your choice in address book");
            System.out.println();
            System.out.println("1.Add a new contact to your address book.");
            System.out.println("2.Edit a contact from your address book.");
            System.out.println("3.display information of all of your contacts.");
            System.out.println("4 delete  a contact from your address book.");
            System.out.println("5 Exit outside to the address book ");
            System.out.println();
            System.out.println("Enter your menu choice:");
            int yourChoiceNumber = scanner.nextInt();

            switch (yourChoiceNumber) {
                case ADD_CONTACT:
                    addressBookMain.addContect();
                    break;
                case EDIT_CONTACT:
                    addressBookMain.editContact();
                    break;

                case DISPLAY:
                    addressBookMain.displayContacts();
                    break;
                case DELETE_CONTACT:
                    addressBookMain.deleteContact();
                    break;
                case EXIT:
                    loopExit=false;
                    break;
                default:
                    System.out.println("Enter your choice wrong");
                    break;
            }
        }
    }
}

