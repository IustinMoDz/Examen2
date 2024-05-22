public class TestSetDni {

    public static void main(String[] args) {
        
        Persona persona = new Persona();

        // Caso 1: DNI con 8 dígitos

        assert persona.setDni("12345678") == true : "Error: Caso 1 fallido";
        assert persona.getDni().equals("12345678") : "Error: Caso 1 fallido - DNI no asignado correctamente";

        // Caso 2: DNI con menos de 8 dígitos

        assert persona.setDni("1234567") == false : "Error: Caso 2 fallido";

        // Caso 3: DNI con más de 8 dígitos

        assert persona.setDni("123456789") == false : "Error: Caso 3 fallido";

        // Caso 4: DNI con caracteres no numéricos

        assert persona.setDni("1234abcd") == false : "Error: Caso 4 fallido";

        // Caso 5: DNI vacío

        assert persona.setDni("") == false : "Error: Caso 5 fallido";

        // Caso 6: DNI con caracteres especiales

        assert persona.setDni("1234@678") == false : "Error: Caso 6 fallido";

        // Caso 7: DNI con espacios
        
        assert persona.setDni("1234 678") == false : "Error: Caso 7 fallido";

        System.out.println("Todas las pruebas han pasado correctamente.");
    }
}