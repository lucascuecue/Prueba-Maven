package com.cuervacuencalucas;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Persona p = new Persona("persona", "ejemplo", "personaejemplo@gmail.com", 20);

        Gson gson = new Gson();
        String json = gson.toJson(p);
        System.out.println(json);
    }
}