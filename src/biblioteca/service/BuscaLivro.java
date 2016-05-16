package biblioteca.service;

import biblioteca.dao.LivroDAO;
import biblioteca.model.Livro;

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
}
