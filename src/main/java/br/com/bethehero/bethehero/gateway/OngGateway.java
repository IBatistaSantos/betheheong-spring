package br.com.bethehero.bethehero.gateway;

import br.com.bethehero.bethehero.domain.entities.Ong;
import br.com.bethehero.bethehero.gateway.exception.OngAlreadyExistException;
import br.com.bethehero.bethehero.gateway.presenters.OngPresenters;
import br.com.bethehero.bethehero.repository.OngRepository;
import br.com.bethehero.bethehero.repository.entities.OngTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OngGateway {

    @Autowired
    private OngRepository ongRepository;

    public void createOng(Ong ong) {
        ongRepository.save(OngPresenters.presentToOngTable(ong));
    }

    public void verifyIfOngExists(String name) {
        Optional<OngTable> foundOng = ongRepository.findByName(name);

        if (foundOng.isPresent()) {
            throw new OngAlreadyExistException(name);
        }
    }
}
