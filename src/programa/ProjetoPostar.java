package programa;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comentario;
import entities.Publicar;

public class ProjetoPostar {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss ");

		Comentario c1 = new Comentario("Boa viagem! ");
		Comentario c2 = new Comentario("Que incrivel! ");
		Publicar p1 = new Publicar(sdf.parse("04/04/2022 11:45:20"), 
				"Viajando para Nova Zelândia! ",
				"Vou visitar este país maravilhoso! ", 
				12);
		p1.addComentario(c1);
		p1.addComentario(c2);
		
		System.out.println(p1);
	}

}
