package br.edu.ifsp.spo.lp1a3.projeto.war.classes;

public class Tabuleiro {
//Grafo dos territ�rios
//Array List de continentes e um continente Array List de pa�ses e um pa�s um Array List de conex�es
//String l = "Brasil; Argentina; Venezuela; Arg�lia";
//String paises = l.split(';');
//Como guardar a informa��o de onde est�o? Par Ordenado - Trio (tem ou n�o, qual player, qtos exercitos ele tem)
	
//M�todo
	//An�lise da rolagem
	//"Matar" o ex�rcito - Retorna pe�as do player, perdidas ou ganhas
	
	int diceSet; //Dice game set
	
//	public Tabuleiro() {
//		
//	}
	
	public Tabuleiro(Partida partida){
        this.diceSet = partida.getDiceset();
    }

    public String compararRolagem(){
        Dado dice = new Dado(6);
        int resultP1 = dice.rolarDado();
        int resultP2 = dice.rolarDado();
        System.out.println("Dado 1: " + resultP1 + " Dado 2: " + resultP2);
        if(resultP1 > resultP2){
            return "Venceu";
        }   else if(resultP1 == resultP2){
            return "Empatou";
        }   else{
            return "Perdeu";
        }
    }
    
    public static int compareRolagemDados(int ladosDado) {
    	Dado dado = new Dado(ladosDado);
    	int result1 = dado.rolarDado();
    	int result2 = dado.rolarDado();
    	if(result1 > result2) {
    		return 1;
    	} else if(result1 == result2) {
    		return 0;
    	}
    	return -1;
    }
}
