package br.com.bethehero.bethehero.adapter.controller;

import br.com.bethehero.bethehero.adapter.controller.builder.OngBuilder;
import br.com.bethehero.bethehero.adapter.controller.dto.OngDTO;
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

    @PostMapping
    public OngDTO createOng(@RequestBody OngDTO ongDTO) {
        Ong ongCreated = createOng.execute(OngBuilder.presentToOng(ongDTO));
        return OngBuilder.presentOngDTO(ongCreated);
    }
}
