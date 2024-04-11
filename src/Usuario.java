import java.util.ArrayList;
import java.util.List;

public class Usuario {
    // Atributos
    private String nombre;
    private String idUsuario;
    private List<Usuario> listaRoomies;
    private List<GeneroLiterario> listaGenerosLiterarios;
    private List<Amistad> listaAmistades;

    // Constructor
    public Usuario() {
        this(null, null);
    }

    // Constructor
    public Usuario(String nombre, String idUsuario) {
        this.nombre = nombre;
        this.idUsuario = idUsuario;
        this.listaRoomies = new ArrayList<>();
        this.listaGenerosLiterarios = new ArrayList<>();
        this.listaAmistades = new ArrayList<>();
    }

    // Métodos getter y setter para los atributos (omito para brevedad)

    // Método para agregar un roomie
    public void agregarRoomie(String nombreRoomie, String idRoomie) {
        Usuario roomie = new Usuario(nombreRoomie, idRoomie);
        listaRoomies.add(roomie);
    }

    // Método para agregar un género literario favorito
    public void agregarGeneroLiterario(String nombreGenero, String descripcion) {
        GeneroLiterario genero = new GeneroLiterario(nombreGenero, descripcion);
        listaGenerosLiterarios.add(genero);
    }

    // Método para agregar una amistad
    public void agregarAmistad(String datosAmigo) {
        Amistad amistad = new Amistad(datosAmigo);
        listaAmistades.add(amistad);
    }

    //declarando metodos que hacian falta para poder ejecutar la interfaz "BibliotecaUI"

        public String getNombre() {
            return nombre;
        }

        // Método para obtener el ID del usuario
        public String getIdUsuario() {
            return idUsuario;
        }
    }


