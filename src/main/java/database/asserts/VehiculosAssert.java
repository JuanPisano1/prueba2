package database.asserts;

import database.business.VehiculosDB;
import org.json.simple.JSONArray;
import utils.Database;
import utils.GlobalData;

public class VehiculosAssert {
        public static Boolean polizaVigente(String dominio) {
            String nroDominio = GlobalData.dominio;
            String polizaModificada = GlobalData.polizaModificada;
            JSONArray result = VehiculosDB.obtenerPolizaVigente(nroDominio);

            String resultPoliza = Database.getValue(result, 0, "nroPoliza");
            System.out.println(resultPoliza);

            // Verificar si "resultPoliza" es igual a "polizaModificada"
            if (resultPoliza.equalsIgnoreCase(polizaModificada)) {
                // Si son iguales, imprimir un mensaje exitoso y retornar true
                System.out.println("La modificacion de la poliza ha sido exitosa");
                return true;
            } else {
                // Si son distintos, imprimir un mensaje de fallo y retornar false
                System.out.println("Caso fallido. La poliza no se ha modificado.");
                return false;
            }
        }

            public static Boolean identificatoriosModificados (String dominio){
                String nroDominio = GlobalData.dominioUtilizado;
                String chasis = GlobalData.chasisActual;
                String motor = GlobalData.motorActual;
                JSONArray result = VehiculosDB.obtenerChasisyMotor(nroDominio);
                String resultChasis = Database.getValue(result, 0, "chasis");
                String resultMotor = Database.getValue(result, 0, "motor");
                System.out.println("El nuevo valor del chasis es " + resultChasis);
                System.out.println("El nuevo valor del motor es " +resultMotor);
                    if (!resultChasis.equals(chasis) && !resultMotor.equals(motor)) {
                        System.out.println("Los valores del chasis y el motor han sido modificados correctamente.");
                        return true;
                    } else {
                        System.out.println("La modificacion de los datos identificatorios ha fallado.");
                        return false;
                    }
            }
        }