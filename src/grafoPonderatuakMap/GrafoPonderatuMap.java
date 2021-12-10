package grafoPonderatuakMap;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.Set;
import java.util.Map.Entry;


public class GrafoPonderatuMap {
	protected HashMap<Erpina, LinkedList<ErpinPonderatua>> auzoLista;

	public GrafoPonderatuMap() { // Eraikitzailea
		this.auzoLista = new HashMap<Erpina, LinkedList<ErpinPonderatua>>();
	}

	public boolean erpinaBadago(Erpina u) {
		return this.auzoLista.containsKey(u);
	}

	/**
	 * Erpin bat gehitzen du grafoan. Erpina lehendik bazegoen, ez du ezer egiten.
	 */
	public void erantsiErpina(Erpina u) {
		if (!erpinaBadago(u))
			this.auzoLista.put(u, new LinkedList<ErpinPonderatua>());
	}

	/**
	 * Erpina ezabatzen du grafotik. Erpin horrek zituen arkuak ere ezabatuta
	 * geratzen dira.
	 * Erpina grafoan ez badago, ez du ezer egiten.
	 */
	public void ezabatuErpina(Erpina u) {

		// HAU EGIN BEHAR DA
		
		
		
		
	}

	/**
	 * Bi erpinen arteko arkua txertatzen du grafoan.
	 * u edo v erpinak grafoan ez badaude, erantsi egiten ditu.
	 * Lehendik arkua bazegoen, eguneratu egiten du.
	 */
	public void erantsiArkua(Erpina u, Erpina v, int pisua) {
		if (!this.auzoLista.containsKey(u)) {
			this.erantsiErpina(u);
		}
		if (!this.auzoLista.containsKey(v)) {
			this.erantsiErpina(v);
		}
		LinkedList<ErpinPonderatua> auzokoak = this.auzoLista.get(u);
		ErpinPonderatua berria = new ErpinPonderatua(v, pisua);
		int i = 0;
		boolean aurkitua = false;
		while (i < auzokoak.size() && !aurkitua) {
			if (auzokoak.get(i).getErpina().equals(v)) {
				aurkitua = true;
			}
			i++;
		}
		if (aurkitua) {
			auzokoak.remove(i);
		}
		auzokoak.add(berria);
	}

	/**
	 * Bi erpinen arteko arkua ezabatzen du grafotik.
	 * u eta v-ren arteko arkua ez badago, ez du ezer egiten.
	 */
	public void ezabatuArkua(Erpina u, Erpina v) {
		if (this.auzoLista.containsKey(u)) {
			LinkedList<ErpinPonderatua> auzokoak = this.auzoLista.get(u);
			int i = 0;
			boolean aurkitua = false;
			while (i < auzokoak.size() && !aurkitua) {
				if (auzokoak.get(i).getErpina().equals(v)) {
					aurkitua = true;
				} else {
					i++;
				}
			}
			if (aurkitua) {
				auzokoak.remove(i);
			}
		}
	}
	

	/**
	 * u erpinaren irteerako arku guztien pisuen batura itzultzen du.
	 * aurrebaldintza: pisuak zenbaki arruntak dira.
	 * 
	 * @param u, irteerako pisua kalkulatuko den erpina
	 * @return u erpinaren irteerako arku guztien pisuen batura u erpina grafoan ez
	 *         badago, 0 itzultzen du
	 */
	public int lortuIrteerakoPisua(Erpina u) {

		// HAU EGIN BEHAR DA
		
		
		
		
	}

	/**
	 * Grafoko erpin guztien artean, irteerako pisu handieneko erpina itzultzen du.
	 * aurrebaldintza: pisuak zenbaki arruntak dira.
	 * 
	 * @return erpina, grafoko irteerako pisu handiena duena
	 */
	public Erpina lortuIrtPisuMaxErpina() {

		// HAU EGIN BEHAR DA
		
		
		
		
	}

	/**
	 * u erpinaren sarrerako arku guztien pisuen batura itzultzen du.
	 * aurrebaldintza: pisuak zenbaki arruntak dira.
	 * 
	 * @param u, sarrerako pisua kalkulatuko den erpina
	 * @return u erpinaren sarrerako arku guztien pisuen batura u erpina grafoan ez
	 *         badago, 0 itzultzen du
	 */
	public int lortuSarrerakoPisua(Erpina u) {

		// HAU EGIN BEHAR DA
		
		
		
		
	}

	/**
	 * Grafoko erpin guztien artean, sarrerako pisu handieneko erpina itzultzen du.
	 * aurrebaldintza: pisuak zenbaki arruntak dira.
	 * 
	 * @return erpina, grafoko sarrerako pisu handiena duena
	 */
	public Erpina lortuSarrPisuMaxErpina() {

		// HAU EGIN BEHAR DA
		
		
		
		
	}


	/**
	 * u Erpinaren auzkokide ponderatuak itzultzen ditu lista batean.
	 * 
	 * Erpina ez badago, lista hutsa itzultzen du.
	 * 
	 */
	public LinkedList<ErpinPonderatua> auzokideak(Erpina u) {
		LinkedList<ErpinPonderatua> lista;
		if (!this.auzoLista.containsKey(u)) {
			lista = new LinkedList<ErpinPonderatua>();
		} else {
			lista = this.auzoLista.get(u);
		}
		return lista;
	}

	/**
	 * True itzultzen du grafoa hutsik badago; false, bestela.
	 * 
	 */
	public boolean isEmpty() {
		return (this.auzoLista.size() == 0);
	}

	/**
	 * Grafoaren erpin-kopurua itzultzen du.
	 * 
	 */
	public int size() {
		return this.auzoLista.size();
	}

	/**
	 * Grafoaren String errepresentazioa itzultzen du.
	 * 
	 * @return String
	 */
	public String toString() {
		String output = "Erpinak:\n";
		output += "{ ";

		for (Erpina u : this.auzoLista.keySet()) {
			output += u.getEtiketa() + " ";
		}
		output += " }";

		output += "\nArkuak:\n";
		for (Entry<Erpina, LinkedList<ErpinPonderatua>> itema : this.auzoLista.entrySet()) {
			String etiketa1 = itema.getKey().getEtiketa();
			for (int i = 0; i < itema.getValue().size(); i++) {
				String etiketa2 = itema.getValue().get(i).getErpina().getEtiketa();
				int pisua = itema.getValue().get(i).getPisua();
				output += "< " + etiketa1 + ", " + etiketa2 + ", " + pisua + " >";
			}
		}
		return output;
	}

}
