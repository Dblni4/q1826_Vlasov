package by.itstep.musicPlaylist;

public interface AudioTrack {

     String getTitle();
     String getArtist();
     int getDuration(); //секунды
     String getGenre();
     int getRating(); //рейтинг от 1 до 5

    void setRating(int rating);

}
