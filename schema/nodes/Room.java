package de.tum.ar.ai.ksdaccess.neo4j.schema.nodes;

import de.tum.ar.ai.ksdaccess.neo4j.schema.edges.IsConnectedTo;
import de.tum.ar.ai.ksdaccess.neo4j.schema.edges.IsSeparatedFrom;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.List;
import java.util.Set;

@Data
@EqualsAndHashCode(callSuper = true, exclude = {"connectedTo","separatedFrom"})
@ToString(callSuper = true)
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@NodeEntity(label = "Room")
public class Room extends StructuralElement {

    // Native geometry, taken directly from the Ifc file

    String floorGeometryNative; // WKT-encoded geometry of the floor polygon from the Ifc file

    String fullGeometryNative; // WKT-encoded geometry of the full IfcSpace

    String centerNative; // WKT-encoded point that represents the room center in the Ifc, calculated by TODO:

    double areaNative; // The area without any conversion applied to it

    String floorGeometry; // WKT-encoded geometry of the floor polygon centered at (0,0), which denotes the roomCenter

    String fullGeometry; // WKT-encoded geometry of the full IfcSpace centered at (0,0) on the lateral axes and with 0 on the height axes

    double area; // area in square meters TODO: enforce this. maybe through scale factor?

    boolean isEnclosed; // TODO: inquire

    boolean hasWindows; // TODO: inquire

    List<IsConnectedTo> connectedTo;

    List<IsSeparatedFrom> separatedFrom;

    @Relationship(type = "HAS_TYPE", direction = Relationship.OUTGOING)
    RoomType roomType;
}
