package grafoZuzenduListak;

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

		GrafoZuzenduLista grafoa = new GrafoZuzenduLista();

		System.out.println("GRAFO ZUZENDUA, AUZOKIDETASUN-LISTAREN BIDEZ");
		grafoa.erantsiErpina(a);
		grafoa.erantsiErpina(b);
		grafoa.erantsiErpina(c);
		grafoa.erantsiErpina(d);
		grafoa.erantsiErpina(e);
		grafoa.erantsiErpina(f);
		grafoa.erantsiErpina(g);


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
		
		System.out.println("\nKORRITU ZABALERAN, Dtik hasita:");
		System.out.print("<");
		grafoa.zabalerakoKorritzea(d);
		System.out.println(" >");
		
		System.out.println("\nKORRITU ZABALERAN, Btik hasita:");
		System.out.print("<");
		grafoa.zabalerakoKorritzea(b);
		System.out.println(" >");
		
		System.out.println("\nKORRITU SAKONERAN errekurtsiboa, Dtik hasita:");
		System.out.print("<");
		grafoa.sakonerakoKorritzeaErrek(d);
		System.out.println(" >");
		
		System.out.println("\nKORRITU SAKONERAN errekurtsiboa, Btik hasita:");
		System.out.print("<");
		grafoa.sakonerakoKorritzeaErrek(b);
		System.out.println(" >");

		System.out.println("\nERANTSI [G,C] ARKUA");
		grafoa.erantsiArkua(g, c);
		
		System.out.println("\nKORRITU ZABALERAN, Dtik hasita:");
		System.out.print("<");
		grafoa.zabalerakoKorritzea(d);
		System.out.println(" >");
		
		System.out.println("\nKORRITU SAKONERAN errekurtsiboa, Dtik hasita:");
		System.out.print("<");
		grafoa.sakonerakoKorritzeaErrek(d);
		System.out.println(" >");

		
	}
}
