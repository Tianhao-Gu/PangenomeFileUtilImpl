
package us.kbase.pangenomefileutil;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * <p>Original spec-file type: PangenomeToFileParams</p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "pangenome_name",
    "workspace_name"
})
public class PangenomeToFileParams {

    @JsonProperty("pangenome_name")
    private String pangenomeName;
    @JsonProperty("workspace_name")
    private String workspaceName;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("pangenome_name")
    public String getPangenomeName() {
        return pangenomeName;
    }

    @JsonProperty("pangenome_name")
    public void setPangenomeName(String pangenomeName) {
        this.pangenomeName = pangenomeName;
    }

    public PangenomeToFileParams withPangenomeName(String pangenomeName) {
        this.pangenomeName = pangenomeName;
        return this;
    }

    @JsonProperty("workspace_name")
    public String getWorkspaceName() {
        return workspaceName;
    }

    @JsonProperty("workspace_name")
    public void setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
    }

    public PangenomeToFileParams withWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return ((((((("PangenomeToFileParams"+" [pangenomeName=")+ pangenomeName)+", workspaceName=")+ workspaceName)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
