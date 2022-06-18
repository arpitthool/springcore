package org.springcore.semester;

public class Course {
    private String name;
    private Book book;

    /*
    Getter and Setter
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    /*
    Constructor
     */

    public Course() {
    }

    /*
    Class Methods
     */

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", book=" + book +
                '}';
    }
}
