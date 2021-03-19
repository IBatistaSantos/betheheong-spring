package br.com.bethehero.bethehero.adapter.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Builder
public class OngDTO {
    private String id;
    private String name;
    private String email;
    private String password;
    private String whatsapp;
    private String city;
    private String UF;
}
