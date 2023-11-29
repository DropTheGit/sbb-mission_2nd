package com.mysite.sbb_2nd;

import com.mysite.sbb_2nd.answer.Answer;
import com.mysite.sbb_2nd.answer.AnswerRepository;
import com.mysite.sbb_2nd.question.QuestionRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class Sbb2ndApplicationTests {

    @Autowired
    private QuestionRepository questionRepository;
    @Autowired
    private AnswerRepository answerRepository;

    @Test
    void testJpa() {
     Optional<Answer> oa = this.answerRepository.findById(1L);
     assertTrue(oa.isPresent());
     Answer a = oa.get();
     assertEquals(1, a.getQuestion().getId());
    }
}
