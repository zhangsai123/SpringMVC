import org.junit.Test;

//@RunWith(SpringJUnit4ClassRunner.class)
public class TestDemo {

    /**
     * 字符转ASCII码值
     */
    @Test
    public void ChartoASCII(){
        char char7 = '9';
        int num7 =(int)char7;
        System.out.println(num7);
    }

    /**
     * ASCII码转为字符
     */
    @Test
    public void ASCIItoChar(){
        int number = 57;
        char char8 = (char)number;
        System.out.println(char8);
    }
}
