package br.edu.ifsp.spo.lp1a3.projeto.war;

import br.edu.ifsp.spo.lp1a3.projeto.war.classes.*;

@SuppressWarnings("unused")
public class App {
	public static void main(String[] args) {
		GameConf.loadMapConf();
		Partida p;
		p = Tabuleiro.iniciarPartida();
		System.out.println(p.getPlayers());
	}
}
