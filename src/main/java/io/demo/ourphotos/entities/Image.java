package io.demo.ourphotos.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Image {
    @Id
    private int id;
    private String imageUrl;
    private int postId;
}
