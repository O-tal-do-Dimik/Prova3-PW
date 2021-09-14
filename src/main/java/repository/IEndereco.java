package repository;

import model.Cliente;
import model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEndereco extends JpaRepository<Endereco, Long> {
}
