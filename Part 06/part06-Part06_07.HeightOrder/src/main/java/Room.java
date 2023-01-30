
import java.util.ArrayList;


public class Room {
    ArrayList<Person> persons;

    public Room() {
        persons = new ArrayList<Person>();
    }
    
    public void add(Person person) {
        this.persons.add(person);
    }
     
    public boolean isEmpty() {
        return this.persons.isEmpty();
    }
    
    public ArrayList<Person> getPersons() {
        return this.persons;
    }
    
    public Person shortest() {
        if (this.isEmpty())
            return null;
        
        Person shortestPerson = null;
        
        for (Person person : persons) {    
            if (shortestPerson == null)
                shortestPerson = person;
            
            if (person.getHeight() < shortestPerson.getHeight())
                shortestPerson = person;
        }
        
        return shortestPerson;
    }
    
    public Person take() {
        Person returnPerson = this.shortest();
        this.persons.remove(returnPerson);
        return returnPerson;
   }
}
