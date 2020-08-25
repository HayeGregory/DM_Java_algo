package SampleAnonymiousLambdaStream.Model;

import SampleAnonymiousLambdaStream.Interface.ISearchable;

public class SearchStudentByFirstname implements ISearchable {
    @Override
    public boolean test(Student s) {
        return s.getPrenom().equals("John");
    }
}
