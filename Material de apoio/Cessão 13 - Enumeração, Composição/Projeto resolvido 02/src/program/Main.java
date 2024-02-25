package program;

import java.time.LocalDateTime;

import entities.Comment;
import entities.Post;

public class Main {
    public static void main(String[] args) {
        Post post = new Post(
            LocalDateTime.now(), 
            "Treveling to New Zeland", 
            "I am going to visit this wonderful country!", 
            12
        );

        post.addComment(new Comment("Have a nice trip"));

        post.addComment(new Comment("Wow that is awesome!"));

        System.out.println(post.toString());

    }
}
