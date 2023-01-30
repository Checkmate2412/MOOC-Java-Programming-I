
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }
    
    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public boolean equals(Object comparison) {
        
        if (this == comparison)
            return true;
        
        if (!(comparison instanceof Book))
            return false;
        
        Book compared = (Book) comparison;
        
        return this.name.equals(compared.name) && 
                this.publicationYear == compared.publicationYear;
    }
}
