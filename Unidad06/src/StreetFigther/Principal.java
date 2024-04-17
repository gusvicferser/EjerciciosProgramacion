package StreetFigther;

public class Principal {

	public static void main(String[] args) {
		
		//Creamos los dos luchadores:
		Luchador l1 = new Luchador("Ryu");
		Luchador l2 = new Luchador("Ken");
		Luchador ganador;
		
		//Generamos los dos escenarios:
		Escenario escenario1 = new Escenario();
		Escenario escenarioFinal = new Escenario("Bison Mansion");
		
		//Se celebra el combate llamando a la función de pelea desde el escenario:
		ganador = escenario1.pelea(escenario1, l1, l2);
		
		//El ganador va contra Mr.Bison:
		escenarioFinal.pelea(escenarioFinal, ganador, Luchador.mrBison());
}
}


