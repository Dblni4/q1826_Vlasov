package by.itstep.musicPlaylist;

public class Podcast implements AudioTrack {

    private String host;
    private String title;
    private String artist;
    private int duration;
    private String genre;
    private int rating;

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getArtist() {
        return artist;
    }

    @Override
    public int getDuration() {
        return duration;
    }

    @Override
    public String getGenre() {
        return genre;
    }

    @Override
    public int getRating() {
        return rating;
    }

    @Override
    public void setRating(int rating) {
        if (rating >= 1 && rating <= 5) {
            this.rating=  rating;
        } else
            System.out.println("Укажите рейтинг от 1 до 5");
    }

    public Podcast(String host, String title, String artist, int duration, String genre, int rating) {
        this.host = host;
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.genre = genre;
        setRating(rating);
    }

    @Override
    public String toString() {
        return "Podcast{" +
                "host='" + host + '\'' +
                ", title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", duration=" + duration +
                ", genre='" + genre + '\'' +
                ", rating=" + rating +
                '}';
    }
}

