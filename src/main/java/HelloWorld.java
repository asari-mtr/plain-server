import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloWorld extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("application/json; charset=UTF-8");

        PrintWriter out = response.getWriter();
        out.println("{message: \"こんにちは\"}");
    }
}
