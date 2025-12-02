package estudio.ctacte.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import estudio.ctacte.entity.Usuario;
import estudio.ctacte.service.UsuarioService;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "${APP_FRONTEND_URL}")
public class AuthController {

    private final UsuarioService service;

    public AuthController(UsuarioService service) {
        this.service = service;
    }

    @PostMapping("/login")
    public String login(@RequestBody Usuario body) {
        Usuario u = service.login(body.getUsuario(), body.getContrasenia());
        if (u == null) {
            return "Credenciales inválidas";
        }
        return "Login exitoso";
    }
}
