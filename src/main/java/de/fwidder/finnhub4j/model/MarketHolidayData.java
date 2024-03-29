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
 * MarketHolidayData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-09T22:29:37.142+01:00")
public class MarketHolidayData {
    @JsonProperty("eventName")
    private String eventName = null;

    @JsonProperty("atDate")
    private String atDate = null;

    @JsonProperty("tradingHour")
    private String tradingHour = null;

    public MarketHolidayData eventName(String eventName) {
        this.eventName = eventName;
        return this;
    }

    /**
     * Holiday&#39;s name.
     *
     * @return eventName
     **/
    @ApiModelProperty(value = "Holiday's name.")
    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public MarketHolidayData atDate(String atDate) {
        this.atDate = atDate;
        return this;
    }

    /**
     * Date.
     *
     * @return atDate
     **/
    @ApiModelProperty(value = "Date.")
    public String getAtDate() {
        return atDate;
    }

    public void setAtDate(String atDate) {
        this.atDate = atDate;
    }

    public MarketHolidayData tradingHour(String tradingHour) {
        this.tradingHour = tradingHour;
        return this;
    }

    /**
     * Trading hours for this day if the market is partially closed only.
     *
     * @return tradingHour
     **/
    @ApiModelProperty(value = "Trading hours for this day if the market is partially closed only.")
    public String getTradingHour() {
        return tradingHour;
    }

    public void setTradingHour(String tradingHour) {
        this.tradingHour = tradingHour;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MarketHolidayData marketHolidayData = (MarketHolidayData) o;
        return Objects.equals(this.eventName, marketHolidayData.eventName) &&
                Objects.equals(this.atDate, marketHolidayData.atDate) &&
                Objects.equals(this.tradingHour, marketHolidayData.tradingHour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventName, atDate, tradingHour);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MarketHolidayData {\n");

        sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
        sb.append("    atDate: ").append(toIndentedString(atDate)).append("\n");
        sb.append("    tradingHour: ").append(toIndentedString(tradingHour)).append("\n");
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

