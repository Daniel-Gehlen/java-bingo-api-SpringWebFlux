package model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Card {
    @Id
    private String id;
    private List<Integer> numbers;
    private String playerId;

    public Card() {}

    public Card(List<Integer> numbers, String playerId) {
        this.setNumbers(numbers);
        this.setPlayerId(playerId);
    }

	public List<Integer> getNumbers() {
		return numbers;
	}

	public void setNumbers(List<Integer> numbers) {
		this.numbers = numbers;
	}

	public String getPlayerId() {
		return playerId;
	}

	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}

    // getters and setters, equals, hashCode, toString
}