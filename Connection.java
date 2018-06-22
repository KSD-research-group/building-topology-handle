package de.tum.ar.ai.ksdaccess.neo4j;

public enum Connection {

    DOOR, // closeable passage
    PASSAGE, // unobstructed passage
    ENTRANCE, // portal between inside the building an external structures (like open air or a shared corridor)
    STAIRS;

}
