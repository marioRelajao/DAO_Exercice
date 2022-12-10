package edu.upc.eetac.dsa;

import edu.upc.eetac.dsa.model.Employee;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ORMTest {




    @Before
    public void setUp() { //Eliminar cosas si existen y dejarla limpia
        ///Hay que setear la BBDD
        Session s = FactorySession.openSession();
        s.clean();
    }

    @After
    public void tearDown() {

    }

    @Test
    public void test1() {
        Employee e = new Employee("Juan", "DE los palotes", 20202);

        Session s = FactorySession.openSession();
        s.save(e);
    }
}
