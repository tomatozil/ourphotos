package io.demo.ourphotos.infrastructure.post;

import io.demo.ourphotos.domain.post.Post;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
    Optional<Post> getPostByPostToken(String postToken);
}
