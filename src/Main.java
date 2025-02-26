import Modelo.EmailNotificacion;
import Modelo.PushNotificacion;
import Modelo.SMSNotificacion;
import Modelo.WhatsappNotificacion;
import Servicios.NotificacionesServicios;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*creaamos las notificaciones*/
        SMSNotificacion sms = new SMSNotificacion();
        PushNotificacion push = new PushNotificacion();
        EmailNotificacion email = new EmailNotificacion();
        WhatsappNotificacion whatsapp = new WhatsappNotificacion();
        /*creamos el servicio*/
        NotificacionesServicios servicios = new NotificacionesServicios(Arrays.asList(sms,push,email,whatsapp));
        /*enviamos los mensajes*/
        servicios.enviarNotificaciones("mensaje de prueba: ");//enviara los mesajes de cada notificacion
    }
}