package nl.jcore.java8demo.defaultmethods;

public interface DefaultMethodExample {
    void demonstrate();

    default void demonstrateDefault() {
        final String assignmentVar = "like any other";
        String.format("A method implementation, %s.", assignmentVar);
    }

    default String demonstrateDefaultB() {
        throw new UnsupportedOperationException();
    }
}

