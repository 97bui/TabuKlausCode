package database.model;

import java.time.LocalDateTime;
import java.util.UUID;

public class SolutionAttempt {
	
	private UUID id;
	private Player player;
	private TabuWord word;
	private boolean solved;
	private LocalDateTime submittedAt;
	private String prompt;
	private String aiResponse;
	
	public SolutionAttempt() {
		
	}
	
	public SolutionAttempt(UUID id, Player player, TabuWord word, boolean solved, LocalDateTime submittedAt,
			String prompt, String aiResponse) {
		super();
		this.id = id;
		this.player = player;
		this.word = word;
		this.solved = solved;
		this.submittedAt = submittedAt;
		this.prompt = prompt;
		this.aiResponse = aiResponse;
	}
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
	public TabuWord getWord() {
		return word;
	}
	public void setWord(TabuWord word) {
		this.word = word;
	}
	public boolean isSolved() {
		return solved;
	}
	public void setSolved(boolean solved) {
		this.solved = solved;
	}
	public LocalDateTime getSubmittedAt() {
		return submittedAt;
	}
	public void setSubmittedAt(LocalDateTime submittedAt) {
		this.submittedAt = submittedAt;
	}
	public String getPrompt() {
		return prompt;
	}
	public void setPrompt(String prompt) {
		this.prompt = prompt;
	}
	public String getAiResponse() {
		return aiResponse;
	}
	public void setAiResponse(String aiResponse) {
		this.aiResponse = aiResponse;
	}
	
	

}
