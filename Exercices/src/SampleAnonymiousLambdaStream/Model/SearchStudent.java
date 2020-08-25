package SampleAnonymiousLambdaStream.Model;

import SampleAnonymiousLambdaStream.Interface.ISearchable;

import java.util.ArrayList;
import java.util.List;

public class SearchStudent {
    public static List<Student> Search(List<Student> students, ISearchable s) {
        List<Student> response = new ArrayList<Student>();

        for (Student student : students) {
            if (s.test(student)) {
                response.add(student);
            }
        }

        return response;
    }
}
