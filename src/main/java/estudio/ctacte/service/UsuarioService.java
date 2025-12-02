package estudio.ctacte.service;

import org.springframework.stereotype.Service;

import estudio.ctacte.entity.Usuario;
import estudio.ctacte.repository.UsuarioRepository;

@Service
public class UsuarioService {

    private final UsuarioRepository repo;

    public UsuarioService(UsuarioRepository repo) {
        this.repo = repo;
    }

    public Usuario login(String usuario, String contrasenia) {
        Usuario u = repo.findByUsuario(usuario);

        if (u == null) return null;
        if (!u.getContrasenia().equals(contrasenia)) return null;

        return u;
    }
}