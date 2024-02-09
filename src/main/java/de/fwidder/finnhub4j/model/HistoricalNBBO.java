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
 * HistoricalNBBO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-09T22:29:37.142+01:00")
public class HistoricalNBBO {
    @JsonProperty("s")
    private String s = null;

    @JsonProperty("skip")
    private Long skip = null;

    @JsonProperty("count")
    private Long count = null;

    @JsonProperty("total")
    private Long total = null;

    @JsonProperty("av")
    private List<Float> av = null;

    @JsonProperty("a")
    private List<Float> a = null;

    @JsonProperty("ax")
    private List<String> ax = null;

    @JsonProperty("bv")
    private List<Float> bv = null;

    @JsonProperty("b")
    private List<Float> b = null;

    @JsonProperty("bx")
    private List<String> bx = null;

    @JsonProperty("t")
    private List<Long> t = null;

    @JsonProperty("c")
    private List<List<String>> c = null;

    public HistoricalNBBO s(String s) {
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

    public HistoricalNBBO skip(Long skip) {
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

    public HistoricalNBBO count(Long count) {
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

    public HistoricalNBBO total(Long total) {
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

    public HistoricalNBBO av(List<Float> av) {
        this.av = av;
        return this;
    }

    public HistoricalNBBO addAvItem(Float avItem) {
        if (this.av == null) {
            this.av = new ArrayList<>();
        }
        this.av.add(avItem);
        return this;
    }

    /**
     * List of Ask volume data.
     *
     * @return av
     **/
    @ApiModelProperty(value = "List of Ask volume data.")
    public List<Float> getAv() {
        return av;
    }

    public void setAv(List<Float> av) {
        this.av = av;
    }

    public HistoricalNBBO a(List<Float> a) {
        this.a = a;
        return this;
    }

    public HistoricalNBBO addAItem(Float aItem) {
        if (this.a == null) {
            this.a = new ArrayList<>();
        }
        this.a.add(aItem);
        return this;
    }

    /**
     * List of Ask price data.
     *
     * @return a
     **/
    @ApiModelProperty(value = "List of Ask price data.")
    public List<Float> getA() {
        return a;
    }

    public void setA(List<Float> a) {
        this.a = a;
    }

    public HistoricalNBBO ax(List<String> ax) {
        this.ax = ax;
        return this;
    }

    public HistoricalNBBO addAxItem(String axItem) {
        if (this.ax == null) {
            this.ax = new ArrayList<>();
        }
        this.ax.add(axItem);
        return this;
    }

    /**
     * List of venues/exchanges - Ask price. A list of exchange codes can be found &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1Tj53M1svmr-hfEtbk6_NpVR1yAyGLMaH6ByYU6CG0ZY/edit?usp&#x3D;sharing\&quot;,&gt;here&lt;/a&gt;
     *
     * @return ax
     **/
    @ApiModelProperty(value = "List of venues/exchanges - Ask price. A list of exchange codes can be found <a target=\"_blank\" href=\"https://docs.google.com/spreadsheets/d/1Tj53M1svmr-hfEtbk6_NpVR1yAyGLMaH6ByYU6CG0ZY/edit?usp=sharing\",>here</a>")
    public List<String> getAx() {
        return ax;
    }

    public void setAx(List<String> ax) {
        this.ax = ax;
    }

    public HistoricalNBBO bv(List<Float> bv) {
        this.bv = bv;
        return this;
    }

    public HistoricalNBBO addBvItem(Float bvItem) {
        if (this.bv == null) {
            this.bv = new ArrayList<>();
        }
        this.bv.add(bvItem);
        return this;
    }

    /**
     * List of Bid volume data.
     *
     * @return bv
     **/
    @ApiModelProperty(value = "List of Bid volume data.")
    public List<Float> getBv() {
        return bv;
    }

    public void setBv(List<Float> bv) {
        this.bv = bv;
    }

    public HistoricalNBBO b(List<Float> b) {
        this.b = b;
        return this;
    }

    public HistoricalNBBO addBItem(Float bItem) {
        if (this.b == null) {
            this.b = new ArrayList<>();
        }
        this.b.add(bItem);
        return this;
    }

    /**
     * List of Bid price data.
     *
     * @return b
     **/
    @ApiModelProperty(value = "List of Bid price data.")
    public List<Float> getB() {
        return b;
    }

    public void setB(List<Float> b) {
        this.b = b;
    }

    public HistoricalNBBO bx(List<String> bx) {
        this.bx = bx;
        return this;
    }

    public HistoricalNBBO addBxItem(String bxItem) {
        if (this.bx == null) {
            this.bx = new ArrayList<>();
        }
        this.bx.add(bxItem);
        return this;
    }

    /**
     * List of venues/exchanges - Bid price. A list of exchange codes can be found &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1Tj53M1svmr-hfEtbk6_NpVR1yAyGLMaH6ByYU6CG0ZY/edit?usp&#x3D;sharing\&quot;,&gt;here&lt;/a&gt;
     *
     * @return bx
     **/
    @ApiModelProperty(value = "List of venues/exchanges - Bid price. A list of exchange codes can be found <a target=\"_blank\" href=\"https://docs.google.com/spreadsheets/d/1Tj53M1svmr-hfEtbk6_NpVR1yAyGLMaH6ByYU6CG0ZY/edit?usp=sharing\",>here</a>")
    public List<String> getBx() {
        return bx;
    }

    public void setBx(List<String> bx) {
        this.bx = bx;
    }

    public HistoricalNBBO t(List<Long> t) {
        this.t = t;
        return this;
    }

    public HistoricalNBBO addTItem(Long tItem) {
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

    public HistoricalNBBO c(List<List<String>> c) {
        this.c = c;
        return this;
    }

    public HistoricalNBBO addCItem(List<String> cItem) {
        if (this.c == null) {
            this.c = new ArrayList<>();
        }
        this.c.add(cItem);
        return this;
    }

    /**
     * List of quote conditions. A comprehensive list of quote conditions code can be found &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1iiA6e7Osdtai0oPMOUzgAIKXCsay89dFDmsegz6OpEg/edit?usp&#x3D;sharing\&quot;&gt;here&lt;/a&gt;
     *
     * @return c
     **/
    @ApiModelProperty(value = "List of quote conditions. A comprehensive list of quote conditions code can be found <a target=\"_blank\" href=\"https://docs.google.com/spreadsheets/d/1iiA6e7Osdtai0oPMOUzgAIKXCsay89dFDmsegz6OpEg/edit?usp=sharing\">here</a>")
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
        HistoricalNBBO historicalNBBO = (HistoricalNBBO) o;
        return Objects.equals(this.s, historicalNBBO.s) &&
                Objects.equals(this.skip, historicalNBBO.skip) &&
                Objects.equals(this.count, historicalNBBO.count) &&
                Objects.equals(this.total, historicalNBBO.total) &&
                Objects.equals(this.av, historicalNBBO.av) &&
                Objects.equals(this.a, historicalNBBO.a) &&
                Objects.equals(this.ax, historicalNBBO.ax) &&
                Objects.equals(this.bv, historicalNBBO.bv) &&
                Objects.equals(this.b, historicalNBBO.b) &&
                Objects.equals(this.bx, historicalNBBO.bx) &&
                Objects.equals(this.t, historicalNBBO.t) &&
                Objects.equals(this.c, historicalNBBO.c);
    }

    @Override
    public int hashCode() {
        return Objects.hash(s, skip, count, total, av, a, ax, bv, b, bx, t, c);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HistoricalNBBO {\n");

        sb.append("    s: ").append(toIndentedString(s)).append("\n");
        sb.append("    skip: ").append(toIndentedString(skip)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    av: ").append(toIndentedString(av)).append("\n");
        sb.append("    a: ").append(toIndentedString(a)).append("\n");
        sb.append("    ax: ").append(toIndentedString(ax)).append("\n");
        sb.append("    bv: ").append(toIndentedString(bv)).append("\n");
        sb.append("    b: ").append(toIndentedString(b)).append("\n");
        sb.append("    bx: ").append(toIndentedString(bx)).append("\n");
        sb.append("    t: ").append(toIndentedString(t)).append("\n");
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
