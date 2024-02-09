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
 * EbitdaEstimates
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-09T22:29:37.142+01:00")
public class EbitdaEstimates {
    @JsonProperty("data")
    private List<EbitdaEstimatesInfo> data = null;

    @JsonProperty("freq")
    private String freq = null;

    @JsonProperty("symbol")
    private String symbol = null;

    public EbitdaEstimates data(List<EbitdaEstimatesInfo> data) {
        this.data = data;
        return this;
    }

    public EbitdaEstimates addDataItem(EbitdaEstimatesInfo dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(dataItem);
        return this;
    }

    /**
     * List of estimates
     *
     * @return data
     **/
    @ApiModelProperty(value = "List of estimates")
    public List<EbitdaEstimatesInfo> getData() {
        return data;
    }

    public void setData(List<EbitdaEstimatesInfo> data) {
        this.data = data;
    }

    public EbitdaEstimates freq(String freq) {
        this.freq = freq;
        return this;
    }

    /**
     * Frequency: annual or quarterly.
     *
     * @return freq
     **/
    @ApiModelProperty(value = "Frequency: annual or quarterly.")
    public String getFreq() {
        return freq;
    }

    public void setFreq(String freq) {
        this.freq = freq;
    }

    public EbitdaEstimates symbol(String symbol) {
        this.symbol = symbol;
        return this;
    }

    /**
     * Company symbol.
     *
     * @return symbol
     **/
    @ApiModelProperty(value = "Company symbol.")
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
        EbitdaEstimates ebitdaEstimates = (EbitdaEstimates) o;
        return Objects.equals(this.data, ebitdaEstimates.data) &&
                Objects.equals(this.freq, ebitdaEstimates.freq) &&
                Objects.equals(this.symbol, ebitdaEstimates.symbol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, freq, symbol);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EbitdaEstimates {\n");

        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    freq: ").append(toIndentedString(freq)).append("\n");
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

