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
      Question question = (Question) target;

      if (question.getName() == null) {
          errors.rejectValue("name", "your_error_code");
      }

      // do "complex" validation here

    }
}