package br.com.bethehero.bethehero.usecase.ong;

import br.com.bethehero.bethehero.domain.entities.Ong;
import br.com.bethehero.bethehero.gateway.OngGateway;
import br.com.bethehero.bethehero.usecase.ong.port.IdGenerator;
import br.com.bethehero.bethehero.usecase.ong.port.PasswordEncoder;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CreateOng {

    private final IdGenerator idGenerator;
    private final PasswordEncoder passwordEncoder;
    private final OngGateway ongGateway;
    public Ong execute(Ong ong) {
        var userToSave = Ong.builder()
                .id(idGenerator.generate())
                .name(ong.getName())
                .email(ong.getEmail())
                .password(passwordEncoder.encode(ong.getPassword()))
                .whatsapp(ong.getWhatsapp())
                .city(ong.getCity())
                .UF(ong.getUF())
                .build();
        return ongGateway.createOng(userToSave);
    }
}
