
package ventasdao.objetos;


public class Cliente {
    
    private Integer id;
    private String documento;
    private String nombre;
    private String apellido;

    public String getCuil() {
        return documento;
    }

    public void setCuil(String cuil) {
        this.documento = cuil;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getDocumento() { return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

 
    
}
