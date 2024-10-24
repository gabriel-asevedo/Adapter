package entities;

import service.PinoRedondo;

public class BuracoRedondo {
    private double raio;

    public BuracoRedondo(){
    }

    public BuracoRedondo(double raio) {
        this.raio = raio;
    }

    public boolean encaixa(PinoRedondo pino) {
        return this.raio >= pino.getRaio();
    }
}
