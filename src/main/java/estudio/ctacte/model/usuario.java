@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String usuario;
    private String contrasenia;

    public void getUsuario(){
        return this.usuario;
    }

    public void getContrasenia(){
        return this.contrasenia;
    }

    public void setUsario(String u){
        this.usuario = u;
    }

    public void setContrasenia(String contrasenia){
        this.contrasenia = contrasenia;
    }
}