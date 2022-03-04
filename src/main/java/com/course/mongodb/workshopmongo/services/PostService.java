package com.course.mongodb.workshopmongo.services;

import com.course.mongodb.workshopmongo.domain.Post;
import com.course.mongodb.workshopmongo.repositories.PostRepository;
import com.course.mongodb.workshopmongo.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repository;

    public Post findById(String id) {
        Optional<Post> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }
}
