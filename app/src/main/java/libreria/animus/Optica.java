package libreria.animus;

public class Optica extends Negocio {
  
  private int numeroAutorefractometros;
  
  public int getNumeroAutorefractometros() {
    return numeroAutorefractometros;
  }
  
  public void setNumeroAutorefractometros(int numeroAutorefractometros) {
    this.numeroAutorefractometros = numeroAutorefractometros;
  }

  public Optica(String nombre, String nif, int numeroAutorefractometros) {
    super(nombre, nif);
    this.numeroAutorefractometros = numeroAutorefractometros;
  }

  @Override
  public String toString() {
    return "Soy la �ptica con nombre " + getNombre() + " y NIF " + getNif();
  }
  
}
