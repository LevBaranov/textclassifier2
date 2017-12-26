package org.ripreal.textclassifier2.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashSet;
import java.util.Set;

@Data
@Document
@NoArgsConstructor
@RequiredArgsConstructor
public class Characteristic {

    @Id private String id;
    @NonNull private String name;
    @DBRef private Set<CharacteristicValue> possibleValues = new HashSet<>();

    @Override
    public boolean equals(Object o) {
        return ((o instanceof Characteristic) && (this.name.equals(((Characteristic) o).getName())));
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }
}