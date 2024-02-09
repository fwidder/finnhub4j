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
 * Trend
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-09T22:29:37.142+01:00")
public class Trend {
    @JsonProperty("adx")
    private Float adx = null;

    @JsonProperty("trending")
    private Boolean trending = null;

    public Trend adx(Float adx) {
        this.adx = adx;
        return this;
    }

    /**
     * ADX reading
     *
     * @return adx
     **/
    @ApiModelProperty(value = "ADX reading")
    public Float getAdx() {
        return adx;
    }

    public void setAdx(Float adx) {
        this.adx = adx;
    }

    public Trend trending(Boolean trending) {
        this.trending = trending;
        return this;
    }

    /**
     * Whether market is trending or going sideway
     *
     * @return trending
     **/
    @ApiModelProperty(value = "Whether market is trending or going sideway")
    public Boolean isTrending() {
        return trending;
    }

    public void setTrending(Boolean trending) {
        this.trending = trending;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Trend trend = (Trend) o;
        return Objects.equals(this.adx, trend.adx) &&
                Objects.equals(this.trending, trend.trending);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adx, trending);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Trend {\n");

        sb.append("    adx: ").append(toIndentedString(adx)).append("\n");
        sb.append("    trending: ").append(toIndentedString(trending)).append("\n");
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

