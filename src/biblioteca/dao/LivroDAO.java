package biblioteca.dao;

import biblioteca.model.Livro;
import biblioteca.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class LivroDAO {
    private Session session;

    public LivroDAO() {}

    public Livro show(int id) {
        session = HibernateUtil.getSessionFactory().openSession();
        Livro livro = session.get(Livro.class, new Integer(id));
        session.close();

        return livro;
    }

    public List<Livro> search(String text) {
        session = HibernateUtil.getSessionFactory().openSession();
        List<Livro> list = (List<Livro>) session.createCriteria(Livro.class)
                .add(
                        Restrictions.or(
                                Restrictions.ilike("titulo", "%" + text + "%"),
                                Restrictions.ilike("autorPrincipal", "%" + text + "%")
                        )
                ).addOrder(Order.asc("id")).list();
        session.close();

        return list;
    }
}
