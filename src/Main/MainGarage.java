package Main;
import Veicoli.*;
import Garage.*;
import java.util.Scanner;

public class MainGarage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Garage garage = new Garage();
		byte scelta;

		do {
			do {
				System.out.println("1) per inserire un automobile");
				System.out.println("2) per inserire un furgone");
				System.out.println("3) per inserire una motocicletta");
				System.out.println("4) per liberare un posto");
				System.out.println("5) per stampare la situazione posti");
				System.out.println("0) per uscire");
				scelta = in.nextByte();
				in.nextLine();

			}while(scelta!=0 && scelta!=1 && scelta!=2 && scelta!=3 && scelta!=4 && scelta!=5);
			
			switch(scelta) {
			case 1:
				Automobile auto = (Automobile)inserisciVeicoloMenu(scelta);
				System.out.println("Inserisci il numero di porte");
				int numPorte = in.nextInt();
				in.nextLine();
				auto.setNumeroPorte(numPorte);
				garage.immettiNuovoVeicolo(auto);
				break;
			case 2:
				Furgone furgone = (Furgone)inserisciVeicoloMenu(scelta);
				System.out.println("Inserisci la capacità del furgone");
				int capacità = in.nextInt();
				in.nextLine();
				furgone.setCapacitàCarico(capacità);
				garage.immettiNuovoVeicolo(furgone);
				break;
			case 3:
				Motocicletta moto = (Motocicletta)inserisciVeicoloMenu(scelta);
				System.out.println("Inserisci la tipologia della moto (enduro/naked)");
				String tipologia = in.nextLine();
				moto.setTipologia(tipologia);
				System.out.println("Inserisci il numero di tempi della moto (2/4)");
				int numTempi = in.nextInt();
				in.nextLine();
				moto.setNumTempiMotore(numTempi);
				garage.immettiNuovoVeicolo(moto);
				break;
			case 4:
				System.out.println("Di quale parcheggio si vuole rimuovere il veicolo?");
				int numeroParcheggio = in.nextInt();
				in.nextLine();
				System.out.println(garage.estraiVeicolo(numeroParcheggio));
				break;
			case 5:
				garage.stampaSituazionePosti();
				break;
			case 0:
				break;
				}
		}while(scelta!=0);
		System.out.println("Arrivederci");
		System.exit(0);
	}
	
	public static VeicoliAMotore inserisciVeicoloMenu(int scelta) {
		Scanner in = new Scanner(System.in);
		VeicoliAMotore veicolo = null;
		int annoImmatricolazione;
		String marca;
		String tipoAlimentazione;
		int cilindrata;
		
		System.out.println("Inserisci l'anno di immatricolazione");
		annoImmatricolazione = in.nextInt();
		in.nextLine();
		System.out.println("Inserire la marca del mezzo");
		marca = in.nextLine();
		System.out.println("Inserire il tipo di alimentazione");
		tipoAlimentazione = in.nextLine();
		System.out.println("Inserisci la cilindrata");
		cilindrata = in.nextInt();
		in.nextLine();
		switch (scelta) {
		case 1:
			veicolo = new Automobile(annoImmatricolazione, marca, tipoAlimentazione, cilindrata);
			break;
		case 2:
			veicolo = new Furgone(annoImmatricolazione, marca, tipoAlimentazione, cilindrata);;
			break;
		case 3:
			veicolo = new Motocicletta(annoImmatricolazione, marca, tipoAlimentazione, cilindrata);
			break;
		}
		return veicolo;
	}
}
