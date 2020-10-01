#include <iostream>
#include <string>
using namespace std;

struct course {
  string department;
  int coursenNmuber;
  string title;
};


int numCoursesInDepartment(course courseArray[], int numCourses, string department)
{
  int departmentCourses = 0;
  for (int i = 0; i < numCourses; i++) {
    if (courseArray[i].department == department) {
      departmentCourses += 1;
    }
  }

  return departmentCourses;
}

int main()
{
  
  int courses_count = 10;
  course courses[courses_count] = {
    {"PHYS", 1400, "Quantum Mechanics I"},
    {"PHYS", 1406, "Quantum Mechanics II"},
    {"PHYS", 1406, "Lasers & Spectroscopy"},
    {"COMP", 1406, "Introduction to Computer Science I"},
    {"COMP", 1406, "Introduction to Computer Science II"},
    {"FME", 1406, "Complex Analysis"},
    {"CIV", 1406, "Construnction Practice"},
    {"BIOC", 1406, "Physics and applied Physics"},
    {"MATH", 1406, "Organic Chemistry"},
    {"MECE", 1406, "Engineering Hydraulics I"}
  };
  
  string department = "PHYS";  
  cout << "The " << department << " department has " << numCoursesInDepartment(courses, courses_count, department) << " courses";
}
