

package br.com.bethehero.bethehero.gateway;

import br.com.bethehero.bethehero.domain.entities.Ong;
import br.com.bethehero.bethehero.gateway.expection.OngAlreadyExistException;
import br.com.bethehero.bethehero.gateway.presenters.OngPresenters;
import br.com.bethehero.bethehero.repository.OngRepository;
import br.com.bethehero.bethehero.repository.entities.OngTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OngGateway {

    @Autowired
    private OngRepository ongRepository;

    public Ong createOng(Ong ong) {
        if (ongRepository.findByEmailOrName(ong.getEmail(), ong.getName()).isPresent()) {
            throw new OngAlreadyExistException(ong.getEmail(), ong.getName());
        }

        OngTable ongTable = OngPresenters.presentToOngTable(ong);
        OngTable save =  ongRepository.save(ongTable);
        return OngPresenters.presentToDomain(save);
    }
}


