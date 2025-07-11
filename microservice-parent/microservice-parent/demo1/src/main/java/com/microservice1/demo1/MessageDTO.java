package com.microservice1.demo1;

public class MessageDTO extends MessageFromDemo2DTO{


    private Long createdDate;


    public MessageDTO(Long id, String body) {
        super(id, body);
    }

    public Long getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Long createdDate) {
        this.createdDate = createdDate;
    }
}
