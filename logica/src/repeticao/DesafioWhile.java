package repeticao;

import javax.swing.JOptionPane;

public class DesafioWhile {
	
	public static void main(String[] args) {
		
		int dia, mes, ano;
		
		dia = Integer.parseInt(JOptionPane.showInputDialog("Dia: "));
		mes = Integer.parseInt(JOptionPane.showInputDialog("Mes: "));
		ano = Integer.parseInt(JOptionPane.showInputDialog("Ano: "));
		
		while (ano>2003 || ano<1920) {
			ano = Integer.parseInt(JOptionPane.showInputDialog("Ano: "));
		}
		
		while (mes>12 || mes<1) {
			mes = Integer.parseInt(JOptionPane.showInputDialog("Mes: "));
		}
		
		if (mes==2) {
			while (dia>29 || dia<1) {
				dia = Integer.parseInt(JOptionPane.showInputDialog("Dia: "));
			}
		}
		
		else if (mes==4 || mes==6 || mes==9 || mes==11) {
			while (dia>30 || dia<1) {
				dia = Integer.parseInt(JOptionPane.showInputDialog("Dia: "));
			}
		}
		
		else {
			while (dia>31 || dia<1) {
				dia = Integer.parseInt(JOptionPane.showInputDialog("Dia: "));
			}
		}
		
		System.out.println("Data: "+ dia +"-"+ mes +"-"+ ano);
		
	}

}
