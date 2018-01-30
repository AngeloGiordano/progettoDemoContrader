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
}
