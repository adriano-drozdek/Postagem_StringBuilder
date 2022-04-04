package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Publicar {

	private Date momento;
	private String titulo;
	private String comentario;
	private Integer likes;

	private List<Comentario> comentarios = new ArrayList<>();

	public Publicar(Date momento, String titulo, String comentario, Integer likes) {
		this.momento = momento;
		this.titulo = titulo;
		this.comentario = comentario;
		this.likes = likes;
	}

	public Publicar() {

	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comentario> getComentarios() {
		return comentarios;
	}

	public void addComentario(Comentario comentario) {
		comentarios.add(comentario);
	}

	public void removeComentario(Comentario comentario) {
		comentarios.remove(comentario);
	}

}
