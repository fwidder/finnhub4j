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
 * BreakdownItem
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-09T22:29:37.142+01:00")
public class BreakdownItem {
    @JsonProperty("accessNumber")
    private String accessNumber = null;

    @JsonProperty("breakdown")
    private BreakdownItemMap breakdown = null;

    public BreakdownItem accessNumber(String accessNumber) {
        this.accessNumber = accessNumber;
        return this;
    }

    /**
     * Access number of the report from which the data is sourced.
     *
     * @return accessNumber
     **/
    @ApiModelProperty(value = "Access number of the report from which the data is sourced.")
    public String getAccessNumber() {
        return accessNumber;
    }

    public void setAccessNumber(String accessNumber) {
        this.accessNumber = accessNumber;
    }

    public BreakdownItem breakdown(BreakdownItemMap breakdown) {
        this.breakdown = breakdown;
        return this;
    }

    /**
     * Revenue breakdown.
     *
     * @return breakdown
     **/
    @ApiModelProperty(value = "Revenue breakdown.")
    public BreakdownItemMap getBreakdown() {
        return breakdown;
    }

    public void setBreakdown(BreakdownItemMap breakdown) {
        this.breakdown = breakdown;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BreakdownItem breakdownItem = (BreakdownItem) o;
        return Objects.equals(this.accessNumber, breakdownItem.accessNumber) &&
                Objects.equals(this.breakdown, breakdownItem.breakdown);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessNumber, breakdown);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BreakdownItem {\n");

        sb.append("    accessNumber: ").append(toIndentedString(accessNumber)).append("\n");
        sb.append("    breakdown: ").append(toIndentedString(breakdown)).append("\n");
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

