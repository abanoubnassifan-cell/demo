@Test
public void testCalculateGrade() {
    Student student = new Student("Ahmed", 82.0);
    String grade = student.calculateGrade();

    assertEquals("B", grade, "Grade should be B");
}
