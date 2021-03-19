package br.com.bethehero.bethehero.domain.entities;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Ong {
    private String id;
    private String name;
    private String email;
    private String password;
    private String whatsapp;
    private String city;
    private String UF;
}
