package cl.duoc.usuario_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {

    @GetMapping("/api/usuarios")
    public List<String> listarUsuarios() {
        return List.of("Ana", "Luis", "Camila");
    }

    @GetMapping("/api/usuarios/estado")
    public String estado() {
        return "Usuario Service funcionando correctamente en el puerto 8082";
    }
}