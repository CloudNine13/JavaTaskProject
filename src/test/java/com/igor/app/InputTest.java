package com.igor.app;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class InputTest {

    List<String> input;

    @BeforeEach
    void setUp() {
        input = Input.getInput();
    }

    @Test
    @DisplayName("Testing getInput method")
    void getInput() {
        assertThat(input).isInstanceOf(List.class).contains("SERVED");
        assertThat(input.get(0)).doesNotContain("SERVED").doesNotContain("ENTER");
    }

    @AfterEach
    void tearDown() {
        input = null;
    }
}