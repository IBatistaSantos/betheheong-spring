package br.com.bethehero.bethehero.usecase.ong;


import br.com.bethehero.bethehero.domain.entities.Ong;
import br.com.bethehero.bethehero.gateway.OngGateway;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class FindAllOng {

    @Autowired
    OngGateway ongGateway;

    public List<Ong> execute() {
        return ongGateway.findAll();
    }

}
