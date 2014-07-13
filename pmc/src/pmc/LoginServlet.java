package pmc;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
//
//    private void println(HttpServletRequest req) {
//        Enumeration<String> params = req.getParameterNames();
//        while (params.hasMoreElements()) {
//            String param = (String) params.nextElement();
//            System.out.println("param: " + param);
//        }
//    }

    @Override
    protected void service(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/login.html").forward(request, response);
    }
}
