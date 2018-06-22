package de.tum.ar.ai.ksdaccess.neo4j.schema.nodes;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;

@Data
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@NodeEntity(label = "StructuralElement")
public abstract class StructuralElement {

    @GraphId
    Long id;

    String ifcElementName; // Name of the element in the ifc file. Could be used for training recognition networks.

    String ifcElementId; // The GUID of the respective element
}
