package com.company;

public class Book {

    private String author;
    private String name;
    private long yearOfPublishing;
    private String isbn;
    private final int ISBN_LENGTH = 13;

    public Book() {}

    public Book(String author, String name, long yearOfPublishing, String isbn) {
        this.author = author;
        this.name = name;
        this.yearOfPublishing = yearOfPublishing;
        this.isbn = isbn;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setYearOfWriting(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public long getYearOfWriting() {
        return this.yearOfPublishing;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn() {
        return this.isbn;
    }

    private boolean checkIsbn() {

        try {
            Long.parseLong(this.isbn);
        }
        catch(NumberFormatException e) {
            return false;
        }

        if (this.isbn.length() != 13)
            return false;

        int digit;
        int controlDigit;
        int initialControlDigit = Integer.parseInt( Character.toString( this.isbn.charAt(ISBN_LENGTH-1) ) );
        int digitSum = 0;

        for (int i = 0; i < ISBN_LENGTH-1; i++) {
            digit = Integer.parseInt( ( Character.toString( this.isbn.charAt(ISBN_LENGTH-2-i) ) ) );
            digitSum += digit * (3-2*(i%2));
        }
        controlDigit = digitSum % 10;

        if (controlDigit != 0)
            controlDigit = 10 - controlDigit;

        return controlDigit == initialControlDigit;

    }
    @Override
    public String toString() {
        String out = "Summary:\n" + "Author: " + this.author + "\nName: " + this.name + "\nYear of publishing: " + this.yearOfPublishing
                + "\nIsbn: ";
        if (this.checkIsbn())
            out += this.isbn;
        else
            out += "Invalid isbn (" + this.isbn + ")";
        return out;
    }

}