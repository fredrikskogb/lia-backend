package com.example.accessingdatamongodb.services;

import com.example.accessingdatamongodb.model.Translations;
import com.example.accessingdatamongodb.repository.TranslationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class TranslationsService {

    @Autowired
    private TranslationsRepository translationsRepository;

    @Autowired
    public TranslationsService(){}

    public List<Translations> getTranslations() {
        return translationsRepository.findAll();
    }

    public void createTranslations(Translations translations) {
        translationsRepository.save(translations);
    }

}
