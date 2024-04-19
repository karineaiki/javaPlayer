import java.util.HashSet;

class Player {
    public static void main(String[] args) {
        
        Artist laCompagnieCreole = new Artist("La compagnie", "Créole");
        Artist garou = new Artist ("Garou", "");
        Artist celine = new Artist("Céline", "Dion");
        
        HashSet<Artist> compagnieCreoleSet = new HashSet<>();
        HashSet<Artist> duoGarouCeline = new HashSet<>();
        duoGarouCeline.add(garou);
        duoGarouCeline.add(celine);
        compagnieCreoleSet.add(laCompagnieCreole);
        Music lesOiseaux = new Music("les oiseaux", 230, compagnieCreoleSet);
        Music sousLeVent  = new Music("Sous le vent", 340, duoGarouCeline);
        

        System.out.println(laCompagnieCreole.getFullName());
        System.out.println(lesOiseaux.getInfos());
        System.out.println(sousLeVent.getInfos());

        Playlist karaokeNight = new Playlist();
        karaokeNight.add(lesOiseaux);
        karaokeNight.add(sousLeVent);

        karaokeNight.getCurrentMusic(lesOiseaux);
        karaokeNight.next();
        karaokeNight.getMusicList();
    }
}