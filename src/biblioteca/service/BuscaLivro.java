package biblioteca.service;

import beans.dao.LivroDAO;
import model.Livro;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;

@WebService()
public class BuscaLivro {

    @WebMethod
    public List<Livro> buscar(String str) {
        LivroDAO dao = new LivroDAO();
        return dao.search(str);
    }

    @WebMethod
    public Livro obter(int id) {
        LivroDAO dao = new LivroDAO();
        return dao.show(id);
    }
}
