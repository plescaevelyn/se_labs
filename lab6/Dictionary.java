package lab6;
import java.util.HashMap;
import java.util.List;

public class Dictionary {
	private HashMap<Word, Definition> dictionary;
	
	public Dictionary() {
	}

	public Dictionary(Word w, Definition d) {
		
	}
	
	public void addWord(Word w, Definition d) {
		dictionary.put(w, d);
	}
	
	public String getDefinition(Word w) {
		return dictionary.get(w).getDescription();
	}
	
	public void getAllWords() {
	}	
	
	public void getAllDefinitions() {
		
	}
}
