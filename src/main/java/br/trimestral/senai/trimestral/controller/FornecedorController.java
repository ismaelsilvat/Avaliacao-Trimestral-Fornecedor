package br.trimestral.senai.trimestral.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import br.trimestral.senai.trimestral.service.FornecedorServiceImple;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FornecedorController {

    @Autowired
    FornecedorServiceImple fornecedorService;

    @GetMapping("/fornecedor/list")
    public String fornecedorList(Model model){
        model.addAttribute("fornecedores", fornecedorService.findAll());
        return "fornecedor/list";
    }

}
