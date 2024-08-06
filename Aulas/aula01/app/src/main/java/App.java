

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

public class App {

    public static void main(String[] args) throws Exception {
        List<Musica> musicas = new ArrayList<>();

        musicas.add(new Musica(0, "Killer Queen", 180));
        musicas.add(new Musica(1, "It's a kind of magic", 300));
        musicas.add(new Musica(2, "I Want to break free", 185));
        musicas.add(new Musica(3, "Aposta Brutal", 356));

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File("app/src/main/resources/musicas.json"),musicas);
    }
}
