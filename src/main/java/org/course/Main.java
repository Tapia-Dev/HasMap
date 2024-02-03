package org.course;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        HashMap<Integer,String> mapNames = new HashMap<>();

        mapNames.put(100,"Allan");
        mapNames.put(200,"Alberto");

        for (Map.Entry<Integer, String> entry : mapNames.entrySet()) {
            Integer clave = entry.getKey();
            String valor = entry.getValue();
            System.out.println("Clave: " + clave + ", Valor: " + valor);
        }



    }
}