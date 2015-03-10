package Tareas;

import javax.swing.*;
public class Tarea_3 {

	public static void main(String[] args) {
	int numb;
	String Numerote;
	
	Numerote= JOptionPane.showInputDialog("Digite el numero");
	numb= Integer.parseInt(Numerote);
	
	if(numb % 2==0 )
	JOptionPane.showMessageDialog(null,"Su numero es Par");
	else
		JOptionPane.showMessageDialog(null,"Su numero es Impar");
	}

}
