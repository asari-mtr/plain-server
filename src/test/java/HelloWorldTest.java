import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloWorldTest {

    @Test public void helloWorld() {
        String s = "Hello";

        assertThat(s, is("Hello"));
        assertThat(5, is(s.length()));
    }

}
