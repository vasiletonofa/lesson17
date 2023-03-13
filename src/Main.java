import equals.Employee;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Employee ion = new Employee("Programator", 23); // 123
        Employee vasile = new Employee("Contabil", 23); // 456
        Employee gheorghe = new Employee("Contabil", 25); // 456
        Employee gheorghe2 = new Employee("Contabil", 25); // 456
        Employee gheorghe3 = new Employee("Contabil", 23); // 456

        boolean isEqual = ion.equals(vasile); // false

        gheorghe = vasile; // 456

        Set<Employee> set = new HashSet<>();
        set.add(ion);
        set.add(vasile);
        set.add(gheorghe);  // 456 == 456 // nu se va adauaga

        boolean isEq = ion == gheorghe; // 123 == 456 //false
        boolean isEq2 = ion.equals(gheorghe); // true

        ion.equals(ion);

        int y = 2;
        int z = 2;

         boolean v =  z == y; // true

        // 1. Pentru clasele create de noi adaugam mereu equals(), hashCode(), toString()
        // 2. Pentru clasele create de noi folosim doar equals() si nu folosim ==
        // 3. == se foloseste doar la compararea primitivelo ca ex: int, long, float

        boolean isAdded = set.add(gheorghe); // nu se va adauga

        System.out.println(isAdded);

        List<Employee> employees = new ArrayList<>();
        employees.add(ion);
        employees.add(vasile); // SE VA ADAUGA

        System.out.println(vasile); // Contabil

        ion.equals(ion); // true
        ion.equals(vasile); // true => vasile.equals(ion)
        ion.equals(gheorghe); // true => vasile.equals(vasile) ==> gheorhe.eqauls(vasile)
        ion.equals(vasile);
        ion.equals(vasile);
        ion.equals(null); // false

        // Set vs List
        // 1. List pastreaza ordinea de adaugare a elementelor spre deosebire de Set
        // 2. Set nu permite duplicate spre deosebire de List
        // 3. List poate extrage elementele dupa index, spre deosebire de Set
        // 4. Set poate avea elementele sortate, ca de ex la TreeSet, spre deosebire de List

        // HashSet vs TreeSet
        // 1. TreeSet sorteaza elementele la adaugare
        // 2. HashSet folosete Hash (hashCode()) si equals pentru a verifica pozitia si unicitatea
        //     iar TreeSet foloseste Arbore binar si Comparator pentru a verifica unicitatea si a le sorta
        // 3. HashSet e mai rapid la adaugare


//             3                                     1
//                                            2
//                                         3
//                                       4
//                                     5
//                     5            6
//     2           4       6
//                            7
// 1
//
//        1, 2, 3, 4, 5, 6




    }
}