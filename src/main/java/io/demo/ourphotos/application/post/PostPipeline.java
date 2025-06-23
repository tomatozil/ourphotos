package io.demo.ourphotos.application.post;


import io.demo.ourphotos.domain.post.PostCommand;
import io.demo.ourphotos.domain.post.PostInfo;
import io.demo.ourphotos.domain.post.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PostPipeline {
    private final PostService postService;

    public PostInfo postPost(PostCommand command) {
        var postInfo = postService.postPost(command);

        // postInfo 의 author가 속한 group의 모든 멤버에게 알림을 보낸다

        return postInfo;
    }

}
