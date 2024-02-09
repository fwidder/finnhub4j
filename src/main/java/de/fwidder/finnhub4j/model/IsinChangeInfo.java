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
 * IsinChangeInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-09T22:29:37.142+01:00")
public class IsinChangeInfo {
    @JsonProperty("atDate")
    private String atDate = null;

    @JsonProperty("oldIsin")
    private String oldIsin = null;

    @JsonProperty("newIsin")
    private String newIsin = null;

    public IsinChangeInfo atDate(String atDate) {
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

    public IsinChangeInfo oldIsin(String oldIsin) {
        this.oldIsin = oldIsin;
        return this;
    }

    /**
     * Old ISIN.
     *
     * @return oldIsin
     **/
    @ApiModelProperty(value = "Old ISIN.")
    public String getOldIsin() {
        return oldIsin;
    }

    public void setOldIsin(String oldIsin) {
        this.oldIsin = oldIsin;
    }

    public IsinChangeInfo newIsin(String newIsin) {
        this.newIsin = newIsin;
        return this;
    }

    /**
     * New ISIN.
     *
     * @return newIsin
     **/
    @ApiModelProperty(value = "New ISIN.")
    public String getNewIsin() {
        return newIsin;
    }

    public void setNewIsin(String newIsin) {
        this.newIsin = newIsin;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IsinChangeInfo isinChangeInfo = (IsinChangeInfo) o;
        return Objects.equals(this.atDate, isinChangeInfo.atDate) &&
                Objects.equals(this.oldIsin, isinChangeInfo.oldIsin) &&
                Objects.equals(this.newIsin, isinChangeInfo.newIsin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(atDate, oldIsin, newIsin);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IsinChangeInfo {\n");

        sb.append("    atDate: ").append(toIndentedString(atDate)).append("\n");
        sb.append("    oldIsin: ").append(toIndentedString(oldIsin)).append("\n");
        sb.append("    newIsin: ").append(toIndentedString(newIsin)).append("\n");
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

