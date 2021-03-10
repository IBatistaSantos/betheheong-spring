package br.com.bethehero.bethehero.controller.presenters;

import br.com.bethehero.bethehero.controller.dto.OngDTO;
import br.com.bethehero.bethehero.domain.entities.Ong;

public class OngPresenterController {
    public static Ong toDomain(OngDTO ongDTO) {
        return Ong.builder()
                .id(ongDTO.getId())
                .name(ongDTO.getName())
                .email(ongDTO.getEmail())
                .whatsapp(ongDTO.getWhatsapp())
                .city(ongDTO.getCity())
                .UF(ongDTO.getUF())
                .build();
    }

    public static OngDTO toDTO(Ong ong) {
        return OngDTO.builder()
                .id(ong.getId())
                .name(ong.getName())
                .email(ong.getEmail())
                .whatsapp(ong.getWhatsapp())
                .city(ong.getCity())
                .UF(ong.getUF())
                .build();
    }


}
