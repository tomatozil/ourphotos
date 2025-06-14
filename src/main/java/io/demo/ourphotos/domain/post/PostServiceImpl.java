package io.demo.ourphotos.domain.post;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class PostServiceImpl implements PostService {
    private final PostReader postReader;
    private final PostStore postStore;

    @Override
    @Transactional
    public PostInfo postPost(PostCommand postCommand) {
        var initPost = postCommand.toEntity();
        Post storedPost = postStore.store(initPost);

        return storedPost.toDomain();
    }

    @Override
    @Transactional(readOnly = true)
    public PostInfo getPostInfo(String postToken) {
        Post targetPost = postReader.getPost(postToken);
        return targetPost.toDomain();
    }
}
