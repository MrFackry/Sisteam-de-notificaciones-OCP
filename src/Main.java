import Modelo.EmailNotificacion;
import Modelo.PushNotificacion;
import Modelo.SMSNotificacion;
import Servicios.NotificacionesServicios;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*creaamos las notificaciones*/
        SMSNotificacion sms = new SMSNotificacion();
        PushNotificacion push = new PushNotificacion();
        EmailNotificacion email = new EmailNotificacion();

        /*creamos el servicio*/
        NotificacionesServicios servicios = new NotificacionesServicios(Arrays.asList(sms,push,email));

        servicios.enviarNotificaciones("mensaje de prueba");
    }
}