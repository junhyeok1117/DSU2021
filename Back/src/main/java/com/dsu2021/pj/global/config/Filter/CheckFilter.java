package com.dsu2021.pj.global.config.Filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Slf4j
@WebFilter(urlPatterns = "/*")
public class CheckFilter implements Filter {

    @Autowired
    HttpSession session;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("init");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        //값이 없는 경우에도 null이라 뜨는 것 해결필요
        if (!session.equals(null)) {
            String a = (String) session.getAttribute("email");
            log.info(a);

        } else {
            log.info("뿡");
        }

        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        log.info("destroy");
    }
}
