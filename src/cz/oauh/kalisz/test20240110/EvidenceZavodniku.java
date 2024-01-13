package cz.oauh.kalisz.test20240110;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EvidenceZavodniku {
    private List<Zavodnik> seznamZavodniku = new ArrayList<>();

    public EvidenceZavodniku(List<Zavodnik> zavodnikList) {
        seznamZavodniku.addAll(zavodnikList);
    }

    public void pridejZavodnika(Zavodnik zavodnik){
        seznamZavodniku.add(zavodnik);
    }

    public void odstranZavodnika(Zavodnik zavodnik){
        seznamZavodniku.remove(zavodnik);
    }

    public Zavodnik ziskejZavodnika(int i){
        return seznamZavodniku.get(i);
    }

    public List<Zavodnik> ziskejSeznamZavodniku(){
        return seznamZavodniku;
    }

    public void cteniZeSouboru(){
        try (Scanner sc = new Scanner(new BufferedReader(new FileReader("soubor.txt")))){
            while(sc.hasNextLine()){
                String radek = sc.nextLine();
                String[] bloky = radek.split("/");
                String text =bloky[0];
                double vysledek = Double.parseDouble(bloky[1]);
                int kategorie = Integer.parseInt(bloky[2]);
                BigDecimal financniCastka = new BigDecimal(bloky[3]);
                boolean divokaKarta = bloky[4].equals("pravda");
                LocalDate datumPrihlaseni = LocalDate.parse(bloky[5]);
                Zavodnik zavodnik = new Zavodnik(text, vysledek, kategorie, financniCastka, divokaKarta, datumPrihlaseni);
                seznamZavodniku.add(zavodnik);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
