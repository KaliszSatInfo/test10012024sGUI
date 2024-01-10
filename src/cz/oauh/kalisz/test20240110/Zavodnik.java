package cz.oauh.kalisz.test20240110;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Zavodnik {
    private String text;
    private double vysledek;
    private int kategorie;
    private BigDecimal financniCastka;
    private boolean divokaKarta;
    private LocalDate datumPrihlaseni;

    public Zavodnik(String text, double vysledek, int kategorie, BigDecimal financniCastka, boolean divokaKarta, LocalDate datumPrihlaseni) {
        this.text = text;
        this.vysledek = vysledek;
        this.kategorie = kategorie;
        this.financniCastka = financniCastka;
        this.divokaKarta = divokaKarta;
        this.datumPrihlaseni = datumPrihlaseni;
    }

    public Zavodnik(String text, int kategorie) {
        this.text = text;
        this.kategorie = kategorie;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public double getVysledek() {
        return vysledek;
    }

    public void setVysledek(double vysledek) {
        this.vysledek = vysledek;
    }

    public int getKategorie() {
        return kategorie;
    }

    public void setKategorie(int kategorie) {
        this.kategorie = kategorie;
    }

    public BigDecimal getFinancniCastka() {
        return financniCastka;
    }

    public void setFinancniCastka(BigDecimal financniCastka) {
        this.financniCastka = financniCastka;
    }

    public boolean isDivokaKarta() {
        return divokaKarta;
    }

    public void setDivokaKarta(boolean divokaKarta) {
        this.divokaKarta = divokaKarta;
    }

    public LocalDate getDatumPrihlaseni() {
        return datumPrihlaseni;
    }

    public void setDatumPrihlaseni(LocalDate datumPrihlaseni) {
        this.datumPrihlaseni = datumPrihlaseni;
    }
}
