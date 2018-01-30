package com.example.demo.Dto;

public class UserDTO {


    private String username;
    private String password ;
    private String nomeUser ;
    private String cognomeUser;
    private String dataDiNascita;
    private String indirizzo ;
    private String città;
    private String provincia ;
    private String cap ;
    private String email;
    private String telefono ;
    private  String ruolo ;

    public UserDTO(){}

    public UserDTO(String username, String password, String nomeUser, String cognomeUser, String dataDiNascita, String indirizzo, String città, String provincia, String cap,String email,String telefono, String ruolo) {
        this.username = username;
        this.password = password;
        this.nomeUser = nomeUser;
        this.cognomeUser = cognomeUser;
        this.dataDiNascita = dataDiNascita;
        this.indirizzo = indirizzo;
        this.città= città;
        this.provincia = provincia;
        this.cap = cap;
        this.email=email;
        this.telefono=telefono;
        this.ruolo =ruolo;

    }


}
