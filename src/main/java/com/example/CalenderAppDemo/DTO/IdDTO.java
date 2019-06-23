package com.example.CalenderAppDemo.DTO;

import java.util.UUID;

public class IdDTO {

    private UUID id;

    public IdDTO (UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
