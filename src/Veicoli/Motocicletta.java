package Veicoli;

public class Motocicletta extends VeicoliAMotore{
	private String tipologia;
	private int numTempiMotore;
	
	public Motocicletta(int annoImmatricolazione, String marca, String tipoAlimentazione, int cilindrata) {
		super(annoImmatricolazione, marca, tipoAlimentazione, cilindrata);
	}

	public String toString() {
		return "la motocicletta di: \nAnno di Immatricolazione: "+super.getAnnoImmatricolazione()+"\nMarca: "+super.getMarca()+"\nTipo di alimentazione: "+super.getTipoAlimentazione()+
				"\nCilindrata: "+super.getCilindrata()+" cc"+ "\nTipologia: "+this.tipologia + "\nNumero di tempi del motore: "+this.numTempiMotore+"\n";
	}
	
	public String getTipologia() {
		return tipologia;
	}

	public void setTipologia(String tipologia) {
		this.tipologia = tipologia;
	}

	public int getNumTempiMotore() {
		return numTempiMotore;
	}

	public void setNumTempiMotore(int numTempiMotore) {
		this.numTempiMotore = numTempiMotore;
	}
}
