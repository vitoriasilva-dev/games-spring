package application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import application.model.Plataforma;
import application.repository.PlataformaRepository;

@Controller
@RequestMapping("/plataforma")
public class PlataformaController {

    @Autowired
    private PlataformaRepository plataformaRepo;

    @GetMapping("/list")
    public String listPlataformas(Model ui) {
        ui.addAttribute("plataformas", plataformaRepo.findAll());
        return "plataforma/list"; // Nome da view para listar as plataformas
    }

    @GetMapping("/insert")
    public String addPlataformaForm(Model ui) {
        return "plataformas/insert"; // Nome da view para o formulário de adição
    }

    @PostMapping("/insert")
    public String insert(@RequestParam("nome") String nome) {
        Plataforma plataforma = new Plataforma();
        plataforma.setNome(nome);  // Defina o nome da plataforma com o valor recebido
        plataformaRepo.save(plataforma); // Corrigido para plataformaRepo
        return "redirect:/plataforma/list"; // Redireciona para a lista após adicionar
    }

    @GetMapping("/edit/{id}")
    public String editPlataformaForm(@PathVariable("id") long id, Model model) {
        Plataforma plataforma = plataformaRepo.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("ID de plataforma inválido:" + id));
        model.addAttribute("plataforma", plataforma);
        return "plataformas/edit"; // Nome da view para o formulário de edição
    }

    @PostMapping("/update/{id}")
    public String updatePlataforma(@PathVariable("id") long id, @ModelAttribute Plataforma plataforma) {
        plataforma.setId(id); // Garante que estamos atualizando a plataforma correta
        plataformaRepo.save(plataforma); // Corrigido para plataformaRepo
        return "redirect:/plataforma/list"; // Redireciona para a lista após atualizar
    }

    @GetMapping("/delete/{id}")
    public String deletePlataforma(@PathVariable("id") long id) {
        Plataforma plataforma = plataformaRepo.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("ID de plataforma inválido:" + id));
        plataformaRepo.delete(plataforma); // Corrigido para plataformaRepo
        return "redirect:/plataforma/list"; // Redireciona para a lista após excluir
    }
}
