package com.mazdak;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HesapMakinesi {

	private JFrame frmHesapMakinesi;
	private JTextField txtsayi1;
	private JTextField txtsayi2;
	private JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HesapMakinesi window = new HesapMakinesi();
					window.frmHesapMakinesi.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HesapMakinesi() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHesapMakinesi = new JFrame();
		frmHesapMakinesi.setTitle("Hesap Makinesi");
		frmHesapMakinesi.setBounds(100, 100, 450, 300);
		frmHesapMakinesi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHesapMakinesi.getContentPane().setLayout(null);

		JLabel label = new JLabel("Say\u0131 1 =");
		label.setBounds(65, 44, 46, 14);
		frmHesapMakinesi.getContentPane().add(label);

		JLabel label_1 = new JLabel("Say\u0131 2 =");
		label_1.setBounds(65, 75, 46, 14);
		frmHesapMakinesi.getContentPane().add(label_1);

		txtsayi1 = new JTextField();
		txtsayi1.setColumns(10);
		txtsayi1.setBounds(108, 38, 107, 20);
		frmHesapMakinesi.getContentPane().add(txtsayi1);

		txtsayi2 = new JTextField();
		txtsayi2.setColumns(10);
		txtsayi2.setBounds(108, 69, 107, 20);
		frmHesapMakinesi.getContentPane().add(txtsayi2);

		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "TOPLAM", "\u00C7IKAR", "\u00C7ARP", "B\u00D6L" }));
		comboBox.setBounds(225, 55, 107, 20);
		frmHesapMakinesi.getContentPane().add(comboBox);

		JButton button = new JButton("Hesapla");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String islemTipi = comboBox.getSelectedItem().toString();
				/* JOptionPane.showMessageDialog(frmHesapMakinesi, islemTipi); */
				String sayi1text = txtsayi1.getText();
				String sayi2text = txtsayi2.getText();

				Float sayi1 = Float.valueOf(sayi1text);
				Float sayi2 = Float.valueOf(sayi2text);

				if (islemTipi == "TOPLAM") {
					JOptionPane.showMessageDialog(frmHesapMakinesi, "TOPLAM =" + (sayi1 + sayi2));
				} else if (islemTipi == "ÇIKAR") {
					JOptionPane.showMessageDialog(frmHesapMakinesi, "ÇIKARMA =" + (sayi1 - sayi2));
				} else if (islemTipi == "ÇARP") {
					JOptionPane.showMessageDialog(frmHesapMakinesi, "ÇARPMA =" + (sayi1 * sayi2));
				} else if (islemTipi == "BÖL") {
					JOptionPane.showMessageDialog(frmHesapMakinesi, "BÖLME =" + (sayi1 / sayi2));
				}

			}
		});
		button.setBounds(126, 100, 89, 23);
		frmHesapMakinesi.getContentPane().add(button);
	}
}
