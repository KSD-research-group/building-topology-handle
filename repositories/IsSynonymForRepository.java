package de.tum.ar.ai.ksdaccess.neo4j.repositories;

import de.tum.ar.ai.ksdaccess.neo4j.RoomType;
import de.tum.ar.ai.ksdaccess.neo4j.schema.edges.IsSynonymFor;
import de.tum.ar.ai.ksdaccess.neo4j.schema.nodes.Synonym;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import java.util.Optional;

public interface IsSynonymForRepository extends Neo4jRepository<IsSynonymFor, Long> {

    Optional<IsSynonymFor> findFirstBySynonym_SynonymAndRoomType_RoomType(String synonym, RoomType roomType);

}
