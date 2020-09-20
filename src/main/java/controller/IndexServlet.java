package controller;

import model.Burger;
import model.DaoFactory;
import model.Soda;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "IndexServlet", urlPatterns = "")
public class IndexServlet extends HttpServlet {
    // we want to display our 'home page' using this servlet, when someone loads
    //  'http://localhost:8080/'


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // This will be the page we access when we hit 'http://localhost:8080/ - without any URL patterns to recognize

        // Get all of the existing burgers, and list them here with links to their individual profile pages
        List<Burger> allBurgers = new ArrayList<>();
        allBurgers.add(DaoFactory.getBurgersDao().findById(1L));
        allBurgers.add(DaoFactory.getBurgersDao().findById(2L));
        allBurgers.add(DaoFactory.getBurgersDao().findById(3L));

        // Get all of the existing sodas, and list them here
        List<Soda> allSodas = new ArrayList<>();
        allSodas. add(DaoFactory.getSodasDao().findById(1L));
        allSodas. add(DaoFactory.getSodasDao().findById(2L));
        allSodas. add(DaoFactory.getSodasDao().findById(3L));

        // sending our List<Burger> allBurgers as the attribute "allBurgers"
        req.setAttribute("allBurgers", allBurgers);
        req.setAttribute("allSodas", allSodas);


        req.getRequestDispatcher("/index.jsp").forward(req, resp);
        // the path is relative to our 'webapp' folder

    }
}