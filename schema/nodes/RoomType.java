package de.tum.ar.ai.ksdaccess.neo4j.schema.nodes;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.Set;

@Data
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@NodeEntity(label = "RoomType")
public class RoomType {

    @GraphId Long id;

    de.tum.ar.ai.ksdaccess.neo4j.RoomType roomType;
}
