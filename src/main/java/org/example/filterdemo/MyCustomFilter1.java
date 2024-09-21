package org.example.filterdemo;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MyCustomFilter1 extends GenericFilter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // No initialization needed for this simple filter.
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpServletResponse httpResponse = (HttpServletResponse) response;
        httpResponse.addHeader("Filter-Processing-1", "CustomFilter1 Processing");
        chain.doFilter(request, response); // Pass the request down the filter chain
    }


    @Override
    public void destroy() {
        // No cleanup needed for this simple filter
    }
}