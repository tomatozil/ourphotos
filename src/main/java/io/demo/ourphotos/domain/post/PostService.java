package io.demo.ourphotos.domain.post;

/* 포스트과 관련된 비즈니스 로직 정의 */
public interface PostService {
    PostInfo postPost(PostCommand postCommand);
    PostInfo getPostInfo(String postToken);
}
