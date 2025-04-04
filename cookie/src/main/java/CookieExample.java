import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import javax.servlet.*;
import javax.servlet.http.*;
public class CookieExample extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        Cookie cookie = new Cookie("EMPID", "AN2356");
        cookie.setMaxAge(60);
        response.addCookie(cookie);
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("EMPID")) {
                    System.out.println("Cookie Name: " + c.getName());
                    System.out.println("Cookie Value: " + c.getValue());
                }
            }
        }
    }
}
