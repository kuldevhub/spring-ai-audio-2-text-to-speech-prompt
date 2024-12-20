package guru.springframework.springaiaudio.controllers;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import guru.springframework.springaiaudio.model.Question;
import guru.springframework.springaiaudio.services.OpenAIService;
import lombok.RequiredArgsConstructor;

/**
 * Created by jt, Spring Framework Guru.
 */
@RequiredArgsConstructor
@RestController
public class QuestionController {

    private final OpenAIService openAIService;

    @PostMapping(value ="/talk", consumes = MediaType.APPLICATION_JSON_VALUE , produces = "audio/mpeg")
    @ResponseBody
    public byte[] talkTalk(@RequestBody Question question) {
        return openAIService.getSpeech(question);
    }
}
