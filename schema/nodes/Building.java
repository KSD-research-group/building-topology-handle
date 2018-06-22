package de.tum.ar.ai.ksdaccess.neo4j.schema.nodes;

import de.tum.ar.ai.ksdaccess.neo4j.BuildingType;
import de.tum.ar.ai.ksdaccess.neo4j.schema.edges.Contains;
import lombok.*;

import lombok.experimental.FieldDefaults;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import java.math.BigDecimal;
import java.net.InetAddress;
import java.time.Instant;
import java.time.Year;
import java.util.List;
import java.util.Set;

@Data
@EqualsAndHashCode(callSuper = true, exclude = {"contains"})
@ToString(callSuper = true)
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@NodeEntity(label = "Building")
public class Building extends StructuralElement {

    // Internal data, used for backups and administrative work

    long bimProjectId; // useful in conjunction with getLatestRevisionId

    String ifcFilename; // do NOT strip file types identifiers (.ifc, .xml, ...)

    byte[] ifcMD5; // hash of the Ifc file

    Instant uploadTimestamp; // We take the timestamp that is reported by the BIMServer

    boolean validated; // indicates if graph was validated / uploaded by an admin

    Long legacyBimProjectId; // was the project carried over from the legacy database? if yes, this is set

    InetAddress uploaderIp; // for tracking of malicious uploaders / spammers

    // Information about the project

    String title; // Representative title of the project for display in 3rd party apps

    @NotEmpty
    List<String> architects;

    // @Past TODO: investigate validation options
    Year yearOfConception;

    // @Past TODO: investigate validation options
    Year yearOfConstruction; // year when construction was finished

    // @NotNull TODO: ask if mandatory
    BuildingType buildingType;

    List<String> websites;

    boolean isConcept; // indicates whether the building is just a concept or was actually built

    // Location data -  Try to use official ISO names for locations and convey this to the user

    //@Range(min = -90, max = 90) TODO: investigate how to make optional
    BigDecimal latitude;

    //@Range(min = -180, max = 180) TODO: investigate how to make optional
    BigDecimal longitude;

    String city;

    String country;

    // Relations

    List<Contains> contains; // Storeys

}