package repository;

import model.Endereco;
import model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProduto extends JpaRepository<Produto, Long> {


}
