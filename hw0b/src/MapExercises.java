import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExercises {
    /** Returns a map from every lower case letter to the number corresponding to that letter, where 'a' is
     * 1, 'b' is 2, 'c' is 3, ..., 'z' is 26.
     */
    public static Map<Character, Integer> letterToNum() {
        // TODO: Fill in this function.
        Map<Character,Integer> tg=new HashMap<>();
        for(int i=0;i<26;i++){
            tg.put((char) ('a'+i),i+1);
        }

        return tg;
    }

    /** Returns a map from the integers in the list to their squares. For example, if the input list
     *  is [1, 3, 6, 7], the returned map goes from 1 to 1, 3 to 9, 6 to 36, and 7 to 49.
     */
    public static Map<Integer, Integer> squares(List<Integer> nums) {
        // TODO: Fill in this function.
        Map<Integer,Integer> tg=new HashMap<>();
        for(int i:nums){
            tg.put(i,i*i);
        }
        return tg;
    }

    /** Returns a map of the counts of all words that appear in a list of words. */
    public static Map<String, Integer> countWords(List<String> words) {
        // TODO: Fill in this function.
        HashMap<String,Integer> tg=new HashMap<>();
        for(String word:words){
            if(tg.containsKey(word)){
                tg.put(word, tg.get(word) + 1);
            }
            else{
                tg.put(word,1);
            }
        }
        return tg;
    }
}
