package com.example.demo.Dto;
import java.util.Date;

public class MovimentoDTO {

    private Date data;

    private String causale;

    private double importo;

    private String mittente;

    private String beneficiario;

    private String valuta;

    public MovimentoDTO(Date data, String causale, double importo, String mittente, String beneficiario, String valuta) {
        this.data = data;
        this.causale = causale;
        this.importo = importo;
        this.mittente = mittente;
        this.beneficiario = beneficiario;
        this.valuta = valuta;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getCausale() {
        return causale;
    }

    public void setCausale(String causale) {
        this.causale = causale;
    }

    public double getImporto() {
        return importo;
    }

    public void setImporto(double importo) {
        this.importo = importo;
    }

    public String getMittente() {
        return mittente;
    }

    public void setMittente(String mittente) {
        this.mittente = mittente;
    }

    public String getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(String beneficiario) {
        this.beneficiario = beneficiario;
    }

    public String getValuta() {
        return valuta;
    }

    public void setValuta(String valuta) {
        this.valuta = valuta;
    }
}
