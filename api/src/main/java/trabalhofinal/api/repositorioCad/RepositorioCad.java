package trabalhofinal.api.repositorioCad;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import trabalhofinal.api.modeloCad.Cadastro;


@Repository
public interface RepositorioCad extends CrudRepository<Cadastro, Integer> {
    
    List<Cadastro> findAll();

    Cadastro findByCodigo(int codigo);




}
