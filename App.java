package inventario.personaje;

import java.util.Scanner;

public class App {

	public static Inventario inventario = new Inventario(new Objeto[100]);
	public static Scanner sn = new Scanner(System.in);
	public static Scanner st = new Scanner(System.in);

	public static void main(String[] args) {
		inventario.agregarObjeto(new Objeto("Katana", "Arma", 2, "bonita"));
		inventario.agregarObjeto(new Objeto("Katana", "Arma", 2, "bonita"));
		inventario.agregarObjeto(new Objeto("Katana larga", "Arma", 3, "preciosa"));
		inventario.agregarObjeto(new Objeto("Arco", "Arma", 1, "fea"));
		
		menu();

	}

	private static void menu() {
		int flag = 0;

		do {
			System.out.println("Pulsa 1 Agregar un objeto nuevo");
			System.out.println("Pulsa 2 Eliminar un objetopor su nombre");
			System.out.println("Pulsa 3 Listar todos los objetos");
			System.out.println("Pulsa 4 Consultar los objetos por categoría");
			System.out.println("Pulsa 5 Mostrar el peso total del inventario");
			System.out.println("Pulsa 6 Para Salir");
			flag = st.nextInt();
			menuOpciones(flag);

		} while (flag != 6);
	}

	private static void menuOpciones(int flag) {
		switch (flag) {
		case 1:
			System.out.println("Instruccion introduccion Arma\nNombre objeto (al terminar pulsar enter)\n"
					+ "Escribe tipo de arma (Arma/Pocion/Material) (al terminar pulsa enter)\n"
					+ "Escribe el peso con numero del objeto (al terminar pulsa enter)\n"
					+ "Escribele una descripcion (al terminar pulsa enter)\\n ");
			String nombre = st.next();
			String tipo = st.next();
			int peso = sn.nextInt();
			String descripcion = st.next();
			inventario.agregarObjeto(new Objeto(nombre, tipo, peso, descripcion));
			System.out.println(
					(inventario.agregarObjeto(new Objeto(nombre, tipo, peso, descripcion))) ? " Agregado con Exito\n"
							: "Fallo, no se agrego\n");
			break;
		case 2:
			System.out.println("Dime el nombre del objeto");
			nombre = st.next();
			inventario.eliminarObjeto(nombre);
			System.out.println(
					(inventario.eliminarObjeto(nombre)) ? "Eliminado con Exito\n" : "Fallo, no se ha eliminado\n");
			break;
		case 3:
			inventario.listarObjetos();
			System.out.println((inventario.listarObjetos()) ? "\n" : "El inventario esta vacio\n");
			break;
		case 4:
			System.out.println("Dime categoria que quieres buscar?");
			nombre = st.next();
			inventario.filtrarObjetos(nombre);
			System.out.println();
			break;
		case 5:
			System.out.println("El peso total del inventario es: " + inventario.calcularPeso());

			break;

		default:
			break;
		}

	}

}
