package cz.oauh.kalisz.test20240110;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        EvidenceZavodniku evidence = new EvidenceZavodniku();
        evidence.cteniZeSouboru();

        Zavodnik z1 = new Zavodnik("Jan Malý", 2.7, 3, BigDecimal.valueOf(546), Boolean.TRUE, LocalDate.now());
        Zavodnik z2 = new Zavodnik("Karel Velký", 8.5, 3, BigDecimal.valueOf(15000), Boolean.TRUE, LocalDate.now());
        Zavodnik z3 = new Zavodnik("Random", 7, 1, BigDecimal.valueOf(245), Boolean.FALSE, LocalDate.of(1939,12,01));

        evidence.pridejZavodnika(z1);
        evidence.pridejZavodnika(z2);
        evidence.pridejZavodnika(z3);
    }
}