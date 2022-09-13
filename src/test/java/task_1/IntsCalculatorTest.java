package task_1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class IntsCalculatorTest {
    private final Ints calc = new IntsCalculator();

    @Test
    public void whenPositiveAndSum() {
       assertThat(calc.sum(3, 4)).isEqualTo(7);
    }

    @Test
    public void whenPositiveAndPow() {
        assertThat(calc.pow(2, 3)).isEqualTo(8);
    }

    @Test
    public void whenPositiveAndMultiply() {
        assertThat(calc.mult(2, 3)).isEqualTo(6);
    }

    @Test
    public void whenNegativeAndSum() {
        assertThat(calc.sum(-2, -3)).isEqualTo(-5);
    }

    @Test
    public void whenNegativeAndPow() {
        assertThat(calc.pow(-2, 3)).isEqualTo(-8);
    }

    @Test
    public void whenNegativeAndMultiply() {
        assertThat(calc.mult(-2, -3)).isEqualTo(6);
    }
}