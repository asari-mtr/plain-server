import java.io.*;
import java.util.Date;

import javax.servlet.*;
import javax.servlet.http.*;

public class Now extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("application/json; charset=UTF-8");

        PrintWriter out = response.getWriter();
        Date date = new Date();
        out.println("{date : \"" + date + "\"}");
    }
}
