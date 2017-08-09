package hiwotab.springboot07.Model;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Tvshow {

    @NotNull
    @Min(1)
    long id;
    @NotNull
    @Size(min=3,max=20)
    String names;
    @NotNull
    @Size(min=3,max=10)
    String type;
    @NotNull
    @Size(min=3,max=50)
    String description;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
