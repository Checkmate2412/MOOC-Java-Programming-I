
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    @Override
    public boolean equals(Object comparison) {      
        if (this == comparison)
            return true;

        if (!(comparison instanceof Song)) 
            return false;
        
        Song compared = (Song) comparison;
        
        return this.artist.equals(compared.artist) &&
                this.name.equals(compared.name) &&
                this.durationInSeconds == compared.durationInSeconds;
    }
    
    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }


}
