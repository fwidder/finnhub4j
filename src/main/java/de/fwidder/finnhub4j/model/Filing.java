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
 * Filing
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-09T22:29:37.142+01:00")
public class Filing {
    @JsonProperty("accessNumber")
    private String accessNumber = null;

    @JsonProperty("symbol")
    private String symbol = null;

    @JsonProperty("cik")
    private String cik = null;

    @JsonProperty("form")
    private String form = null;

    @JsonProperty("filedDate")
    private String filedDate = null;

    @JsonProperty("acceptedDate")
    private String acceptedDate = null;

    @JsonProperty("reportUrl")
    private String reportUrl = null;

    @JsonProperty("filingUrl")
    private String filingUrl = null;

    public Filing accessNumber(String accessNumber) {
        this.accessNumber = accessNumber;
        return this;
    }

    /**
     * Access number.
     *
     * @return accessNumber
     **/
    @ApiModelProperty(value = "Access number.")
    public String getAccessNumber() {
        return accessNumber;
    }

    public void setAccessNumber(String accessNumber) {
        this.accessNumber = accessNumber;
    }

    public Filing symbol(String symbol) {
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

    public Filing cik(String cik) {
        this.cik = cik;
        return this;
    }

    /**
     * CIK.
     *
     * @return cik
     **/
    @ApiModelProperty(value = "CIK.")
    public String getCik() {
        return cik;
    }

    public void setCik(String cik) {
        this.cik = cik;
    }

    public Filing form(String form) {
        this.form = form;
        return this;
    }

    /**
     * Form type.
     *
     * @return form
     **/
    @ApiModelProperty(value = "Form type.")
    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public Filing filedDate(String filedDate) {
        this.filedDate = filedDate;
        return this;
    }

    /**
     * Filed date &lt;code&gt;%Y-%m-%d %H:%M:%S&lt;/code&gt;.
     *
     * @return filedDate
     **/
    @ApiModelProperty(value = "Filed date <code>%Y-%m-%d %H:%M:%S</code>.")
    public String getFiledDate() {
        return filedDate;
    }

    public void setFiledDate(String filedDate) {
        this.filedDate = filedDate;
    }

    public Filing acceptedDate(String acceptedDate) {
        this.acceptedDate = acceptedDate;
        return this;
    }

    /**
     * Accepted date &lt;code&gt;%Y-%m-%d %H:%M:%S&lt;/code&gt;.
     *
     * @return acceptedDate
     **/
    @ApiModelProperty(value = "Accepted date <code>%Y-%m-%d %H:%M:%S</code>.")
    public String getAcceptedDate() {
        return acceptedDate;
    }

    public void setAcceptedDate(String acceptedDate) {
        this.acceptedDate = acceptedDate;
    }

    public Filing reportUrl(String reportUrl) {
        this.reportUrl = reportUrl;
        return this;
    }

    /**
     * Report&#39;s URL.
     *
     * @return reportUrl
     **/
    @ApiModelProperty(value = "Report's URL.")
    public String getReportUrl() {
        return reportUrl;
    }

    public void setReportUrl(String reportUrl) {
        this.reportUrl = reportUrl;
    }

    public Filing filingUrl(String filingUrl) {
        this.filingUrl = filingUrl;
        return this;
    }

    /**
     * Filing&#39;s URL.
     *
     * @return filingUrl
     **/
    @ApiModelProperty(value = "Filing's URL.")
    public String getFilingUrl() {
        return filingUrl;
    }

    public void setFilingUrl(String filingUrl) {
        this.filingUrl = filingUrl;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Filing filing = (Filing) o;
        return Objects.equals(this.accessNumber, filing.accessNumber) &&
                Objects.equals(this.symbol, filing.symbol) &&
                Objects.equals(this.cik, filing.cik) &&
                Objects.equals(this.form, filing.form) &&
                Objects.equals(this.filedDate, filing.filedDate) &&
                Objects.equals(this.acceptedDate, filing.acceptedDate) &&
                Objects.equals(this.reportUrl, filing.reportUrl) &&
                Objects.equals(this.filingUrl, filing.filingUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessNumber, symbol, cik, form, filedDate, acceptedDate, reportUrl, filingUrl);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Filing {\n");

        sb.append("    accessNumber: ").append(toIndentedString(accessNumber)).append("\n");
        sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
        sb.append("    cik: ").append(toIndentedString(cik)).append("\n");
        sb.append("    form: ").append(toIndentedString(form)).append("\n");
        sb.append("    filedDate: ").append(toIndentedString(filedDate)).append("\n");
        sb.append("    acceptedDate: ").append(toIndentedString(acceptedDate)).append("\n");
        sb.append("    reportUrl: ").append(toIndentedString(reportUrl)).append("\n");
        sb.append("    filingUrl: ").append(toIndentedString(filingUrl)).append("\n");
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

