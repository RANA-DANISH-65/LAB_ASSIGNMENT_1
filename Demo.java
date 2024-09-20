public class Demo {

    public static void main(String[] args) {

        // Create artist and artworks
        Artist artist_1 = new Artist("Jawad Shafi");
        Artwork artwork_1 = new Artwork("Namona", 2024, artist_1);
        Artwork artwork_2 = new Artwork("Namona_2", 2023);

        // Modify second artwork's details
        artwork_2.setTitle("Shahkar");
        artwork_2.setYear(2035);

        // Display artworks
        System.out.println("Showing details of Artwork 1:");
        artwork_1.displayArtwork();

        System.out.println("\nShowing details of Artwork 2:");
        artwork_2.displayArtwork();

        // Create shallow and deep copies
        Artwork shallowArtwork = artwork_1.getShallowCopy();
        Artwork deepArtwork = artwork_1.getDeepCopy();

        // Modify original artwork's title
        artwork_1.setTitle("Ajooba");

        // Display original, shallow, and deep copies
        System.out.println("\nShowing original Artwork:");
        artwork_1.displayArtwork();

        System.out.println("\nShowing Shallow Artwork:");
        shallowArtwork.displayArtwork();

        System.out.println("\nShowing Deep Artwork:");
        deepArtwork.displayArtwork();
    }
}
