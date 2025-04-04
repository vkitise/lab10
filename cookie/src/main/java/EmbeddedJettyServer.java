import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
public class EmbeddedJettyServer {
    public static void main(String[] args) throws Exception {
        Server server = new Server(8080);
        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.setContextPath("/");
        context.addServlet(new ServletHolder(new CookieExample()), "/cookie");
        server.setHandler(context);
        System.out.println("Server starting on http://localhost:8080/cookie");
        server.start();
        server.join();
    }
}
