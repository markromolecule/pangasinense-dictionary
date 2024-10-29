package dictionary.entities;

import java.io.Serializable;

public class word implements Serializable {

    private static final long serialVersionUID = 1L;
    private int id;
    private String pangasinense;
    private String definition;
    private String tagalog;
    private String synonyms;
    private String antonyms;
    private String sentence;

    public word(int id, String pangasinense, String definition, String tagalog, String synonyms, String antonyms, String sentence) {
        this.id = id;
        this.pangasinense = pangasinense;
        this.definition = definition;
        this.tagalog = tagalog;
        this.synonyms = synonyms;
        this.antonyms = antonyms;
        this.sentence = sentence;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPangasinense() {
        return pangasinense;
    }

    public void setPangasinense(String pangasinense) {
        this.pangasinense = pangasinense;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public String getTagalog() {
        return tagalog;
    }

    public void setTagalog(String tagalog) {
        this.tagalog = tagalog;
    }

    public String getSynonyms() {
        return synonyms;
    }

    public void setSynonyms(String synonyms) {
        this.synonyms = synonyms;
    }

    public String getAntonyms() {
        return antonyms;
    }

    public void setAntonyms(String antonyms) {
        this.antonyms = antonyms;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }
}
