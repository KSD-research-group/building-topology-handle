package de.tum.ar.ai.ksdaccess.neo4j.schema.nodes;

import de.tum.ar.ai.ksdaccess.neo4j.schema.edges.Contains;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.List;
import java.util.Set;

@Data
@EqualsAndHashCode(callSuper = true, exclude = {"contains"})
@ToString(callSuper = true)
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@NodeEntity(label = "Storey")
public class Storey extends StructuralElement {

    float level; // 0.0 represents the ground floor, 1.0 the first floor, intermediate floors are ALLOWED

    String centerNative; // WKT-encoded point that represents the storey center in the Ifc, calculated by TODO:

    List<Contains> contains; // Rooms
}
