package pl.sdacedemy.jokesexporter.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class JokeValue2 {
    Integer id;
    String joke;
    String[] categories;
}
