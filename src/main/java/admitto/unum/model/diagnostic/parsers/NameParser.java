package admitto.unum.model.diagnostic.parsers;

import java.util.Collections;
import java.util.StringTokenizer;

import admitto.unum.model.diagnostic.DiagnosticFactory;
import admitto.unum.model.diagnostic.Name;
import admitto.unum.model.diagnostic.QualifiedName;
import admitto.unum.model.diagnostic.SimpleName;
import io.vavr.collection.List;

public class NameParser {

    private static final DiagnosticFactory factory = DiagnosticFactory.eINSTANCE;

    /**
     * Parse a string containing name tokens possibly delimited by a dot (.).
     *
     * @param source Source containing identifier or a list of identifiers separated by a dot.
     * @return New {@link Name} instance.
     */
    public static Name parseDotNotation(final String source) {
        return parseName(source, "\\.");
    }

    /**
     * Parse a string containing name tokens into a {@link Name} model.
     *
     * @param source String to scan for names
     * @param delimitor Token used to delimit names
     * @return New {@link Name} instance.
     */
    public static Name parseName(final String source, final String delimitor) {
        if (source == null || source.isBlank()) {
            throw new IllegalArgumentException("source must contain a simple or qualified name");
        }

        var tokens = Collections.list(new StringTokenizer(source, delimitor))
            .stream()
            .map(token -> (String) token)
            .collect(List.collector());

        if (tokens.size() > 1) {
            return createQualifiedName(tokens);
        }

        return createSimpleName(tokens);
    }

    private static SimpleName createSimpleName(final List<String> tokens) {
        if (tokens.isEmpty()) {
            return null;
        }

        var simpleName = factory.createSimpleName();
        simpleName.setIdentifier(tokens.last());
        return simpleName;
    }

    /**
     * @param tokens
     * @return
     */
    private static QualifiedName createQualifiedName(final List<String> tokens) {
        if (tokens.isEmpty()) {
            return null;
        }

        var qn = factory.createQualifiedName();
        qn.setName(createSimpleName(tokens));
        qn.setQualifier(createQualifiedName(tokens.init()));

        return qn;
    }
}
