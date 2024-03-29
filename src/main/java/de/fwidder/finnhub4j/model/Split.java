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
 * Split
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-09T22:29:37.142+01:00")
public class Split {
    @JsonProperty("symbol")
    private String symbol = null;

    @JsonProperty("date")
    private LocalDate date = null;

    @JsonProperty("fromFactor")
    private Float fromFactor = null;

    @JsonProperty("toFactor")
    private Float toFactor = null;

    public Split symbol(String symbol) {
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

    public Split date(LocalDate date) {
        this.date = date;
        return this;
    }

    /**
     * Split date.
     *
     * @return date
     **/
    @ApiModelProperty(value = "Split date.")
    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Split fromFactor(Float fromFactor) {
        this.fromFactor = fromFactor;
        return this;
    }

    /**
     * From factor.
     *
     * @return fromFactor
     **/
    @ApiModelProperty(value = "From factor.")
    public Float getFromFactor() {
        return fromFactor;
    }

    public void setFromFactor(Float fromFactor) {
        this.fromFactor = fromFactor;
    }

    public Split toFactor(Float toFactor) {
        this.toFactor = toFactor;
        return this;
    }

    /**
     * To factor.
     *
     * @return toFactor
     **/
    @ApiModelProperty(value = "To factor.")
    public Float getToFactor() {
        return toFactor;
    }

    public void setToFactor(Float toFactor) {
        this.toFactor = toFactor;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Split split = (Split) o;
        return Objects.equals(this.symbol, split.symbol) &&
                Objects.equals(this.date, split.date) &&
                Objects.equals(this.fromFactor, split.fromFactor) &&
                Objects.equals(this.toFactor, split.toFactor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(symbol, date, fromFactor, toFactor);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Split {\n");

        sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
        sb.append("    fromFactor: ").append(toIndentedString(fromFactor)).append("\n");
        sb.append("    toFactor: ").append(toIndentedString(toFactor)).append("\n");
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

