package config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractReactiveMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

import com.mongodb.reactivestreams.client.MongoClient;
import com.mongodb.reactivestreams.client.MongoClients;

@Configuration
@EnableReactiveMongoRepositories
public class MongoConfig extends AbstractReactiveMongoConfiguration {
    @Override
    protected String getDatabaseName() {
        return "bingo";
    }

    @Override
    public MongoClient reactiveMongoClient() {
        return MongoClients.create();
    }
}
