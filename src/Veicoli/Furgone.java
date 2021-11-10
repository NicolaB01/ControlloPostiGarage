package Veicoli;

public class Furgone extends VeicoliAMotore{
	private int capacit‡Carico;
	
	public Furgone(int annoImmatricolazione, String marca, String tipoAlimentazione, int cilindrata) {
		super(annoImmatricolazione, marca, tipoAlimentazione, cilindrata);
	}
	
	public String toString() {
		return "il furgone di: \nAnno di Immatricolazione: "+super.getAnnoImmatricolazione()+"\nMarca: "+super.getMarca()+"\nTipo di alimentazione: "+super.getTipoAlimentazione()+
				"\nCilindrata: "+super.getCilindrata()+" cc"+ "\nCapacit‡ del furgone: "+this.capacit‡Carico+" kg\n";
	}
	
	public int getCapacit‡Carico() {
		return capacit‡Carico;
	}

	public void setCapacit‡Carico(int capacit‡Carico) {
		this.capacit‡Carico = capacit‡Carico;
	}

}
