package de.tum.ar.ai.ksdaccess.neo4j.schema.edges;

import de.tum.ar.ai.ksdaccess.neo4j.Connection;
import de.tum.ar.ai.ksdaccess.neo4j.schema.nodes.Room;
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
@RelationshipEntity(type = "CONNECTED_TO")
public class IsConnectedTo {

    @GraphId
    Long id;

    Connection type;

    @StartNode
    Room room1;

    @EndNode
    Room room2;

    @Override
    public String toString() {
        return "IsConnectedTo{" +
                "type=" + type +
                '}';
    }
}
