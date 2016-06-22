/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 *
 * @author mark-4304
 */
public class ResultFilter implements Filter {

    
    public ResultFilter() {
    }    

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        //Getting filter param
        final String filterName = filterConfig.getFilterName();
        System.out.print(filterName);
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        int marks = 0;
        response.setContentType("html/text");
        PrintWriter out = response.getWriter();
        try{
            marks = Integer.parseInt(request.getParameter("marks"));
        }catch(Exception ex){
            System.err.println(ex.getMessage());
        }
        
        if ( name.trim().equals(null) ){
            out.print("Name is Required");
        }
        else if ( email.trim().equals(null) ){
            out.print("Email Id is Required");
        }
        else if ( marks == 0 ){
            out.print("Marks is Required");
        }
        else{
            out.print("<pre>");
            chain.doFilter(request, response);
            out.print("</pre>");
        }
            
            
    }

    @Override
    public void destroy() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
