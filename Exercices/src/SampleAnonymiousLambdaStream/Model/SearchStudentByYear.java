package SampleAnonymiousLambdaStream.Model;

import SampleAnonymiousLambdaStream.Interface.ISearchable;

public class SearchStudentByYear implements ISearchable {
    @Override
    public boolean test(Student s) {
        return s.getYear() == 2;
    }
}
