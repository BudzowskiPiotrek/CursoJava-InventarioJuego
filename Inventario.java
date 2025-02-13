package inventario.personaje;

public class Inventario {
	private Objeto[] objeto;
	private int cantidadObjetos = 0;

	public Inventario(Objeto[] objetos) {
		this.objeto = objetos;
	}

	public Objeto[] getObjetos() {
		return objeto;
	}

	public void setObjetos(Objeto[] objetos) {
		this.objeto = objetos;
	}

	public boolean agregarObjeto(Objeto objetoNuevo) {
		boolean exito = false;

		if (cantidadObjetos++ < objeto.length) {
			objeto[cantidadObjetos] = objetoNuevo;
			cantidadObjetos++;
			exito = true;
		}
		return exito;
	}

	public boolean eliminarObjeto(String nombre) {
		boolean exito = false, seguro = false;

		for (int i = 0; i < cantidadObjetos && !seguro; i++) {
			if (objeto[i] != null && objeto[i].getNombre().equalsIgnoreCase(nombre)) {
				for (int j = i; j < cantidadObjetos - 1; j++) {
					objeto[j] = objeto[j + 1];
				}
				objeto[cantidadObjetos - 1] = null;
				cantidadObjetos--;
				exito = true;
				seguro = true;
			}
		}
		return exito;

	}

	public boolean listarObjetos() {
		boolean exito = false;

		if (cantidadObjetos == 0) {
			exito = false;
		} else {
			System.out.println("----Lista de Objetos----");
			for (int i = 0; i < cantidadObjetos; i++) {
				if (objeto[i] != null) {
					System.out.println();
					objeto[i].mostrarDetalles();
				}
			}
		}
		return exito;
	}

	public boolean filtrarObjetos(String nombre) {
		boolean exito = false;

		for (int i = 0; i < cantidadObjetos; i++) {
			if (objeto[i] != null && objeto[i].getCategoria().equalsIgnoreCase(nombre)) {
				objeto[i].mostrarDetalles();
				exito = true;
			}
		}
		return exito;
	}

	public int calcularPeso() {
		int totalPeso = 0;

		for (int i = 0; i < cantidadObjetos; i++) {
			if (objeto[i] == null) {
				continue;
			}
			totalPeso += objeto[i].getPeso();
		}
		return totalPeso;
	}
}
