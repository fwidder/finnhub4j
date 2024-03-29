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
 * TechnicalAnalysis
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-09T22:29:37.142+01:00")
public class TechnicalAnalysis {
    @JsonProperty("count")
    private Indicator count = null;

    @JsonProperty("signal")
    private String signal = null;

    public TechnicalAnalysis count(Indicator count) {
        this.count = count;
        return this;
    }

    /**
     * Number of indicators for each signal
     *
     * @return count
     **/
    @ApiModelProperty(value = "Number of indicators for each signal")
    public Indicator getCount() {
        return count;
    }

    public void setCount(Indicator count) {
        this.count = count;
    }

    public TechnicalAnalysis signal(String signal) {
        this.signal = signal;
        return this;
    }

    /**
     * Aggregate Signal
     *
     * @return signal
     **/
    @ApiModelProperty(value = "Aggregate Signal")
    public String getSignal() {
        return signal;
    }

    public void setSignal(String signal) {
        this.signal = signal;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TechnicalAnalysis technicalAnalysis = (TechnicalAnalysis) o;
        return Objects.equals(this.count, technicalAnalysis.count) &&
                Objects.equals(this.signal, technicalAnalysis.signal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, signal);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TechnicalAnalysis {\n");

        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    signal: ").append(toIndentedString(signal)).append("\n");
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

