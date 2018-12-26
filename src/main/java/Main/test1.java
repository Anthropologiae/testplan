package Main;

import methods.methods;
import org.junit.BeforeClass;
import org.junit.Test;



public class test1  {

public static methods mt = new methods();

    @BeforeClass
    public static void  test () throws InterruptedException {


        mt.start("https://edunavi.online/org/import/");

        mt.click("");

        mt.vait("");

        mt.down();

        mt.open("");



    }





}
