package admitto.unum.model.diagnosticadmitto.unum.model.diagnostic.diagnostic;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.IntStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import admitto.unum.model.diagnostic.DiagnosticFactory;
import admitto.unum.model.diagnostic.Posting;
import admitto.unum.model.diagnostic.Whiteboard;
import admitto.unum.model.diagnostic.parsers.NameParser;

public class Whiteboard_Test {
    private final DiagnosticFactory factory = DiagnosticFactory.eINSTANCE;

    private Whiteboard whiteboard;


    @BeforeEach
    void setupWhiteboard() {
        whiteboard = factory.createWhiteboard();

    }

    @Test
    void addPost() {
        var post = factory.createPosting();
        post.setName(NameParser.parseDotNotation("A.B.C"));
        post.setValue("Testing posting");

        IntStream.rangeClosed(1, 5)
            .forEach($ -> whiteboard.getPostings()
                .add(createPost("A.B." + $, "Test post " + $)));

        assertThat(whiteboard.getPostings()).hasSize(5);

        var firstPost = whiteboard.getPostings()
            .get(0);

        assertThat(firstPost.getName()
            .isQualifiedName()).isTrue();
    }


    Posting createPost(String name, String data) {
        var post = factory.createPosting();
        post.setName(NameParser.parseDotNotation(name));
        post.setValue(data);
        return post;
    }
}
