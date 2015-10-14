package jokenpo.jogo.main;

import javax.swing.JOptionPane;

import jokenpo.jogo.control.Jogo;
import jokenpo.jogo.model.Jogador;

public class Main {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "BEM VINDO!!");
		boolean lacoInfinito = true;
		Jogador jogadorUm = new Jogador();
		Jogador jogadorDois = new Jogador();
		criaJogadores(jogadorUm, jogadorDois);
		while(lacoInfinito){
			Long opcao = Long.parseLong(JOptionPane.showInputDialog("Digite:  \n1 - Jogar \n2 - Pontuação \n3 - Sair"));
			if(opcao == null){
				JOptionPane.showMessageDialog(null, "Opção inválida!!");
			}else{
				switch (opcao.intValue()) {
				case 1:
					jogarJokenpo(jogadorUm, jogadorDois);
					break;
				case 2:
					JOptionPane.showMessageDialog(null, jogadorUm.getNome() + ": "+ jogadorUm.getPontuacao() + "\n" + jogadorDois.getNome() + ": "+ jogadorDois.getPontuacao() );
					break;
				case 3:
					JOptionPane.showMessageDialog(null, "Game Over");
					System.exit(0);
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opção inválida!!");
					break;
				}
			}
		}
	}

	private static void criaJogadores(Jogador jogadorUm, Jogador jogadorDois) {
		jogadorUm.setNome(JOptionPane.showInputDialog("Entre com o nome do jogador 1"));
		jogadorDois.setNome(JOptionPane.showInputDialog("Entre com o nome do jogador 2"));
		jogadorUm.setPontuacao(0);
		jogadorDois.setPontuacao(0);
		jogadorUm.setId(1);
		jogadorDois.setId(2);
	}

	private static void jogarJokenpo(Jogador jogadorUm, Jogador jogadorDois) {
		Integer idVencedor = Jogo.jogarJokenpo(jogadorUm, jogadorDois, null, null);
		if(idVencedor == jogadorUm.getId()){
			jogadorUm.setPontuacao(jogadorUm.getPontuacao()+1);
		}else if(idVencedor == 0){
			JOptionPane.showMessageDialog(null, "Empate, joguem outra vez");
		}else{
			jogadorDois.setPontuacao(jogadorDois.getPontuacao()+1);
		}
		
		if(jogadorUm.getPontuacao() >= 2 || jogadorDois.getPontuacao() >=2){
			JOptionPane.showMessageDialog(null, "FIM DE JOGO! \n" + jogadorUm.getNome() + ": "+ jogadorUm.getPontuacao() + "\n" + jogadorDois.getNome() + ": "+ jogadorDois.getPontuacao() );
			System.exit(0);
		}
	}

}
