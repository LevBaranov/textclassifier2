package org.ripreal.textclassifier2.storage.data.mapper;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.ripreal.textclassifier2.storage.SpringTestConfig;
import org.ripreal.textclassifier2.model.Characteristic;
import org.ripreal.textclassifier2.model.CharacteristicValue;
import org.ripreal.textclassifier2.model.ClassifiableText;
import org.ripreal.textclassifier2.model.VocabularyWord;
import org.ripreal.textclassifier2.storage.testdata.ClassifiableTestData;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;

import static org.junit.Assert.*;

public class DeserializationTest extends SpringTestConfig {

    @Autowired
    private ObjectMapper mapper;

    @Test
    public void deserializeClassifiableTextTest() throws IOException {
        deserialize(ClassifiableTestData.getTextTestData().get(0), ClassifiableText.class);
    }

    @Test
    public void deserializeCharacteristic() throws IOException {
        deserialize(ClassifiableTestData.getCharacteristicTestData().get(0), Characteristic.class);
    }

    @Test
    public void deserializeCharacteristicValue() throws IOException {
        deserialize(ClassifiableTestData.getCharacteristicValueTetData().get(0), CharacteristicValue.class);
    }

    @Test
    public void deserializeVocabularyWord() throws IOException {
        deserialize(ClassifiableTestData.getVocabTestData().get(0), VocabularyWord.class);
    }

    public <T> void deserialize(T data, Class<T> dataClass) throws IOException {
        String beforeJson = mapper.writeValueAsString(data);
        String afterJson =  mapper.writeValueAsString(mapper.readValue(beforeJson, dataClass));

        assertEquals(beforeJson, afterJson);
    }
}