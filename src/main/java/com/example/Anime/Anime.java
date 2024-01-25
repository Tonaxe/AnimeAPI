package com.example.Anime;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;

// Clase AlternativaTítulos
@JsonIgnoreProperties(ignoreUnknown = true)
record AlternativeTitles(String japanese, String english) {}

// Clase Personaje
@JsonIgnoreProperties(ignoreUnknown = true)
record Character(
        String name,
        String picture_url,
        String myanimelist_url,
        String voice_actor_name,
        String voice_actor_picture_url,
        String voice_actor_myanimelist_url
) {}

// Clase Género
@JsonIgnoreProperties(ignoreUnknown = true)
record Genre(String name, String url) {}

// Clase Información
@JsonIgnoreProperties(ignoreUnknown = true)
record Information(
        ArrayList<Type> type,
        String episodes,
        String status,
        String aired,
        ArrayList<Premiered> premiered,
        String broadcast,
        ArrayList<Producer> producers,
        ArrayList<Licensor> licensors,
        ArrayList<Studio> studios,
        String source,
        String genre,
        String theme,
        String duration,
        String rating,
        ArrayList<Genre> genres,
        ArrayList<Theme> themes
) {}

// Clase Licenciatario
@JsonIgnoreProperties(ignoreUnknown = true)
record Licensor(String name, String url) {}

// Clase Estrenado
@JsonIgnoreProperties(ignoreUnknown = true)
record Premiered(String name, String url) {}

// Clase Productor
@JsonIgnoreProperties(ignoreUnknown = true)
record Producer(String name, String url) {}

// Clase Raíz
@JsonIgnoreProperties(ignoreUnknown = true)
record AnimeResponse(
        String title_ov,
        String title_en,
        String synopsis,
        AlternativeTitles alternative_titles,
        Information information,
        Statistics statistics,
        ArrayList<Character> characters,
        String picture_url
) {}

// Clase Estadísticas
@JsonIgnoreProperties(ignoreUnknown = true)
record Statistics(double score, int ranked, int popularity, int members, int favorites) {}

// Clase Estudio
@JsonIgnoreProperties(ignoreUnknown = true)
record Studio(String name, String url) {}

// Clase Tema
@JsonIgnoreProperties(ignoreUnknown = true)
record Theme(String name, String url) {}

// Clase Tipo
@JsonIgnoreProperties(ignoreUnknown = true)
record Type(String name, String url) {}
