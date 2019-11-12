package com.example.accessingdatamongodb.api;


import com.example.accessingdatamongodb.model.Translations;
import com.example.accessingdatamongodb.services.TranslationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = {"http://localhost:8081", "http://localhost:9876"})

public class TranslationsApi {

    @Autowired
    private TranslationsService translationsService;

    @GetMapping("/translations")
    public List<Translations> getTranslations() {
        return translationsService.getTranslations();
    }

    @PostMapping ("translations/create")
    public void setTranslations(@RequestBody Translations translations) {
        translationsService.createTranslations(translations);
    }

}
