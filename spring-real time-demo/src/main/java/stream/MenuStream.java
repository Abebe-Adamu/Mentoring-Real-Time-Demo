package stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;
import constants.Constants;

public interface MenuStream {
	String INPUT = Constants.inputTopic;
    String OUTPUT = Constants.outputTopic;

    @Input(INPUT)
    SubscribableChannel inboundMenu();

    @Output(OUTPUT)
    MessageChannel outboundMenu();	

}
