package application;

import entities.AdaptadorPinoQuadrado;
import entities.BuracoRedondo;
import entities.PinoQuadrado;
import entities.PinoRedondoConcreto;

public class Program {

    public static void main(String[]args) {
        BuracoRedondo buraco = new BuracoRedondo(5);

        PinoRedondoConcreto pinoRedondo = new PinoRedondoConcreto(5);
        System.out.println("Pino redondo encaixa: " + buraco.encaixa(pinoRedondo));

        PinoQuadrado pinoQuadrado = new PinoQuadrado(5);

        AdaptadorPinoQuadrado adaptadorPinoQuadrado = new AdaptadorPinoQuadrado(pinoQuadrado);
        System.out.println("Pino quadrado adaptado encaixa: " + buraco.encaixa(adaptadorPinoQuadrado));

        PinoQuadrado pinoQuadradoGrande = new PinoQuadrado(10);
        AdaptadorPinoQuadrado adaptadorGrande = new AdaptadorPinoQuadrado(pinoQuadradoGrande);
        System.out.println("Pino quadrado grande adaptado encaixa: " + buraco.encaixa(adaptadorGrande));
    }
}