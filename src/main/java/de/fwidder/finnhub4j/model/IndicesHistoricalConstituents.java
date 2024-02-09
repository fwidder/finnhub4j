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
 * IndicesHistoricalConstituents
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-09T22:29:37.142+01:00")
public class IndicesHistoricalConstituents {
    @JsonProperty("symbol")
    private String symbol = null;

    @JsonProperty("historicalConstituents")
    private List<IndexHistoricalConstituent> historicalConstituents = null;

    public IndicesHistoricalConstituents symbol(String symbol) {
        this.symbol = symbol;
        return this;
    }

    /**
     * Index&#39;s symbol.
     *
     * @return symbol
     **/
    @ApiModelProperty(value = "Index's symbol.")
    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public IndicesHistoricalConstituents historicalConstituents(List<IndexHistoricalConstituent> historicalConstituents) {
        this.historicalConstituents = historicalConstituents;
        return this;
    }

    public IndicesHistoricalConstituents addHistoricalConstituentsItem(IndexHistoricalConstituent historicalConstituentsItem) {
        if (this.historicalConstituents == null) {
            this.historicalConstituents = new ArrayList<>();
        }
        this.historicalConstituents.add(historicalConstituentsItem);
        return this;
    }

    /**
     * Array of historical constituents.
     *
     * @return historicalConstituents
     **/
    @ApiModelProperty(value = "Array of historical constituents.")
    public List<IndexHistoricalConstituent> getHistoricalConstituents() {
        return historicalConstituents;
    }

    public void setHistoricalConstituents(List<IndexHistoricalConstituent> historicalConstituents) {
        this.historicalConstituents = historicalConstituents;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IndicesHistoricalConstituents indicesHistoricalConstituents = (IndicesHistoricalConstituents) o;
        return Objects.equals(this.symbol, indicesHistoricalConstituents.symbol) &&
                Objects.equals(this.historicalConstituents, indicesHistoricalConstituents.historicalConstituents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(symbol, historicalConstituents);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IndicesHistoricalConstituents {\n");

        sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
        sb.append("    historicalConstituents: ").append(toIndentedString(historicalConstituents)).append("\n");
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

