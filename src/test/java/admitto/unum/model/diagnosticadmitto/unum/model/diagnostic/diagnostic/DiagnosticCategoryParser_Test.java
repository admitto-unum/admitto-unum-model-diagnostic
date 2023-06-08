package admitto.unum.model.diagnosticadmitto.unum.model.diagnostic.diagnostic;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import admitto.unum.model.diagnostic.DiagnosticFactory;
import admitto.unum.model.diagnostic.QualifiedName;
import admitto.unum.model.diagnostic.parsers.DiagnosticCategoryParser;

public class DiagnosticCategoryParser_Test {

    private DiagnosticFactory factory = DiagnosticFactory.eINSTANCE;

    @Test
    void parse_inferenceText_diagosticCategory() {
        // A => B : C.D
        var testModel = createName("D", createName("C", createName("B", createName("A", null))));

        var category = DiagnosticCategoryParser.parseDiagnostics(testModel);

        assertThat(category.getConditionName()
            .getIdentifier()).isEqualTo("A");

        assertThat(category.getCategoryName()
            .getIdentifier()).isEqualTo("B");

        var specificity = category.getSpecificity();

        assertThat(specificity.getName()
            .getIdentifier()).isEqualTo("C");
        assertThat(specificity.getQualifiednameeOpposite()
            .getName()
            .getIdentifier()).isEqualTo("D");
    }

    private QualifiedName createName(String identifier, QualifiedName parent) {
        var qn = factory.createQualifiedName();
        qn.setQualifier(parent);

        var sn = factory.createSimpleName();
        sn.setIdentifier(identifier);

        qn.setName(sn);

        return qn;
    }
}
