package com.zipcodewilmington.phonebook;

import java.util.*;

/**
 * Created by leon on 1/23/18.
 */
public class PhoneBook {
    public static void main(String[] args) {

        Map<String, List<String>> phoneBook;

        }

// public by default
      Map<String, List<String>> phoneBook;

//map =  object, phoneBook = instance variable, phoneBook = map (storing object into instance variable)
    public PhoneBook(Map<String, List<String>> map) {
        this.phoneBook = map;
        }


    public PhoneBook() {


        this( new HashMap<String, List<String>>());
        //new PhoneBook("eggs",new ArrayList<String>( "pie" ) );
    }

    public void add(String name, String phoneNumber) {
        this.phoneBook.put(name, Collections.singletonList( phoneNumber ) );

        Collection<String> collection = new ArrayList<String>();
        ((ArrayList<String>) collection).add( "Three" );



    }

    public void addAll(String name, String... phoneNumbers) {

}

    public boolean remove(String name) {
        return phoneBook.containsKey(name);


    }

    public Boolean hasEntry(String name) {


        return null;
    }

    public List<String> lookup(String name) {


        return null;
    }

    public String reverseLookup(String phoneNumber)  {



        return null;
    }

    public List<String> getAllContactNames() {






        return (List<String>) phoneBook;


    }

    public Map<String, List<String>> getMap() {


        return phoneBook;
    }
}
