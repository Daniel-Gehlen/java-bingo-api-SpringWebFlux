package service;

import org.springframework.stereotype.Service;

import model.Round;
import reactor.core.publisher.Mono;
import repository.CardRepository;
import repository.PlayerRepository;
import repository.RoundRepository;

import java.util.Collections;

@Service
public class RoundService {
    private final RoundRepository roundRepository;
    private final PlayerRepository playerRepository;
    private final CardRepository cardRepository;

    public RoundService(RoundRepository roundRepository, PlayerRepository playerRepository, CardRepository cardRepository) {
        this.roundRepository = roundRepository;
        this.playerRepository = playerRepository;
        this.cardRepository = cardRepository;
    }

    public Mono<Round> createRound() {
        Round round = new Round(Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
        return roundRepository.save(round);
    }
    // other methods

	public PlayerRepository getPlayerRepository() {
		return playerRepository;
	}

	public CardRepository getCardRepository() {
		return cardRepository;
	}
}