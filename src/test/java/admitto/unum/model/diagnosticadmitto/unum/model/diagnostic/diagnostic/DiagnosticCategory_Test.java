package admitto.unum.model.diagnosticadmitto.unum.model.diagnostic.diagnostic;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import admitto.unum.model.diagnostic.DiagnosticCategory;
import admitto.unum.model.diagnostic.DiagnosticFactory;
import admitto.unum.model.diagnostic.QualifiedName;

public class DiagnosticCategory_Test {
    private DiagnosticFactory factory = DiagnosticFactory.eINSTANCE;

    @Test
    void init() {
        // A => B : C.D
        var testModel = createName("D", createName("C", createName("B", createName("A", null))));

        DiagnosticCategory dc = factory.createDiagnosticCategory();
        dc.setConditionName(testModel.getQualifier()
            .getQualifier()
            .getQualifier()
            .getName());
        dc.setCategoryName(testModel.getQualifier()
            .getQualifier()
            .getName());
        dc.setSpecificity(testModel.getQualifier());

        assertThat(dc.getConditionName()
            .getIdentifier()).isEqualTo("A");

        assertThat(dc.getCategoryName()
            .getIdentifier()).isEqualTo("B");

        assertThat(dc.getSpecificity()
            .getName()
            .getIdentifier()).isEqualTo("C");
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
