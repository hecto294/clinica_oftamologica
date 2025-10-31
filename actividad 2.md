 # **Programación estructurada** (usando variables sueltas y funciones)

 son datos y funciones separados; se usan variables globales o pasadas por parámetros. Buena para tareas secuenciales y simples.
***EJEMPLO:***

public class MainEstructurada {
        public static void main(String[] args) {

            // --- Datos de la cita ---
            String codigo = "EYE-001";
            String paciente = "Ana Pérez";
            String doctor = "Dr. Martínez";
            String tipoConsulta = "Consulta General";
            String fecha = "30/10/2025";
            String hora = "10:00 AM";

            // --- Mostrar los datos de la cita ---
            System.out.println("===== DATOS DE LA CITA =====");
            System.out.println("Código: " + codigo);
            System.out.println("Paciente: " + paciente);
            System.out.println("Doctor: " + doctor);
            System.out.println("Tipo de consulta: " + tipoConsulta);
            System.out.println("Fecha: " + fecha);
            System.out.println("Hora: " + hora);
        }
    }


**Programación orientada a objetos** (usando una clase)

 Agrupa datos (atributos) y comportamientos (métodos) en un objeto/ clase. Facilita modelar entidades reales, reutilización y mantenimiento.

 ***EJEMPLO:***

 public class MainPOO {
        public static void main(String[] args) {
            // Crear objetos de tipo EyeAppointment
            EyeAppointment cita1 = new EyeAppointment("EYE-001", "Consulta General", "Dr. Martínez");
            EyeAppointment cita2 = new EyeAppointment("EYE-002", "Examen Optométrico", "Dra. Rodríguez");
            EyeAppointment cita3 = new EyeAppointment("EYE-003", "Cirugía Láser", "Dr. Gómez");

            // Mostrar información de las citas
            System.out.println("===== CITAS OFTALMOLÓGICAS =====");
            cita1.showInfo();
            cita2.showInfo();
            cita3.showInfo();
        }
    }

