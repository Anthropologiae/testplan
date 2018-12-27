package Main;

import methods.methods;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.testng.annotations.AfterTest;


public class First extends methods{



    public static methods ms = new methods();




    @Test
    public void testplan1  () throws InterruptedException  {

        ms.start("https://edunavi.online/");

        ms.scroll("//h2[@class='heading heading--big-font'][contains(.,'Спецпроект')]");

        ms.down();


    }

    @Test
    public void testplan2  () throws InterruptedException {
        ms.start("https://edunavi.online/");

        ms.scroll("//h2[@class='heading heading--big-font'][contains(.,'Спецпроект')]");

        ms.down();

    }

    @AfterTest
    public void end () throws InterruptedException
    {

        ms.down();

    }







}

