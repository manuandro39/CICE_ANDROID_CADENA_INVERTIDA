package com.example.cice.invertido;

/**
 * Created by vale on 11/05/16.
 */
public class StringUtil {

    public static String cadenaAlReves (String nombre)
    {
        String cadenainvertida="";

        for(int i = nombre.length() - 1; i >= 0; i--) {
            cadenainvertida += nombre.charAt(i);
        }
        return cadenainvertida;
    }
}
