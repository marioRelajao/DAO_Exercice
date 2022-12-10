package edu.upc.eetac.dsa;

import edu.upc.eetac.dsa.model.Employee;
import edu.upc.eetac.dsa.util.ObjectHelper;
import org.junit.Assert;
import org.junit.Test;

public class ObjectHelperTest {




    @Test
    public void test() {
        Employee e = new Employee("Juan", "lopez", 292922);
        Assert.assertEquals("Juan", ObjectHelper.getter(e, "name"));

        ObjectHelper.setter(e, "name", "Pepito");
        Assert.assertEquals("Pepito", e.getName());
    }
}
