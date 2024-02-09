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
 * MutualFundCountryExposureData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-09T22:29:37.142+01:00")
public class MutualFundCountryExposureData {
    @JsonProperty("country")
    private String country = null;

    @JsonProperty("exposure")
    private Float exposure = null;

    public MutualFundCountryExposureData country(String country) {
        this.country = country;
        return this;
    }

    /**
     * Country
     *
     * @return country
     **/
    @ApiModelProperty(value = "Country")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public MutualFundCountryExposureData exposure(Float exposure) {
        this.exposure = exposure;
        return this;
    }

    /**
     * Percent of exposure.
     *
     * @return exposure
     **/
    @ApiModelProperty(value = "Percent of exposure.")
    public Float getExposure() {
        return exposure;
    }

    public void setExposure(Float exposure) {
        this.exposure = exposure;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MutualFundCountryExposureData mutualFundCountryExposureData = (MutualFundCountryExposureData) o;
        return Objects.equals(this.country, mutualFundCountryExposureData.country) &&
                Objects.equals(this.exposure, mutualFundCountryExposureData.exposure);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, exposure);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MutualFundCountryExposureData {\n");

        sb.append("    country: ").append(toIndentedString(country)).append("\n");
        sb.append("    exposure: ").append(toIndentedString(exposure)).append("\n");
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
