package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class CheckPrimeNumberTest {
    @Test
    void whenCheck1thenTrue() {
        boolean expected = true;
        boolean out = CheckPrimeNumber.check(1);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    void whenCheck11thenTrue() {
        boolean expected = true;
        boolean out = CheckPrimeNumber.check(11);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    void whenCheck10thenFalse() {
        boolean expected = false;
        boolean out = CheckPrimeNumber.check(10);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    void whenCheck5thenTrue() {
        boolean expected = true;
        boolean out = CheckPrimeNumber.check(5);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    void whenCheck4thenFalse() {
        boolean expected = false;
        boolean out = CheckPrimeNumber.check(4);
        assertThat(out).isEqualTo(expected);
    }
}