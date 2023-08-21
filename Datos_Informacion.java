public class Datos_Informacion {

    public static void main(String[] args) {
        // Datos - Entrada
        int[] datos = {5, 8, 12, 3, 10};

        String[] estudiantes = {"Estudiante A", "Estudiante B", "Estudiante C", "Estudiante D", "Estudiante E"};
        
        // Procesamiento
        System.out.println("Datos (números):");
        for (int dato : datos) {
            System.out.print(dato + " ");
        }
        System.out.println("\n");

        // Informacion - Salida
        System.out.println("Información (calificaciones de estudiantes):");
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println(estudiantes[i] + ": " + datos[i] + " puntos");
        }
    }
}
