package me.droized.atlastest.messages;

import lombok.Data;

@Data
public class ResponseMessage {

    private String msg;

    public ResponseMessage(String msg) {
        this.msg = msg;
    }
}
