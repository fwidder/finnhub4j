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
 * VisaApplicationResult
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-09T22:29:37.142+01:00")
public class VisaApplicationResult {
    @JsonProperty("symbol")
    private String symbol = null;

    @JsonProperty("data")
    private List<VisaApplication> data = null;

    public VisaApplicationResult symbol(String symbol) {
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

    public VisaApplicationResult data(List<VisaApplication> data) {
        this.data = data;
        return this;
    }

    public VisaApplicationResult addDataItem(VisaApplication dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(dataItem);
        return this;
    }

    /**
     * Array of H1b and Permanent visa applications.
     *
     * @return data
     **/
    @ApiModelProperty(value = "Array of H1b and Permanent visa applications.")
    public List<VisaApplication> getData() {
        return data;
    }

    public void setData(List<VisaApplication> data) {
        this.data = data;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VisaApplicationResult visaApplicationResult = (VisaApplicationResult) o;
        return Objects.equals(this.symbol, visaApplicationResult.symbol) &&
                Objects.equals(this.data, visaApplicationResult.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(symbol, data);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VisaApplicationResult {\n");

        sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

