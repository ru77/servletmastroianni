package app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class App extends HttpServlet{
    /**
     *
     */
    private static final long serialVersionUID = -3967314453512919811L;

    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java 1");
    }

    private String mymsg;
    public void init() throws ServletException 
    {      
       mymsg = "Http Servlet Demo";   
    }

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
        // Setting up the content type of web page      
        res.setContentType("text/html");
        // Writing the message on the web page      
        PrintWriter out = res.getWriter();      
        out.println("<h1>" + mymsg + "</h1>");      
        out.println("<p>" + "Hello Friends!" + "</p>");
    }

}