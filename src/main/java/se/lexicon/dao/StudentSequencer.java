package se.lexicon.dao;

public class StudentSequencer {

    private static int studentSequencer;

    public static int nextStudentId() {
        return ++studentSequencer;
    }
    public static int getStudentSequencerId() {
        return studentSequencer;
    }
}
