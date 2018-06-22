package de.tum.ar.ai.ksdaccess.neo4j.schema.nodes;

import de.tum.ar.ai.ksdaccess.neo4j.schema.edges.IsSynonymFor;
import de.tum.ar.ai.ksdaccess.neo4j.schema.nodes.RoomType;
import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@EqualsAndHashCode(exclude = {"roomTypes"})
@FieldDefaults(level = AccessLevel.PRIVATE)
@NodeEntity(label = "Synonym")
public class Synonym {

    @GraphId Long id;

    String synonym; // a synonym for a room room type

    List<IsSynonymFor> roomTypes;
}
