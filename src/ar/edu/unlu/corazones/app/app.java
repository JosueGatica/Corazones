package ar.edu.unlu.corazones.app;

import ar.edu.unlu.corazones.controlador.Controlador;
import ar.edu.unlu.corazones.modelo.Corazones;
import ar.edu.unlu.corazones.vista.IVista;
import ar.edu.unlu.corazones.vista.VistaConsola;

public class app {

	public static void main(String[] args) {
		Corazones modelo = new Corazones();
		IVista vista = new VistaConsola();
		Controlador controlador = new Controlador(modelo, vista);
		vista.iniciar();
	}

}
