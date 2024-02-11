package repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import model.Round;

public interface RoundRepository extends ReactiveMongoRepository<Round, String> {
}