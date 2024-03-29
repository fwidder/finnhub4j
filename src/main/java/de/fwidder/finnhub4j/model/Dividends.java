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
 * Dividends
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-09T22:29:37.142+01:00")
public class Dividends {
    @JsonProperty("symbol")
    private String symbol = null;

    @JsonProperty("date")
    private LocalDate date = null;

    @JsonProperty("amount")
    private Float amount = null;

    @JsonProperty("adjustedAmount")
    private Float adjustedAmount = null;

    @JsonProperty("payDate")
    private LocalDate payDate = null;

    @JsonProperty("recordDate")
    private LocalDate recordDate = null;

    @JsonProperty("declarationDate")
    private LocalDate declarationDate = null;

    @JsonProperty("currency")
    private String currency = null;

    @JsonProperty("freq")
    private String freq = null;

    public Dividends symbol(String symbol) {
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

    public Dividends date(LocalDate date) {
        this.date = date;
        return this;
    }

    /**
     * Ex-Dividend date.
     *
     * @return date
     **/
    @ApiModelProperty(value = "Ex-Dividend date.")
    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Dividends amount(Float amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Amount in local currency.
     *
     * @return amount
     **/
    @ApiModelProperty(value = "Amount in local currency.")
    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public Dividends adjustedAmount(Float adjustedAmount) {
        this.adjustedAmount = adjustedAmount;
        return this;
    }

    /**
     * Adjusted dividend.
     *
     * @return adjustedAmount
     **/
    @ApiModelProperty(value = "Adjusted dividend.")
    public Float getAdjustedAmount() {
        return adjustedAmount;
    }

    public void setAdjustedAmount(Float adjustedAmount) {
        this.adjustedAmount = adjustedAmount;
    }

    public Dividends payDate(LocalDate payDate) {
        this.payDate = payDate;
        return this;
    }

    /**
     * Pay date.
     *
     * @return payDate
     **/
    @ApiModelProperty(value = "Pay date.")
    public LocalDate getPayDate() {
        return payDate;
    }

    public void setPayDate(LocalDate payDate) {
        this.payDate = payDate;
    }

    public Dividends recordDate(LocalDate recordDate) {
        this.recordDate = recordDate;
        return this;
    }

    /**
     * Record date.
     *
     * @return recordDate
     **/
    @ApiModelProperty(value = "Record date.")
    public LocalDate getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(LocalDate recordDate) {
        this.recordDate = recordDate;
    }

    public Dividends declarationDate(LocalDate declarationDate) {
        this.declarationDate = declarationDate;
        return this;
    }

    /**
     * Declaration date.
     *
     * @return declarationDate
     **/
    @ApiModelProperty(value = "Declaration date.")
    public LocalDate getDeclarationDate() {
        return declarationDate;
    }

    public void setDeclarationDate(LocalDate declarationDate) {
        this.declarationDate = declarationDate;
    }

    public Dividends currency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Currency.
     *
     * @return currency
     **/
    @ApiModelProperty(value = "Currency.")
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Dividends freq(String freq) {
        this.freq = freq;
        return this;
    }

    /**
     * &lt;p&gt;Dividend frequency. Can be 1 of the following values:&lt;/p&gt;&lt;ul&gt; &lt;li&gt;&lt;code&gt;0: Annually&lt;/code&gt;&lt;/li&gt; &lt;li&gt;&lt;code&gt;1: Monthly&lt;/code&gt;&lt;/li&gt; &lt;li&gt;&lt;code&gt;2: Quarterly&lt;/code&gt;&lt;/li&gt; &lt;li&gt;&lt;code&gt;3: Semi-annually&lt;/code&gt;&lt;/li&gt; &lt;li&gt;&lt;code&gt;4: Other/Unknown&lt;/code&gt;&lt;/li&gt; &lt;li&gt;&lt;code&gt;5: Bimonthly&lt;/code&gt;&lt;/li&gt; &lt;li&gt;&lt;code&gt;6: Trimesterly&lt;/code&gt;&lt;/li&gt; &lt;li&gt;&lt;code&gt;7: Weekly&lt;/code&gt;&lt;/li&gt; &lt;/ul&gt;
     *
     * @return freq
     **/
    @ApiModelProperty(value = "<p>Dividend frequency. Can be 1 of the following values:</p><ul> <li><code>0: Annually</code></li> <li><code>1: Monthly</code></li> <li><code>2: Quarterly</code></li> <li><code>3: Semi-annually</code></li> <li><code>4: Other/Unknown</code></li> <li><code>5: Bimonthly</code></li> <li><code>6: Trimesterly</code></li> <li><code>7: Weekly</code></li> </ul>")
    public String getFreq() {
        return freq;
    }

    public void setFreq(String freq) {
        this.freq = freq;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Dividends dividends = (Dividends) o;
        return Objects.equals(this.symbol, dividends.symbol) &&
                Objects.equals(this.date, dividends.date) &&
                Objects.equals(this.amount, dividends.amount) &&
                Objects.equals(this.adjustedAmount, dividends.adjustedAmount) &&
                Objects.equals(this.payDate, dividends.payDate) &&
                Objects.equals(this.recordDate, dividends.recordDate) &&
                Objects.equals(this.declarationDate, dividends.declarationDate) &&
                Objects.equals(this.currency, dividends.currency) &&
                Objects.equals(this.freq, dividends.freq);
    }

    @Override
    public int hashCode() {
        return Objects.hash(symbol, date, amount, adjustedAmount, payDate, recordDate, declarationDate, currency, freq);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Dividends {\n");

        sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    adjustedAmount: ").append(toIndentedString(adjustedAmount)).append("\n");
        sb.append("    payDate: ").append(toIndentedString(payDate)).append("\n");
        sb.append("    recordDate: ").append(toIndentedString(recordDate)).append("\n");
        sb.append("    declarationDate: ").append(toIndentedString(declarationDate)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    freq: ").append(toIndentedString(freq)).append("\n");
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

