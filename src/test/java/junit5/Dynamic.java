package junit5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

public class Dynamic {

    @TestFactory
    Collection<DynamicTest> dynamicTestsWithCollection() {
        return Arrays.asList(
                DynamicTest.dynamicTest("Add test", () -> assertEquals(2, Math.addExact(1, 1))),
                DynamicTest.dynamicTest("Multiply test", () -> assertEquals(4, Math.multiplyExact(2, 2))));
    }

    @TestFactory
    Iterable<DynamicTest> dynamicTestsWithIterable() {
        return Arrays.asList(
                DynamicTest.dynamicTest("Add test",
                        () -> assertEquals(2, Math.addExact(1, 1))),
                DynamicTest.dynamicTest("Multiply Test",
                        () -> assertEquals(4, Math.multiplyExact(2, 2))));
    }

    @TestFactory
    Iterator<DynamicTest> dynamicTestsWithIterator() {
        return Arrays.asList(
                DynamicTest.dynamicTest("Add test",
                        () -> assertEquals(2, Math.addExact(1, 1))),
                DynamicTest.dynamicTest("Multiply Test",
                        () -> assertEquals(4, Math.multiplyExact(2, 2))))
                     .iterator();
    }

    @TestFactory
    Stream<DynamicTest> dynamicTestsFromIntStream() {
        return IntStream.iterate(0, n -> n + 2).limit(10)
                        .mapToObj(n -> DynamicTest.dynamicTest("test" + n,
                                () -> assertEquals(0, n % 2)));
    }
}
