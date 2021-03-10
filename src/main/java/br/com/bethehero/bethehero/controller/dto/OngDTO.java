package br.com.bethehero.bethehero.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Builder
public class OngDTO {
    private Long id;
    private String name;
    private String email;
    private String whatsapp;
    private String city;
    private String UF;
}
