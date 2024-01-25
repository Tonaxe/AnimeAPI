package com.example.Anime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AnimeService {

    @Autowired
    RestTemplate restTemplate;

    protected AnimeResponse getAnimeDetails(int anime_id) {
        String animeUrl = "https://myanimelist.p.rapidapi.com/anime/" + anime_id;
        AnimeResponse data = restTemplate.getForObject(animeUrl, AnimeResponse.class);
        return data;
    }

    protected AnimeResponse[] getRoot() {
        // Este método puede permanecer igual si necesitas obtener la lista de animes
        AnimeResponse[] data = restTemplate.getForObject("https://myanimelist.p.rapidapi.com/", AnimeResponse[].class);
        return data;
    }
}
