package com.mysite.sbb_2nd.question;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface QuestionRepository extends JpaRepository<Question, Long>{

    Optional<Question> findBySubject(String subject);
}
