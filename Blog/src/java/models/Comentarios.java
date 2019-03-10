package models;
// Generated 05/09/2018 19:48:07 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Comentarios generated by hbm2java
 */
public class Comentarios  implements java.io.Serializable {

    private Integer id;
    private Posts posts;
    private Usuarios usuarios;
    private Integer comentarioPai;
    private String autorNome;
    private String comentario;
    private char tipo;
    private Date dataComentario;

    public Comentarios() {
    }
    
    public Comentarios(Posts posts, Usuarios usuarios) {
        this.posts = posts;
        this.usuarios = usuarios;
    }
    
    public Comentarios(Posts posts, Usuarios usuarios, 
            Integer comentarioPai, String autorNome, char tipo,
            String comentario, Date dataComentario) {
       this.posts = posts;
       this.usuarios = usuarios;
       this.comentarioPai = comentarioPai;
       this.autorNome = autorNome;
       this.tipo = tipo;
       this.comentario = comentario;
       this.dataComentario = dataComentario;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public Posts getPosts() {
        return this.posts;
    }
    
    public void setPosts(Posts posts) {
        this.posts = posts;
    }
    
    public Usuarios getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }
    
    public Integer getComentarioPai() {
        return this.comentarioPai;
    }
    
    public void setComentarioPai(Integer comentarioPai) {
        this.comentarioPai = comentarioPai;
    }
    
    public String getAutorNome() {
        return this.autorNome;
    }
    
    public void setAutorNome(String autorNome) {
        this.autorNome = autorNome;
    }
    
    public String getComentario() {
        return this.comentario;
    }
    
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    
    public Date getDataComentario() {
        return this.dataComentario;
    }
    
    public void setDataComentario(Date dataComentario) {
        this.dataComentario = dataComentario;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

}


