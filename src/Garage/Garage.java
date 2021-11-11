package Garage;
import Veicoli.*;

public class Garage {
	private int ind = 0;
	private static final int POSTI_TOTALI = 15;
	private static int postiOccupati = 0;
	private static int postiDisponibili = POSTI_TOTALI;
	private VeicoliAMotore[] veicolo = new VeicoliAMotore[POSTI_TOTALI];
	
	public void immettiNuovoVeicolo(VeicoliAMotore veicolo) {
		if (isPostoVuoto()) {
			ind = trovaIndice();
			this.veicolo[trovaIndice()] = veicolo;
			Garage.postiOccupati++;
			Garage.postiDisponibili = POSTI_TOTALI - Garage.postiOccupati;
		
			System.out.println("La vettura si trova nel parcheggio "+(ind+1));
			System.out.println("Rimangono "+Garage.postiDisponibili+" posti per il riempimento del garage\n");
		}else {
			System.out.println("Il parcheggio č pieno");
		}
	}
	public VeicoliAMotore estraiVeicolo(int numeroParcheggio) {
		VeicoliAMotore temp = this.veicolo[numeroParcheggio-1];
		this.veicolo[numeroParcheggio-1] = null;
		Garage.postiOccupati--;
		Garage.postiDisponibili++;
		
		return temp;
	}
	public void stampaSituazionePosti() {
		if (postiOccupati == 0) {
			System.out.println("La lista č vuota");
		}else {
			for(int i=0; i<POSTI_TOTALI; i++)
				if (veicolo[i] != null)
					System.out.println("Nel "+(i+1)+" posto si trova "+veicolo[i]);
		}
	}

	private boolean isPostoVuoto() {
		if (Garage.postiDisponibili > 0) {
			return true;
		}
		return false;
	}
	
	private int trovaIndice() {
		for (int i=0; i<POSTI_TOTALI; i++)
			if (this.veicolo[i] == null)
				return i;
		return 0;
	}
	
	public static int getPostiOccupati() {
		return postiOccupati;
	}
	public static void setPostiOccupati(int postiOccupati) {
		Garage.postiOccupati = postiOccupati;
	}
	public static int getPostiDisponibili() {
		return postiDisponibili;
	}
	public static void setPostiDisponibili(int postiDisponibili) {
		Garage.postiDisponibili = postiDisponibili;
	}
	
}
