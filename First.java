package my;

import java.io.IOException;
import java.io.PrintWriter;
import static javafx.scene.paint.Color.color;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class First implements Servlet
{
 
    ServletConfig config=null;
    
    public void init(ServletConfig config)
    {
        this.config=config;
        System.out.println("Servlet Is Intialized..");
    }
    
    public void service(ServletRequest req,ServletResponse res)throws IOException,ServletException
    {
        res.setContentType("text/html");
        
        PrintWriter pw = res.getWriter();
        
        pw.print("<html><body>");
        pw.print("<b>Hello Simple Servlet</b>");
        pw.print("</body></html>");
    }
    
    
  public void destroy()
  {
      System.out.println("Servlet is destroyed..");
  }
  
  public ServletConfig getServletConfig()
  {
      return config;
  }
  public String getServletInfo()
  {
      return "copyright 2020-2021";
  }
}
