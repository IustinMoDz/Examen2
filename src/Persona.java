import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

// Clase que representa una persona con varios atributos personales

class Persona {

    // Atributos privados de la clase Persona

    private String dni;
    private String correo;
    private String contrasena;
    private String nombre;
    private String apellidos;
    private String direccionPostal;
    private String codigoPostal;
    private String telefono;
    private int edad;

    // Método para establecer el DNI, debe ser un string de 8 dígitos

    public boolean setDni(String dni) {
        if (dni.matches("\\d{8}")) {
            this.dni = dni;
            return true;
        } else {
            System.out.println("DNI no válido. Debe tener 8 dígitos.");
            return false;
        }
    }

    // Método para establecer el correo electrónico, debe seguir un formato específico

    public boolean setCorreo(String correo) {
        String regex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(correo);
        if (matcher.matches()) {
            this.correo = correo;
            return true;
        } else {
            System.out.println("Correo electrónico no válido.");
            return false;
        }
    }

    // Método para establecer la contraseña, debe tener más de 8 caracteres

    public boolean setContrasena(String contrasena) {
        if (contrasena.length() > 8) {
            this.contrasena = contrasena;
            return true;
        } else {
            System.out.println("Contraseña no válida. Debe tener más de 8 caracteres.");
            return false;
        }
    }

    // Métodos para establecer otros atributos de la persona

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setDireccionPostal(String direccionPostal) {
        this.direccionPostal = direccionPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    // Método para establecer la edad, debe ser 18 o mayor

    public boolean setEdad(int edad) {
        if (edad >= 18) {
            this.edad = edad;
            return true;
        } else {
            System.out.println("Debes ser mayor de 18 años.");
            return false;
        }
    }

    // Método toString para obtener una representación en texto de la persona
    
    @Override
    public String toString() {
        return "DNI: " + dni + "\n" +
               "Correo: " + correo + "\n" +
               "Nombre: " + nombre + "\n" +
               "Apellidos: " + apellidos + "\n" +
               "Dirección Postal: " + direccionPostal + "\n" +
               "Código Postal: " + codigoPostal + "\n" +
               "Teléfono: " + telefono + "\n" +
               "Edad: " + edad;
    }
}
