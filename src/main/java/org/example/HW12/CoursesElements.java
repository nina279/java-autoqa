package org.example.HW12;

import java.util.List;

public interface CoursesElements {
    List<TestingCoursesBlock> getCourses();
    List<TestingCoursesBlock> getAdditionalCourses();
    List<OpportunitiesBlock> getOpportunities();
    void goToCategory(String category);
}
