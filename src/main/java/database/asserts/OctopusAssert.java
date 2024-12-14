package database.asserts;

import database.business.CalipsoDB;
import database.business.OctopusDB;
import org.json.simple.JSONArray;
import utils.Database;
import utils.GlobalData;


public class OctopusAssert {
    public static Boolean verificarEstadoTramite(String idIdentificable) {
   //obtener estado del tramite
        JSONArray resultBaja = OctopusDB.obtenerEstadoTramite(idIdentificable);

        String resultTramite = String.valueOf(Database.getValue(resultBaja, 0, "estado"));

        if (resultTramite.isEmpty()) {
            return false;
        }
        if (resultTramite.isEmpty()) {
            return false;
        }
        if (resultTramite.equalsIgnoreCase("FINALIZADO")) {
            return true;
        }

        return true;
    }
    public static Boolean verificarTramiteFinalzado(String tramiteFinalizado) {
        //obtener estado del tramite
        JSONArray resultBaja = OctopusDB.estadoTramite(tramiteFinalizado);

        String resultTramite = String.valueOf(Database.getValue(resultBaja, 0, "estado"));

        if (resultTramite.isEmpty()) {
            return false;
        }
        if (resultTramite.equalsIgnoreCase("FINALIZADO")) {
            return true;
        }

        return true;
    }
}