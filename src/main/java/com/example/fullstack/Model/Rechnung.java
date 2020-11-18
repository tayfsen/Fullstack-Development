package com.example.fullstack.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Rechnung {

    private String id;
    private String Rechnungsnummer;
    private String Rechnungsdatum;


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
