package org.ripreal.textclassifier2.translators;

import org.junit.*;
import org.ripreal.textclassifier2.SpringTestConfig;
import org.ripreal.textclassifier2.service.ClassifiableTextService;
import org.springframework.beans.factory.annotation.Autowired;

public class FromMongoToClassifiableTranslatorTest extends SpringTestConfig {

    @Autowired
    FromMongoToClassifiableTranslator translator;

    @Autowired
    ClassifiableTextService textService;

    @Before
    public void setUp() throws Exception {
        //textService.deleteAll().blockLast();
        //textService.saveAll(ClassifiableTestData.getTextTestData()).blockLast();
    }

    @After
    public void tearDown() throws Exception {
        //textService.deleteAll().blockLast();
    }

    @Test
    public void toClassifiableTexts() {
        //translator.toClassifiableTexts();
    }

    @Test
    public void toCharacteristics() {
    }

    @Test
    public void toVocabulary() {
    }
}