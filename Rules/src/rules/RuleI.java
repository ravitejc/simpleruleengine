package rules;

public interface RuleI<I, O> {
    boolean matches(I input);
    O process(I input);
}
