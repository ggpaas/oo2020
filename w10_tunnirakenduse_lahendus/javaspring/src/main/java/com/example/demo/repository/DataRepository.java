package com.example.demo.repository;

import java.util.Map;

public class DataRepository {
    static Map<String, String> data;

    static public Map<String, String> buildData(){
        data = Map.of(
            "name", "Gevin",
            "language", "java"
        );

        return data;
    }
}
