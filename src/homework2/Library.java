package homework2;

import homework2.person.Customer;
import homework2.person.Employee;
import homework2.publication.*;

import java.util.Arrays;

public class Library {

    public static void main(String[] args) {

        Book book1 = new Book("The Hacienda", "Isabel Cañas", 352, true, Genre.MYSTERY);
        Book book2 = new Book("Moby-Dick", "Herman Melville", 360, true, Genre.CLASSICS);
        NewsPaper newsPaper1 = new NewsPaper("20 of May 2022", "The New York Times", 250, true, Genre.CLASSICS);
        Magazine magazine1 = new Magazine("ALL ABOUT LOVE", "Vogue", 40, true, Genre.ROMANCE);
        Book book3 = new Book("The Hacienda", "Isabel Cañas", 352, true, Genre.MYSTERY);
        Customer customer1 = new Customer("Charles", Genre.CLASSICS);
        Employee employee1 = new Employee("Olga");

        employee1.greet(customer1);
        customer1.greet(employee1);

        Publication[] publications = {book1, book2, newsPaper1, magazine1, book3};

        System.out.println("publications = " + Arrays.toString(publications));
        System.out.println("publication chosen = " + customer1.choosePublication(employee1.search(publications, customer1)));
        employee1.changeAvailability(book2);
        System.out.println("Publication " + book2.getTitle() + " is " + ((book2.getAvailable()) ? "Available" : "Not Available"));
        book1.isSamePublication(book2);
        book1.isSamePublication(book3);
        book3.isSamePublication(magazine1);
    }

}
