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



public class EyeAppointment {
    // Atributos
    String appointmentCode;
    String consultationType;
    String doctorName;

    // Constructor
    public EyeAppointment(String appointmentCode, String consultationType, String doctorName) {
        this.appointmentCode = appointmentCode;
        this.consultationType = consultationType;
        this.doctorName = doctorName;
    }

    // Método para mostrar la información
    public void showInfo() {
        System.out.println("Código: " + appointmentCode);
        System.out.println("Tipo de Consulta: " + consultationType);
        System.out.println("Doctor: " + doctorName);
        System.out.println("-----------------------------");
    }
}

public class EyeAppointment {
    // Atributos
    String appointmentCode;
    String consultationType;
    String doctorName;

    // Constructor
    public EyeAppointment(String appointmentCode, String consultationType, String doctorName) {
        this.appointmentCode = appointmentCode;
        this.consultationType = consultationType;
        this.doctorName = doctorName;
    }

    // Método para mostrar la información
    public void showInfo() {
        System.out.println("Código: " + appointmentCode);
        System.out.println("Tipo de Consulta: " + consultationType);
        System.out.println("Doctor: " + doctorName);
        System.out.println("-----------------------------");
    }
}

public class EyeAppointment {
    // Atributos
    String appointmentCode;
    String consultationType;
    String doctorName;

    // Constructor
    public EyeAppointment(String appointmentCode, String consultationType, String doctorName) {
        this.appointmentCode = appointmentCode;
        this.consultationType = consultationType;
        this.doctorName = doctorName;
    }

    // Método para mostrar la información
    public void showInfo() {
        System.out.println("Código: " + appointmentCode);
        System.out.println("Tipo de Consulta: " + consultationType);
        System.out.println("Doctor: " + doctorName);
        System.out.println("-----------------------------");
    }
}


public class EyeAppointment {
    // Atributos
    String appointmentCode;
    String consultationType;
    String doctorName;

    // Constructor
    public EyeAppointment(String appointmentCode, String consultationType, String doctorName) {
        this.appointmentCode = appointmentCode;
        this.consultationType = consultationType;
        this.doctorName = doctorName;
    }

    // Método para mostrar la información
    public void showInfo() {
        System.out.println("Código: " + appointmentCode);
        System.out.println("Tipo de Consulta: " + consultationType);
        System.out.println("Doctor: " + doctorName);
        System.out.println("-----------------------------");
    }
}

