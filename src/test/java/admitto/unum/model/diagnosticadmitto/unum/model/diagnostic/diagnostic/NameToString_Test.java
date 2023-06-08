package admitto.unum.model.diagnosticadmitto.unum.model.diagnostic.diagnostic;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import admitto.unum.model.diagnostic.DiagnosticFactory;
import admitto.unum.model.diagnostic.QualifiedName;
import admitto.unum.model.diagnostic.report.NameToString;

public class NameToString_Test {
    private DiagnosticFactory factory = DiagnosticFactory.eINSTANCE;

    @Test
    void report_simpleName_identifier() {
        var testModel = factory.createSimpleName();
        testModel.setIdentifier("TestModel");

        var report = NameToString.report(testModel);

        assertThat(report).isEqualTo("TestModel");
    }

    @Test
    void report_qualifiedName_dotNotation() {
        var testModel = createName("C", createName("B", createName("A", null)));

        var report = NameToString.report(testModel);

        assertThat(report).isEqualTo("A/B/C");
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
