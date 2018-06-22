package de.tum.ar.ai.ksdaccess.neo4j.schema.edges;

import de.tum.ar.ai.ksdaccess.neo4j.schema.nodes.RoomType;
import de.tum.ar.ai.ksdaccess.neo4j.schema.nodes.Synonym;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

@Data
@NoArgsConstructor
@EqualsAndHashCode(exclude = {"id"})
@FieldDefaults(level = AccessLevel.PRIVATE)
@RelationshipEntity(type = "SYNONYM_FOR")
public class IsSynonymFor {

    @GraphId
    Long id;

    int instances; // number of times that the originating synonym was correctly used for classification of a room type

    @StartNode
    Synonym synonym;

    @EndNode
    RoomType roomType;

    @Override
    public String toString() {
        return "IsSynonymFor{" +
                ", instances=" + instances +
                '}';
    }
}
