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
      res.setContentType("text/html");
      PrintWriter out = res.getWriter();
      String[] dizionario =
  		{
  			"Sinonimi: ampio,consistente,ingente. Contrari: esiguo,insufficente,irrisorio.",
  			"Sinonimi: babbione,babbuasso,balordo. Contrari: acuto,furbo,intelligente.",
  			"Sinonimi: buzzurro,bifolco,campagnolo. Contrari: galantuomo,persona per bene,signore.",
  			"Sinoimi: ossequente,rispettoso (di),disciplinato. Contrari: disobediente,ribelle,indomito.",
  			"Sinoimi: mancante,privo,vuoto. Contrari: carico,pieno,colmo",
  		};
      switch(req.getParameter("cerca")){
        case "abbondante":
          out.println("<p>" + dizionario[0] + "</p>");
          break;
        case "babbeo":
          out.println("<p>" + dizionario[1] + "</p>");
          break;
        case "cafone":
          out.println("<p>" + dizionario[2] + "</p>");
          break;
        case "ubbidiente":
          out.println("<p>" + dizionario[3] + "</p>");
          break;
        case "vacuo":
          out.println("<p>" + dizionario[4] + "</p>");
          break;
      }
    }
}
