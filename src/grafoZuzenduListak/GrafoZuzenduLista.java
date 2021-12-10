package grafoZuzenduListak;

import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class GrafoZuzenduLista {
	protected final int EDUKIERA = 10;
	protected int erpinKopurua; // grafoaren erpin kopurua
	protected LinkedList<Erpina>[] auzoLista; // auzokidetasun-lista
	protected Erpina[] erpinak; // erpinen arraya

	@SuppressWarnings("unchecked")
	public GrafoZuzenduLista() { // Eraikitzailea
		erpinKopurua = 0;
		this.auzoLista = new LinkedList[EDUKIERA];
		for (int i = 0; i < EDUKIERA; i++) {
			auzoLista[i] = new LinkedList<Erpina>(); // lista hutsa
		}
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
	public void erantsiErpina(Erpina a) {

		// HAU EGIN BEHAR DA
		
		
		
		
	}

	/**
	 * Erpina ezabatzen du grafotik. Erpin horrek zituen arkuak ere ezabatuta
	 * geratzen dira.
	 * Erpina grafoan ez badago, ez du ezer egiten.
	 */
	public void ezabatuErpina(Erpina u) {
		// aurkitu u erpinaren indizea
		int indizea = this.lortuIndizea(u);
		if (indizea != -1) {
			// ezabatu u erpina, eta u erpinetik ateratzen diren arkuak
			for (int i = indizea; i < erpinKopurua - 1; i++) {
				this.erpinak[i] = this.erpinak[i + 1];
				this.auzoLista[i] = this.auzoLista[i + 1];
			}
			this.auzoLista[erpinKopurua - 1] = new LinkedList<Erpina>();
			erpinKopurua--;
			// ezabatu u erpinean bukatzen diren arkuak
			for (int i = 0; i < erpinKopurua; i++) {
				for (int h = 0; h < this.auzoLista[i].size(); h++) {
					if (this.auzoLista[i].get(h).equals(u)) {
						this.auzoLista[i].remove(h);
					}
				}
			}
		}
	}

	/**
	 * Bi erpinen arteko arkua txertatzen du grafoan.
	 * 
	 * u edo v erpinak grafoan ez badaude, erantsi egiten ditu.
	 */
	public void erantsiArkua(Erpina u, Erpina v) {

		// HAU EGIN BEHAR DA
		
		
		
	
	}

	/**
	 * Bi erpinen arteko arkua ezabatzen du grafotik.
	 * 
	 * Arkua ez badago grafoan, ez du ezer egiten.
	 * 
	 */
	public void ezabatuArkua(Erpina u, Erpina v) {
		int indU = lortuIndizea(u);
		if (indU != -1) {
			for (int i = 0; i < this.auzoLista[indU].size(); i++) {
				if (this.auzoLista[indU].get(i).equals(v)) {
					this.auzoLista[indU].remove(i);
					break;
				}
			}
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
	 * 
	 */
	public List<Erpina> auzokideak(Erpina u) {
		int indizea = this.lortuIndizea(u);
		if (indizea != -1) {
			return this.auzoLista[indizea];
		} else {
			return new LinkedList<Erpina>();
		}
	}
	/**
	 * abiapuntua erpinetik hasita, zabalerako korritzearen bidez
	 * grafoko erpinak inprimatzen ditu
	 * @param abiapuntua
	 */
	public void zabalerakoKorritzea(Erpina abiapuntua) {

		// HAU EGIN BEHAR DA
		
		
		
	
	}

	/**
	 * abiapuntua erpinetik hasita, sakonerako korritze
	 * errekurtsiboaren bidez grafoko erpinak inprimatzen ditu
	 * @param abiapuntua
	 */
	public void sakonerakoKorritzeaErrek(Erpina u) {

		// HAU EGIN BEHAR DA
		
		
		
	
	}


	/**
	 * True itzultzen du grafoa hutsik badago; false, bestela.
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
			Iterator<Erpina> it = auzoLista[i].iterator();
			while (it.hasNext()) {
				output += "[ ";
				output += erpinak[i].getEtiketa() + ", ";
				output += it.next().getEtiketa();
				output += " ]";
			}
		}
		return output;
	}

}
