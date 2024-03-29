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
 * CompanyEarningsQualityScoreData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-09T22:29:37.142+01:00")
public class CompanyEarningsQualityScoreData {
    @JsonProperty("period")
    private String period = null;

    @JsonProperty("growth")
    private Float growth = null;

    @JsonProperty("profitability")
    private Float profitability = null;

    @JsonProperty("cashGenerationCapitalAllocation")
    private Float cashGenerationCapitalAllocation = null;

    @JsonProperty("leverage")
    private Float leverage = null;

    @JsonProperty("score")
    private Float score = null;

    @JsonProperty("letterScore")
    private String letterScore = null;

    public CompanyEarningsQualityScoreData period(String period) {
        this.period = period;
        return this;
    }

    /**
     * Period
     *
     * @return period
     **/
    @ApiModelProperty(value = "Period")
    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public CompanyEarningsQualityScoreData growth(Float growth) {
        this.growth = growth;
        return this;
    }

    /**
     * Growth Score
     *
     * @return growth
     **/
    @ApiModelProperty(value = "Growth Score")
    public Float getGrowth() {
        return growth;
    }

    public void setGrowth(Float growth) {
        this.growth = growth;
    }

    public CompanyEarningsQualityScoreData profitability(Float profitability) {
        this.profitability = profitability;
        return this;
    }

    /**
     * Profitability Score
     *
     * @return profitability
     **/
    @ApiModelProperty(value = "Profitability Score")
    public Float getProfitability() {
        return profitability;
    }

    public void setProfitability(Float profitability) {
        this.profitability = profitability;
    }

    public CompanyEarningsQualityScoreData cashGenerationCapitalAllocation(Float cashGenerationCapitalAllocation) {
        this.cashGenerationCapitalAllocation = cashGenerationCapitalAllocation;
        return this;
    }

    /**
     * Cash Generation and Capital Allocation
     *
     * @return cashGenerationCapitalAllocation
     **/
    @ApiModelProperty(value = "Cash Generation and Capital Allocation")
    public Float getCashGenerationCapitalAllocation() {
        return cashGenerationCapitalAllocation;
    }

    public void setCashGenerationCapitalAllocation(Float cashGenerationCapitalAllocation) {
        this.cashGenerationCapitalAllocation = cashGenerationCapitalAllocation;
    }

    public CompanyEarningsQualityScoreData leverage(Float leverage) {
        this.leverage = leverage;
        return this;
    }

    /**
     * Leverage Score
     *
     * @return leverage
     **/
    @ApiModelProperty(value = "Leverage Score")
    public Float getLeverage() {
        return leverage;
    }

    public void setLeverage(Float leverage) {
        this.leverage = leverage;
    }

    public CompanyEarningsQualityScoreData score(Float score) {
        this.score = score;
        return this;
    }

    /**
     * Total Score
     *
     * @return score
     **/
    @ApiModelProperty(value = "Total Score")
    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    public CompanyEarningsQualityScoreData letterScore(String letterScore) {
        this.letterScore = letterScore;
        return this;
    }

    /**
     * Letter Score
     *
     * @return letterScore
     **/
    @ApiModelProperty(value = "Letter Score")
    public String getLetterScore() {
        return letterScore;
    }

    public void setLetterScore(String letterScore) {
        this.letterScore = letterScore;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CompanyEarningsQualityScoreData companyEarningsQualityScoreData = (CompanyEarningsQualityScoreData) o;
        return Objects.equals(this.period, companyEarningsQualityScoreData.period) &&
                Objects.equals(this.growth, companyEarningsQualityScoreData.growth) &&
                Objects.equals(this.profitability, companyEarningsQualityScoreData.profitability) &&
                Objects.equals(this.cashGenerationCapitalAllocation, companyEarningsQualityScoreData.cashGenerationCapitalAllocation) &&
                Objects.equals(this.leverage, companyEarningsQualityScoreData.leverage) &&
                Objects.equals(this.score, companyEarningsQualityScoreData.score) &&
                Objects.equals(this.letterScore, companyEarningsQualityScoreData.letterScore);
    }

    @Override
    public int hashCode() {
        return Objects.hash(period, growth, profitability, cashGenerationCapitalAllocation, leverage, score, letterScore);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CompanyEarningsQualityScoreData {\n");

        sb.append("    period: ").append(toIndentedString(period)).append("\n");
        sb.append("    growth: ").append(toIndentedString(growth)).append("\n");
        sb.append("    profitability: ").append(toIndentedString(profitability)).append("\n");
        sb.append("    cashGenerationCapitalAllocation: ").append(toIndentedString(cashGenerationCapitalAllocation)).append("\n");
        sb.append("    leverage: ").append(toIndentedString(leverage)).append("\n");
        sb.append("    score: ").append(toIndentedString(score)).append("\n");
        sb.append("    letterScore: ").append(toIndentedString(letterScore)).append("\n");
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

