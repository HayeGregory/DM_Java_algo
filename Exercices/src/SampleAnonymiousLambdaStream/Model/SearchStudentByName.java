package SampleAnonymiousLambdaStream.Model;

public class SearchStudentByName {
    public static boolean search(Student s, String name) {

        return s.getNom().equals(name);
    }
}
