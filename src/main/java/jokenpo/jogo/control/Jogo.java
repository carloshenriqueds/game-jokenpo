package jokenpo.jogo.control;

import javax.swing.JOptionPane;

import jokenpo.jogo.model.Jogador;

public class Jogo {
	
	public static Integer jogarJokenpo(Jogador jogadorUm, Jogador jogadorDois, Integer jogada1, Integer jogada2){
		if(jogada1 == null){
			jogada1 = Integer.parseInt(JOptionPane.showInputDialog(jogadorUm.getNome() + ": "+ jogadorUm.getPontuacao() + "\n" + jogadorDois.getNome() + ": "+ jogadorDois.getPontuacao()+"\nEntre com a opção " +jogadorUm.getNome()+": \n1 - Pedra \n2 - Papel \n3 - Tesoura \n4 - Lagarto \n5 - Spock"));
			 jogada2 = Integer.parseInt(JOptionPane.showInputDialog(jogadorUm.getNome() + ": "+ jogadorUm.getPontuacao() + "\n" + jogadorDois.getNome() + ": "+ jogadorDois.getPontuacao()+"\nEntre com a opção " +jogadorDois.getNome()+": \n1 - Pedra \n2 - Papel \n3 - Tesoura \n4 - Lagarto \n5 - Spock"));
		}
		switch (jogada1) {
		case 1:
			switch (jogada2) {
			case 1:
				return 0;
			case 2:
				JOptionPane.showMessageDialog(null, "Papel cobre pedra... "+jogadorDois.getNome() + " venceu");
				return 2;
			case 3:
				JOptionPane.showMessageDialog(null, "Pedra quebra tesoura... "+jogadorUm.getNome() + " venceu");
				return 1;
			case 4:
				JOptionPane.showMessageDialog(null, "Pedra esmaga lagarto... "+jogadorUm.getNome() + " venceu");
				return 1;
			case 5:
				JOptionPane.showMessageDialog(null, "Spock vaporiza pedra..."+jogadorDois.getNome() + " venceu");
				return 2;
				
			default:
				JOptionPane.showMessageDialog(null, "Opção invalida");
			}
			break;
		case 2:
			switch (jogada2) {
			case 1:
				JOptionPane.showMessageDialog(null, "Papel cobre pedra... "+jogadorUm.getNome() + " venceu");
				return 1;
			case 2:
				return 0;
			case 3:
				JOptionPane.showMessageDialog(null, "Tesoura corta papel... "+jogadorDois.getNome() + " venceu");
				return 2;
			case 4:
				JOptionPane.showMessageDialog(null, "Lagarto come papel... "+jogadorDois.getNome() + " venceu");
				return 2;
			case 5:
				JOptionPane.showMessageDialog(null, "Papel refuta Spock... "+jogadorUm.getNome() + " venceu");
				return 1;
			default:
				JOptionPane.showMessageDialog(null, "Opção invalida");
			}
		break;
		
		case 3:
			switch (jogada2) {
			case 1:
				JOptionPane.showMessageDialog(null, "Pedra quebra tesoura... "+jogadorDois.getNome() + " venceu");
				return 2;
			case 2:
				JOptionPane.showMessageDialog(null, "Tesoura corta papel... "+jogadorUm.getNome() + " venceu");
				return 1;
			case 3:
				return 0;
			case 4:
				JOptionPane.showMessageDialog(null, "Tesoura decapita lagarto... "+jogadorUm.getNome() + " venceu");
				return 1;
			case 5:
				JOptionPane.showMessageDialog(null, "Spock esmaga (ou derrete) tesoura... "+jogadorDois.getNome() + " venceu");
				return 2;
			default:
				JOptionPane.showMessageDialog(null, "Opção invalida");
			}
		break;
		
		case 4:
			switch (jogada2) {
			case 1:
				JOptionPane.showMessageDialog(null, "Pedra esmaga lagarto... "+jogadorDois.getNome() + " venceu");
				return 2;
			case 2:
				JOptionPane.showMessageDialog(null, "Lagarto come papel... "+jogadorUm.getNome() + " venceu");
				return 1;
			case 3:
				JOptionPane.showMessageDialog(null, "Tesoura decapita lagarto... "+jogadorDois.getNome() + " venceu");
				return 2;
			case 4:
				return 0;
			case 5:
				JOptionPane.showMessageDialog(null, "Lagarto envenena Spock... "+jogadorUm.getNome() + " venceu");
				return 1;
			default:
				JOptionPane.showMessageDialog(null, "Opção invalida");
			}
		break;
		
		case 5:
			switch (jogada2) {
			case 1:
				JOptionPane.showMessageDialog(null, "Spock vaporiza pedra... "+jogadorUm.getNome() + " venceu");
				return 1;
			case 2:
				JOptionPane.showMessageDialog(null, "Papel refuta Spock... "+jogadorDois.getNome() + " venceu");
				return 2;
			case 3:
				JOptionPane.showMessageDialog(null, "Spock esmaga (ou derrete) tesoura... "+jogadorUm.getNome() + " venceu");
				return 1;
			case 4:
				JOptionPane.showMessageDialog(null, "Lagarto envenena Spock... "+jogadorDois.getNome() + " venceu");
				return 2;
			case 5:
				return 0;
			default:
				JOptionPane.showMessageDialog(null, "Opção invalida");
			}
		break;
		
		default:
			JOptionPane.showMessageDialog(null, "Opção invalida");
		}
		return null;
	}
}
