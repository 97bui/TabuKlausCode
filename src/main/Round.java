package database.model;

import java.time.LocalDateTime;
import java.util.UUID;

public class Round {

    private UUID id;
    private LocalDateTime createdAt;
    private Player creator;
    private Difficulty difficulty;
    private boolean active

    public enum Difficulty {
        EASY, MIDDLE, HARD
    }

    public Round() {}

    public Round(UUID id, LocalDateTime createdAt, Player creator,
                 Difficulty difficulty) {
        this.id = id;
        this.createdAt = createdAt;
        this.creator = creator;
        this.difficulty = difficulty;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Player getCreator() {
        return creator;
    }

    public void setCreator(Player creator) {
        this.creator = creator;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

}
