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
 * SimilarityIndex
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-09T22:29:37.142+01:00")
public class SimilarityIndex {
    @JsonProperty("symbol")
    private String symbol = null;

    @JsonProperty("cik")
    private String cik = null;

    @JsonProperty("similarity")
    private List<SimilarityIndexInfo> similarity = null;

    public SimilarityIndex symbol(String symbol) {
        this.symbol = symbol;
        return this;
    }

    /**
     * Symbol.
     *
     * @return symbol
     **/
    @ApiModelProperty(value = "Symbol.")
    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public SimilarityIndex cik(String cik) {
        this.cik = cik;
        return this;
    }

    /**
     * CIK.
     *
     * @return cik
     **/
    @ApiModelProperty(value = "CIK.")
    public String getCik() {
        return cik;
    }

    public void setCik(String cik) {
        this.cik = cik;
    }

    public SimilarityIndex similarity(List<SimilarityIndexInfo> similarity) {
        this.similarity = similarity;
        return this;
    }

    public SimilarityIndex addSimilarityItem(SimilarityIndexInfo similarityItem) {
        if (this.similarity == null) {
            this.similarity = new ArrayList<>();
        }
        this.similarity.add(similarityItem);
        return this;
    }

    /**
     * Array of filings with its cosine similarity compared to the same report of the previous year.
     *
     * @return similarity
     **/
    @ApiModelProperty(value = "Array of filings with its cosine similarity compared to the same report of the previous year.")
    public List<SimilarityIndexInfo> getSimilarity() {
        return similarity;
    }

    public void setSimilarity(List<SimilarityIndexInfo> similarity) {
        this.similarity = similarity;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SimilarityIndex similarityIndex = (SimilarityIndex) o;
        return Objects.equals(this.symbol, similarityIndex.symbol) &&
                Objects.equals(this.cik, similarityIndex.cik) &&
                Objects.equals(this.similarity, similarityIndex.similarity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(symbol, cik, similarity);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SimilarityIndex {\n");

        sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
        sb.append("    cik: ").append(toIndentedString(cik)).append("\n");
        sb.append("    similarity: ").append(toIndentedString(similarity)).append("\n");
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
