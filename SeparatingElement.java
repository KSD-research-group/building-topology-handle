package de.tum.ar.ai.ksdaccess.neo4j;

// Separating building elements that can be traversed (without using force ;)
public enum SeparatingElement {

    SLAB, // ceiling or floor
    WALL,
    WINDOW;

}
