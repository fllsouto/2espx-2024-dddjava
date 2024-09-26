package br.com.fiap.twoespx.libunclesampler.libunclesampler.model;

import java.time.LocalDate;
import java.util.List;

public class Discoverer {

    // Fields to describe a discoverer
    private String fullName;                   // Full name of the discoverer (e.g., Carl Linnaeus)
    private LocalDate birthDate;               // Date of birth
    private LocalDate deathDate;               // Date of death (nullable for living discoverers)
    private String nationality;                // Nationality of the discoverer
    private String fieldOfStudy;               // Primary field of study (e.g., Botany, Zoology, Taxonomy)
    private List<String> discoveries;          // List of discoveries or contributions (e.g., Species, classifications)
    private List<String> publications;         // List of notable publications or papers
    private String biography;                  // Brief biography or description
    private String knownFor;                   // Key achievement or discovery they are famous for
    private String geoJsonExplorationAreas;    // GeoJSON representing areas explored by the discoverer
    private boolean isAlive;

}
