package dao;

import dao.SelectionSortStrategy;
import dao.ISortStrategy;
import model.Student;

public class StudentList {
    private final int MAX = 100;
    private Student[] students;
    private int count;
    private ISortStrategy sortStrategy;

    public StudentList() {
        this.count = 0;
        this.students = new Student[MAX];
        sortStrategy = new SelectionSortStrategy();
    }

    public StudentList(Student[] students, int count, ISortStrategy sortStrategy) {
        this.students = students;
        this.count = count;
        this.sortStrategy = sortStrategy;
    }

    public void addStudent(Student student) {

    }

    public Student removeStudent(int code) {

        return null;
    }

    public void display() {

    }

    public void sort() {

    }

    public void setSortStrategy(ISortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }
}
