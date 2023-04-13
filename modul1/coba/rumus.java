package coba;

public class rumus {

    public int getResultAsInt(Segitiga segitga){
        return (int)(segitga.Alas.doubleValue()*segitga.Tinggi.doubleValue())/2;

    }
    public double getResultAsDouble(Segitiga segitga){
        return (segitga.Alas.doubleValue()*segitga.Tinggi.doubleValue())/2;
        
    }

    
}
