package service;

import model.Endereco;
import model.NotaNF;
import org.springframework.beans.factory.annotation.Autowired;
import repository.IEndereco;
import repository.INotaNF;

import java.util.List;
import java.util.Optional;

public class NotaNFService {


    private INotaNF repository;


    @Autowired
    public void setRepository(INotaNF repository) {
        this.repository = repository;
    }

    public NotaNF insert(NotaNF c){
        return repository.save(c);
    }

    public NotaNF update(NotaNF c){
        return repository.save(c);

    }

    public void delete(NotaNF c){
        repository.delete(c);
    }

    public NotaNF getOne(Long id){
        return repository.getOne(id);
    }

    public List<NotaNF> getAll() {
        return repository.findAll();
    }

    public Optional<NotaNF> findById(Long id) {
        return repository.findById(id);
    }

    public NotaNF saveAndFlush(NotaNF client) {
        return repository.saveAndFlush(client);
    }

}
