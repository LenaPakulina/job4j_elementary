package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {
    @Test
    void when00to20then2() {
        double expected = 2;
        Point first = new Point(0, 0);
        Point second = new Point(2, 0);
        double out = first.distance(second);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when00to22then2dot82() {
        double expected = 2.82;
        Point first = new Point(0, 0);
        Point second = new Point(2, 2);
        double out = first.distance(second);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when00to00then0() {
        double expected = 0;
        Point first = new Point(0, 0);
        Point second = new Point(0, 0);
        double out = first.distance(second);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenM10M10toM100then10() {
        double expected = 10;
        Point first = new Point(-10, -10);
        Point second = new Point(-10, 0);
        double out = first.distance(second);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when442to159then7dot68() {
        double expected = 7.68;
        Point first = new Point(4, 4, 2);
        Point second = new Point(1, 5, 9);
        double out = first.distance3d(second);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when442to402then4() {
        double expected = 4;
        Point first = new Point(4, 4, 2);
        Point second = new Point(4, 0, 2);
        double out = first.distance3d(second);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
}