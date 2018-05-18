package com.jmzombek.web;

import java.lang.String;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import com.jmzombek.validator.QuestionValidator;

@RestController
@RequestMapping("/EmptyTomb/Question")
@EnableAutoConfiguration
// It configures and wires our beans based on what @Bean methods we have defined in our configuration
// class. It does other additional configurations too, which includes configuring/invoking helper 
// components (like embedded Tomcat in the web application). 
public class QuestionController {
  
    @InitBinder("Question")
    protected void initBinder(WebDataBinder binder) {
        binder.setValidator(new QuestionValidator());
    }
    
    @RequestMapping(value = "/byId/{questionId}", method = RequestMethod.GET)
    @ResponseBody
    // Note the @ResponseBody annotation on the method – which instructs Spring to bypass the view resolver 
    // and essentially write out the output directly to the body of the HTTP response.

 	public String getQuestionById(@PathVariable final String questionId) {
	    //@RequestHeader final HttpHeaders headers,
	    //@RequestParam(value = "questionID", required = false, defaultValue = "1") final String questionID) {
	        
		return "Question " + questionId;
	}
    
    @RequestMapping("/home")
    public String home() {
        return "Greetings From Spring Boot";
    }
}