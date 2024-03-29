/*
 * Finnhub API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package de.fwidder.finnhub4j.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * ExcerptResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-09T22:29:37.142+01:00")
public class ExcerptResponse {
    @JsonProperty("content")
    private String content = null;

    @JsonProperty("snippetId")
    private String snippetId = null;

    @JsonProperty("startOffset")
    private String startOffset = null;

    @JsonProperty("endOffset")
    private String endOffset = null;

    public ExcerptResponse content(String content) {
        this.content = content;
        return this;
    }

    /**
     * Highlighted content
     *
     * @return content
     **/
    @ApiModelProperty(value = "Highlighted content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public ExcerptResponse snippetId(String snippetId) {
        this.snippetId = snippetId;
        return this;
    }

    /**
     * Location of the content in the rendered document
     *
     * @return snippetId
     **/
    @ApiModelProperty(value = "Location of the content in the rendered document")
    public String getSnippetId() {
        return snippetId;
    }

    public void setSnippetId(String snippetId) {
        this.snippetId = snippetId;
    }

    public ExcerptResponse startOffset(String startOffset) {
        this.startOffset = startOffset;
        return this;
    }

    /**
     * Start offset of highlighted content
     *
     * @return startOffset
     **/
    @ApiModelProperty(value = "Start offset of highlighted content")
    public String getStartOffset() {
        return startOffset;
    }

    public void setStartOffset(String startOffset) {
        this.startOffset = startOffset;
    }

    public ExcerptResponse endOffset(String endOffset) {
        this.endOffset = endOffset;
        return this;
    }

    /**
     * End offset of highlighted content
     *
     * @return endOffset
     **/
    @ApiModelProperty(value = "End offset of highlighted content")
    public String getEndOffset() {
        return endOffset;
    }

    public void setEndOffset(String endOffset) {
        this.endOffset = endOffset;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExcerptResponse excerptResponse = (ExcerptResponse) o;
        return Objects.equals(this.content, excerptResponse.content) &&
                Objects.equals(this.snippetId, excerptResponse.snippetId) &&
                Objects.equals(this.startOffset, excerptResponse.startOffset) &&
                Objects.equals(this.endOffset, excerptResponse.endOffset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content, snippetId, startOffset, endOffset);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExcerptResponse {\n");

        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    snippetId: ").append(toIndentedString(snippetId)).append("\n");
        sb.append("    startOffset: ").append(toIndentedString(startOffset)).append("\n");
        sb.append("    endOffset: ").append(toIndentedString(endOffset)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

