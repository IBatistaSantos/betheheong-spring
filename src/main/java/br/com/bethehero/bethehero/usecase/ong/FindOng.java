package br.com.bethehero.bethehero.usecase.ong;

import br.com.bethehero.bethehero.domain.entities.Ong;
import br.com.bethehero.bethehero.gateway.OngGateway;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class FindOng {

    OngGateway ongGateway;

    public Ong execute(Long ongId){
        return ongGateway.findOng(ongId);
    }
}
