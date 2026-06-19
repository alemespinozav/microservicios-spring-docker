package cl.duoc.producto_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class ProductoController {



    @GetMapping("/productos")
    public List<String> listarProductos() {
        return List.of("Notebook", "Mouse", "Teclado");
    }

    @GetMapping("/productos/estado")
    public String estado() {
        return "Producto Service funcionando correctamente en el puerto 8081";
    }
}
