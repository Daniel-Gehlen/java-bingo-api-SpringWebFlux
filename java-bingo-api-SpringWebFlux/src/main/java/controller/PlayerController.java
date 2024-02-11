package controller;

import org.springframework.web.bind.annotation.*;

import model.Player;
import reactor.core.publisher.Mono;
import service.PlayerService;

@RestController
@RequestMapping("/players")
public class PlayerController {
    private final PlayerService playerService;

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @PostMapping
    public Mono<Player> savePlayer(@RequestBody Player player) {
        return playerService.savePlayer(player);
    }
    // other endpoints
}