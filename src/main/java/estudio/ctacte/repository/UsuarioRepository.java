package estudio.ctacte.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import estudio.ctacte.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findByUsuario(String usuario);
}
