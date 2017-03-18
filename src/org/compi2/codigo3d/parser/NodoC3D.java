package org.compi2.codigo3d.parser;

/**
 * Clase sencilla para sintetizar información entre producciones.
 * Cuenta con un único atributo de tipo String, pero pueden agregársele
 * los atributos que se consideren necesarios.
 * @author esvux
 */
public class NodoC3D {
    private String cad;
    private String Verdadero;
    private String Falso;

    public NodoC3D(String cad) {
        this.cad = cad;
    }

    public String getVerdadero() {
        return Verdadero;
    }

    public void setVerdadero(String Verdadero) {
        this.Verdadero = Verdadero;
    }

    public String getFalso() {
        return Falso;
    }

    public void setFalso(String Falso) {
        this.Falso = Falso;
    }
    
    public NodoC3D(String cad, String verdadero, String falso) {
        this.cad = cad;
        this.Verdadero=verdadero;
        this.Falso=falso;
    }
    
    public String getCad(){
        return cad;
    }
        
}
