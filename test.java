package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {

    @Test
    public void testCalculateGrade() {
        Student student = new Student("Ahmed", 82.0);
        String grade = student.calculateGrade();

        assertEquals("B", grade);
    }
}
