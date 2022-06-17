package Servlet;

import model.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author Ivan Kudryashov
 * @version 1.0
 */

public class ServletPage extends HttpServlet {

    /**
     * address jsp-page
     */
    private final static String list = "/WEB-INF/views/main/index.jsp";

    /**
     * list users
     */
    private List<User> users;

    /**
     * initialization
     */
    @Override
    public void init() {

        users = new CopyOnWriteArrayList<>();

        users.add(new User("Konstantin Kozhevnikov", 1));
        users.add(new User("Ivan Kudryashov", 2));
        users.add(new User("Alexander Mikhin", 3));
        users.add(new User("Annette", 3));
        users.add(new User("Bulygin Konstantin", 4));
        users.add(new User("Daniil Shtranin", 5));
        users.add(new User("Eugene", 6));
        users.add(new User("Maria Semenyuk", 7));
        users.add(new User("Michael", 8));
        users.add(new User("Ramzan Kurbanov", 9));
        users.add(new User("Valeria Bozhko", 10));
        users.add(new User("Yarik Apasny", 11));
        users.add(new User("Даниил Давыденко", 12));
        users.add(new User("Димон", 13));
        users.add(new User("Евгений Юсупов", 14));
        users.add(new User("Егор Паничкин", 15));
        users.add(new User("Илья Макаров", 16));
        users.add(new User("Макаренко Глеб", 17));
        users.add(new User("Мансур Минникаев", 18));
        users.add(new User("Маргарита Зайцева", 19));
        users.add(new User("Ольга Соловьева", 20));

    }

    /**
     * method toGet for GET-REQUEST
     * @param req HttpRequest
     * @param resp HttpResponse
     * @throws ServletException if something goes wrong
     * @throws IOException if something goes wrong
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.setAttribute("users", users);
        req.getRequestDispatcher(list).forward(req, resp);
    }

}
