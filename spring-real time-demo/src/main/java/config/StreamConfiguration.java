package config;


import org.springframework.cloud.stream.annotation.EnableBinding;

import stream.MenuStream;

@EnableBinding(MenuStream.class)
public class StreamConfiguration {

}
