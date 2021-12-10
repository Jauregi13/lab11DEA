package grafoEzZuzenduakMatrizeak;

import java.util.List;


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

		GrafoEzZuzenduMatrizea grafoa = new GrafoEzZuzenduMatrizea();

		System.out.println("GRAFO EZ-ZUZENDUA, AUZOKIDETASUN-MATRIZEAREN BIDEZ");			
		grafoa.erantsiErpina(a);
		grafoa.erantsiErpina(b);
		grafoa.erantsiErpina(c);
		grafoa.erantsiErpina(d);
		grafoa.erantsiErpina(e);
		grafoa.erantsiErpina(f);
		grafoa.erantsiErpina(g);
		grafoa.erantsiErpina(f);		


		grafoa.erantsiArkua(d, a);
		grafoa.erantsiArkua(d, b);
		grafoa.erantsiArkua(b, a);
		grafoa.erantsiArkua(b, c);
		grafoa.erantsiArkua(b, f);
		grafoa.erantsiArkua(b, e);
		grafoa.erantsiArkua(a, c);
		grafoa.erantsiArkua(c, f);
		grafoa.erantsiArkua(e, g);
		grafoa.erantsiArkua(f, g);

		System.out.println(grafoa);

		System.out.println("\nGrafoaren erpin kopurua: " + grafoa.size());		

		
		System.out.println("\nERANTSI [D, F] ARKUA:");	
		grafoa.erantsiArkua(d, f);	
		System.out.println(grafoa);

				
		System.out.println("\nEZABATU <B> ERPINA:");	
		grafoa.ezabatuErpina(b);	
		System.out.println(grafoa);	
		
		System.out.println("\nEZABATU [D, F] ARKUA:");	
		grafoa.ezabatuArkua(d, f);;	
		System.out.println(grafoa);	
				
		// AUZOKIDEAK PROBA
		System.out.println("\nAUZOKIDEAK PROBA:");
		List<Erpina> erpinLista = grafoa.auzokideak(d);
		System.out.print("D erpinaren auzokideak: < ");
		for (Erpina u : erpinLista) {
			System.out.print(u.getEtiketa() + " ");
		}
		System.out.print(">\n");		
		erpinLista = grafoa.auzokideak(a);
		System.out.print("A erpinaren auzokideak: < ");
		for (Erpina u : erpinLista) {
			System.out.print(u.getEtiketa() + " ");
		}
		System.out.print(">\n");	
		erpinLista = grafoa.auzokideak(f);
		System.out.print("F erpinaren auzokideak: < ");
		for (Erpina u : erpinLista) {
			System.out.print(u.getEtiketa() + " ");
		}
		System.out.println(">");	

	}

}
