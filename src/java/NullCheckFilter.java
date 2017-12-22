

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class NullCheckFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        String user = request.getParameter("user");
        String pass = request.getParameter("pass");
        if(user.isEmpty() && pass.isEmpty())
        {
            request.getRequestDispatcher("index.jsp").forward(request,response);
            
        }
        else
           chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
       
    }
    
   
    
}
