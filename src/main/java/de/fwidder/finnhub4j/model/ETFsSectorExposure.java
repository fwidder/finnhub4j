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
 * ETFsSectorExposure
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-09T22:29:37.142+01:00")
public class ETFsSectorExposure {
    @JsonProperty("symbol")
    private String symbol = null;

    @JsonProperty("sectorExposure")
    private List<ETFSectorExposureData> sectorExposure = null;

    public ETFsSectorExposure symbol(String symbol) {
        this.symbol = symbol;
        return this;
    }

    /**
     * ETF symbol.
     *
     * @return symbol
     **/
    @ApiModelProperty(value = "ETF symbol.")
    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public ETFsSectorExposure sectorExposure(List<ETFSectorExposureData> sectorExposure) {
        this.sectorExposure = sectorExposure;
        return this;
    }

    public ETFsSectorExposure addSectorExposureItem(ETFSectorExposureData sectorExposureItem) {
        if (this.sectorExposure == null) {
            this.sectorExposure = new ArrayList<>();
        }
        this.sectorExposure.add(sectorExposureItem);
        return this;
    }

    /**
     * Array of industries and exposure levels.
     *
     * @return sectorExposure
     **/
    @ApiModelProperty(value = "Array of industries and exposure levels.")
    public List<ETFSectorExposureData> getSectorExposure() {
        return sectorExposure;
    }

    public void setSectorExposure(List<ETFSectorExposureData> sectorExposure) {
        this.sectorExposure = sectorExposure;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ETFsSectorExposure etFsSectorExposure = (ETFsSectorExposure) o;
        return Objects.equals(this.symbol, etFsSectorExposure.symbol) &&
                Objects.equals(this.sectorExposure, etFsSectorExposure.sectorExposure);
    }

    @Override
    public int hashCode() {
        return Objects.hash(symbol, sectorExposure);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ETFsSectorExposure {\n");

        sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
        sb.append("    sectorExposure: ").append(toIndentedString(sectorExposure)).append("\n");
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

