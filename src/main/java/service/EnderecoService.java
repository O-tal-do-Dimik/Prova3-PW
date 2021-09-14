package service;

import model.Endereco;
import org.springframework.beans.factory.annotation.Autowired;
import repository.IEndereco;

import java.util.List;
import java.util.Optional;

public class EnderecoService {


    private IEndereco repository;


    @Autowired
    public void setRepository(IEndereco repository) {
        this.repository = repository;
    }


    public Endereco insert(Endereco c){
        return repository.save(c);
    }

    public Endereco update(Endereco c){
        return repository.save(c);

    }

    public void delete(Endereco c){
        repository.delete(c);
    }

    public Endereco getOne(Long id){
        return repository.getOne(id);
    }


    public List<Endereco> getAll() {
        return repository.findAll();
    }

    public Optional<Endereco> findById(Long id) {
        return repository.findById(id);
    }


    public Endereco saveAndFlush(Endereco client) {
        return repository.saveAndFlush(client);
    }




}
