package dictionary.manager;

import dictionary.entities.Word;
import java.io.*;
import java.util.TreeMap;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class WordManager {

    private TreeMap<String, Word> wordMap;
    private final String fileName = "dictionary_data.json";

    public WordManager() {
        wordMap = new TreeMap<>();
        loadData();
    }

    /*
    Functionality
     */
    // To add
    public void addWord(Word newWord) {
        String pangasinenseWord = newWord.getPangasinense();

        if (wordMap.containsKey(pangasinenseWord)) {
            System.out.println("Duplicate word found: " + pangasinenseWord);
            return;
        }

        int newId = wordMap.size() + 1;
        newWord.setId(newId);
        wordMap.put(pangasinenseWord, newWord);
    }

    public Word getWord(String pangasinense) {
        return wordMap.get(pangasinense);
    }

    // To remove
    public void removeWord(String pangasinense) {
        Word removedWord = wordMap.remove(pangasinense);
        if (removedWord != null) {
            System.out.println("Word removed: " + pangasinense);
            reassignIds();
        } else {
            System.out.println("Word not found: " + pangasinense);
        }
    }

    public TreeMap<String, Word> getWordMap() {
        return wordMap;
    }

    public void saveData() {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (FileWriter writer = new FileWriter(fileName)) {
            gson.toJson(wordMap, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadData() {
        Gson gson = new Gson();
        try (FileReader reader = new FileReader(fileName)) {
            wordMap = gson.fromJson(reader, new TypeToken<TreeMap<String, Word>>() {
            }.getType());
            if (wordMap != null && !wordMap.isEmpty()) {
                reassignIds();
            }
        } catch (IOException e) {
            System.out.println("No previous data found, starting fresh.");
        }
    }

    private void reassignIds() {
        int id = 1;
        for (Word w : wordMap.values()) {
            w.setId(id++);
        }
    }
}
