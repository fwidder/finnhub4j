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
 * SupplyChainRelationships
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-09T22:29:37.142+01:00")
public class SupplyChainRelationships {
    @JsonProperty("symbol")
    private String symbol = null;

    @JsonProperty("data")
    private List<KeyCustomersSuppliers> data = null;

    public SupplyChainRelationships symbol(String symbol) {
        this.symbol = symbol;
        return this;
    }

    /**
     * symbol
     *
     * @return symbol
     **/
    @ApiModelProperty(value = "symbol")
    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public SupplyChainRelationships data(List<KeyCustomersSuppliers> data) {
        this.data = data;
        return this;
    }

    public SupplyChainRelationships addDataItem(KeyCustomersSuppliers dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(dataItem);
        return this;
    }

    /**
     * Key customers and suppliers.
     *
     * @return data
     **/
    @ApiModelProperty(value = "Key customers and suppliers.")
    public List<KeyCustomersSuppliers> getData() {
        return data;
    }

    public void setData(List<KeyCustomersSuppliers> data) {
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
        SupplyChainRelationships supplyChainRelationships = (SupplyChainRelationships) o;
        return Objects.equals(this.symbol, supplyChainRelationships.symbol) &&
                Objects.equals(this.data, supplyChainRelationships.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(symbol, data);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SupplyChainRelationships {\n");

        sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
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

