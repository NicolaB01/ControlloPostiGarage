package Garage;
import Veicoli.*;

public class MainGarageTest {

	public static void main(String[] args) {
	Garage g = new Garage();
	Automobile a = new Automobile(2010, "Renault", "Benzina", 3000);
	Automobile b = new Automobile(1900, "Seat", "Benzina", 3000);
	Motocicletta m = new Motocicletta(3000, "Seat", "Benzina", 3000);
	g.immettiNuovoVeicolo(a);
	g.immettiNuovoVeicolo(a);
	g.immettiNuovoVeicolo(b);
	g.immettiNuovoVeicolo(m);
	g.immettiNuovoVeicolo(a);
	g.immettiNuovoVeicolo(a);
	g.immettiNuovoVeicolo(b);
	g.immettiNuovoVeicolo(m);
	g.immettiNuovoVeicolo(a);
	g.immettiNuovoVeicolo(a);
	g.immettiNuovoVeicolo(b);
	g.immettiNuovoVeicolo(m);
	g.immettiNuovoVeicolo(a);
	g.immettiNuovoVeicolo(a);
	g.immettiNuovoVeicolo(b);
	g.immettiNuovoVeicolo(m);
	g.stampaSituazionePosti();
	g.estraiVeicolo(5);
	g.immettiNuovoVeicolo(m);
	g.stampaSituazionePosti();
	}

}
