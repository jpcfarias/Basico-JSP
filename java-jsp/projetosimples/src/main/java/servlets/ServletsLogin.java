package servlets;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.ModelLogin;

@WebServlet("/ServletsLogin")
public class ServletsLogin extends HttpServlet{

    private static final long serialVersionUID = 1L;

    public ServletsLogin(){

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response){

    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String senha = req.getParameter("senha");

        if (login != null && !login.isEmpty() && senha != null && !senha.isEmpty()){
            ModelLogin modelLogin = new ModelLogin();
            modelLogin.setLogin(login);
            modelLogin.setSenha(senha);
            if (modelLogin.getLogin().equalsIgnoreCase("admin") && modelLogin.getSenha().equalsIgnoreCase("admin")){
                req.getSession().setAttribute("usuario", modelLogin.getLogin());
                RequestDispatcher redirecionar = req.getRequestDispatcher("principal/principal.jsp");
                redirecionar.forward(req, resp);
            }else{
                RequestDispatcher redirecionar = req.getRequestDispatcher("index.jsp");
                req.setAttribute("msg", "informe o login e senha!");
                redirecionar.forward(req, resp); 
            }
        }else{
            RequestDispatcher redirecionar = req.getRequestDispatcher("index.jsp");
            req.setAttribute("msg", "informe o login e senha!");
            redirecionar.forward(req, resp);
        }
    }
}
