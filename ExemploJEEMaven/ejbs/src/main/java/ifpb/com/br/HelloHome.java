package ifpb.com.br;

import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;

public interface HelloHome extends EJBLocalHome
{

    public HelloLocal create () throws CreateException;
}
