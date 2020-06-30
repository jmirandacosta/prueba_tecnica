package com.springboot.prueba.utilidades;

public class Utilidad {

	public static int Cantidad() {
		int cant = (int) Math.floor(Math.random() * (10 - 1 + 1) + 1);
		return cant;
	}

}
