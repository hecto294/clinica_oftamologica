// Clase que representa una cita en una clínica oftalmológica
public class EyeAppointment {
    // Atributos
    String appointmentCode;   // Código de la cita
    String patientName;       // Nombre del paciente
    String consultationType;  // Tipo de consulta
    String doctorName;        // Nombre del médico
    String appointmentDate;   // Fecha de la cita

    // Constructor
    public EyeAppointment(String appointmentCode, String patientName, String consultationType, String doctorName, String appointmentDate) {
        this.appointmentCode = appointmentCode;
        this.patientName = patientName;
        this.consultationType = consultationType;
        this.doctorName = doctorName;
        this.appointmentDate = appointmentDate;
    }

    // Método para mostrar la información de la cita
    public void showInfo() {
        System.out.println("Código: " + appointmentCode);
        System.out.println("Paciente: " + patientName);
        System.out.println("Tipo de Consulta: " + consultationType);
        System.out.println("Doctor: " + doctorName);
        System.out.println("Fecha: " + appointmentDate);
        System.out.println("--------------------------------------");
    }
}


// Programa principal que crea y muestra citas oftalmológicas
public class Main {
    public static void main(String[] args) {
        // Crear 5 objetos de tipo EyeAppointment
        EyeAppointment cita1 = new EyeAppointment("CITA-001", "María López", "Consulta General", "Dr. Martínez", "2025-11-02");
        EyeAppointment cita2 = new EyeAppointment("CITA-002", "Carlos Gómez", "Examen de Agudeza Visual", "Dra. Rodríguez", "2025-11-05");
        EyeAppointment cita3 = new EyeAppointment("CITA-003", "Lucía Fernández", "Control de Lentes", "Dr. Jiménez", "2025-11-08");
        EyeAppointment cita4 = new EyeAppointment("CITA-004", "Javier Torres", "Cirugía Láser", "Dr. Pérez", "2025-11-10");
        EyeAppointment cita5 = new EyeAppointment("CITA-005", "Sofía Ramírez", "Examen de Fondo de Ojo", "Dra. Morales", "2025-11-12");

        // Mostrar información de todas las citas
        cita1.showInfo();
        cita2.showInfo();
        cita3.showInfo();
        cita4.showInfo();
        cita5.showInfo();
    }
}


