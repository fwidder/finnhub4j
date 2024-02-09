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
 * LastBidAsk
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-09T22:29:37.142+01:00")
public class LastBidAsk {
    @JsonProperty("b")
    private Float b = null;

    @JsonProperty("a")
    private Float a = null;

    @JsonProperty("bv")
    private Float bv = null;

    @JsonProperty("av")
    private Float av = null;

    @JsonProperty("t")
    private Long t = null;

    public LastBidAsk b(Float b) {
        this.b = b;
        return this;
    }

    /**
     * Bid price.
     *
     * @return b
     **/
    @ApiModelProperty(value = "Bid price.")
    public Float getB() {
        return b;
    }

    public void setB(Float b) {
        this.b = b;
    }

    public LastBidAsk a(Float a) {
        this.a = a;
        return this;
    }

    /**
     * Ask price.
     *
     * @return a
     **/
    @ApiModelProperty(value = "Ask price.")
    public Float getA() {
        return a;
    }

    public void setA(Float a) {
        this.a = a;
    }

    public LastBidAsk bv(Float bv) {
        this.bv = bv;
        return this;
    }

    /**
     * Bid volume.
     *
     * @return bv
     **/
    @ApiModelProperty(value = "Bid volume.")
    public Float getBv() {
        return bv;
    }

    public void setBv(Float bv) {
        this.bv = bv;
    }

    public LastBidAsk av(Float av) {
        this.av = av;
        return this;
    }

    /**
     * Ask volume.
     *
     * @return av
     **/
    @ApiModelProperty(value = "Ask volume.")
    public Float getAv() {
        return av;
    }

    public void setAv(Float av) {
        this.av = av;
    }

    public LastBidAsk t(Long t) {
        this.t = t;
        return this;
    }

    /**
     * Reference UNIX timestamp in ms.
     *
     * @return t
     **/
    @ApiModelProperty(value = "Reference UNIX timestamp in ms.")
    public Long getT() {
        return t;
    }

    public void setT(Long t) {
        this.t = t;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LastBidAsk lastBidAsk = (LastBidAsk) o;
        return Objects.equals(this.b, lastBidAsk.b) &&
                Objects.equals(this.a, lastBidAsk.a) &&
                Objects.equals(this.bv, lastBidAsk.bv) &&
                Objects.equals(this.av, lastBidAsk.av) &&
                Objects.equals(this.t, lastBidAsk.t);
    }

    @Override
    public int hashCode() {
        return Objects.hash(b, a, bv, av, t);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LastBidAsk {\n");

        sb.append("    b: ").append(toIndentedString(b)).append("\n");
        sb.append("    a: ").append(toIndentedString(a)).append("\n");
        sb.append("    bv: ").append(toIndentedString(bv)).append("\n");
        sb.append("    av: ").append(toIndentedString(av)).append("\n");
        sb.append("    t: ").append(toIndentedString(t)).append("\n");
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
