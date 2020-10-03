package ifpb.com.br;


import java.io. *;

import javax.ejb.CreateException;
import javax.ejb.EJB;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.http. *;
import javax.servlet. *;

public class HelloServlet extends HttpServlet {
    @EJB
    private HelloLocal helloLocal;
    private String mensagem;
    public void doGet (HttpServletRequest req,HttpServletResponse res)
            throws  IOException {
        try {
            InitialContext context = new InitialContext();
            HelloHome hellohome = (HelloHome) context.lookup
                    ("java:comp/env/ejb/Hello");
         helloLocal = (HelloLocal) hellohome.create();


        } catch (CreateException e) {
            e.printStackTrace();
        } catch (NamingException e) {
            e.printStackTrace();
        }
       
        mensagem = helloLocal.helloWorld();
        req.setAttribute("mensagem",mensagem);
        try {
            req.getRequestDispatcher( "index.jsp" ).forward(req, res);
        } catch (ServletException e) {
            e.printStackTrace();
        }


    }
}
