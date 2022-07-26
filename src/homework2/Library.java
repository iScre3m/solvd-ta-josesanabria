package homework2;

import homework2.person.*;
import homework2.publication.*;

import java.util.ArrayList;

public class Library {

    public static void main(String[] args) {

        Book book1 = new Book("The Hacienda", "Isabel Cañas", 352, true, Genre.MYSTERY);
        Book book2 = new Book("Moby-Dick", "Herman Melville", 360, true, Genre.CLASSICS);
        NewsPaper newsPaper1 = new NewsPaper("20 of May 2022", "The New York Times", 250, true, Genre.CLASSICS);
        Magazine magazine1 = new Magazine("ALL ABOUT LOVE", "Vogue", 40, true, Genre.ROMANCE);
        Book book3 = new Book("The Hacienda", "Isabel Cañas", 352, true, Genre.MYSTERY);
        Customer customer1 = new Customer("Charles", Genre.CLASSICS);
        Employee employee1 = new Employee("Olga");

        ArrayList<Publications> publicationList = new ArrayList<>();
        publicationList.add(book1);
        publicationList.add(book2);
        publicationList.add(newsPaper1);
        publicationList.add(magazine1);
        publicationList.add(book3);

        employee1.changeAvailability(book3);
        System.out.println("Publication is " + ((book3.getAvailable()) ? "Available" : "Not Available"));

        customer1.search(publicationList);
        book1.samePublication(book2);
        book1.samePublication(book3);
        book3.samePublication(magazine1);
    }

}
