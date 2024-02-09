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
 * InstitutionalPortfolioInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-09T22:29:37.142+01:00")
public class InstitutionalPortfolioInfo {
    @JsonProperty("symbol")
    private String symbol = null;

    @JsonProperty("cusip")
    private String cusip = null;

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("putCall")
    private String putCall = null;

    @JsonProperty("change")
    private Float change = null;

    @JsonProperty("noVoting")
    private Float noVoting = null;

    @JsonProperty("percentage")
    private Float percentage = null;

    @JsonProperty("share")
    private Float share = null;

    @JsonProperty("sharedVoting")
    private Float sharedVoting = null;

    @JsonProperty("soleVoting")
    private Float soleVoting = null;

    @JsonProperty("value")
    private Float value = null;

    public InstitutionalPortfolioInfo symbol(String symbol) {
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

    public InstitutionalPortfolioInfo cusip(String cusip) {
        this.cusip = cusip;
        return this;
    }

    /**
     * CUSIP.
     *
     * @return cusip
     **/
    @ApiModelProperty(value = "CUSIP.")
    public String getCusip() {
        return cusip;
    }

    public void setCusip(String cusip) {
        this.cusip = cusip;
    }

    public InstitutionalPortfolioInfo name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Position&#39;s name.
     *
     * @return name
     **/
    @ApiModelProperty(value = "Position's name.")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public InstitutionalPortfolioInfo putCall(String putCall) {
        this.putCall = putCall;
        return this;
    }

    /**
     * &lt;code&gt;put&lt;/code&gt; or &lt;code&gt;call&lt;/code&gt; for options.
     *
     * @return putCall
     **/
    @ApiModelProperty(value = "<code>put</code> or <code>call</code> for options.")
    public String getPutCall() {
        return putCall;
    }

    public void setPutCall(String putCall) {
        this.putCall = putCall;
    }

    public InstitutionalPortfolioInfo change(Float change) {
        this.change = change;
        return this;
    }

    /**
     * Number of shares change.
     *
     * @return change
     **/
    @ApiModelProperty(value = "Number of shares change.")
    public Float getChange() {
        return change;
    }

    public void setChange(Float change) {
        this.change = change;
    }

    public InstitutionalPortfolioInfo noVoting(Float noVoting) {
        this.noVoting = noVoting;
        return this;
    }

    /**
     * Number of shares with no voting rights.
     *
     * @return noVoting
     **/
    @ApiModelProperty(value = "Number of shares with no voting rights.")
    public Float getNoVoting() {
        return noVoting;
    }

    public void setNoVoting(Float noVoting) {
        this.noVoting = noVoting;
    }

    public InstitutionalPortfolioInfo percentage(Float percentage) {
        this.percentage = percentage;
        return this;
    }

    /**
     * Percentage of portfolio.
     *
     * @return percentage
     **/
    @ApiModelProperty(value = "Percentage of portfolio.")
    public Float getPercentage() {
        return percentage;
    }

    public void setPercentage(Float percentage) {
        this.percentage = percentage;
    }

    public InstitutionalPortfolioInfo share(Float share) {
        this.share = share;
        return this;
    }

    /**
     * Number of shares.
     *
     * @return share
     **/
    @ApiModelProperty(value = "Number of shares.")
    public Float getShare() {
        return share;
    }

    public void setShare(Float share) {
        this.share = share;
    }

    public InstitutionalPortfolioInfo sharedVoting(Float sharedVoting) {
        this.sharedVoting = sharedVoting;
        return this;
    }

    /**
     * Number of shares with shared voting rights.
     *
     * @return sharedVoting
     **/
    @ApiModelProperty(value = "Number of shares with shared voting rights.")
    public Float getSharedVoting() {
        return sharedVoting;
    }

    public void setSharedVoting(Float sharedVoting) {
        this.sharedVoting = sharedVoting;
    }

    public InstitutionalPortfolioInfo soleVoting(Float soleVoting) {
        this.soleVoting = soleVoting;
        return this;
    }

    /**
     * Number of shares with sole voting rights.
     *
     * @return soleVoting
     **/
    @ApiModelProperty(value = "Number of shares with sole voting rights.")
    public Float getSoleVoting() {
        return soleVoting;
    }

    public void setSoleVoting(Float soleVoting) {
        this.soleVoting = soleVoting;
    }

    public InstitutionalPortfolioInfo value(Float value) {
        this.value = value;
        return this;
    }

    /**
     * Position value.
     *
     * @return value
     **/
    @ApiModelProperty(value = "Position value.")
    public Float getValue() {
        return value;
    }

    public void setValue(Float value) {
        this.value = value;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InstitutionalPortfolioInfo institutionalPortfolioInfo = (InstitutionalPortfolioInfo) o;
        return Objects.equals(this.symbol, institutionalPortfolioInfo.symbol) &&
                Objects.equals(this.cusip, institutionalPortfolioInfo.cusip) &&
                Objects.equals(this.name, institutionalPortfolioInfo.name) &&
                Objects.equals(this.putCall, institutionalPortfolioInfo.putCall) &&
                Objects.equals(this.change, institutionalPortfolioInfo.change) &&
                Objects.equals(this.noVoting, institutionalPortfolioInfo.noVoting) &&
                Objects.equals(this.percentage, institutionalPortfolioInfo.percentage) &&
                Objects.equals(this.share, institutionalPortfolioInfo.share) &&
                Objects.equals(this.sharedVoting, institutionalPortfolioInfo.sharedVoting) &&
                Objects.equals(this.soleVoting, institutionalPortfolioInfo.soleVoting) &&
                Objects.equals(this.value, institutionalPortfolioInfo.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(symbol, cusip, name, putCall, change, noVoting, percentage, share, sharedVoting, soleVoting, value);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstitutionalPortfolioInfo {\n");

        sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
        sb.append("    cusip: ").append(toIndentedString(cusip)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    putCall: ").append(toIndentedString(putCall)).append("\n");
        sb.append("    change: ").append(toIndentedString(change)).append("\n");
        sb.append("    noVoting: ").append(toIndentedString(noVoting)).append("\n");
        sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
        sb.append("    share: ").append(toIndentedString(share)).append("\n");
        sb.append("    sharedVoting: ").append(toIndentedString(sharedVoting)).append("\n");
        sb.append("    soleVoting: ").append(toIndentedString(soleVoting)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

