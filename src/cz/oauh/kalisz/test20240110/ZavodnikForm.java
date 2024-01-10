package cz.oauh.kalisz.test20240110;

import javax.swing.*;

public class ZavodnikForm extends JFrame{

    private JTextArea textArea1;
    private JTextArea textArea2;
    private JTextArea textArea3;
    private JTextArea textArea4;
    private JTextArea textArea5;
    private JTextArea textArea6;
    private JPanel Panel;

    public void displayZavodnik(Zavodnik zavodnik) {
        textArea1.setText(zavodnik.getText());
        textArea2.setText(String.valueOf(zavodnik.getVysledek()));
        textArea3.setText(String.valueOf(zavodnik.getKategorie()));
        textArea4.setText(String.valueOf(zavodnik.getFinancniCastka()));
        textArea5.setText(String.valueOf(zavodnik.isDivokaKarta()));
        textArea6.setText(zavodnik.getDatumPrihlaseni().toString());
    }

    public static void main(String[] args) {
        ZavodnikForm z = new ZavodnikForm();
        z.setContentPane(z.Panel);
        z.setSize(500,500);
        z.setDefaultCloseOperation(EXIT_ON_CLOSE);
        z.setVisible(true);
    }
}
