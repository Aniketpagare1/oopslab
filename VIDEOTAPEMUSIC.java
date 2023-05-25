import java.util.Scanner;

class VideoTape {
    protected String title;
    protected int length;
    protected boolean available;

    public VideoTape(String title, int length) {
        this.title = title;
        this.length = length;
        this.available = true;
    }

    public void show() {
        System.out.println("Title: " + title);
        System.out.println("Length: " + length);
        System.out.println("Available: " + (available ? "Yes" : "No"));
    }
}

class Movie extends VideoTape {
    private String directorRating;

    public Movie(String title, int length, String directorRating) {
        super(title, length);
        this.directorRating = directorRating;
    }

    public void show() {
        super.show();
        System.out.println("Director Rating: " + directorRating);
    }
}

class MusicVideo extends VideoTape {
    private String artistCategory;

    public MusicVideo(String title, int length, String artistCategory) {
        super(title, length);
        this.artistCategory = artistCategory;
    }

    public void show() {
        super.show();
        System.out.println("Artist Category: " + artistCategory);
    }
}

public class VIDEOTAPEMUSIC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a Movie instance
        System.out.println("Enter movie details:");
        System.out.print("Title: ");
        String movieTitle = scanner.nextLine();
        System.out.print("Length: ");
        int movieLength = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Director Rating: ");
        String directorRating = scanner.nextLine();

        Movie movie = new Movie(movieTitle, movieLength, directorRating);

        System.out.println("\nMovie details:");
        movie.show();

        System.out.println();

        // Create a MusicVideo instance
        System.out.println("Enter music video details:");
        System.out.print("Title: ");
        String musicVideoTitle = scanner.nextLine();
        System.out.print("Length: ");
        int musicVideoLength = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Artist Category: ");
        String artistCategory = scanner.nextLine();

        MusicVideo musicVideo = new MusicVideo(musicVideoTitle, musicVideoLength, artistCategory);

        System.out.println("\nMusic Video details:");
        musicVideo.show();

        scanner.close();
    }
}
