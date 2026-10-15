package by.itstep.musicPlaylist;

import java.util.ArrayList;
import java.util.List;

public class Playlist {

    private ArrayList<AudioTrack> audioTracks = new ArrayList<>();

    public void addTrack(AudioTrack track) {//добавление трека в плейлист
        audioTracks.add(track);
    }


    public void removeTrack(AudioTrack track) {//удаление трека из плейлиста
        audioTracks.remove(track);
    }

    List<AudioTrack> searchByTitle(String title) {//поиск треков по названию (игнорируя регистр)
        return null;
    }

    List<AudioTrack> searchByArtist(String artist) {//поиск треков по исполнителю (игнорируя регистр)
        return null;
    }

    List<AudioTrack> getTrackByGenre(String genre) {//получение списка треков определенного жанра
        return null;
    }

    public void printPlaylist() {//вывод всего плейлиста
        for (AudioTrack track : audioTracks) {
            System.out.println(track);
        }
    }

    public int getTotalDuration() {//получение общей длительности плейлиста в секундах
        int secondTotal = 0;
        for (AudioTrack sec : audioTracks) {
            secondTotal += sec.getDuration();
        }
        return secondTotal;


    }
}