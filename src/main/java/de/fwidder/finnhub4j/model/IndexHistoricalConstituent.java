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

import java.time.LocalDate;
import java.util.Objects;

/**
 * IndexHistoricalConstituent
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-09T22:29:37.142+01:00")
public class IndexHistoricalConstituent {
    @JsonProperty("symbol")
    private String symbol = null;

    @JsonProperty("action")
    private String action = null;

    @JsonProperty("date")
    private LocalDate date = null;

    public IndexHistoricalConstituent symbol(String symbol) {
        this.symbol = symbol;
        return this;
    }

    /**
     * Symbol
     *
     * @return symbol
     **/
    @ApiModelProperty(value = "Symbol")
    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public IndexHistoricalConstituent action(String action) {
        this.action = action;
        return this;
    }

    /**
     * &lt;code&gt;add&lt;/code&gt; or &lt;code&gt;remove&lt;/code&gt;.
     *
     * @return action
     **/
    @ApiModelProperty(value = "<code>add</code> or <code>remove</code>.")
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public IndexHistoricalConstituent date(LocalDate date) {
        this.date = date;
        return this;
    }

    /**
     * Date of joining or leaving the index.
     *
     * @return date
     **/
    @ApiModelProperty(value = "Date of joining or leaving the index.")
    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IndexHistoricalConstituent indexHistoricalConstituent = (IndexHistoricalConstituent) o;
        return Objects.equals(this.symbol, indexHistoricalConstituent.symbol) &&
                Objects.equals(this.action, indexHistoricalConstituent.action) &&
                Objects.equals(this.date, indexHistoricalConstituent.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(symbol, action, date);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IndexHistoricalConstituent {\n");

        sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
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

