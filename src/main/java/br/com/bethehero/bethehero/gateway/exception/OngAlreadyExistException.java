package br.com.bethehero.bethehero.gateway.exception;

import javax.persistence.EntityExistsException;

public class OngAlreadyExistException extends EntityExistsException {

    public OngAlreadyExistException(String name) {
        super(String.format("Ong with %s has already been registered ", name));
    }
}
