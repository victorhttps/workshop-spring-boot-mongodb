package com.course.mongodb.workshopmongo.services.exceptions;

public class ObjectNotFoundException extends RuntimeException{
    public static final long serialVersionUID = 1L;

    public ObjectNotFoundException(String msg){
        super(msg);
    }
}
