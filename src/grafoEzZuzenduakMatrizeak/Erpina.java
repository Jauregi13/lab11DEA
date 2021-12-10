package grafoEzZuzenduakMatrizeak;

public class Erpina {
    String etiketa;

    public Erpina(String etiketa) {
        this.etiketa = etiketa;
    }
 
    public boolean equals(Erpina arg0) {
    	return this.etiketa.equals(arg0.etiketa);
    }
    
    public int hashCode() {
    	return this.etiketa.hashCode();
    }
    
    public String getEtiketa() {
    	return this.etiketa;
    }
    
    public void setEtiketa(String etiketa) {
        this.etiketa = etiketa;
    }
}
