package com.cice.maven.test.java;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CicloVidaServlet extends HttpServlet {

    @Override
    public void destroy() {
        super.destroy();
        System.out.println("Destruyendo servlet...");

    }

    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("Iniciando servlet...");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Llamando al service del servlet...");
    }
}
