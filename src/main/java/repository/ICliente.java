package repository;

import model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ICliente extends JpaRepository<Cliente, Long> {

}
