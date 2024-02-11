package repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import model.Card;

public interface CardRepository extends ReactiveMongoRepository<Card, String> {
}