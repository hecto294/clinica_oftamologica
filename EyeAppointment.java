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

