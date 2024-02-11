package model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Round {
    @Id
    private String id;
    private List<Integer> drawnNumbers;
    private List<String> playerIds;
    private List<Card> cards;

    public Round() {}

    public Round(List<Integer> drawnNumbers, List<String> playerIds, List<Card> cards) {
        this.setDrawnNumbers(drawnNumbers);
        this.setPlayerIds(playerIds);
        this.setCards(cards);
    }

	public List<Integer> getDrawnNumbers() {
		return drawnNumbers;
	}

	public void setDrawnNumbers(List<Integer> drawnNumbers) {
		this.drawnNumbers = drawnNumbers;
	}

	public List<String> getPlayerIds() {
		return playerIds;
	}

	public void setPlayerIds(List<String> playerIds) {
		this.playerIds = playerIds;
	}

	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}

    // getters and setters, equals, hashCode, toString
}