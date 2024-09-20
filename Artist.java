// Models an artist with a name
public class Artist {
    
    private String name; // Artist's name
    
    // Constructor to initialize the name
    public Artist(String name) {
        this.name = name;
    }
    
    // Getter for the artist's name
    public String getArtist() {
        return name;
    }
    
    // Displays artist information
    public void displayArtistInfo() {
        System.out.println("Artist: " + name);
    }
}
