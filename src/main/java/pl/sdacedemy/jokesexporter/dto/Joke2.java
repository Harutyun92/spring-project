package pl.sdacedemy.jokesexporter.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@NotNull
public class Joke2 {
    String type;
    @NotNull
    JokeValue2 value;
}

