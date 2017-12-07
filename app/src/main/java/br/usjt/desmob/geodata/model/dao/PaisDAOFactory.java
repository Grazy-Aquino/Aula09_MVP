package br.usjt.desmob.geodata.model.dao;

import br.usjt.desmob.geodata.Contexto;

/**
 * Grazielly de Aquino RA 201517191
 */

public class PaisDAOFactory {

    public static PaisDAO getPaisDAO(boolean onLine){
        if (onLine) {
            return new PaisDAORest();
        } else {
            return new PaisDAODb(Contexto.getValue());
        }
    }
}
