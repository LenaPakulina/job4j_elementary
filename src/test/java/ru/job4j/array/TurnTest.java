package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class TurnTest {
    @Test
    void whenArray12345then54321() {
        int[] data = new int[] {1, 2, 3, 4, 5};
        int[] expected = new int[] {5, 4, 3, 2, 1};
        int[] result = Turn.back(data);
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenArray1234then4321() {
        int[] data = new int[] {1, 2, 3, 4};
        int[] expected = new int[] {4, 3, 2, 1};
        int[] result = Turn.back(data);
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {4, 1, 6, 2};
        int[] result = Turn.back(input);
        int[] expected = new int[] {2, 6, 1, 4};
        assertThat(result).containsExactly(expected);
    }
}