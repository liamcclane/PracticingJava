import java.util.*;
public class Hashmatique {
    public static void main(String[] args) {
        HashMap<String, String> songHash = new HashMap<String, String>();
        songHash.put("End Game", "I wanna be your endgame  \nI wanna be your first string \nI wanna be your A-Team\nI wanna be your endgame, endgame");
        songHash.put("Clean", "The drought was the very worst, ah ah\nWhen the flowers that we'd grown together died of thirst\nIt was months, and months of back and forth, ah ah\nYou're still all over me like a wine-stained dress I can't wear anymore\nHung my head, as I lost the war, and the sky turned black like a perfect storm");
        songHash.put("Lover", "We could leave the Christmas lights up 'til January\nThis is our place, we make the rules\nAnd there's a dazzling haze, a mysterious way about you, dear\nHave I known you twenty seconds or twenty years?");
        songHash.put("Red", "Loving him is like Driving a new Maserati down a dead-end street\nFaster than the wind Passionate as sin Ending so suddenly\nLoving him is like Trying to change your mind once you're already flying through the free fall \nLike the colors in autumn, so bright \nJust before they lose it all");
        // get the keys by using the keySet method
        Set<String> keys = songHash.keySet();
        for(String key : keys) {
            System.out.println("Song Title is : " +key);
            System.out.println("Opening verse is: ");
            System.out.println(songHash.get(key));
            System.out.println();
        }

        // System.out.println("Red : " + songHash.get("Red"));

        for (String key : keys){
            System.out.println(key +" : " + songHash.get(key));
        }

    }
}
