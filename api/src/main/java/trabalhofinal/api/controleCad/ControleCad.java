package trabalhofinal.api.controleCad;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import trabalhofinal.api.modeloCad.Cadastro;
import trabalhofinal.api.repositorioCad.RepositorioCad;


@RestController
public class ControleCad {

    @Autowired
    private RepositorioCad funcao;
    

    @GetMapping (path = "/api/buscar")
    public List<Cadastro> buscar(){

        return funcao.findAll();
    }

    @GetMapping (path = "/api/buscar/{codigo}")
    public Cadastro buscarPorId(@PathVariable int codigo){

        return funcao.findByCodigo(codigo);
    }

    @PostMapping (path = "/api/cadastrar")
    public Cadastro cadastrar(@RequestBody Cadastro cad){

        return funcao.save(cad);
    }

    @PutMapping (path = "/api/editar")
    public Cadastro editar(@RequestBody Cadastro cad){

        return funcao.save(cad);
    }

    @DeleteMapping (path = "/api/deletar/{codigo}")
    public void excluir(@PathVariable int codigo){

        Cadastro cad = buscarPorId(codigo);
        funcao.delete(cad);
    }


}
