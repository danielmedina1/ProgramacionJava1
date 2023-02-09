package VideoClub;

public class Alquiler {
	private int Tiempo;
	private DVD DVD;
	
	public int getTiempo() {
		return Tiempo;
	}
	public void setTiempo(int tiempo) {
		Tiempo = tiempo;
	}
	public DVD getDVD() {
		return DVD;
	}
	public void setDVD(DVD dVD) {
		DVD = dVD;
	}
	
	public Alquiler(int tiempo, DVD dVD) {
		Tiempo = tiempo;
		DVD = dVD;
	}
	public Alquiler() {
		Tiempo = 0;
		DVD = new DVD();
	}
}
