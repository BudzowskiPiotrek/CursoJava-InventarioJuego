package inventario.personaje;

public class Objeto {
	private String nombre;
	private String categoria;
	private float peso;
	private String descripcion;
	private int numeroObjetos;

	public Objeto(String nombre, String categoria, float peso, String descripcion) {
		this.nombre = nombre;
		setCategoria(categoria);
		this.peso = peso;
		this.descripcion = descripcion;
		numeroObjetos++;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {

		switch (categoria.toLowerCase()) {
		case "arma":
			this.categoria = "Arma";
			break;
		case "pocion":
			this.categoria = "Pocion";
			break;
		default:
			this.categoria = "Material";
			break;
		}

	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public boolean mostrarDetalles() {
		boolean exito = false;

		if (numeroObjetos > 0) {
			System.out.println("----Detalles Objeto----");
			System.out.println(" * Nombre: " + getNombre());
			System.out.println(" * Categoria: " + getCategoria());
			System.out.println(" * Peso: " + getPeso());
			System.out.println(" * Descripcion: " + getDescripcion());
			exito = true;
		}
		return exito;
	}

}
