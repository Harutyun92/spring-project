package pl.sdacedemy.jokesexporter.dao;

import lombok.Builder;
import lombok.Data;
import java.util.ArrayList;
import java.util.List;

@Data
@Builder
public class JokeModel2 {

    Integer id;
    Integer externalId;
    String value;
    List<String> categories = new ArrayList<>();
}