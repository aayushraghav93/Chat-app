package com.chat.app.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;
@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/chat")//server ka endpoint
                .setAllowedOrigins("http://localhost:8080")//client or frontend ka
                .withSockJS();//to add compatability for websocket
    }

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        //set message broker
        //expect message when
        registry.enableSimpleBroker("/topic");//handling msg for topic
        registry.setApplicationDestinationPrefixes("/app");//server will process with app

    }
}
