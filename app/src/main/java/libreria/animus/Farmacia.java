package libreria.animus;

public class Farmacia extends Negocio implements FarmaciaInterfaz {

	private int numeroPuntosSigre;
	
	@Override
	public int getNumeroPuntosSigre() {
		return numeroPuntosSigre;
	}
	
	@Override
	public void setNumeroPuntosSigre(int numeroPuntosSigre) {
		this.numeroPuntosSigre = numeroPuntosSigre;		
	}
	
	public Farmacia() {};

	public Farmacia(String nombre, String nif, int numeroPuntosSigre) {
		super(nombre, nif);
		this.numeroPuntosSigre = numeroPuntosSigre;
	}
	
	@Override
	public String toString() {
		return "Soy la farmacia con NIF " + getNif() + ", me llamo " + getNombre();
	}




}
