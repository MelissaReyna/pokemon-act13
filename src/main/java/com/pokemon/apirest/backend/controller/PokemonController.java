package com.pokemon.apirest.backend.controller;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/pokemon")
public class PokemonController {

    private String urlApi = "https://pokeapi.co/api/v2/pokemon/";

    @GetMapping(value = "/{pokemon_name}")
    public String pokemon(@PathVariable ("pokemon_name") String pokemon_name) {

        String nombre = "";

        RestTemplate restTemplate = new RestTemplate();

        nombre = restTemplate.getForObject(urlApi+pokemon_name, String.class);

        return nombre;
    }

    @GetMapping(value = "/abilities/{pokemon_name}")
    public String getAbilities(@PathVariable ("pokemon_name") String pokemon_name) throws JSONException {

        String getAbili = "";

        RestTemplate restTemplate = new RestTemplate();
        getAbili =  restTemplate.getForObject(urlApi+pokemon_name,String.class);
        JSONObject json = new JSONObject(getAbili);
        getAbili = json.optString("abilities");

        return getAbili;
    }

    @GetMapping(value = "/base_experiences/{pokemon_name}")
    public String getBaseExperiences(@PathVariable ("pokemon_name") String pokemon_name) throws JSONException {

        String getBaseExp = "";

        RestTemplate restTemplate = new RestTemplate();
        getBaseExp =  restTemplate.getForObject(urlApi+pokemon_name,String.class);
        JSONObject json = new JSONObject(getBaseExp);
        getBaseExp = json.optString("base_experience");

        return getBaseExp;
    }

    @GetMapping(value = "/held_items/{pokemon_name}")
    public String getHeldItems(@PathVariable ("pokemon_name") String pokemon_name) throws JSONException {

        String getHeldItems = "";

        RestTemplate restTemplate = new RestTemplate();
        getHeldItems =  restTemplate.getForObject(urlApi+pokemon_name,String.class);
        JSONObject json = new JSONObject(getHeldItems);
        getHeldItems = json.optString("held_items");

        return getHeldItems;
    }

    @GetMapping(value = "/id/{pokemon_name}")
    public String getId(@PathVariable ("pokemon_name") String pokemon_name) throws JSONException {

        String getId = "";

        RestTemplate restTemplate = new RestTemplate();
        getId =  restTemplate.getForObject(urlApi+pokemon_name,String.class);
        JSONObject json = new JSONObject(getId);
        getId = json.optString("id");

        return getId;
    }

    @GetMapping(value = "/name/{pokemon_name}")
    public String getName(@PathVariable ("pokemon_name") String pokemon_name) throws JSONException {

        String getName = "";

        RestTemplate restTemplate = new RestTemplate();
        getName =  restTemplate.getForObject(urlApi+pokemon_name,String.class);
        JSONObject json = new JSONObject(getName);
        getName = json.optString("name");

        return getName;
    }

    @GetMapping(value = "/location_area_encounters/{pokemon_name}")
    public String getLocAreaEncount(@PathVariable ("pokemon_name") String pokemon_name) throws JSONException {

        String getLocAreaEncount = "";

        RestTemplate restTemplate = new RestTemplate();
        getLocAreaEncount =  restTemplate.getForObject(urlApi+pokemon_name,String.class);
        JSONObject json = new JSONObject(getLocAreaEncount);
        getLocAreaEncount = json.optString("location_area_encounters");

        return getLocAreaEncount;
    }

}
