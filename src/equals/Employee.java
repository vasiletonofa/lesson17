package equals;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.Objects;

public class Employee extends Object {

    int varsta = 23;

    int salariu;

    Date date = new Date();

    String profesie = "Programator";

    public Employee(String profesie, int varsta) {
        this.profesie = profesie;
        this.varsta = varsta;
    }

    @Override
    public boolean equals(Object vasile) {
        if(vasile == null) return false;
        if( !(vasile instanceof Employee) ) return false;
        Employee employee = (Employee) vasile;
        return this.profesie.equals(employee.profesie) && this.varsta == employee.varsta;
    }

    @Override
    public int hashCode() {
        return varsta;
    }

    @Override
    public String toString() {
        return profesie;
    }
}
