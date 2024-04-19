import java.util.ArrayList;

public class Playlist {
    private Music currentMusic;
    private ArrayList<Music> musicList = new ArrayList<>();
    public int totalDuration;

    public void add(Music music) {
        musicList.add(music);
    };

    public void remove(Music music) {
        musicList.remove(music);
    }

    public Music getCurrentMusic(Music music) {
        return this.currentMusic;
    }

    public ArrayList<Music> getMusicList() {
        
        return this.musicList;
    }

    public void next() {
        if (this.musicList.size() > 0){
            var first = this.musicList.get(
                0);
                this.currentMusic = first;
                this.remove(first);
                System.err.println("La musique jouée est " + this.currentMusic.getTitle());
        } else {
            System.out.println("La playlist est vide");
        }

    }

    public int getTotalDuration(ArrayList<Music> musicList) {
        for(Music music : musicList) {
            int musicDuration = music.getDuration();
            this.totalDuration = (this.totalDuration + musicDuration);
        }
        return this.totalDuration;
    }


}
