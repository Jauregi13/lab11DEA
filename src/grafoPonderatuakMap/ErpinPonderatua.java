package grafoPonderatuakMap;

public class ErpinPonderatua {
	Erpina erpina;
	int pisua;

    public ErpinPonderatua(Erpina erpina, int pisua) {
        this.erpina = erpina;
        this.pisua = pisua;
    }    
 
    public Erpina getErpina() {
    	return this.erpina;
    }
    
    public void setErpina(Erpina erpina) {
    	this.erpina = erpina;
    }
    
    public int getPisua() {
    	return this.pisua;
    }
    
    public void setPisua(int pisua) {
        this.pisua = pisua;
    }

}
