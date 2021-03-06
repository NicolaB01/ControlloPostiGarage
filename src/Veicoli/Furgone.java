package Veicoli;

public class Furgone extends VeicoliAMotore{
	private int capacitąCarico;
	
	public Furgone(int annoImmatricolazione, String marca, String tipoAlimentazione, int cilindrata) {
		super(annoImmatricolazione, marca, tipoAlimentazione, cilindrata);
	}
	
	public String toString() {
		return "il furgone di: \nAnno di Immatricolazione: "+super.getAnnoImmatricolazione()+"\nMarca: "+super.getMarca()+"\nTipo di alimentazione: "+super.getTipoAlimentazione()+
				"\nCilindrata: "+super.getCilindrata()+" cc"+ "\nCapacitą del furgone: "+this.capacitąCarico+" kg\n";
	}
	
	public int getCapacitąCarico() {
		return capacitąCarico;
	}

	public void setCapacitąCarico(int capacitąCarico) {
		this.capacitąCarico = capacitąCarico;
	}

}
