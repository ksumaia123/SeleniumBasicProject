package stepDef;

import config.BaseClass;
import org.junit.After;
import org.junit.Before;

public class Hooks {
    @Before
    public void initializeTest(){
        BaseClass.setup();
    }
    @After
    public void tearDown(){
        BaseClass.tearDown();
    }
}
