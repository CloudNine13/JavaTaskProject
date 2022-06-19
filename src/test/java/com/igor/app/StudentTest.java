package com.igor.app;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class StudentTest {

    private Student student;

    @BeforeEach
    void setUp()  { student = new Student(3, "String", 6.5); }

    @Test
    @DisplayName("Testing getID method")
    void getID() {
        int id = student.getID();

        assertThat(id).isInstanceOf(Integer.class);
        assertEquals(3, id);
    }

    @Test
    @DisplayName("Testing getName method")
    void getName() {
        String name = student.getName();

        assertNotNull(name);
        assertThat(name).isInstanceOf(String.class);
        assertEquals("String", name);
    }

    @Test
    @DisplayName("Testing getCGPA method")
    void getCGPA() {
        double cgpa = student.getCGPA();

        assertThat(cgpa).isInstanceOf(Double.class);
        assertEquals(6.5, cgpa);
    }

    @AfterEach
    void done() { this.student = null; }
}