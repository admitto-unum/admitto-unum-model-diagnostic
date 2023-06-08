package admitto.unum.model.diagnostic.report;

import admitto.unum.model.diagnostic.Name;
import admitto.unum.model.diagnostic.QualifiedName;
import admitto.unum.model.diagnostic.SimpleName;
import admitto.unum.model.diagnostic.util.DiagnosticSwitch;

public class NameToString {
    private static final String delimitor = "/";

    private static DiagnosticSwitch<String> visitor = new DiagnosticSwitch<>() {
        @Override
        public String caseSimpleName(SimpleName name) {
            return name.getIdentifier();
        }

        @Override
        public String caseQualifiedName(QualifiedName name) {
            var qualifier = name.getQualifier();

            if (qualifier != null) {
                return doSwitch(qualifier) + delimitor + doSwitch(name.getName());
            }

            return doSwitch(name.getName());
        }
    };

    public static String report(Name name) {
        return visitor.doSwitch(name);
    }
}
