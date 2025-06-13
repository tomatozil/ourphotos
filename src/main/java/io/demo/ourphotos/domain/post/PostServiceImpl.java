package io.demo.ourphotos.domain.post;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PostServiceImpl implements PostService {
    private final PostReader postReader;
    private final PostStore postStore;

    @Override
    public PostInfo postPost(PostCommand postCommand) {
        var initPost = postCommand.toEntity();
        Post storedPost = postStore.store(initPost);

        return storedPost.toDomain();
    }

    @Override
    public PostInfo getPostInfo(String postToken) {
        Post targetPost = postReader.getPost(postToken);
        return targetPost.toDomain();
    }
}
