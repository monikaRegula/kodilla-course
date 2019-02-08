package collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {

    @Before
    public void before(){
        System.out.println("Test Collection: begin");
    }

    @After
    public void after(){
        System.out.println("Test Collection : end");
    }

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Test Collection: before");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("Test Collection: after");
    }

    @Test
    public void testOddNumbersExtermiantorEmptyList(){
        //given:
        OddNumbersExterminator oddNumbersExterminator= new OddNumbersExterminator();

        //when:
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> result;
        result = oddNumbersExterminator.exterminate(list);
        System.out.println("Testing "+ result.toString());
        //then:
        //tutaj błąd bo pusta lista tablicowa to po prostu <[]>
       // Assert.assertNull(result);
        //
        Assert.assertEquals(list,result);
    }


    @Test
    public void testOddNumbersExterminatorNormaList(){
        //given:
        OddNumbersExterminator oddNumbersExterminator= new OddNumbersExterminator();

        //when:
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);list.add(5);list.add(6);

        ArrayList<Integer> result;
        result = oddNumbersExterminator.exterminate(list);
        System.out.println("Testing"+ result.toString());
        //then:
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(6);

        //co moge wpisać tutaj zamiast expected jako listy tablicowej ?? [6] to że błąd
       Assert.assertEquals(expected,result);
    }

}
