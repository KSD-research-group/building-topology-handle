package de.tum.ar.ai.ksdaccess.neo4j.repositories;

import de.tum.ar.ai.ksdaccess.neo4j.schema.nodes.Building;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface BuildingRepository extends Neo4jRepository<Building, Long> {

    Optional<Building> findByIfcMD5Is(byte[] ifcMD5);
}
