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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * TranscriptContent
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-09T22:29:37.142+01:00")
public class TranscriptContent {
    @JsonProperty("name")
    private String name = null;

    @JsonProperty("speech")
    private List<String> speech = null;

    @JsonProperty("session")
    private String session = null;

    public TranscriptContent name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Speaker&#39;s name
     *
     * @return name
     **/
    @ApiModelProperty(value = "Speaker's name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TranscriptContent speech(List<String> speech) {
        this.speech = speech;
        return this;
    }

    public TranscriptContent addSpeechItem(String speechItem) {
        if (this.speech == null) {
            this.speech = new ArrayList<>();
        }
        this.speech.add(speechItem);
        return this;
    }

    /**
     * Speaker&#39;s speech
     *
     * @return speech
     **/
    @ApiModelProperty(value = "Speaker's speech")
    public List<String> getSpeech() {
        return speech;
    }

    public void setSpeech(List<String> speech) {
        this.speech = speech;
    }

    public TranscriptContent session(String session) {
        this.session = session;
        return this;
    }

    /**
     * Earnings calls section (management discussion or Q&amp;A)
     *
     * @return session
     **/
    @ApiModelProperty(value = "Earnings calls section (management discussion or Q&A)")
    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TranscriptContent transcriptContent = (TranscriptContent) o;
        return Objects.equals(this.name, transcriptContent.name) &&
                Objects.equals(this.speech, transcriptContent.speech) &&
                Objects.equals(this.session, transcriptContent.session);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, speech, session);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TranscriptContent {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    speech: ").append(toIndentedString(speech)).append("\n");
        sb.append("    session: ").append(toIndentedString(session)).append("\n");
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
