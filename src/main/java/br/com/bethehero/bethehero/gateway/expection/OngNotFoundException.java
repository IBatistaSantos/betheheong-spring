package br.com.bethehero.bethehero.gateway.expection;

import javax.persistence.EntityNotFoundException;

public class OngNotFoundException extends EntityNotFoundException {
    public OngNotFoundException(String id) {
        super(String.format("Ong with %s ID not fount", id ));
    }
}
