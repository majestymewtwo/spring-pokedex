package com.example.springpokedex.service;

import com.example.springpokedex.dto.Pokemon;
import com.google.gson.Gson;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

@Service
public class PokedexService {
    public Pokemon getPokemonDetails(String name) throws IOException {
        URL url = new URL("https://pokeapi.co/api/v2/pokemon/" + name);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String line;
        StringBuilder content = new StringBuilder();
        while ((line = in.readLine()) != null) {
            content.append(line);
            content.append(System.lineSeparator());
        }
        in.close();
        connection.disconnect();
        Gson gson = new Gson();
        return gson.fromJson(content.toString(), Pokemon.class);
    }
}
