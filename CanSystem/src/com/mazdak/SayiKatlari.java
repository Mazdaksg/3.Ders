package com.mazdak;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SayiKatlari {

	private JFrame frmSayikat;
	private JTextField txtsayi;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SayiKatlari window = new SayiKatlari();
					window.frmSayikat.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SayiKatlari() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSayikat = new JFrame();
		frmSayikat.setTitle("SayiKat");
		frmSayikat.setBounds(100, 100, 450, 300);
		frmSayikat.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSayikat.getContentPane().setLayout(null);

		JLabel label = new JLabel("Say\u0131 =");
		label.setBounds(92, 30, 46, 14);
		frmSayikat.getContentPane().add(label);

		txtsayi = new JTextField();
		txtsayi.setColumns(10);
		txtsayi.setBounds(148, 27, 86, 20);
		frmSayikat.getContentPane().add(txtsayi);

		JButton btnNewButton = new JButton("Hesapla");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				String sayitext = txtsayi.getText();

				Byte sayi = Byte.valueOf(sayitext);
				
				
//				say� 0-50aral���nda olsun
				
				

				if (sayi % 5 == 0) {
					JOptionPane.showMessageDialog(frmSayikat, "say� 5'�n tam kat�d�r.");
				} else if (sayi % 4 == 0) {
					JOptionPane.showMessageDialog(frmSayikat, "say� 4'�n tam kat�d�r.");
				} else if (sayi % 3 == 0) {
					JOptionPane.showMessageDialog(frmSayikat, "say� 3'un tam kat�d�r.");
				} else if (sayi % 2 == 0) {
					JOptionPane.showMessageDialog(frmSayikat, "say� 2'n�n tam kat�d�r.");
				} else {
					JOptionPane.showMessageDialog(frmSayikat, "girdi�iniz say� 5, 4, 3 veya 2'ye b�l�nemiyor.");
				}
				
			}
		});
		btnNewButton.setBounds(148, 62, 89, 23);
		frmSayikat.getContentPane().add(btnNewButton);
	}

}
