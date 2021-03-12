package br.com.bethehero.bethehero.controller;

import br.com.bethehero.bethehero.controller.dto.OngDTO;
import br.com.bethehero.bethehero.controller.presenters.OngPresenterController;
import br.com.bethehero.bethehero.domain.entities.Ong;
import br.com.bethehero.bethehero.usecase.ong.CreateOng;
import br.com.bethehero.bethehero.usecase.ong.FindAllOng;
import br.com.bethehero.bethehero.usecase.ong.FindByIdOng;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/v1/ong")
public class OngController {

    @Autowired
    private CreateOng createOng;

    @Autowired
    private FindByIdOng findByIdOng;

    @Autowired
    private FindAllOng finAllOng;

    @PostMapping
    public OngDTO createOng(@RequestBody OngDTO ongDTO) {
        Ong ongCreated = createOng.execute(OngPresenterController.toDomain(ongDTO));
        return OngPresenterController.toDTO(ongCreated);
    }

    @GetMapping("/{ongId}")
    public OngDTO findByIdOng (@PathVariable Long ongId) {
        Ong ongFound = findByIdOng.execute(ongId);
        return OngPresenterController.toDTO(ongFound);
    }

    @GetMapping
    public List<OngDTO> finAll() {
        List<Ong> ongList = finAllOng.execute();

        return ongList.stream()
                .map(ong -> OngPresenterController.toDTO(ong))
                .collect(Collectors.toList());
    }
}
