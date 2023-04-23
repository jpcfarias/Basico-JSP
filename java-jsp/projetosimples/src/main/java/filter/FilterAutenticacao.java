package filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;

@WebFilter(urlPatterns = {"/principal/*"})
public class FilterAutenticacao implements Filter {

    public FilterAutenticacao(){

    }
  
    public void init(FilterConfig config) throws ServletException {
        
    }
  
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        
        chain.doFilter(request, response);
        
    }
  
    public void destroy() {

    }
}
