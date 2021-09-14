package repository;

import model.Endereco;
import model.NotaNF;
import org.springframework.data.jpa.repository.JpaRepository;

public interface INotaNF extends JpaRepository<NotaNF, Long> {
}
