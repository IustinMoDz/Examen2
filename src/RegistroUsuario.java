import java.util.Scanner;

// Clase principal que contiene el método main para la ejecución del programa

public class RegistroUsuario {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Scanner para la entrada del usuario

        Persona persona = new Persona(); // Crear una nueva instancia de Persona

        // Recolección y validación de los datos del usuario

        System.out.print("Ingrese el DNI: ");
        while (!persona.setDni(scanner.nextLine()))
            ;

        System.out.print("Ingrese el correo electrónico: ");
        while (!persona.setCorreo(scanner.nextLine()))
            ;

        System.out.print("Ingrese la contraseña: ");
        while (!persona.setContrasena(scanner.nextLine()))
            ;

        System.out.print("Ingrese el nombre: ");
        persona.setNombre(scanner.nextLine());

        System.out.print("Ingrese los apellidos: ");
        persona.setApellidos(scanner.nextLine());

        System.out.print("Ingrese la dirección postal: ");
        persona.setDireccionPostal(scanner.nextLine());

        System.out.print("Ingrese el código postal: ");
        persona.setCodigoPostal(scanner.nextLine());

        System.out.print("Ingrease el teléfono: ");
        persona.setTelefono(scanner.nextLine());

        System.out.print("Ingrese la edad: ");
        while (!persona.setEdad(scanner.nextInt()))
            ;

        // Mostrar mensaje de éxito y detalles del usuario registrado

        System.out.println("Registro exitoso!");
        System.out.println("Detalles del usuario:");
        System.out.println(persona);
    }
}