package cz.oauh.kalisz.test20240110;

import javax.swing.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ZavodnikForm extends JFrame{

    private JTextArea textArea1;
    private JTextArea textArea2;
    private JTextArea textArea3;
    private JTextArea textArea4;
    private JTextArea textArea5;
    private JTextArea textArea6;
    private JPanel panel;
    private JButton previousButton;
    private JButton nextButton;
    private EvidenceZavodniku evidence;
    private int currentIndex;

    public ZavodnikForm() {
        List<Zavodnik> seznamZavodniku = new ArrayList<>();
        Zavodnik z1 = new Zavodnik("Jan Malý", 2.7, 3, BigDecimal.valueOf(546), Boolean.TRUE, LocalDate.now());
        Zavodnik z2 = new Zavodnik("Karel Velký", 8.5, 3, BigDecimal.valueOf(15000), Boolean.TRUE, LocalDate.now());
        Zavodnik z3 = new Zavodnik("Lorem Ipsum", 7, 1, BigDecimal.valueOf(245), Boolean.FALSE, LocalDate.of(1939, 12, 1));

        seznamZavodniku.add(z1);
        seznamZavodniku.add(z2);
        seznamZavodniku.add(z3);

        evidence = new EvidenceZavodniku(seznamZavodniku);
        evidence.cteniZeSouboru();

        currentIndex = 0;
        if (!evidence.ziskejSeznamZavodniku().isEmpty()) {
            displayZavodnik(evidence.ziskejSeznamZavodniku().get(currentIndex));
        }
        previousButton.addActionListener(e -> showZavodnikAtIndex(currentIndex - 1));
        nextButton.addActionListener(e -> showZavodnikAtIndex(currentIndex + 1));
    }
    private void showZavodnikAtIndex(int index) {
        if (index >= 0 && index < evidence.ziskejSeznamZavodniku().size()) {
            currentIndex = index;
            displayZavodnik(evidence.ziskejSeznamZavodniku().get(currentIndex));
        }
    }
    public void displayZavodnik(Zavodnik zavodnik) {
        textArea1.setText(zavodnik.getText());
        textArea2.setText(String.valueOf(zavodnik.getVysledek()));
        textArea3.setText(String.valueOf(zavodnik.getKategorie()));
        textArea4.setText(String.valueOf(zavodnik.getFinancniCastka()));
        textArea5.setText(String.valueOf(zavodnik.isDivokaKarta()));
        textArea6.setText(zavodnik.getDatumPrihlaseni().toString());
        JTextArea[] textAreas = {textArea1, textArea2, textArea3, textArea4, textArea5, textArea6};
        for (JTextArea textArea : textAreas) {
            textArea.setEditable(false);
        }
    }
    public static void main(String[] args) {
        ZavodnikForm z = new ZavodnikForm();
        z.setContentPane(z.panel);
        z.setSize(500, 500);
        z.setDefaultCloseOperation(EXIT_ON_CLOSE);
        z.setVisible(true);
    }
}
