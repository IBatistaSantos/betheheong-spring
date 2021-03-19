package br.com.bethehero.bethehero.gateway.expection;

import javax.persistence.EntityExistsException;

public class OngAlreadyExistException extends EntityExistsException {
    public OngAlreadyExistException(String email, String name) {
        super(String.format("Ong with email %s or name %s already exists", email, name));
    }
}
