package grafoEzZuzenduakMatrizeak;

import java.util.List;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;

public class GrafoEzZuzenduMatrizea {
	protected final int EDUKIERA = 10;
	protected int erpinKopurua; // grafoaren erpin kopurua
	protected boolean[][] auzoMatrizea; // auzokidetasun matrizea
	protected Erpina[] erpinak; // erpinen etiketak

	public GrafoEzZuzenduMatrizea() { // Eraikitzailea
		this.erpinKopurua = 0;
		this.auzoMatrizea = new boolean[EDUKIERA][EDUKIERA];
		this.erpinak = new Erpina[EDUKIERA];
	}

	public boolean erpinaBadago(Erpina u) {
		for (int i = 0; i < erpinKopurua; i++) {
			if (erpinak[i].equals(u))
				return true;
		}
		return false;
	}

	/**
	 * Erpin bat gehitzen du grafoan. Erpina lehendik bazegoen, ez du ezer egiten.
	 */
	public void erantsiErpina(Erpina u) {

		if (!erpinaBadago(u)) {
			this.erpinak[erpinKopurua] = u;
			this.erpinKopurua++;
			
		}		
	}

	/**
	 * Erpina ezabatzen du grafotik. Erpin horrek zituen arkuak ere ezabatuta
	 * geratzen dira.
	 * Erpina grafoan ez badago, ez du ezer egiten.
	 */
	public void ezabatuErpina(Erpina u) {

		// HAU EGIN BEHAR DA
		if (erpinaBadago(u)) {
			int pos = lortuIndizea(u);
			if(pos != this.erpinKopurua-1) {
				for (int i = pos; i < this.erpinKopurua; i++) {
					this.erpinak[i] = this.erpinak[i+1];
				}
			}
			this.erpinKopurua--;
		}
		
		
		
		
		
	}

	/**
	 * Bi erpinen arteko arkua txertatzen du grafoan.
	 * 
	 * u edo v erpinak grafoan ez badaude, erantsi egiten ditu.
	 */
	public void erantsiArkua(Erpina u, Erpina v) {

		erantsiErpina(u);
		erantsiErpina(v);
				
		auzoMatrizea[lortuIndizea(u)][lortuIndizea(v)] = true;
		auzoMatrizea[lortuIndizea(v)][lortuIndizea(u)] = true;
		
	}

	/**
	 * Bi erpinen arteko arkua ezabatzen du grafotik.
	 * 
	 * u eta v-ren arteko arkua ez badago, ez du ezer egiten.
	 * 
	 */
	public void ezabatuArkua(Erpina u, Erpina v) {
		int indU = lortuIndizea(u);
		int indV = lortuIndizea(v);
		if (indU != -1 && indV != -1) {
			this.auzoMatrizea[indU][indV] = false;
			this.auzoMatrizea[indV][indU] = false;
		}
	}

	/**
	 * u Erpinaren indizea itzultzen du.
	 * 
	 * u ez badago, -1 itzultzen du.
	 * 
	 */
	public int lortuIndizea(Erpina u) {
		// aurkitu u erpinaren indizea
		int indizea = 0;
		boolean aurkitua = false;
		while (indizea < erpinKopurua && !aurkitua) {
			if (this.erpinak[indizea].getEtiketa().equals(u.getEtiketa())) {
				aurkitua = true;
			} else {
				indizea++;
			}
		}
		return (aurkitua) ? indizea : -1;
	}

	/**
	 * u Erpinaren auzkokideak itzultzen ditu lista batean.
	 * Erpina ez badago, lista hutsa itzultzen du.
	 */
	public List<Erpina> auzokideak(Erpina u) {

		// HAU EGIN BEHAR DA
		
		
		
		
	}


	/**
	 * True itzultzen du grafoa hutsik badago; false, bestela.
	 * 
	 */
	public boolean isEmpty() {
		return (erpinKopurua == 0);
	}


	/**
	 * Grafoaren erpin-kopurua itzultzen du.
	 * 
	 */
	public int size() {
		return erpinKopurua;
	}

	/**
	 * Grafoaren String errepresentazioa itzultzen du.
	 * 
	 * @return String
	 */
	public String toString() {
		String output = "Erpinak:\n";
		output += "{ ";
		for (int i = 0; i < erpinKopurua - 1; i++) {
			output += erpinak[i].getEtiketa() + ", ";
		}
		if (erpinKopurua > 0)
			output += erpinak[erpinKopurua - 1].getEtiketa() + " }";
		output += "\nArkuak:\n";

		for (int i = 0; i < erpinKopurua; i++) {
			for (int z = 0; z < erpinKopurua; z++) {
				if (auzoMatrizea[i][z]) {
					output += "[ " + erpinak[i].getEtiketa() + ", " + erpinak[z].getEtiketa() + " ]";
				}
			}
		}
		return output;
	}

}
