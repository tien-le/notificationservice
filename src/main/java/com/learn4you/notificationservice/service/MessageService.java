package com.learn4you.notificationservice.service;

import com.learn4you.notificationservice.model.MessageDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private EmailService emailService;

    @KafkaListener(id="notification-group", topics="notification")
    public void listen(MessageDTO messageDTO) {
        logger.info("Received Message from Kafka: " + messageDTO.toString());
        emailService.sendEmail(messageDTO);
    }
}