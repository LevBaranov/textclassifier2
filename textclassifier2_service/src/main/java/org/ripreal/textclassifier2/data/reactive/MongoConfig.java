package org.ripreal.textclassifier2.data.reactive;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.MongoClientURI;
import com.mongodb.MongoCredential;
import com.mongodb.client.MongoDatabase;
import org.ripreal.textclassifier2.data.reactive.CharacteristicMongoListener;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.MongoClientFactoryBean;
import org.springframework.data.mongodb.core.MongoOperations;

@Configuration
public class MongoConfig {

    //@Value("${spring.data.mongodb.uri}")
    private String mongoURI = "mongodb+srv://admin:kentdfu!@cluster0-bsfqs.mongodb.net/test";

    @Bean
    public CharacteristicMongoListener characteristicMongoListener(MongoOperations mongoOperations) {
        return new CharacteristicMongoListener(mongoOperations);
    }

    @Bean
    @Profile("production")
    public MongoClient mongoClientCloud() {
        MongoClientURI uri = new MongoClientURI(mongoURI);
        return new MongoClient(uri);
    }

    @Bean
    @Profile("test")
    public MongoClient mongoClientLocal() {
        return new MongoClient();
    }
}
