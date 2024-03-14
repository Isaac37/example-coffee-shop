package com.isaac.example.coffee;

import java.time.Instant;
import java.util.UUID;

import jakarta.json.bind.annotation.JsonbProperty;
import jakarta.json.bind.annotation.JsonbTransient;

public class CoffeeOrder {
    @JsonbTransient
    private UUID uuid;
    @JsonbProperty("createdOn")
    private Instant created;
    private CoffeeType type;

    public CoffeeOrder() {
        this.uuid = UUID.randomUUID();
        this.created = Instant.now();
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public Instant getCreated() {
        return created;
    }

    public void setCreated(Instant created) {
        this.created = created;
    }

    public CoffeeType getType() {
        return type;
    }

    public void setType(CoffeeType type) {
        this.type = type;
    }
}
