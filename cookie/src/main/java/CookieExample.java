import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import javax.servlet.*;
import javax.servlet.http.*;

public class CookieExample extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        // Create a new cookie with the name "EMPID" and the value "AN2356"
        Cookie cookie = new Cookie("EMPID", "AN2356");
        // Set the maximum age of the cookie to 60 seconds
        cookie.setMaxAge(60);
        // Add the cookie to the response
        response.addCookie(cookie);
        
        // Read the cookie from the response
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