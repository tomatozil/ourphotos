package io.demo.ourphotos.infrastructure.post;

import io.demo.ourphotos.domain.post.Post;
import io.demo.ourphotos.domain.post.PostStore;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class PostStoreImpl implements PostStore {
    private final PostRepository postRepository;

    @Override
    public Post store(Post initPost) {
        return postRepository.save(initPost);
    }
}
