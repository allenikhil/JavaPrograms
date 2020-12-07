package org.jsp.app;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.jsp.app.MainHibernate;
@WebServlet(urlPatterns="/hibernatecheck")
public class CheckServlet extends HttpServlet
{
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
{
	System.out.println("servlet");
	MainHibernate m=new MainHibernate();
	m.loginWithHibernate(req.getParameter("nm"), req.getParameter("ps"));
}
}
