package SampleAnonymiousLambdaStream;

import SampleAnonymiousLambdaStream.Interface.ISearchable;
import SampleAnonymiousLambdaStream.Model.*;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Doe", "John", 2));
        students.add(new Student("Doe", "Jane", 1));
        students.add(new Student("Smith", "John", 3));
        students.add(new Student("Smith", "Sam", 1));
        students.add(new Student("Sheeran", "Ed", 2));
        students.add(new Student("Molko", "Bryan", 3));
        students.add(new Student("Partoutatis", "Asterix", 3));
        students.add(new Student("LaGrandeMereLeRetour", "Yvonne", 2));

        for (Student student : students) {
            if (student.getYear() == 2) {
                System.out.println(student);
            }
        }
        System.out.println("----------------------------");

        for (Student student : students) {
            if (SearchStudentByName.search(student, "Sheeran")) {
                System.out.println(student);
            }
        }
        System.out.println("---------------------------- chaque classe implemente test");

        SearchStudentByFirstname sFN = new SearchStudentByFirstname();
        SearchStudentByYear sY = new SearchStudentByYear();

        for (Student student : students) {
            if (sFN.test(student)) {
                System.out.println(student.getNom() + ' ' + student.getPrenom());
            }
            if (sY.test(student)) {
                System.out.println(student.getNom() + ' ' + student.getPrenom());
            }
        }

        System.out.println("----------------------------- via classe anonyme ");
        ISearchable searchByYear = new ISearchable() {
            @Override
            public boolean test(Student value) {
                return value.getYear() == 2;
            }
        };
        ISearchable searchByFirstName = new ISearchable() {
            @Override
            public boolean test(Student value) {
                return value.getNom().equals("Doe");
            }
        };

        for (Student student : students) {
            if (searchByYear.test(student)) {
                System.out.println(student.getNom() + ' ' + student.getPrenom());
            }
            if (searchByFirstName.test(student)) {
                System.out.println(student.getNom() + ' ' + student.getPrenom());
            }
        }

        System.out.println("--------------------------------------------- via classe anonyme searchstudent");

        List<Student> result = SearchStudent.Search(students, searchByFirstName);
        result = SearchStudent.Search(result, searchByYear);

        for (Student student : result) {
            System.out.println(student.getNom() + ' ' + student.getPrenom());
        }

        searchByYear = s -> s.getYear() == 3 ; // expression lambda
        searchByFirstName = s -> s.getNom().equals( "Smith" ) ;

        result = SearchStudent.Search(students, searchByFirstName);
        result = SearchStudent.Search(result, searchByYear);

        for (Student student : result) {
            System.out.println(student.getNom() + ' ' + student.getPrenom());
        }

        System.out.println("--------------------------------------------- via Stream");
        students.stream().forEach(s -> System.out.println(s));
        System.out.println("--");
        students.stream().filter(s -> s.getNom().equals("Partoutatis")).forEach(s -> System.out.println(s));
        System.out.println("---");
        students.stream().filter(s -> s.getYear() == 2).map(s -> s.getPrenom() + ' ' +  s.getPrenom() ).forEach(s -> System.out.println(s));

        System.out.println("---");
        System.out.println(students.stream().map(s -> s.getYear()).reduce((x, y) -> x+y));

        Optional<Integer> sum = students.stream().map(s -> s.getYear()).reduce((x, y) -> x+y);

        if (sum.isPresent())
            System.out.println(sum.get());
        else
            System.out.println("pas possible");
        System.out.println(sum.orElse(0));

        System.out.println("---");
        System.out.println(students.stream().count());

        System.out.println("---");
        System.out.println(students.stream().filter(s -> s.getPrenom().startsWith("J")).count());

        System.out.println("---");
        List<Student> listTest = students.stream().filter(s -> s.getYear() != 2).collect(Collectors.toList());
        listTest.forEach(s -> System.out.println(s));




    }

}
