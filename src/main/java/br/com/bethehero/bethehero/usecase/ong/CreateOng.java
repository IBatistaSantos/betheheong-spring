package br.com.bethehero.bethehero.usecase.ong;

import br.com.bethehero.bethehero.domain.entities.Ong;
import br.com.bethehero.bethehero.gateway.OngGateway;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CreateOng {

    OngGateway ongGateway;

    public void execute(Ong ong) {
        ongGateway.verifyIfOngExists(ong.getName());
        ongGateway.createOng(ong);
    }
}
