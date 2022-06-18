package org.springcore.semester;

public class Book {
    private String name;

    /*
    Getter and Setter
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*
    Constructor
     */

    public Book() {
    }

    /*
    Class Methods
     */

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }
}
