package de.tum.ar.ai.ksdaccess.neo4j.schema.edges;

import de.tum.ar.ai.ksdaccess.neo4j.schema.nodes.StructuralElement;
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
@RelationshipEntity(type = "CONTAINS")
public class Contains {

    @GraphId
    Long id;

    String offset; // WKT vector offset from the normalized parent entity center (which is always 0,0,0) in meters

    @StartNode
    StructuralElement container;

    @EndNode
    StructuralElement contained;

    @Override
    public String toString() {
        return "Contains{" +
                "offset='" + offset + '\'' +
                '}';
    }
}
