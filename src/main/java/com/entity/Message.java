package com.entity;

import java.util.Date;
import java.util.Objects;
import java.util.Random;

public class Message {

    private final Long id;
    private final String text;
    private final Date time;
    private Double lattitude;
    private Double longitude;

    public Message(String text, Date time, Double lattitude, Double longitude) {
        Random random = new Random();
        this.id = random.nextLong();
        this.text = text;
        this.time = time;
        this.lattitude = lattitude;
        this.longitude = longitude;
    }

    public Long getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public Date getTime() {
        return time;
    }

    public Double getLattitude() {
        return lattitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Message)) return false;
        Message message = (Message) o;
        return Objects.equals(id, message.id) &&
                Objects.equals(text, message.text) &&
                Objects.equals(time, message.time) &&
                Objects.equals(lattitude, message.lattitude) &&
                Objects.equals(longitude, message.longitude);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, text, time, lattitude, longitude);
    }
}
