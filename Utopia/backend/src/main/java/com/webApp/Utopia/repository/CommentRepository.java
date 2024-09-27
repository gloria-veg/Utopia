package com.webApp.Utopia.repository;

import com.webApp.Utopia.model.Comment;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface CommentRepository extends MongoRepository<Comment, String>{

    @Query("{'title':?0}")
    Optional<Comment> findByTitle(String title);

}

