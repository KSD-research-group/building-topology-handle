package de.tum.ar.ai.ksdaccess.neo4j.repositories;

import de.tum.ar.ai.ksdaccess.neo4j.schema.edges.IsSynonymFor;
import de.tum.ar.ai.ksdaccess.neo4j.schema.nodes.RoomType;
import de.tum.ar.ai.ksdaccess.neo4j.schema.nodes.Synonym;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface SynonymRepository extends Neo4jRepository<Synonym, Long> {

    Optional<Synonym> findBySynonymLike(String synonym);
}
