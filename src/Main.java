import com.ipartek.formacion.Person;
import com.ipartek.formacion.calculadora.Calculadora;
//Nuevo proyecto para importar librerias de otros proyectos.
/**
 * Al importar las librerias no nos va a dejar trabajar bien de primeras.
 * Asi que tenemos que añadir el .jar al nuevo proyecto
 *
 */
public class Main {

	public static void main(String[] args) {

		System.out.println("Running other project...");
		Person pe = new Person();
		Casa casa = new Casa();
		Calculadora calc = new Calculadora();
		
		System.out.println("Usamos la libreria " + pe);
		
	}

}
