package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Component;



import stream.MenuStream;
import lombok.extern.slf4j.Slf4j;
import model.Menu;
//import model.Message;

@Component
@Slf4j
public class MenuListener {
	 @Autowired
	 
	    private SimpMessagingTemplate template;
        @StreamListener(target = "menu-out")
	    public void processMessage(Menu pushMessage){
	    	
	        this.template.convertAndSend("/topic/pushNotification", pushMessage);
	    }
        
	
	static Menu m = new Menu();
    @StreamListener(MenuStream.INPUT)
    public void handleMenu(@Payload Menu menu) {
    	m=menu;
        log.info("MenuListener Received menu: {}", menu);
    }
    public static Menu returnStream() { 
		  
		  return m;
	  }
    
}