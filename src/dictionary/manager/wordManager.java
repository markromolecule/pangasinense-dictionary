package dictionary.manager;

import dictionary.entities.word;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.util.TreeMap;

public class wordManager {

    private TreeMap<String, word> wordMap = new TreeMap<>();
    private final String fileName = "dictionary_data.json";

    public wordManager() {
        loadData();
    }

    // Adds a word to the wordMap and saves data
    public boolean addWord(word newWord) {
        if (wordMap.containsKey(newWord.getPangasinense())) {
            return false;
        }
        newWord.setId(wordMap.size() + 1);
        wordMap.put(newWord.getPangasinense(), newWord);
        saveData();
        return true;
    }

    // Updates an existing word by key and saves data
    public boolean updateWord(String originalKey, word updatedWord) {
        if (!originalKey.equals(updatedWord.getPangasinense()) && wordMap.containsKey(updatedWord.getPangasinense())) {
            return false;
        }
        wordMap.remove(originalKey);
        wordMap.put(updatedWord.getPangasinense(), updatedWord);
        saveData();
        return true;
    }

    // Removes a word from wordMap by key and reassigns IDs
    public void removeWord(String pangasinense) {
        if (wordMap.remove(pangasinense) != null) {
            reassignIds();
            saveData();
        }
    }

    // Retrieves a word by its Pangasinense key
    public word getWord(String pangasinense) {
        return wordMap.get(pangasinense);
    }

    // Provides access to the wordMap for displaying in the UI
    public TreeMap<String, word> getWordMap() {
        return wordMap;
    }

    // Reassigns IDs to keep them sequential
    private void reassignIds() {
        int id = 1;
        for (word w : wordMap.values()) {
            w.setId(id++);
        }
    }

    // Saves the wordMap data to a JSON file
    public void saveData() {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (FileWriter writer = new FileWriter(fileName)) {
            gson.toJson(wordMap, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Loads data from JSON file into wordMap
    public void loadData() {
        Gson gson = new Gson();
        try (FileReader reader = new FileReader(fileName)) {
            wordMap = gson.fromJson(reader, new TypeToken<TreeMap<String, word>>() {}.getType());
            if (wordMap == null) {
                wordMap = new TreeMap<>();
            }
            reassignIds();
        } catch (IOException e) {
            System.out.println("No previous data found, starting fresh.");
        }
    }
}
