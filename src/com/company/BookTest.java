package com.company;

public class BookTest {

    public static void main(String[] args) {


        Book testBook = new Book("A. Newey", "How to build a car", 2017, "9780008196806");

        System.out.println(testBook);

        testBook.setIsbn("9781681972712");
        System.out.println("\n" + testBook);

        testBook.setIsbn("978168197271a");
        System.out.println("\n" + testBook);

        testBook.setIsbn("97816819727123333333");
        System.out.println("\n" + testBook);

        testBook.setIsbn("978168197");
        System.out.println("\n" + testBook);

        testBook.setIsbn("978168ab19cd7271A2");
        System.out.println("\n" + testBook);

        testBook.setIsbn("9!781?a6819");
        System.out.println("\n" + testBook);

        testBook.setAuthor("Unknown");
        testBook.setName("451 degres Fhrenheit");
        testBook.setYearOfWriting(1966);
        testBook.setIsbn("9785041022938");

        System.out.println("\n" + testBook);

    }

}