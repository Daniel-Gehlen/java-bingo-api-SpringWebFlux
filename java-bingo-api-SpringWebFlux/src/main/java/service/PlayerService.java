package service;

import org.springframework.stereotype.Service;

import model.Player;
import reactor.core.publisher.Mono;
import repository.PlayerRepository;

@Service
public class PlayerService {
    private final PlayerRepository playerRepository;

    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public Mono<Player> savePlayer(Player player) {
        return playerRepository.save(player);
    }
    // other methods
}