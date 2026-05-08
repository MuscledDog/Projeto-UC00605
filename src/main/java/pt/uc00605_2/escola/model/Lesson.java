package pt.uc00605_2.escola.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity //quer dizer que é uma tabela de dados
@Data
public class Lesson {

    private Long id;
    private String name;
    private String youtubeUrl;
    

}
