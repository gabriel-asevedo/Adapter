package entities;

import service.PinoRedondo;

public class AdaptadorPinoQuadrado implements PinoRedondo {
    private PinoQuadrado pinoQuadrado;

    public AdaptadorPinoQuadrado(){
    }

    public AdaptadorPinoQuadrado(PinoQuadrado pinoQuadrado) {
        this.pinoQuadrado = pinoQuadrado;
    }

    @Override
    public double getRaio() {
        return (pinoQuadrado.getLargura() * Math.sqrt(2)) / 2;
    }
}
