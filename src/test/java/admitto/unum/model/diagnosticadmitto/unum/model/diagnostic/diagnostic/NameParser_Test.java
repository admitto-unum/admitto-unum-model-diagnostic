package admitto.unum.model.diagnosticadmitto.unum.model.diagnostic.diagnostic;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import admitto.unum.model.diagnostic.QualifiedName;
import admitto.unum.model.diagnostic.SimpleName;
import admitto.unum.model.diagnostic.parsers.NameParser;

public class NameParser_Test {
    @DisplayName("Parse single name")
    @Test
    void parseName_identifier_SimpleName() {
        var name = NameParser.parseName("a", "\\.");

        assertThat(name).isNotNull()
            .isInstanceOf(SimpleName.class);

        assertThat(name.isSimpleName()).isTrue();
        assertThat(name.isQualifiedName()).isFalse();
        assertThat(((SimpleName) name).getIdentifier()).isEqualTo("a");
    }

    @DisplayName("Parse qualified name")
    @Test
    void parseName_dotNotation_qualifiedName() {
        var name = NameParser.parseDotNotation("a.b.c.d");

        assertThat(name).isNotNull()
            .isInstanceOf(QualifiedName.class);

        assertThat(name.isSimpleName()).isFalse();
        assertThat(name.isQualifiedName()).isTrue();

        QualifiedName qn = (QualifiedName) name;
        qn = assertNameEqualTo(qn, "d");
        qn = assertNameEqualTo(qn, "c");
        qn = assertNameEqualTo(qn, "b");
        qn = assertNameEqualTo(qn, "a");
        assertThat(qn).isNull();
    }

    private static QualifiedName assertNameEqualTo(QualifiedName qn, String expected) {
        assertThat(qn.getName()
            .getIdentifier()).isEqualTo(expected);
        return qn.getQualifier();
    }
}
