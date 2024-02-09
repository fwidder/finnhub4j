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

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * MutualFundEetPai
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-09T22:29:37.142+01:00")
public class MutualFundEetPai {
    @JsonProperty("isin")
    private String isin = null;

    @JsonProperty("data")
    private MutualFundEetPaiData data = null;

    public MutualFundEetPai isin(String isin) {
        this.isin = isin;
        return this;
    }

    /**
     * ISIN.
     *
     * @return isin
     **/
    @ApiModelProperty(value = "ISIN.")
    public String getIsin() {
        return isin;
    }

    public void setIsin(String isin) {
        this.isin = isin;
    }

    public MutualFundEetPai data(MutualFundEetPaiData data) {
        this.data = data;
        return this;
    }

    /**
     * EET data.
     *
     * @return data
     **/
    @ApiModelProperty(value = "EET data.")
    public MutualFundEetPaiData getData() {
        return data;
    }

    public void setData(MutualFundEetPaiData data) {
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
        MutualFundEetPai mutualFundEetPai = (MutualFundEetPai) o;
        return Objects.equals(this.isin, mutualFundEetPai.isin) &&
                Objects.equals(this.data, mutualFundEetPai.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isin, data);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MutualFundEetPai {\n");

        sb.append("    isin: ").append(toIndentedString(isin)).append("\n");
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
