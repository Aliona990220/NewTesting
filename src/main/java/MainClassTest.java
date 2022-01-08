import org.junit.*;

public class MainClassTest {
//    @BeforeClass
//    public void beforeClassMetod() {
//
//    }
//    @Before
//    public void setUp(){
//
//    }
//    @After
//    public void tearDown(){
//    }

    @Test
    public void metod1(){
        Assert.assertTrue("Value is not equals" ,1 + 1 == 2);

//        Assert.assertFalse(1 + 1 != 2);

    }
    @Test
    public void metod2(){
        Assert.assertFalse("Value is equals" ,1 + 1 == 2);

    }
//    @Test
//    public void metod2(){
//        Assert.assertNull(1 - 1 == 0);
//        Assert.assertNotNull(1 - 2 == 1);

//    }
    @Test
    public void metod3(){
        Assert.assertEquals(20,5 + 5);
//        Assert.assertNotEquals(10, 2 + 2);

    }
    @Test
    public void metod4(){
        Assert.assertNotEquals(20, 5 + 5);
    }

//    @AfterClass
//    public void afterClass(){
//    }
}
