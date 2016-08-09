package org.fourhats.empleartec;

import java.util.HashMap;
import java.util.Map;

public class Tablero {
    public String marcador() {

        Map<String,String> mapa = new HashMap<String, String>() {{
            put("a","b");
        }};
        return "0 - 0";
    }
}
