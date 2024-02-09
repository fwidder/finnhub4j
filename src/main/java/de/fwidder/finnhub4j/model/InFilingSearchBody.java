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
 * InFilingSearchBody
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-09T22:29:37.142+01:00")
public class InFilingSearchBody {
    @JsonProperty("query")
    private String query = null;

    @JsonProperty("filingId")
    private String filingId = null;

    public InFilingSearchBody query(String query) {
        this.query = query;
        return this;
    }

    /**
     * Search query
     *
     * @return query
     **/
    @ApiModelProperty(required = true, value = "Search query")
    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public InFilingSearchBody filingId(String filingId) {
        this.filingId = filingId;
        return this;
    }

    /**
     * Filing Id to search
     *
     * @return filingId
     **/
    @ApiModelProperty(required = true, value = "Filing Id to search")
    public String getFilingId() {
        return filingId;
    }

    public void setFilingId(String filingId) {
        this.filingId = filingId;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InFilingSearchBody inFilingSearchBody = (InFilingSearchBody) o;
        return Objects.equals(this.query, inFilingSearchBody.query) &&
                Objects.equals(this.filingId, inFilingSearchBody.filingId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(query, filingId);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InFilingSearchBody {\n");

        sb.append("    query: ").append(toIndentedString(query)).append("\n");
        sb.append("    filingId: ").append(toIndentedString(filingId)).append("\n");
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

