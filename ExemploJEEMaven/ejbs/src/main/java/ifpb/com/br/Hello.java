package ifpb.com.br;
import javax.ejb.*;


public class Hello implements SessionBean{
    public String helloWorld ()  {
        return "Exemplo maven arquetipos:maven-archetype-j2ee-simple";
    }


    public void setSessionContext(SessionContext sessionContext) throws EJBException {

    }

    public void ejbRemove() throws EJBException{

    }

    public void ejbActivate() throws EJBException  {

    }

    public void ejbPassivate() throws EJBException {

    }

    public void ejbCreate() throws CreateException {

    }
}

