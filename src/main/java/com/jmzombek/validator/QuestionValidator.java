package com.jmzombek.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.jmzombek.model.Question;

public class QuestionValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
      return Question.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
      final Question question = (Question) target;

      if (question.getId() == null) {
          errors.rejectValue("Id not found", "404");
      }

      // do "complex" validation here

    }
}