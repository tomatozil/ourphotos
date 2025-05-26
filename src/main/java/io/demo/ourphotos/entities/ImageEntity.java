package io.demo.ourphotos.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
public class ImageEntity {
    @Id
    private int id;
    private String imageUrl;
    private int postId;
}
