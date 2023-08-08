package com.workintech.bakkal.mobile;

public class Main {
    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone("123123");
        phone.addNewContact(new Contact("Ahmet", "1231231"));
        phone.addNewContact(new Contact("Cem", "1231232"));
        phone.addNewContact(new Contact("Ali", "1231231"));
        phone.addNewContact(new Contact("Cem", "1231233"));
        phone.printContact();
    }

}
