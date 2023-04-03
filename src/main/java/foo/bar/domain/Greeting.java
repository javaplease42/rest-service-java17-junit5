package foo.bar.domain;

import java.util.Objects;

public record Greeting(long id, String content) {
    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Greeting greeting = (Greeting) o;
        return id == greeting.id && Objects.equals(content, greeting.content);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, content);
    }
}
