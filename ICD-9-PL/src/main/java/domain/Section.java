package domain;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import java.util.List;

/**
 * @author Mariusz Szymanski
 */
public class Section {

    private String code;
    private String title;
    private List<Subsection> subsections;

    public Section(String code, String title, List<Subsection> subsections) {
        this.code = code;
        this.title = title;
        this.subsections = subsections;
    }

    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public List<Subsection> getSubsections() {
        return subsections;
    }

    public JsonObject toJsonObject() {
        JsonObjectBuilder builder = Json.createObjectBuilder();
        builder.add("code", this.getCode());
        builder.add("title", this.getTitle());
        return builder.build();
    }
}
