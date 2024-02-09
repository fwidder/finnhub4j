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
 * MutualFundProfile
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-09T22:29:37.142+01:00")
public class MutualFundProfile {
    @JsonProperty("symbol")
    private String symbol = null;

    @JsonProperty("profile")
    private MutualFundProfileData profile = null;

    public MutualFundProfile symbol(String symbol) {
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

    public MutualFundProfile profile(MutualFundProfileData profile) {
        this.profile = profile;
        return this;
    }

    /**
     * Profile data.
     *
     * @return profile
     **/
    @ApiModelProperty(value = "Profile data.")
    public MutualFundProfileData getProfile() {
        return profile;
    }

    public void setProfile(MutualFundProfileData profile) {
        this.profile = profile;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MutualFundProfile mutualFundProfile = (MutualFundProfile) o;
        return Objects.equals(this.symbol, mutualFundProfile.symbol) &&
                Objects.equals(this.profile, mutualFundProfile.profile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(symbol, profile);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MutualFundProfile {\n");

        sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
        sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
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
