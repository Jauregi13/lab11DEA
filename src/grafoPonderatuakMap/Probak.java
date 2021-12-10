package grafoPonderatuakMap;

import java.util.LinkedList;


import java.util.Iterator;

public class Probak {

	public static void main(String[] args) {
		Erpina a, b, c, d, e, f, g;
		a = new Erpina("A");
		b = new Erpina("B");
		c = new Erpina("C");
		d = new Erpina("D");
		e = new Erpina("E");
		f = new Erpina("F");
		g = new Erpina("G");

		GrafoPonderatuMap grafoa = new GrafoPonderatuMap();

		System.out.println("GRAFO PONDERATUA, HASHMAP BATEN BIDEZ");
		grafoa.erantsiErpina(a);
		grafoa.erantsiErpina(b);
		grafoa.erantsiErpina(c);
		grafoa.erantsiErpina(d);
		grafoa.erantsiErpina(e);
		grafoa.erantsiErpina(f);
		grafoa.erantsiErpina(g);
		
		grafoa.erantsiArkua(d, a, 6);
		grafoa.erantsiArkua(d, b, 3);
		grafoa.erantsiArkua(b, a, 7);
		grafoa.erantsiArkua(b, c, 1);
		grafoa.erantsiArkua(b, f, 4);
		grafoa.erantsiArkua(b, e, 5);
		grafoa.erantsiArkua(a, c, 8);
		grafoa.erantsiArkua(c, f, 9);
		grafoa.erantsiArkua(e, g, 2);
		grafoa.erantsiArkua(f, g, 6);

		System.out.println(grafoa);

		// IRTEERAKO PISUAREN PROBA
		System.out.println("\nIRTEERAKO PISUAREN PROBA:");		
		System.out.println("A erpinaren irteerako pisua: " + grafoa.lortuIrteerakoPisua(a));
		System.out.println("D erpinaren irteerako pisua: " + grafoa.lortuIrteerakoPisua(d));
		System.out.println("B erpinaren irteerako pisua: " + grafoa.lortuIrteerakoPisua(b));
		
		// SARRERAKO PISUAREN PROBA
		System.out.println("\nSARRERAKO PISUAREN PROBA:");		
		System.out.println("A erpinaren sarrerako pisua: " + grafoa.lortuSarrerakoPisua(a));
		System.out.println("D erpinaren sarrerako pisua: " + grafoa.lortuSarrerakoPisua(d));
		System.out.println("E erpinaren sarrerako pisua: " + grafoa.lortuSarrerakoPisua(e));	
		System.out.println("C erpinaren sarrerako pisua: " + grafoa.lortuSarrerakoPisua(c));		
		
		// IRTEERAKO PISU MAXIMOAREN PROBA
		System.out.println("\nIRTEERAKO PISU MAXIMOAREN PROBA:");		
		System.out.println("Irteerako pisu handieneko erpina: " + grafoa.lortuIrtPisuMaxErpina().getEtiketa());
		
		
		// SARRERAKO PISU MAXIMOAREN PROBA
		System.out.println("\nSARRERAKO PISU MAXIMOAREN PROBA:");		
		System.out.println("Sarrerako pisu handieneko erpina: " + grafoa.lortuSarrPisuMaxErpina().getEtiketa());
		
		//EZABATU ERPINAREN PROBA		
		System.out.println("\nEZABATU <B> ERPINA:");	
		grafoa.ezabatuErpina(b);	
		System.out.println(grafoa);	
		
	}

}
