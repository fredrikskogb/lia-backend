package com.example.accessingdatamongodb.repository;

import com.example.accessingdatamongodb.model.Translations;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TranslationsRepository extends MongoRepository<Translations, String> {
}
