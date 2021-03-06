package models;
// Generated 05/09/2018 19:48:07 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Usuarios generated by hbm2java
 */
public class Usuarios  implements java.io.Serializable {
    private Integer id;
    private String nomeUsuario;
    private String nome;
    private String sobrenome;
    private String senha;
    private String chave;
    private String bio;
    private String foto;
    private Date dataCadastro;
    private String email;
    private char privilegios;
    private Set<Comentarios> listaDeComentarios = new HashSet<Comentarios>(0);

    public Usuarios() {
    }
	
    public Usuarios(String nomeUsuario, String senha) {
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
    }
    
    public Usuarios(String nomeUsuario, String nome, String sobrenome, 
            String senha, String bio, String foto, Date dataCadastro, 
            String email, Set<Comentarios> listaDeComentarios) {
       this.nomeUsuario = nomeUsuario;
       this.nome = nome;
       this.sobrenome = sobrenome;
       this.senha = senha;
       this.bio = bio;
       this.foto = foto;
       this.dataCadastro = dataCadastro;
       this.email = email;
       this.listaDeComentarios = listaDeComentarios;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getNomeUsuario() {
        return this.nomeUsuario;
    }
    
    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getSobrenome() {
        return this.sobrenome;
    }
    
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public String getSenha() {
        return this.senha;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getChave() {
        return chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }
    
    public String getBio() {
        return this.bio;
    }
    
    public void setBio(String bio) {
        this.bio = bio;
    }
    
    public String getFoto() {
        return this.foto;
    }
    
    public void setFoto(String foto) {
        this.foto = foto;
    }
    
    public Date getDataCadastro() {
        return this.dataCadastro;
    }
    
    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public Set<Comentarios> getListaDeComentarios() {
        return this.listaDeComentarios;
    }
    
    public void setListaDeComentarios(Set<Comentarios> listaDeComentarios) {
        this.listaDeComentarios = listaDeComentarios;
    }

    public char getPrivilegios() {
        return privilegios;
    }
    
    public void setPrivilegios(char privilegios) {
        this.privilegios = privilegios;
    }
    
}


