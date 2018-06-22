package de.tum.ar.ai.ksdaccess.neo4j.repositories;

import de.tum.ar.ai.ksdaccess.neo4j.schema.nodes.RoomType;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import java.util.Optional;

public interface RoomTypeRepository extends Neo4jRepository<RoomType, Long> {

    Optional<RoomType> findByRoomType(de.tum.ar.ai.ksdaccess.neo4j.RoomType roomType);
}
