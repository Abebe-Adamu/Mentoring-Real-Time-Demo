package service;

import java.util.List;



import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.stereotype.Service;
import org.springframework.util.MimeTypeUtils;

import lombok.extern.slf4j.Slf4j;
import model.Menu;
import stream.MenuStream;


@Service
@Slf4j

public class MenuService {
    private final MenuStream menuStream;

    public MenuService(MenuStream menuStream) {
        this.menuStream = menuStream;
    }

    public void sendMenu(final Menu menu) {
        log.info("***MenuService outboundMen*** {}", menu);

        MessageChannel messageChannel = menuStream.outboundMenu();
        messageChannel.send(MessageBuilder
                .withPayload(menu)
                .setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON)
                .build());
    }
    public void sendMenuList(List<Menu> menu) {
    	 
        log.info("***Sending menu List ***{}", menu);

        MessageChannel messageChannel = menuStream.outboundMenu();
        
        messageChannel.send(MessageBuilder
                .withPayload(menu)
                .setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON)
                .build());
    }
}

