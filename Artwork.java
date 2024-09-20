// Models an artwork with title, year, and artist
public class Artwork {

    private String title;
    private int year;
    private Artist artist;
    
    // Constructor with title, year, and artist
    public Artwork(String title, int year, Artist artist) {
        this.title = title;
        this.year = year;
        this.artist = artist;
    }

    // Constructor with title and year, assigns default "Unknown Artist"
    public Artwork(String title, int year) {
        this.title = title;
        this.year = year;
        this.artist = new Artist("Unknown Artist");
    }
    
    // Setters
    public void setTitle(String tit) {
        title = tit;
    }

    public void setYear(int yr) {
        year = yr;
    }

    public void setArtist(Artist art) {
        artist = art;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public Artist getArtist() {
        return artist;
    }

    // Displays artwork details
    public void displayArtwork() {
        System.out.println("The title of Artwork: " + title);
        System.out.println("The year: " + year);
        artist.displayArtistInfo();
    }

    // Creates a shallow copy of the artwork
    public Artwork getShallowCopy() {
        return new Artwork(this.title, this.year, this.artist);
    }

    // Creates a deep copy of the artwork
    public Artwork getDeepCopy() {
        return new Artwork(this.title, this.year, new Artist(this.artist.getArtist()));
    }
}
