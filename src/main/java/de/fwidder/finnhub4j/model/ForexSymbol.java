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
 * ForexSymbol
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-09T22:29:37.142+01:00")
public class ForexSymbol {
    @JsonProperty("description")
    private String description = null;

    @JsonProperty("displaySymbol")
    private String displaySymbol = null;

    @JsonProperty("symbol")
    private String symbol = null;

    public ForexSymbol description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Symbol description
     *
     * @return description
     **/
    @ApiModelProperty(value = "Symbol description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ForexSymbol displaySymbol(String displaySymbol) {
        this.displaySymbol = displaySymbol;
        return this;
    }

    /**
     * Display symbol name.
     *
     * @return displaySymbol
     **/
    @ApiModelProperty(value = "Display symbol name.")
    public String getDisplaySymbol() {
        return displaySymbol;
    }

    public void setDisplaySymbol(String displaySymbol) {
        this.displaySymbol = displaySymbol;
    }

    public ForexSymbol symbol(String symbol) {
        this.symbol = symbol;
        return this;
    }

    /**
     * Unique symbol used to identify this symbol used in &lt;code&gt;/forex/candle&lt;/code&gt; endpoint.
     *
     * @return symbol
     **/
    @ApiModelProperty(value = "Unique symbol used to identify this symbol used in <code>/forex/candle</code> endpoint.")
    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ForexSymbol forexSymbol = (ForexSymbol) o;
        return Objects.equals(this.description, forexSymbol.description) &&
                Objects.equals(this.displaySymbol, forexSymbol.displaySymbol) &&
                Objects.equals(this.symbol, forexSymbol.symbol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, displaySymbol, symbol);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ForexSymbol {\n");

        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    displaySymbol: ").append(toIndentedString(displaySymbol)).append("\n");
        sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
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

