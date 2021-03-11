package br.com.bethehero.bethehero.gateway.exception;

import javax.persistence.EntityNotFoundException;

public class OngNotFoundException extends EntityNotFoundException {
    public OngNotFoundException(Long ongId) {
        super(String.format("Ong with ID %s not found", ongId));
    }
}
