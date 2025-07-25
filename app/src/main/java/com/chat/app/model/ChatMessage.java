package com.chat.app.model;

import lombok.Data;
import lombok.NoArgsConstructor;

//model or structure of the message
@Data
@NoArgsConstructor
public class ChatMessage {
    Long id;
    private String sender;
    private String content;
}
