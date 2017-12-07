package br.usjt.desmob.geodata;

import android.content.Context;

/**
 * Grazielly de Aquino RA 201517191
 */

public class Contexto {
    private static Context contexto;

    public static Context getValue(){
        return contexto;
    }

    public static void setValue(Context c){
        contexto = c;
    }
}
