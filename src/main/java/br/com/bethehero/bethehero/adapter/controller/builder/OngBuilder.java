package br.com.bethehero.bethehero.adapter.controller.builder;


import br.com.bethehero.bethehero.adapter.controller.dto.OngDTO;
import br.com.bethehero.bethehero.domain.entities.Ong;

public class OngBuilder {
    public static OngDTO presentOngDTO(Ong ong) {
        return OngDTO.builder()
                .id(ong.getId())
                .name(ong.getName())
                .email(ong.getEmail())
                .password(ong.getPassword())
                .whatsapp(ong.getWhatsapp())
                .city(ong.getCity())
                .UF(ong.getUF())
                .build();
    }

    public static Ong presentToOng(OngDTO ongDTO) {
        return Ong.builder()
                .id(ongDTO.getId())
                .name(ongDTO.getName())
                .email(ongDTO.getEmail())
                .password(ongDTO.getPassword())
                .whatsapp(ongDTO.getWhatsapp())
                .city(ongDTO.getCity())
                .UF(ongDTO.getUF())
                .build();
    }
}
