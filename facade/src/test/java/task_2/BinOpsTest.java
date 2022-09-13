package task_2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class BinOpsTest {
    private final BinOps binOps = new BinOps();

    @Test
    void whenSum() {
        assertThat(binOps.sum("10000", "111")).isEqualTo("10111");
    }

    @Test
    void whenMultiply() {
        assertThat(binOps.mult("10000", "111")).isEqualTo("1110000");
    }
}