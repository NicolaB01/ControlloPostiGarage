package Veicoli;

public class MainVeicoliTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Furgone f = new Furgone(2010, "Renault", "Benzina", 3000);
		VeicoliAMotore v = new VeicoliAMotore(2010, "Renault", "Benzina", 3000);
		((Automobile) v).setNumeroPorte(5);
		//v.setNumeroPorte(5);
		//System.out.println(v1);
		f.setCapacit‡Carico(1000);
		System.out.println(v);
	}

}
