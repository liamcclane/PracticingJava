public class StringManipulator{
    
    public String trimAndConcatinate(String phraseA, String phraseB){
        return phraseA.trim() + phraseB.trim();
    }

    // when user is looking for specific charcter or letter insider of phrase
    public Integer getIndexOrNull(String phrase, Character letter){
        if (phrase.indexOf(letter)==-1){
            return null;
        }

        return phrase.indexOf(letter);
    }

    // when user is looking to see if something contains, or is substring of orgnial phrase
    public Integer getIndexOrNull(String phrase, String substring){
        if (phrase.indexOf(substring) == -1){
            return null;
        }
        return phrase.indexOf(substring);
    }

    // Get a substring using a starting and ending index, and concatenate 
    // that with the second string input to our method.
    public String concatSubstring(String pharseA, Integer start, Integer stop, String phraseB ){
        return pharseA.substring(start, stop) + phraseB;
    }

}