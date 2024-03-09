package com.example.demo.Config;


import com.example.demo.Models.WikiMedia;
import com.example.demo.Repositories.WikiRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class Consumer {

    private final WikiRepository wikiRepository;

    @KafkaListener(topics = "Topic-1",groupId = "myGroupe")
    public  void consume(String eventMessage){


        log.info(String.format("Event Message received -> %s",eventMessage));
        String message= eventMessage.substring(0,100);
        WikiMedia wikiMedia= new WikiMedia(null,message);
        wikiRepository.save(wikiMedia);
        log.warn("<<<< One Record Inserted to Database >>>>");

    }

}
