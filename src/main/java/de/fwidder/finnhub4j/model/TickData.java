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
 * TickData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-09T22:29:37.142+01:00")
public class TickData {
    @JsonProperty("s")
    private String s = null;

    @JsonProperty("skip")
    private Long skip = null;

    @JsonProperty("count")
    private Long count = null;

    @JsonProperty("total")
    private Long total = null;

    @JsonProperty("v")
    private List<Float> v = null;

    @JsonProperty("p")
    private List<Float> p = null;

    @JsonProperty("t")
    private List<Long> t = null;

    @JsonProperty("x")
    private List<String> x = null;

    @JsonProperty("c")
    private List<List<String>> c = null;

    public TickData s(String s) {
        this.s = s;
        return this;
    }

    /**
     * Symbol.
     *
     * @return s
     **/
    @ApiModelProperty(value = "Symbol.")
    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public TickData skip(Long skip) {
        this.skip = skip;
        return this;
    }

    /**
     * Number of ticks skipped.
     *
     * @return skip
     **/
    @ApiModelProperty(value = "Number of ticks skipped.")
    public Long getSkip() {
        return skip;
    }

    public void setSkip(Long skip) {
        this.skip = skip;
    }

    public TickData count(Long count) {
        this.count = count;
        return this;
    }

    /**
     * Number of ticks returned. If &lt;code&gt;count&lt;/code&gt; &lt; &lt;code&gt;limit&lt;/code&gt;, all data for that date has been returned.
     *
     * @return count
     **/
    @ApiModelProperty(value = "Number of ticks returned. If <code>count</code> < <code>limit</code>, all data for that date has been returned.")
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public TickData total(Long total) {
        this.total = total;
        return this;
    }

    /**
     * Total number of ticks for that date.
     *
     * @return total
     **/
    @ApiModelProperty(value = "Total number of ticks for that date.")
    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public TickData v(List<Float> v) {
        this.v = v;
        return this;
    }

    public TickData addVItem(Float vItem) {
        if (this.v == null) {
            this.v = new ArrayList<>();
        }
        this.v.add(vItem);
        return this;
    }

    /**
     * List of volume data.
     *
     * @return v
     **/
    @ApiModelProperty(value = "List of volume data.")
    public List<Float> getV() {
        return v;
    }

    public void setV(List<Float> v) {
        this.v = v;
    }

    public TickData p(List<Float> p) {
        this.p = p;
        return this;
    }

    public TickData addPItem(Float pItem) {
        if (this.p == null) {
            this.p = new ArrayList<>();
        }
        this.p.add(pItem);
        return this;
    }

    /**
     * List of price data.
     *
     * @return p
     **/
    @ApiModelProperty(value = "List of price data.")
    public List<Float> getP() {
        return p;
    }

    public void setP(List<Float> p) {
        this.p = p;
    }

    public TickData t(List<Long> t) {
        this.t = t;
        return this;
    }

    public TickData addTItem(Long tItem) {
        if (this.t == null) {
            this.t = new ArrayList<>();
        }
        this.t.add(tItem);
        return this;
    }

    /**
     * List of timestamp in UNIX ms.
     *
     * @return t
     **/
    @ApiModelProperty(value = "List of timestamp in UNIX ms.")
    public List<Long> getT() {
        return t;
    }

    public void setT(List<Long> t) {
        this.t = t;
    }

    public TickData x(List<String> x) {
        this.x = x;
        return this;
    }

    public TickData addXItem(String xItem) {
        if (this.x == null) {
            this.x = new ArrayList<>();
        }
        this.x.add(xItem);
        return this;
    }

    /**
     * List of venues/exchanges. A list of exchange codes can be found &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1Tj53M1svmr-hfEtbk6_NpVR1yAyGLMaH6ByYU6CG0ZY/edit?usp&#x3D;sharing\&quot;,&gt;here&lt;/a&gt;
     *
     * @return x
     **/
    @ApiModelProperty(value = "List of venues/exchanges. A list of exchange codes can be found <a target=\"_blank\" href=\"https://docs.google.com/spreadsheets/d/1Tj53M1svmr-hfEtbk6_NpVR1yAyGLMaH6ByYU6CG0ZY/edit?usp=sharing\",>here</a>")
    public List<String> getX() {
        return x;
    }

    public void setX(List<String> x) {
        this.x = x;
    }

    public TickData c(List<List<String>> c) {
        this.c = c;
        return this;
    }

    public TickData addCItem(List<String> cItem) {
        if (this.c == null) {
            this.c = new ArrayList<>();
        }
        this.c.add(cItem);
        return this;
    }

    /**
     * List of trade conditions. A comprehensive list of trade conditions code can be found &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1PUxiSWPHSODbaTaoL2Vef6DgU-yFtlRGZf19oBb9Hp0/edit?usp&#x3D;sharing\&quot;&gt;here&lt;/a&gt;
     *
     * @return c
     **/
    @ApiModelProperty(value = "List of trade conditions. A comprehensive list of trade conditions code can be found <a target=\"_blank\" href=\"https://docs.google.com/spreadsheets/d/1PUxiSWPHSODbaTaoL2Vef6DgU-yFtlRGZf19oBb9Hp0/edit?usp=sharing\">here</a>")
    public List<List<String>> getC() {
        return c;
    }

    public void setC(List<List<String>> c) {
        this.c = c;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TickData tickData = (TickData) o;
        return Objects.equals(this.s, tickData.s) &&
                Objects.equals(this.skip, tickData.skip) &&
                Objects.equals(this.count, tickData.count) &&
                Objects.equals(this.total, tickData.total) &&
                Objects.equals(this.v, tickData.v) &&
                Objects.equals(this.p, tickData.p) &&
                Objects.equals(this.t, tickData.t) &&
                Objects.equals(this.x, tickData.x) &&
                Objects.equals(this.c, tickData.c);
    }

    @Override
    public int hashCode() {
        return Objects.hash(s, skip, count, total, v, p, t, x, c);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TickData {\n");

        sb.append("    s: ").append(toIndentedString(s)).append("\n");
        sb.append("    skip: ").append(toIndentedString(skip)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    v: ").append(toIndentedString(v)).append("\n");
        sb.append("    p: ").append(toIndentedString(p)).append("\n");
        sb.append("    t: ").append(toIndentedString(t)).append("\n");
        sb.append("    x: ").append(toIndentedString(x)).append("\n");
        sb.append("    c: ").append(toIndentedString(c)).append("\n");
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

