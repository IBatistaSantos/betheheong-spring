package br.com.bethehero.bethehero.usecase.ong;

import br.com.bethehero.bethehero.domain.entities.Ong;
import br.com.bethehero.bethehero.gateway.OngGateway;
import br.com.bethehero.bethehero.gateway.presenters.OngPresenters;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CreateOng {

    OngGateway ongGateway;

    public Ong execute(Ong ong) {
        ongGateway.verifyIfOngExists(ong.getName());
        return ongGateway.createOng(ong);

    }
}
