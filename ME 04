package main.java.com.exemploMe.superpackage;

public class Super {
    public void print(){
        System.out.println("Chamada de superclasse");
    }
}
package main.java.com.exemploMe.superpackage;

public class Sub extends Super {
    @Override
    public void print (){
        System.out.println("Chamada de subClasse");
    }
}
package main.java.com.exemploMe.app;

import main.java.com.exemploMe.superpackage.Sub;
import main.java.com.exemploMe.superpackage.Super;

public class JavaPolimorfismo {

    public static void main(String[] args) {
        Super sup = new Super();
        Sub sub = new Sub();
        Super poli = new Sub();

        sup.print();
        sub.print();
        poli.print();
    }
}
