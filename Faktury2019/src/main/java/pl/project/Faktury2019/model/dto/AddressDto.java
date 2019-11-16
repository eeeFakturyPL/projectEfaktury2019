package pl.project.Faktury2019.model.dto;

import javax.xml.ws.soap.Addressing;

public class AddressDto {

    private String miasto;
    private String ulica;
    private Long nrBud;
    private Long nrLok;
    private String kodPoczt;

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public Long getNrBud() {
        return nrBud;
    }

    public void setNrBud(Long nrBud) {
        this.nrBud = nrBud;
    }

    public Long getNrLok() {
        return nrLok;
    }

    public void setNrLok(Long nrLok) {
        this.nrLok = nrLok;
    }

    public String getKodPoczt() {
        return kodPoczt;
    }

    public void setKodPoczt(String kodPoczt) {
        this.kodPoczt = kodPoczt;
    }
}
