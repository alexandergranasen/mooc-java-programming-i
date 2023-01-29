
import java.util.HashMap;

/**
 *
 * @author Alexander Granåsen
 */
public class SimpleDictionary {

    private HashMap<String, String> translations;

    /**
     *
     */
    public SimpleDictionary() {
        this.translations = new HashMap<>();
    }

    /**
     *
     * @param word
     * @return
     */
    public String translate(String word) {
        return this.translations.get(word);
    }

    /**
     *
     * @param word
     * @param translation
     */
    public void add(String word, String translation) {
        this.translations.put(word, translation);
    }
}
