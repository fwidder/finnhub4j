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
 * FundOwnership
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-09T22:29:37.142+01:00")
public class FundOwnership {
    @JsonProperty("symbol")
    private String symbol = null;

    @JsonProperty("ownership")
    private List<FundOwnershipInfo> ownership = null;

    public FundOwnership symbol(String symbol) {
        this.symbol = symbol;
        return this;
    }

    /**
     * Symbol of the company.
     *
     * @return symbol
     **/
    @ApiModelProperty(value = "Symbol of the company.")
    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public FundOwnership ownership(List<FundOwnershipInfo> ownership) {
        this.ownership = ownership;
        return this;
    }

    public FundOwnership addOwnershipItem(FundOwnershipInfo ownershipItem) {
        if (this.ownership == null) {
            this.ownership = new ArrayList<>();
        }
        this.ownership.add(ownershipItem);
        return this;
    }

    /**
     * Array of investors with detailed information about their holdings.
     *
     * @return ownership
     **/
    @ApiModelProperty(value = "Array of investors with detailed information about their holdings.")
    public List<FundOwnershipInfo> getOwnership() {
        return ownership;
    }

    public void setOwnership(List<FundOwnershipInfo> ownership) {
        this.ownership = ownership;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FundOwnership fundOwnership = (FundOwnership) o;
        return Objects.equals(this.symbol, fundOwnership.symbol) &&
                Objects.equals(this.ownership, fundOwnership.ownership);
    }

    @Override
    public int hashCode() {
        return Objects.hash(symbol, ownership);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FundOwnership {\n");

        sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
        sb.append("    ownership: ").append(toIndentedString(ownership)).append("\n");
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
