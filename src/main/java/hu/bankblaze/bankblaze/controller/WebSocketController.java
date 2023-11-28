package hu.bankblaze.bankblaze.controller;

import hu.bankblaze.bankblaze.model.Desk;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class WebSocketController {

    @MessageMapping("/queueCalling")
    @SendTo("/topic/app")
    public Desk refreshInfo(Desk desk) {
        return desk;
    }
}
