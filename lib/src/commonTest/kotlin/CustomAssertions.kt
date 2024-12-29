import kotlin.test.fail

fun assertStringMatchesAny(actual: String, vararg expected: String) {
    if (actual !in expected) {
        fail("Expected <$actual> to match one of ${expected.joinToString(", ")}, but it did not.")
    }
}
