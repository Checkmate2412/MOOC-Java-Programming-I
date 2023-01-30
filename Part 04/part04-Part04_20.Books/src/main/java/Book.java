/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author compl
 */
public class Book {
    private String name, page, year;
    
    public Book(String bName, String bPage, String bYear) {
        this.name = bName;
        this.page = bPage;
        this.year = bYear;
    }
    
    public String getName() {
        return this.name;
    }
    
    @Override
    public String toString() {
        return name + ", " + page + " pages, " + year;
    }
}
