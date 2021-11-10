package Veicoli;

public class Automobile extends VeicoliAMotore{
	private int numeroPorte;
	
	public Automobile(int annoImmatricolazione, String marca, String tipoAlimentazione, int cilindrata) {
		super(annoImmatricolazione, marca, tipoAlimentazione, cilindrata);
	}

	public String toString() {
		return "l'automobile di: \nAnno di Immatricolazione: "+super.getAnnoImmatricolazione()+"\nMarca: "+super.getMarca()+"\nTipo di alimentazione: "+super.getTipoAlimentazione()+
				"\nCilindrata: "+super.getCilindrata()+" cc"+ "\nNumero porte: "+this.numeroPorte+"\n";
	}
	
	public int getNumeroPorte() {
		return numeroPorte;
	}

	public void setNumeroPorte(int numeroPorte) {
		this.numeroPorte = numeroPorte;
	}
}
