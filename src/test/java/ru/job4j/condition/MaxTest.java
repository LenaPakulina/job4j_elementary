package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {
    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax5To3Then5() {
        int left = 5;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1To9Then9() {
        int left = 1;
        int right = 9;
        int result = Max.max(left, right);
        int expected = 9;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax5To5Then5() {
        int left = 5;
        int right = 5;
        int result = Max.max(left, right);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax5And6And7Then7() {
        int first = 5;
        int second = 6;
        int third = 7;
        int result = Max.max(first, second, third);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1And22And7Then22() {
        int first = 1;
        int second = 22;
        int third = 7;
        int result = Max.max(first, second, third);
        int expected = 22;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax9And6And7And8Then9() {
        int first = 9;
        int second = 6;
        int third = 7;
        int fourth = 8;
        int result = Max.max(first, second, third, fourth);
        int expected = 9;
        assertThat(result).isEqualTo(expected);
    }
}
