package br.com.bethehero.bethehero.gateway.presenters;


import br.com.bethehero.bethehero.domain.entities.Ong;
import br.com.bethehero.bethehero.repository.entities.OngTable;

public class OngPresenters {

    public static Ong presentToDomain(OngTable ongTable) {
        return Ong.builder()
                .id(ongTable.getId())
                .name(ongTable.getName())
                .email(ongTable.getEmail())
                .password(ongTable.getPassword())
                .whatsapp(ongTable.getWhatsapp())
                .city(ongTable.getCity())
                .UF(ongTable.getUF())
                .build();
    }

    public static OngTable presentToOngTable(Ong ong) {
        return OngTable.builder()
                .id(ong.getId())
                .name(ong.getName())
                .email(ong.getEmail())
                .password(ong.getPassword())
                .whatsapp(ong.getWhatsapp())
                .city(ong.getCity())
                .UF(ong.getUF())
                .build();
    }
}
