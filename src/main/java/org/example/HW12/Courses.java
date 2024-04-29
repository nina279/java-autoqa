package org.example.HW12;

import java.util.List;

public interface Courses {
    List<TestingCoursesBlock> getCourses();
    List<TestingCoursesBlock> getAdditionalCourses();
    List<OpportunitiesBlock> getOpportunities();
    void goToCategory(String category);
}
