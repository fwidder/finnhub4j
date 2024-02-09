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
 * MarketHoliday
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-09T22:29:37.142+01:00")
public class MarketHoliday {
    @JsonProperty("timezone")
    private String timezone = null;

    @JsonProperty("exchange")
    private String exchange = null;

    @JsonProperty("data")
    private List<MarketHolidayData> data = null;

    public MarketHoliday timezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    /**
     * Timezone.
     *
     * @return timezone
     **/
    @ApiModelProperty(value = "Timezone.")
    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public MarketHoliday exchange(String exchange) {
        this.exchange = exchange;
        return this;
    }

    /**
     * Exchange.
     *
     * @return exchange
     **/
    @ApiModelProperty(value = "Exchange.")
    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public MarketHoliday data(List<MarketHolidayData> data) {
        this.data = data;
        return this;
    }

    public MarketHoliday addDataItem(MarketHolidayData dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(dataItem);
        return this;
    }

    /**
     * Array of holidays.
     *
     * @return data
     **/
    @ApiModelProperty(value = "Array of holidays.")
    public List<MarketHolidayData> getData() {
        return data;
    }

    public void setData(List<MarketHolidayData> data) {
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
        MarketHoliday marketHoliday = (MarketHoliday) o;
        return Objects.equals(this.timezone, marketHoliday.timezone) &&
                Objects.equals(this.exchange, marketHoliday.exchange) &&
                Objects.equals(this.data, marketHoliday.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timezone, exchange, data);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MarketHoliday {\n");

        sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
        sb.append("    exchange: ").append(toIndentedString(exchange)).append("\n");
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

