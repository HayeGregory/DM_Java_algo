package SampleAnonymiousLambdaStream.Interface;

import SampleAnonymiousLambdaStream.Model.Student;

@FunctionalInterface
public interface ISearchable {
    boolean test(Student value);
}
