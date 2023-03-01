package devkaimovies.MoviesAPI;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "reviews") // if there is no collection like this it will make a new one
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Review {

    @Id
    private ObjectId id;

    private String body;
}
