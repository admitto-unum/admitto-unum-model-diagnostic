package admitto.unum.model.diagnostic.parsers;


import admitto.unum.model.diagnostic.DiagnosticCategory;
import admitto.unum.model.diagnostic.DiagnosticFactory;
import admitto.unum.model.diagnostic.Name;
import admitto.unum.model.diagnostic.QualifiedName;

public class DiagnosticCategoryParser {
    private static DiagnosticFactory factory = DiagnosticFactory.eINSTANCE;

    public static DiagnosticCategory parseDiagnostics(final Name name) {
        if (name instanceof QualifiedName qn) {
            var category = factory.createDiagnosticCategory();
            var categoryName = findCondition(qn);
            var conditionName = findCategory(categoryName);

            category.setConditionName(categoryName.getName());
            category.setCategoryName(conditionName.getName());
            category.setSpecificity(findSpecificity(conditionName));
            return category;
        }

        return null;
    }

    private static QualifiedName findCondition(final QualifiedName name) {
        if (name.getQualifier() != null) {
            return findCondition(name.getQualifier());
        }
        return name;
    }

    private static QualifiedName findCategory(final QualifiedName name) {
        return name.getQualifiednameeOpposite();
    }

    private static QualifiedName findSpecificity(final QualifiedName name) {
        return name.getQualifiednameeOpposite();
    }

}
