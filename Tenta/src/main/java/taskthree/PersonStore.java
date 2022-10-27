package taskthree;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PersonStore {
    private PersonStore() {}

    private static final Path path = Paths.get("src/main/resources/Person.json");

    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static List<Person> getFirstName() throws IOException {
     return List.of(objectMapper.readValue(path.toFile(),
             Person[].class)
     );
    }


}
