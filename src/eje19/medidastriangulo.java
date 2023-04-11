package eje19;

public class medidastriangulo {
    public static double perimetro(double lado){
        double perimetro = lado*3;
        return perimetro;
    }  
    public static double altura(double lado){
        double altura = Math.sqrt(lado*lado-lado/2*lado/2);
        return altura;
    }    
    public static double area(double lado){
        double area = lado*lado/2;
        return area;
    }        
}

