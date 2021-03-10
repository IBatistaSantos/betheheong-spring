package br.com.bethehero.bethehero.gateway;

import br.com.bethehero.bethehero.domain.entities.Ong;
import br.com.bethehero.bethehero.gateway.exception.OngAlreadyExistException;
import br.com.bethehero.bethehero.gateway.presenters.OngPresenters;
import br.com.bethehero.bethehero.repository.OngRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OngGateway {

    @Autowired
    private OngRepository ongRepository;

    public void createOng(Ong ong) {
        ongRepository.save(OngPresenters.presentToOngTable(ong));
    }

    public void verifyIfOngExists(String name) {
        ongRepository.findByName(name).ifPresent(ong -> {
            throw new OngAlreadyExistException(ong.getName());
        });
    }
}
