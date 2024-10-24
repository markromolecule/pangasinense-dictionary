package dictionary.manager;

import dictionary.entities.word;
import java.io.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.util.TreeMap;

public class wordManager {

    private TreeMap<String, word> wordMap;
    private final String fileName = "dictionary_data.json";

    public wordManager() {
        wordMap = new TreeMap<>();
        loadData();
    }

    public void addWord(word newWord) {
        String pangasinenseWord = newWord.getPangasinense();
        
        if (wordMap.containsKey(pangasinenseWord)) {
            System.out.println("Duplicate word found: " + pangasinenseWord);
            return;  // Do not add duplicate
        }
        
        int newId = wordMap.size() + 1;
        newWord.setId(newId);
        wordMap.put(pangasinenseWord, newWord);
    }

    public word getWord(String pangasinense) {
        return wordMap.get(pangasinense);
    }

    public void removeWord(String pangasinense) {
        word removedWord = wordMap.remove(pangasinense);
        if (removedWord != null) {
            System.out.println("Word removed: " + pangasinense);
            reassignIds();
        } else {
            System.out.println("Word not found: " + pangasinense);
        }
    }

    private void reassignIds() {
        int id = 1;
        for (word w : wordMap.values()) {
            w.setId(id++);
        }
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
            wordMap = gson.fromJson(reader, new TypeToken<TreeMap<String, word>>() {
            }.getType());
            if (wordMap != null && !wordMap.isEmpty()) {
                reassignIds();  
            }
        } catch (IOException e) {
            System.out.println("No previous data found, starting fresh.");
        }
    }

    public TreeMap<String, word> getWordMap() {
        return wordMap;
    }
}
