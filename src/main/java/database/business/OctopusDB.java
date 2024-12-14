package database.business;
import org.json.simple.JSONArray;
import org.json.simple.parser.ParseException;
import utils.Database;
import java.io.IOException;
import java.sql.SQLException;

public class OctopusDB {
    public static JSONArray obtenerEstadoTramite(String idIdentificable) {
        String query =
                "SELECT TOP 1 estado"
                        + " FROM tramite"
                        + " WHERE idIdentificable = '<ID_IDENTIFICABLE>'";

        query = query.replace("<ID_IDENTIFICABLE>", idIdentificable);
        JSONArray result = null;
        try {
            result = Database.executeQueryJSON("Octopus", query);

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return result;
    }

    public static JSONArray estadoTramite(String tramiteFinalizado) {
        String query =
                "SELECT TOP 1 estado"
                        + " FROM tramite"
                        + " WHERE id = '<TRAMITE_ID>'";

        query = query.replace("<TRAMITE_ID>", tramiteFinalizado);
        JSONArray result = null;
        try {
            result = Database.executeQueryJSON("Octopus", query);


        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return result;
    }

    public static JSONArray estado(String tramiteFinalizado) {
        String query =
                "SELECT TOP 1 estado"
                        + " FROM tramite"
                        + " WHERE id = '45269'";
        JSONArray result = null;
        try {
            result = Database.executeQueryJSON("Octopus", query);


        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return result;
    }
}