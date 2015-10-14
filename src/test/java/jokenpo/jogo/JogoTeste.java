package jokenpo.jogo;

import static org.junit.Assert.*;
import jokenpo.jogo.control.Jogo;
import jokenpo.jogo.model.Jogador;

import org.junit.Test;

public class JogoTeste {

	@Test
	public void jogadorUmVence(){
		Jogador jogadorUm = new Jogador(1, "Joao");
		Jogador jogadorDois= new Jogador(2, "Maria");
		assertEquals("1", Jogo.jogarJokenpo(jogadorUm, jogadorDois, 1, 3).toString());
	
	}
	
	@Test
	public void jogadorDoisVence(){
		Jogador jogadorUm = new Jogador(1, "Joao");
		Jogador jogadorDois= new Jogador(2, "Maria");
		assertEquals("2", Jogo.jogarJokenpo(jogadorUm, jogadorDois, 1, 2).toString());
	
	}
	
	@Test
	public void empateJogadores(){
		Jogador jogadorUm = new Jogador(1, "Joao");
		Jogador jogadorDois= new Jogador(2, "Maria");
		assertEquals("0", Jogo.jogarJokenpo(jogadorUm, jogadorDois, 1, 1).toString());
	
	}
}
