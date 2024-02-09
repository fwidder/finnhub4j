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
 * Indicator
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-09T22:29:37.142+01:00")
public class Indicator {
    @JsonProperty("buy")
    private Long buy = null;

    @JsonProperty("neutral")
    private Long neutral = null;

    @JsonProperty("sell")
    private Long sell = null;

    public Indicator buy(Long buy) {
        this.buy = buy;
        return this;
    }

    /**
     * Number of buy signals
     *
     * @return buy
     **/
    @ApiModelProperty(value = "Number of buy signals")
    public Long getBuy() {
        return buy;
    }

    public void setBuy(Long buy) {
        this.buy = buy;
    }

    public Indicator neutral(Long neutral) {
        this.neutral = neutral;
        return this;
    }

    /**
     * Number of neutral signals
     *
     * @return neutral
     **/
    @ApiModelProperty(value = "Number of neutral signals")
    public Long getNeutral() {
        return neutral;
    }

    public void setNeutral(Long neutral) {
        this.neutral = neutral;
    }

    public Indicator sell(Long sell) {
        this.sell = sell;
        return this;
    }

    /**
     * Number of sell signals
     *
     * @return sell
     **/
    @ApiModelProperty(value = "Number of sell signals")
    public Long getSell() {
        return sell;
    }

    public void setSell(Long sell) {
        this.sell = sell;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Indicator indicator = (Indicator) o;
        return Objects.equals(this.buy, indicator.buy) &&
                Objects.equals(this.neutral, indicator.neutral) &&
                Objects.equals(this.sell, indicator.sell);
    }

    @Override
    public int hashCode() {
        return Objects.hash(buy, neutral, sell);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Indicator {\n");

        sb.append("    buy: ").append(toIndentedString(buy)).append("\n");
        sb.append("    neutral: ").append(toIndentedString(neutral)).append("\n");
        sb.append("    sell: ").append(toIndentedString(sell)).append("\n");
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
