package database.model;

import java.util.List;
import java.util.UUID;

public class TabuWord {
	
	private UUID id;
	private String word;
	private List<String> forbiddenwords;
	private Round round;
	
	public TabuWord() {
		
	}
	
	public TabuWord(UUID id, String word, List<String> forbiddenwords, Round round) {
		super();
		this.id = id;
		this.word = word;
		this.forbiddenwords = forbiddenwords;
		this.round = round;
	}

	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public List<String> getForbiddenwords() {
		return forbiddenwords;
	}
	public void setForbiddenwords(List<String> forbiddenwords) {
		this.forbiddenwords = forbiddenwords;
	}
	public Round getRound() {
		return round;
	}
	public void setRound(Round round) {
		this.round = round;
	}	

}
