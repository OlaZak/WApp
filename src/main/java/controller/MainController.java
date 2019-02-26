package controller;

import dao.DaoAddress;
import dao.DaoPointOfSale;
import dao.DaoProduct;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class MainController extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {

        String pass = request.getParameter("pass");
        String email = request.getParameter("email");
        String msg = "Pass " + pass + " Email  " + email;
        System.out.println(DaoPointOfSale.getPointByPointId(2));
        System.out.println(DaoProduct.getProdByPointId(1));
        System.out.println(DaoAddress.getAddressById(1));
        request.setAttribute("result point", DaoProduct.getProdByPointId(1));

        request.getRequestDispatcher("result.jsp").forward(request, response);
//        PrintWriter out = response.getWriter();
//        out.println("<html>");
//        out.println("<body>");
//        out.println("<t1>" + msg + "</t1>");
//        out.println("</body>");
//        out.println("</html>");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        System.out.println("Servlet");
        response.encodeRedirectURL("/index.jsp");
    }
}
