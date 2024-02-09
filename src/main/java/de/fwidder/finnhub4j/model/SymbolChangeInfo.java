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
 * SymbolChangeInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-09T22:29:37.142+01:00")
public class SymbolChangeInfo {
    @JsonProperty("atDate")
    private String atDate = null;

    @JsonProperty("oldSymbol")
    private String oldSymbol = null;

    @JsonProperty("newSymbol")
    private String newSymbol = null;

    public SymbolChangeInfo atDate(String atDate) {
        this.atDate = atDate;
        return this;
    }

    /**
     * Event&#39;s date.
     *
     * @return atDate
     **/
    @ApiModelProperty(value = "Event's date.")
    public String getAtDate() {
        return atDate;
    }

    public void setAtDate(String atDate) {
        this.atDate = atDate;
    }

    public SymbolChangeInfo oldSymbol(String oldSymbol) {
        this.oldSymbol = oldSymbol;
        return this;
    }

    /**
     * Old symbol.
     *
     * @return oldSymbol
     **/
    @ApiModelProperty(value = "Old symbol.")
    public String getOldSymbol() {
        return oldSymbol;
    }

    public void setOldSymbol(String oldSymbol) {
        this.oldSymbol = oldSymbol;
    }

    public SymbolChangeInfo newSymbol(String newSymbol) {
        this.newSymbol = newSymbol;
        return this;
    }

    /**
     * New symbol.
     *
     * @return newSymbol
     **/
    @ApiModelProperty(value = "New symbol.")
    public String getNewSymbol() {
        return newSymbol;
    }

    public void setNewSymbol(String newSymbol) {
        this.newSymbol = newSymbol;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SymbolChangeInfo symbolChangeInfo = (SymbolChangeInfo) o;
        return Objects.equals(this.atDate, symbolChangeInfo.atDate) &&
                Objects.equals(this.oldSymbol, symbolChangeInfo.oldSymbol) &&
                Objects.equals(this.newSymbol, symbolChangeInfo.newSymbol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(atDate, oldSymbol, newSymbol);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SymbolChangeInfo {\n");

        sb.append("    atDate: ").append(toIndentedString(atDate)).append("\n");
        sb.append("    oldSymbol: ").append(toIndentedString(oldSymbol)).append("\n");
        sb.append("    newSymbol: ").append(toIndentedString(newSymbol)).append("\n");
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

