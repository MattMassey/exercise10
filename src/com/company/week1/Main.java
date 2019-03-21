package com.company.week1;
import java.util.*;

//Matt Massey, 3/21/2019
//Csci 1660, program demonstrates implementation of the iterable interface

public class Main {

    public static void main(String[] args) {
        ContactInfo me = new ContactInfo("Matthew", "totally-real@email.com");
        ContactInfo alsoMe = new ContactInfo("Matt", "justasreal@email.com");

        ContactCollection collection = new ContactCollection();

        collection.addContact(me);
        collection.addContact(alsoMe);

        for (Object contact : collection) {
            System.out.println(contact);
        }
    }
}

class ContactInfo {
    String name;
    String email;

    public ContactInfo(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "ContactInfo{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

class ContactCollection implements Iterable {
    List<ContactInfo> contacts = new ArrayList<>();

    public ContactCollection() {
    }

    @Override
    public Iterator<ContactInfo> iterator() {
        return this.contacts.iterator();
    }

    public void addContact(ContactInfo contact) {
        contacts.add(contact);
    }
}
