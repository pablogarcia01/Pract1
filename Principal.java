import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        mostrarFechaYHora();

        // Nuevo método para crear array de Usuarios
        Usuario[] arrayUsuarios = crearArrayUsuarios(3);

        // Mostrar contenido de cada Usuario
        mostrarUsuarios(arrayUsuarios);
    }

    // Método para mostrar la fecha y hora actual
    public static void mostrarFechaYHora() {
        LocalDateTime fechaHoraActual = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDate = fechaHoraActual.format(formatter);
        System.out.println("Fecha y hora actual: " + formattedDate);
    }

    // Método para crear array de Usuarios
    public static Usuario[] crearArrayUsuarios(int cantidad) {
        Scanner scanner = new Scanner(System.in);
        Usuario[] usuarios = new Usuario[cantidad];

        for (int i = 0; i < cantidad; i++) {
            Usuario usuario = new Usuario();
            System.out.println("Ingresa el nombre del Usuario " + (i + 1) + ": ");
            usuario.nombre = scanner.nextLine();
            System.out.println("Ingresa los apellidos del Usuario " + (i + 1) + ": ");
            usuario.apellidos = scanner.nextLine();
            System.out.println("Ingresa el email del Usuario " + (i + 1) + ": ");
            usuario.email = scanner.nextLine();

            usuarios[i] = usuario;
        }

        return usuarios;
    }

    // Método para mostrar contenido de cada Usuario
    public static void mostrarUsuarios(Usuario[] usuarios) {
        System.out.println("\nUsuarios:");

        for (Usuario usuario : usuarios) {
            System.out.println("Nombre: " + usuario.nombre);
            System.out.println("Apellidos: " + usuario.apellidos);
            System.out.println("Email: " + usuario.email);
            System.out.println();
        }
    }
}
