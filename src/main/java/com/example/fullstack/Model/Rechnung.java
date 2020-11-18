package com.example.fullstack.Model;

import javax.persistence.*;

@Entity
public class Rechnung {

    private String id;
    private String Rechnungsnummer;
    private String Rechnungsdatum;

    @ManyToOne(fetch = FetchType.LAZY)
    private Kunde kunde;

    public void setId(String id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public String getId() {
        return id;
    }

    public String getRechnungsnummer() {
        return Rechnungsnummer;
    }

    public void setRechnungsnummer(String rechnungsnummer) {
        Rechnungsnummer = rechnungsnummer;
    }

    public String getRechnungsdatum() {
        return Rechnungsdatum;
    }

    public void setRechnungsdatum(String rechnungsdatum) {
        Rechnungsdatum = rechnungsdatum;
    }
}
