package br.com.bethehero.bethehero.adapter.controller;

import br.com.bethehero.bethehero.adapter.controller.builder.OngBuilder;
import br.com.bethehero.bethehero.adapter.controller.dto.OngDTO;
import br.com.bethehero.bethehero.domain.entities.Ong;
import br.com.bethehero.bethehero.usecase.ong.CreateOng;
import br.com.bethehero.bethehero.usecase.ong.FindAllOng;
import br.com.bethehero.bethehero.usecase.ong.FindOngById;
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
    private FindOngById findOngById;

    @Autowired
    private FindAllOng findAllOng;

    @PostMapping
    public OngDTO createOng(@RequestBody OngDTO ongDTO) {
        Ong ongCreated = createOng.execute(OngBuilder.presentToOng(ongDTO));
        return OngBuilder.presentOngDTO(ongCreated);
    }

    @GetMapping("/{ongId}")
    public OngDTO findById(@PathVariable String ongId) {
        Ong ong = findOngById.execute(ongId);
        return OngBuilder.presentOngDTO(ong);
    }

    @GetMapping
    public List<OngDTO> findAll() {
        return findAllOng.execute().stream()
                .map(OngBuilder::presentOngDTO)
                .collect(Collectors.toList());
    }
}
