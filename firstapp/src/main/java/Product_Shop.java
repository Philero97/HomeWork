import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;



    @WebServlet

            (name = "Product_Shop", value = "/Product_Shop")
    public  class Product_Shop extends HttpServlet {

public void init() { }

@Override
        public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
            List<Product> products = new ArrayList<>();
            products.add(new Product(1, "Banana", 1));
            products.add(new Product(2, "Book", 14));
            products.add(new Product(3, "Board_game", 35));
            products.add(new Product(4, "Coffee_cup", 3));
            products.add(new Product(5, "Magic_keyboard", 50));
            products.add(new Product(6, "Mouse", 20));
            products.add(new Product(7, "Headphones", 70));
            products.add(new Product(8, "PC", 1350));
            products.add(new Product(9, "Soda", 2));
            products.add(new Product(10, "Wather_gun", 17));

            response.setContentType("text/html");

            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            out.println("<h1>Products</h1>");
            for(Product p : products){
                out.println("<h2>" + p.getTitle() + "</h2>");
                out.println("<p><font size=\"2\" > Id: " + p.getId() + "</font></p>");
                out.println("<p><font size=\"2\" > Cost: " + p.getCost() + "</font></p>");            }
            out.println("</body></html>");

        }

        @Override
        public void destroy() {


        }

    }
