package br.com.bethehero.bethehero.controller;

import br.com.bethehero.bethehero.controller.dto.OngDTO;
import br.com.bethehero.bethehero.controller.presenters.OngPresenterController;
import br.com.bethehero.bethehero.domain.entities.Ong;
import br.com.bethehero.bethehero.usecase.ong.CreateOng;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/ong")
public class OngController {

    @Autowired
    private CreateOng createOng;

    @PostMapping()
    public void createOng(@RequestBody OngDTO ongDTO) {
        createOng.execute(OngPresenterController.toDomain(ongDTO));
    }
}
