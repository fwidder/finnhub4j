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
 * UsptoPatent
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-09T22:29:37.142+01:00")
public class UsptoPatent {
    @JsonProperty("applicationNumber")
    private String applicationNumber = null;

    @JsonProperty("companyFilingName")
    private List<String> companyFilingName = null;

    @JsonProperty("filingDate")
    private String filingDate = null;

    @JsonProperty("description")
    private String description = null;

    @JsonProperty("filingStatus")
    private String filingStatus = null;

    @JsonProperty("patentNumber")
    private String patentNumber = null;

    @JsonProperty("publicationDate")
    private String publicationDate = null;

    @JsonProperty("patentType")
    private String patentType = null;

    @JsonProperty("url")
    private String url = null;

    public UsptoPatent applicationNumber(String applicationNumber) {
        this.applicationNumber = applicationNumber;
        return this;
    }

    /**
     * Application Number.
     *
     * @return applicationNumber
     **/
    @ApiModelProperty(value = "Application Number.")
    public String getApplicationNumber() {
        return applicationNumber;
    }

    public void setApplicationNumber(String applicationNumber) {
        this.applicationNumber = applicationNumber;
    }

    public UsptoPatent companyFilingName(List<String> companyFilingName) {
        this.companyFilingName = companyFilingName;
        return this;
    }

    public UsptoPatent addCompanyFilingNameItem(String companyFilingNameItem) {
        if (this.companyFilingName == null) {
            this.companyFilingName = new ArrayList<>();
        }
        this.companyFilingName.add(companyFilingNameItem);
        return this;
    }

    /**
     * Array of companies&#39; name on the patent.
     *
     * @return companyFilingName
     **/
    @ApiModelProperty(value = "Array of companies' name on the patent.")
    public List<String> getCompanyFilingName() {
        return companyFilingName;
    }

    public void setCompanyFilingName(List<String> companyFilingName) {
        this.companyFilingName = companyFilingName;
    }

    public UsptoPatent filingDate(String filingDate) {
        this.filingDate = filingDate;
        return this;
    }

    /**
     * Filing date.
     *
     * @return filingDate
     **/
    @ApiModelProperty(value = "Filing date.")
    public String getFilingDate() {
        return filingDate;
    }

    public void setFilingDate(String filingDate) {
        this.filingDate = filingDate;
    }

    public UsptoPatent description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Description.
     *
     * @return description
     **/
    @ApiModelProperty(value = "Description.")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UsptoPatent filingStatus(String filingStatus) {
        this.filingStatus = filingStatus;
        return this;
    }

    /**
     * Filing status.
     *
     * @return filingStatus
     **/
    @ApiModelProperty(value = "Filing status.")
    public String getFilingStatus() {
        return filingStatus;
    }

    public void setFilingStatus(String filingStatus) {
        this.filingStatus = filingStatus;
    }

    public UsptoPatent patentNumber(String patentNumber) {
        this.patentNumber = patentNumber;
        return this;
    }

    /**
     * Patent number.
     *
     * @return patentNumber
     **/
    @ApiModelProperty(value = "Patent number.")
    public String getPatentNumber() {
        return patentNumber;
    }

    public void setPatentNumber(String patentNumber) {
        this.patentNumber = patentNumber;
    }

    public UsptoPatent publicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
        return this;
    }

    /**
     * Publication date.
     *
     * @return publicationDate
     **/
    @ApiModelProperty(value = "Publication date.")
    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public UsptoPatent patentType(String patentType) {
        this.patentType = patentType;
        return this;
    }

    /**
     * Patent&#39;s type.
     *
     * @return patentType
     **/
    @ApiModelProperty(value = "Patent's type.")
    public String getPatentType() {
        return patentType;
    }

    public void setPatentType(String patentType) {
        this.patentType = patentType;
    }

    public UsptoPatent url(String url) {
        this.url = url;
        return this;
    }

    /**
     * URL of the original article.
     *
     * @return url
     **/
    @ApiModelProperty(value = "URL of the original article.")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UsptoPatent usptoPatent = (UsptoPatent) o;
        return Objects.equals(this.applicationNumber, usptoPatent.applicationNumber) &&
                Objects.equals(this.companyFilingName, usptoPatent.companyFilingName) &&
                Objects.equals(this.filingDate, usptoPatent.filingDate) &&
                Objects.equals(this.description, usptoPatent.description) &&
                Objects.equals(this.filingStatus, usptoPatent.filingStatus) &&
                Objects.equals(this.patentNumber, usptoPatent.patentNumber) &&
                Objects.equals(this.publicationDate, usptoPatent.publicationDate) &&
                Objects.equals(this.patentType, usptoPatent.patentType) &&
                Objects.equals(this.url, usptoPatent.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applicationNumber, companyFilingName, filingDate, description, filingStatus, patentNumber, publicationDate, patentType, url);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UsptoPatent {\n");

        sb.append("    applicationNumber: ").append(toIndentedString(applicationNumber)).append("\n");
        sb.append("    companyFilingName: ").append(toIndentedString(companyFilingName)).append("\n");
        sb.append("    filingDate: ").append(toIndentedString(filingDate)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    filingStatus: ").append(toIndentedString(filingStatus)).append("\n");
        sb.append("    patentNumber: ").append(toIndentedString(patentNumber)).append("\n");
        sb.append("    publicationDate: ").append(toIndentedString(publicationDate)).append("\n");
        sb.append("    patentType: ").append(toIndentedString(patentType)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

