import java.util.HashSet;

public class Music {
    
    private String title;
    private int duration;
    private HashSet<Artist> artistSet;

    public Music(String title, int duration, HashSet<Artist> artistSet) {
        this.title = title;
        this.duration = duration; //mm:ss
        this.artistSet = artistSet;
    };

    public String getTitle() {
        return this.title;
    }

    public int getDuration() {
        return this.duration;
    }

    public String formatDuration() {
        int minutes = this.duration/60;
        int seconds = this.duration % 60;
        return minutes + ":" + seconds;
    }

    public String getInfos() {
        String artistNames = "";
        for (var artist : artistSet) {
            artistNames += artist.getFullName() + "\n";
        }
        return "Titre: " + this.title + ", durée: " + this.formatDuration() + ", artiste(s) : " + artistNames;
    }
}
