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
 * EbitEstimatesInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-09T22:29:37.142+01:00")
public class EbitEstimatesInfo {
    @JsonProperty("ebitAvg")
    private Float ebitAvg = null;

    @JsonProperty("ebitHigh")
    private Float ebitHigh = null;

    @JsonProperty("ebitLow")
    private Float ebitLow = null;

    @JsonProperty("numberAnalysts")
    private Long numberAnalysts = null;

    @JsonProperty("period")
    private LocalDate period = null;

    @JsonProperty("year")
    private Long year = null;

    @JsonProperty("quarter")
    private Long quarter = null;

    public EbitEstimatesInfo ebitAvg(Float ebitAvg) {
        this.ebitAvg = ebitAvg;
        return this;
    }

    /**
     * Average EBIT estimates including Finnhub&#39;s proprietary estimates.
     *
     * @return ebitAvg
     **/
    @ApiModelProperty(value = "Average EBIT estimates including Finnhub's proprietary estimates.")
    public Float getEbitAvg() {
        return ebitAvg;
    }

    public void setEbitAvg(Float ebitAvg) {
        this.ebitAvg = ebitAvg;
    }

    public EbitEstimatesInfo ebitHigh(Float ebitHigh) {
        this.ebitHigh = ebitHigh;
        return this;
    }

    /**
     * Highest estimate.
     *
     * @return ebitHigh
     **/
    @ApiModelProperty(value = "Highest estimate.")
    public Float getEbitHigh() {
        return ebitHigh;
    }

    public void setEbitHigh(Float ebitHigh) {
        this.ebitHigh = ebitHigh;
    }

    public EbitEstimatesInfo ebitLow(Float ebitLow) {
        this.ebitLow = ebitLow;
        return this;
    }

    /**
     * Lowest estimate.
     *
     * @return ebitLow
     **/
    @ApiModelProperty(value = "Lowest estimate.")
    public Float getEbitLow() {
        return ebitLow;
    }

    public void setEbitLow(Float ebitLow) {
        this.ebitLow = ebitLow;
    }

    public EbitEstimatesInfo numberAnalysts(Long numberAnalysts) {
        this.numberAnalysts = numberAnalysts;
        return this;
    }

    /**
     * Number of Analysts.
     *
     * @return numberAnalysts
     **/
    @ApiModelProperty(value = "Number of Analysts.")
    public Long getNumberAnalysts() {
        return numberAnalysts;
    }

    public void setNumberAnalysts(Long numberAnalysts) {
        this.numberAnalysts = numberAnalysts;
    }

    public EbitEstimatesInfo period(LocalDate period) {
        this.period = period;
        return this;
    }

    /**
     * Period.
     *
     * @return period
     **/
    @ApiModelProperty(value = "Period.")
    public LocalDate getPeriod() {
        return period;
    }

    public void setPeriod(LocalDate period) {
        this.period = period;
    }

    public EbitEstimatesInfo year(Long year) {
        this.year = year;
        return this;
    }

    /**
     * Fiscal year.
     *
     * @return year
     **/
    @ApiModelProperty(value = "Fiscal year.")
    public Long getYear() {
        return year;
    }

    public void setYear(Long year) {
        this.year = year;
    }

    public EbitEstimatesInfo quarter(Long quarter) {
        this.quarter = quarter;
        return this;
    }

    /**
     * Fiscal quarter.
     *
     * @return quarter
     **/
    @ApiModelProperty(value = "Fiscal quarter.")
    public Long getQuarter() {
        return quarter;
    }

    public void setQuarter(Long quarter) {
        this.quarter = quarter;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EbitEstimatesInfo ebitEstimatesInfo = (EbitEstimatesInfo) o;
        return Objects.equals(this.ebitAvg, ebitEstimatesInfo.ebitAvg) &&
                Objects.equals(this.ebitHigh, ebitEstimatesInfo.ebitHigh) &&
                Objects.equals(this.ebitLow, ebitEstimatesInfo.ebitLow) &&
                Objects.equals(this.numberAnalysts, ebitEstimatesInfo.numberAnalysts) &&
                Objects.equals(this.period, ebitEstimatesInfo.period) &&
                Objects.equals(this.year, ebitEstimatesInfo.year) &&
                Objects.equals(this.quarter, ebitEstimatesInfo.quarter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ebitAvg, ebitHigh, ebitLow, numberAnalysts, period, year, quarter);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EbitEstimatesInfo {\n");

        sb.append("    ebitAvg: ").append(toIndentedString(ebitAvg)).append("\n");
        sb.append("    ebitHigh: ").append(toIndentedString(ebitHigh)).append("\n");
        sb.append("    ebitLow: ").append(toIndentedString(ebitLow)).append("\n");
        sb.append("    numberAnalysts: ").append(toIndentedString(numberAnalysts)).append("\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
        sb.append("    year: ").append(toIndentedString(year)).append("\n");
        sb.append("    quarter: ").append(toIndentedString(quarter)).append("\n");
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

