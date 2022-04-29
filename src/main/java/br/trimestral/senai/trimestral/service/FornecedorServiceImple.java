package br.trimestral.senai.trimestral.service;

import br.trimestral.senai.trimestral.service.FornecedorService;
import br.trimestral.senai.trimestral.model.Fornecedor;
import br.trimestral.senai.trimestral.repository.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
public class FornecedorServiceImple implements FornecedorService{


    @Autowired
    FornecedorRepository fornecedorRepository;

    @Override
    public List<Fornecedor> findAll() {
        return fornecedorRepository.findAll(Sort.by("nome"));
    }
}
