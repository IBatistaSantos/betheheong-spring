package br.com.bethehero.bethehero.gateway;

import br.com.bethehero.bethehero.domain.entities.Ong;
import br.com.bethehero.bethehero.gateway.exception.OngAlreadyExistException;
import br.com.bethehero.bethehero.gateway.exception.OngNotFoundException;
import br.com.bethehero.bethehero.gateway.presenters.OngPresenters;
import br.com.bethehero.bethehero.repository.OngRepository;
import br.com.bethehero.bethehero.repository.entities.OngTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OngGateway {

    @Autowired
    private OngRepository ongRepository;

    public Ong createOng(Ong ong) {
        OngTable save = ongRepository.save(OngPresenters.presentToOngTable(ong));
        return OngPresenters.presentToDomain(save);
    }

    public Ong findOng(Long ongId) {
        OngTable ongTable = ongRepository.findById(ongId)
                .orElseThrow(() -> new OngNotFoundException(ongId));
        return OngPresenters.presentToDomain(ongTable);
    }

    public List<Ong> findAll() {
        return ongRepository.findAll().stream()
                .map((ongTable) -> OngPresenters.presentToDomain(ongTable))
                .collect(Collectors.toList());
    }

    public void verifyIfOngExists(String name) {
        ongRepository.findByName(name).ifPresent(ong -> {
            throw new OngAlreadyExistException(ong.getName());
        });
    }
}
