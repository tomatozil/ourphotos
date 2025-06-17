package io.demo.ourphotos.infrastructure.post;

import io.demo.ourphotos.common.exception.BusinessException;
import io.demo.ourphotos.common.response.ErrorCode;
import io.demo.ourphotos.domain.post.Post;
import io.demo.ourphotos.domain.post.PostReader;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class PostReaderImpl implements PostReader {
    private final PostRepository postRepository;

    @Override
    public Post getPost(String postToken) {
        return postRepository.getPostByPostToken(postToken)
                .orElseThrow(() -> new BusinessException(ErrorCode.POST_NOT_FOUND));
    }
}
