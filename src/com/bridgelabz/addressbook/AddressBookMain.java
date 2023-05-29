package com.bridgelabz.addressbook;

import java.util.Scanner;

public class AddressBookMain {
    Scanner scanner = new Scanner(System.in);
    Contact contects = new Contact();
    final static int ADD_CONTACT = 1;
    final static int EDIT_CONTACT = 2;
    final static int DISPLAY = 3;
    final static int DELETE_CONTACT=4;

    private void addContect() {
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
    }

    void editContact() {
        System.out.println("please enter first name of person to edit");
        String firstName = scanner.next().toLowerCase();
        System.out.println("please enter last name of person to edit");
        String lastName = scanner.next().toLowerCase();
        if (firstName.equals(contects.getFirstName().toLowerCase())) {
            if (lastName.equals(contects.getLastName().toLowerCase())) {
                System.out.println("Enter the name of the person for edit");
                contects.setFirstName(scanner.next());

                System.out.println("Enter the last name of the person for edit");
                contects.setLastName(scanner.next());

            }
        }
    }
void deleteContact(){
contects=null;

}
    public void displayContacts() {
        if(contects==null){
            System.out.println("Contact is empty");
            return;
        }
        System.out.println("First Name : " + contects.getFirstName() + "    Last Name: " + contects.getLastName());
        System.out.println("Address   : " + contects.getAddress() + "           City: " + contects.getCity());
        System.out.println("State     : " + contects.getState() + "        Zip Code : " + contects.getZip());
        System.out.println("Phone No. : " + contects.getPhoneNumber() + "      Email: " + contects.getEmail());
        System.out.println("<_________________________________________________________________________________________________>");
    }
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AddressBookMain addressBookMain = new AddressBookMain();
        while (true) {
            System.out.println("please enter your choice in address book");

            System.out.println("1.Add a new contact to your address book.");
            System.out.println("2.Edit a contact from your address book.");
            System.out.println("3.display information of all of your contacts.");

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
                default:
                    System.out.println("Enter your choice wrong");
                    break;
            }
        }
    }
}

