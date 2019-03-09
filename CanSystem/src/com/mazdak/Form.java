package com.mazdak;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Form {

	private JFrame frmanSistemi;
	private JTextField txtOgrenci1;
	private JTextField txtOgrenci2;
	private JTextField txtOgrenci3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form window = new Form();
					window.frmanSistemi.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Form() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmanSistemi = new JFrame();
		frmanSistemi.setTitle("\u00C7an Sistemi");
		frmanSistemi.setBounds(100, 100, 450, 300);
		frmanSistemi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmanSistemi.getContentPane().setLayout(null);

		txtOgrenci1 = new JTextField();
		txtOgrenci1.setColumns(10);
		txtOgrenci1.setBounds(135, 45, 175, 20);
		frmanSistemi.getContentPane().add(txtOgrenci1);

		JLabel lblogrenci1 = new JLabel("\u00F6\u011Frenci 1");
		lblogrenci1.setBounds(59, 48, 46, 14);
		frmanSistemi.getContentPane().add(lblogrenci1);

		txtOgrenci2 = new JTextField();
		txtOgrenci2.setColumns(10);
		txtOgrenci2.setBounds(135, 74, 175, 20);
		frmanSistemi.getContentPane().add(txtOgrenci2);

		txtOgrenci3 = new JTextField();
		txtOgrenci3.setColumns(10);
		txtOgrenci3.setBounds(135, 102, 175, 20);
		frmanSistemi.getContentPane().add(txtOgrenci3);

		JLabel lblogrenci2 = new JLabel("\u00F6\u011Frenci 2");
		lblogrenci2.setBounds(59, 77, 46, 14);
		frmanSistemi.getContentPane().add(lblogrenci2);

		JLabel lblogrenci3 = new JLabel("\u00F6\u011Frenci 3");
		lblogrenci3.setBounds(59, 105, 46, 14);
		frmanSistemi.getContentPane().add(lblogrenci3);

		JButton btnNewButton = new JButton("Hesaplama");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String ogrenci1text = txtOgrenci1.getText();
				String ogrenci2text = txtOgrenci2.getText();
				String ogrenci3text = txtOgrenci3.getText();

				Byte ogrenci1Not = Byte.valueOf(ogrenci1text);
				Byte ogrenci2Not = Byte.valueOf(ogrenci2text);
				Byte ogrenci3Not = Byte.valueOf(ogrenci3text);

				float ortalama = (ogrenci1Not + ogrenci2Not + ogrenci3Not) / 3f;

				if (ogrenci1Not >= ortalama) {
					JOptionPane.showMessageDialog(frmanSistemi, "GEÇTÝ");
				} else {
					float kalmaNotu = ortalama - ogrenci1Not;
					JOptionPane.showMessageDialog(frmanSistemi, kalmaNotu + "puan altýnda kaldý. (ÖÐRENCÝ 1)");
				}
				if (ogrenci2Not >= ortalama) {
					JOptionPane.showMessageDialog(frmanSistemi, "GEÇTÝ");
				} else {
					float kalmaNotu = ortalama - ogrenci2Not;
					JOptionPane.showMessageDialog(frmanSistemi, kalmaNotu + "puan altýnda kaldý. (ÖÐRENCÝ 2)");
				}
				if (ogrenci3Not >= ortalama) {
					JOptionPane.showMessageDialog(frmanSistemi, "GEÇTÝ");
				} else {
					float kalmaNotu = ortalama - ogrenci3Not;
					JOptionPane.showMessageDialog(frmanSistemi, kalmaNotu + "puan altýnda kaldý. (ÖÐRENCÝ 3)");
				}

			}
		});
		btnNewButton.setBounds(221, 133, 89, 23);
		frmanSistemi.getContentPane().add(btnNewButton);
	}
}
