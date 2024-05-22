public class TestSetEdad {
    public static void main(String[] args) {
        Persona persona = new Persona();
        
        // Caso 1: Edad mínima válida

        System.out.println("Prueba 1 (18): " + (persona.setEdad(18) == true));
        
        // Caso 2: Edad mayor a la mínima válida

        System.out.println("Prueba 2 (25): " + (persona.setEdad(25) == true));
        
        // Caso 3: Edad justo por debajo del umbral

        System.out.println("Prueba 3 (17): " + (persona.setEdad(17) == false));
        
        // Caso 4: Edad mucho mayor a la mínima válida

        System.out.println("Prueba 4 (65): " + (persona.setEdad(65) == true));
        
        // Caso 5: Edad negativa

        System.out.println("Prueba 5 (-5): " + (persona.setEdad(-5) == false));
        
        // Caso 6: Edad cero
        
        System.out.println("Prueba 6 (0): " + (persona.setEdad(0) == false));
    }
}
