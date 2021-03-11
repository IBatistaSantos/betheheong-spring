package br.com.bethehero.bethehero.controller;

import br.com.bethehero.bethehero.controller.dto.OngDTO;
import br.com.bethehero.bethehero.controller.presenters.OngPresenterController;
import br.com.bethehero.bethehero.domain.entities.Ong;
import br.com.bethehero.bethehero.gateway.presenters.OngPresenters;
import br.com.bethehero.bethehero.usecase.ong.CreateOng;
import br.com.bethehero.bethehero.usecase.ong.FindOng;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("api/v1/ong")
public class OngController {

    @Autowired
    private CreateOng createOng;

    @Autowired
    private FindOng findOng;

    @PostMapping()
    public OngDTO createOng(@RequestBody OngDTO ongDTO) {
        Ong ongCreated = createOng.execute(OngPresenterController.toDomain(ongDTO));
        return OngPresenterController.toDTO(ongCreated);
    }

    @GetMapping("/{ongId}")
    public OngDTO findOng (@PathVariable Long ongId) {
        Ong ongFound = findOng.execute(ongId);
        return OngPresenterController.toDTO(ongFound);
    }
}
