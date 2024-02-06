import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        mostrarFechaYHora();
    }

    public static void mostrarFechaYHora() {
        LocalDateTime fechaHoraActual = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDate = fechaHoraActual.format(formatter);
        System.out.println("Fecha y hora actual: " + formattedDate);
    }
}

