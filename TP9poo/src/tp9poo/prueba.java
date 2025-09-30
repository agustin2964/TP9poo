package tp9poo;

public class prueba {
	public static void main(String[] args) {
		// ... (código del ejercicio 1)
		
		System.out.println("\n--- Ejercicio Clase Genérica ---\n");
		// Creamos un par que asocia un String con un Integer
		Par<String, Integer> producto = new Par<>("Laptop Gamer", 101);
		System.out.println("Producto: " + producto);
		
		// Creamos un par que asocia un String con un Double
		Par<String, Double> estudiante = new Par<>("Ana Pérez", 9.5);
		System.out.println("Estudiante: " + estudiante);
		
		// Demostración de la SEGURIDAD DE TIPOS
		Integer idProducto = producto.getSegundo();
		System.out.println("ID recuperado (ya es Integer, no necesita cast): " + idProducto);
		}
}
