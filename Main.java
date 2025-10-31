public class Main {
    public static void main(String[] args) {
        // Crear 3 objetos de tipo EyeAppointment
        EyeAppointment cita1 = new EyeAppointment("EYE-001", "Consulta General", "Dr. Martínez");
        EyeAppointment cita2 = new EyeAppointment("EYE-002", "Examen Optométrico", "Dra. Rodríguez");
        EyeAppointment cita3 = new EyeAppointment("EYE-003", "Cirugía Láser", "Dr. Gómez");

        // Mostrar la información de las citas
        System.out.println("===== CITAS OFTALMOLÓGICAS =====");
        cita1.showInfo();
        cita2.showInfo();
        cita3.showInfo();
    }
}
