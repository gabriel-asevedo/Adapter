package entities;

import service.PinoRedondo;

public class PinoRedondoConcreto implements PinoRedondo {

    private Double raio;

    public PinoRedondoConcreto() {
    }

    public PinoRedondoConcreto(double raio) {
        this.raio = raio;
    }

    @Override
    public double getRaio() {
        return this.raio;
    }

}
