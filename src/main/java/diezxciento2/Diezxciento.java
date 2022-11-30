package diezxciento2;

public class Diezxciento {
	    
	    public int ahorro=0;
	    public int sueldo=0;

	    public Diezxciento() {
	        ahorro=20000000;
	        sueldo=700000;    
	    }

	    public Diezxciento(int ahorro, int sueldo) {
	        this.ahorro=ahorro;
	        this.sueldo=sueldo;    
	    }

	    public int diezxciento() {
	        double diezxciento = ahorro * 0.1;
	        System.out.println(diezxciento);
	        
	        // Si ahorro > 1.000.000 y ahorro < 10M, entonces retorna 1M
	        // Si ahorro > 50M, entonce retorna 5M
	        // Si ahorro < 1M, entonces devolver total
	        
	        if(ahorro > 50000000)
	        	return 5000000;
	        else if (ahorro<1000000)
	        	return ahorro;
	        else
	        	return (int) diezxciento;
	    }

	    public int impuesto() {

	        return 0;
	    }

	    public int saldoAhorro() {
	        double noventaxciento = ahorro * 0.9;
	        
	        return (int) noventaxciento;
	    }

}
