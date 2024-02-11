package controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Round;
import reactor.core.publisher.Mono;
import service.RoundService;

@RestController
@RequestMapping("/rounds")
public class RoundController {
    private final RoundService roundService;

    public RoundController(RoundService roundService) {
        this.roundService = roundService;
    }

    @PostMapping
    public Mono<Round> createRound() {
        return roundService.createRound();
    }
    // other endpoints
}