package com.example.Anime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable; // Agrega esta importación
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(AnimeController.ANIME)
public class AnimeController {

    public static final String ANIME = "/anime";

    @Autowired
    AnimeService animeService;

    @GetMapping("/{anime_id}") // Agrega el parámetro animeId en la URL
    public String getAnime(@PathVariable int anime_id, Model model) { // Agrega @PathVariable para capturar el animeId de la URL
        AnimeResponse animeResponse = animeService.getAnimeDetails(anime_id); // Pasa el animeId al método getAnimeDetails()
        model.addAttribute("animeResponse", animeResponse);
        return "anime";
    }

}
