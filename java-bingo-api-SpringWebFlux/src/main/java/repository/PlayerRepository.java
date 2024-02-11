package repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import model.Player;

public interface PlayerRepository extends ReactiveMongoRepository<Player, String> {
}