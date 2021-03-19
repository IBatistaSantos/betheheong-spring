package br.com.bethehero.bethehero.adapter.idGenerator;

import br.com.bethehero.bethehero.usecase.ong.port.IdGenerator;

import java.util.UUID;

public class UUIDGenerator implements IdGenerator {

    public UUIDGenerator() {
        generate();
    }

    @Override
    public String generate() {
        return UUID.randomUUID().toString();
    }
}
