package kafka.exactly.once.semantics;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Tuple {
    private String key;
    private Integer value;

    public static Tuple of(String key, Integer value) {
        return new Tuple(key, value);
    }
}