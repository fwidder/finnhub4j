package de.fwidder.finnhub4j.api;

import de.fwidder.finnhub4j.ApiClient;
import de.fwidder.finnhub4j.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.util.UriComponentsBuilder;

import java.time.LocalDate;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-09T22:29:37.142+01:00")
@Component("de.fwidder.finnhub.restclient.api.DefaultApi")
public class DefaultApi {
    private ApiClient apiClient;

    public DefaultApi() {
        this(new ApiClient());
    }

    @Autowired
    public DefaultApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Aggregate Indicators
     * Get aggregate signal of multiple technical indicators such as MACD, RSI, Moving Average v.v. A full list of indicators can be found &lt;a href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1MWuy0WuT2yVlxr1KbPdggVygMZtJfunDnhe-C0GEXYM/edit?usp&#x3D;sharing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.
     * <p><b>200</b> - successful operation
     *
     * @param symbol     symbol (required)
     * @param resolution Supported resolution includes &lt;code&gt;1, 5, 15, 30, 60, D, W, M &lt;/code&gt;.Some timeframes might not be available depending on the exchange. (required)
     * @return AggregateIndicators
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AggregateIndicators aggregateIndicator(String symbol, String resolution) throws RestClientException {
        return aggregateIndicatorWithHttpInfo(symbol, resolution).getBody();
    }

    /**
     * Aggregate Indicators
     * Get aggregate signal of multiple technical indicators such as MACD, RSI, Moving Average v.v. A full list of indicators can be found &lt;a href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1MWuy0WuT2yVlxr1KbPdggVygMZtJfunDnhe-C0GEXYM/edit?usp&#x3D;sharing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.
     * <p><b>200</b> - successful operation
     *
     * @param symbol     symbol (required)
     * @param resolution Supported resolution includes &lt;code&gt;1, 5, 15, 30, 60, D, W, M &lt;/code&gt;.Some timeframes might not be available depending on the exchange. (required)
     * @return ResponseEntity&lt;AggregateIndicators&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AggregateIndicators> aggregateIndicatorWithHttpInfo(String symbol, String resolution) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'symbol' when calling aggregateIndicator");
        }

        // verify the required parameter 'resolution' is set
        if (resolution == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'resolution' when calling aggregateIndicator");
        }

        String path = UriComponentsBuilder.fromPath("/scan/technical-indicator").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "symbol", symbol));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "resolution", resolution));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<AggregateIndicators> returnType = new ParameterizedTypeReference<AggregateIndicators>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Bond price data
     * &lt;p&gt;Get bond&#39;s price data. The following datasets are supported:&lt;/p&gt;&lt;table class&#x3D;\&quot;table table-hover\&quot;&gt;   &lt;thead&gt;     &lt;tr&gt;       &lt;th&gt;Exchange&lt;/th&gt;       &lt;th&gt;Segment&lt;/th&gt;       &lt;th&gt;Delay&lt;/th&gt;     &lt;/tr&gt;   &lt;/thead&gt;   &lt;tbody&gt;   &lt;tr&gt;       &lt;td class&#x3D;\&quot;text-blue\&quot;&gt;US Government Bonds&lt;/th&gt;       &lt;td&gt;Government Bonds&lt;/td&gt;       &lt;td&gt;End-of-day&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td class&#x3D;\&quot;text-blue\&quot;&gt;FINRA Trace&lt;/th&gt;       &lt;td&gt;BTDS: US Corporate Bonds&lt;/td&gt;       &lt;td&gt;Delayed 4h&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td class&#x3D;\&quot;text-blue\&quot;&gt;FINRA Trace&lt;/th&gt;       &lt;td&gt;144A Bonds&lt;/td&gt;       &lt;td&gt;Delayed 4h&lt;/td&gt;     &lt;/tr&gt;   &lt;/tbody&gt; &lt;/table&gt;
     * <p><b>200</b> - successful operation
     *
     * @param isin ISIN. (required)
     * @param from UNIX timestamp. Interval initial value. (required)
     * @param to   UNIX timestamp. Interval end value. (required)
     * @return BondCandles
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BondCandles bondPrice(String isin, Long from, Long to) throws RestClientException {
        return bondPriceWithHttpInfo(isin, from, to).getBody();
    }

    /**
     * Bond price data
     * &lt;p&gt;Get bond&#39;s price data. The following datasets are supported:&lt;/p&gt;&lt;table class&#x3D;\&quot;table table-hover\&quot;&gt;   &lt;thead&gt;     &lt;tr&gt;       &lt;th&gt;Exchange&lt;/th&gt;       &lt;th&gt;Segment&lt;/th&gt;       &lt;th&gt;Delay&lt;/th&gt;     &lt;/tr&gt;   &lt;/thead&gt;   &lt;tbody&gt;   &lt;tr&gt;       &lt;td class&#x3D;\&quot;text-blue\&quot;&gt;US Government Bonds&lt;/th&gt;       &lt;td&gt;Government Bonds&lt;/td&gt;       &lt;td&gt;End-of-day&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td class&#x3D;\&quot;text-blue\&quot;&gt;FINRA Trace&lt;/th&gt;       &lt;td&gt;BTDS: US Corporate Bonds&lt;/td&gt;       &lt;td&gt;Delayed 4h&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td class&#x3D;\&quot;text-blue\&quot;&gt;FINRA Trace&lt;/th&gt;       &lt;td&gt;144A Bonds&lt;/td&gt;       &lt;td&gt;Delayed 4h&lt;/td&gt;     &lt;/tr&gt;   &lt;/tbody&gt; &lt;/table&gt;
     * <p><b>200</b> - successful operation
     *
     * @param isin ISIN. (required)
     * @param from UNIX timestamp. Interval initial value. (required)
     * @param to   UNIX timestamp. Interval end value. (required)
     * @return ResponseEntity&lt;BondCandles&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BondCandles> bondPriceWithHttpInfo(String isin, Long from, Long to) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'isin' is set
        if (isin == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'isin' when calling bondPrice");
        }

        // verify the required parameter 'from' is set
        if (from == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'from' when calling bondPrice");
        }

        // verify the required parameter 'to' is set
        if (to == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'to' when calling bondPrice");
        }

        String path = UriComponentsBuilder.fromPath("/bond/price").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "isin", isin));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "to", to));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<BondCandles> returnType = new ParameterizedTypeReference<BondCandles>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Bond Profile
     * Get general information of a bond. You can query by FIGI, ISIN or CUSIP. A list of supported bonds can be found &lt;a href&#x3D;\&quot;/api/v1/bond/list?token&#x3D;\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.
     * <p><b>200</b> - successful operation
     *
     * @param isin  ISIN (optional)
     * @param cusip CUSIP (optional)
     * @param figi  FIGI (optional)
     * @return BondProfile
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BondProfile bondProfile(String isin, String cusip, String figi) throws RestClientException {
        return bondProfileWithHttpInfo(isin, cusip, figi).getBody();
    }

    /**
     * Bond Profile
     * Get general information of a bond. You can query by FIGI, ISIN or CUSIP. A list of supported bonds can be found &lt;a href&#x3D;\&quot;/api/v1/bond/list?token&#x3D;\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.
     * <p><b>200</b> - successful operation
     *
     * @param isin  ISIN (optional)
     * @param cusip CUSIP (optional)
     * @param figi  FIGI (optional)
     * @return ResponseEntity&lt;BondProfile&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BondProfile> bondProfileWithHttpInfo(String isin, String cusip, String figi) throws RestClientException {
        Object postBody = null;

        String path = UriComponentsBuilder.fromPath("/bond/profile").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "isin", isin));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cusip", cusip));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "figi", figi));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<BondProfile> returnType = new ParameterizedTypeReference<BondProfile>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Bond Tick Data
     * &lt;p&gt;Get trade-level data for bonds. The following datasets are supported:&lt;/p&gt;&lt;table class&#x3D;\&quot;table table-hover\&quot;&gt;   &lt;thead&gt;     &lt;tr&gt;       &lt;th&gt;Exchange&lt;/th&gt;       &lt;th&gt;Segment&lt;/th&gt;       &lt;th&gt;Delay&lt;/th&gt;     &lt;/tr&gt;   &lt;/thead&gt;   &lt;tbody&gt;     &lt;tr&gt;       &lt;td class&#x3D;\&quot;text-blue\&quot;&gt;FINRA Trace&lt;/th&gt;       &lt;td&gt;BTDS: US Corporate Bonds&lt;/td&gt;       &lt;td&gt;Delayed 4h&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td class&#x3D;\&quot;text-blue\&quot;&gt;FINRA Trace&lt;/th&gt;       &lt;td&gt;144A Bonds&lt;/td&gt;       &lt;td&gt;Delayed 4h&lt;/td&gt;     &lt;/tr&gt;   &lt;/tbody&gt; &lt;/table&gt;
     * <p><b>200</b> - successful operation
     *
     * @param isin     ISIN. (required)
     * @param date     Date: 2020-04-02. (required)
     * @param limit    Limit number of ticks returned. Maximum value: &lt;code&gt;25000&lt;/code&gt; (required)
     * @param skip     Number of ticks to skip. Use this parameter to loop through the entire data. (required)
     * @param exchange Currently support the following values: &lt;code&gt;trace&lt;/code&gt;. (required)
     * @return BondTickData
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BondTickData bondTick(String isin, LocalDate date, Long limit, Long skip, String exchange) throws RestClientException {
        return bondTickWithHttpInfo(isin, date, limit, skip, exchange).getBody();
    }

    /**
     * Bond Tick Data
     * &lt;p&gt;Get trade-level data for bonds. The following datasets are supported:&lt;/p&gt;&lt;table class&#x3D;\&quot;table table-hover\&quot;&gt;   &lt;thead&gt;     &lt;tr&gt;       &lt;th&gt;Exchange&lt;/th&gt;       &lt;th&gt;Segment&lt;/th&gt;       &lt;th&gt;Delay&lt;/th&gt;     &lt;/tr&gt;   &lt;/thead&gt;   &lt;tbody&gt;     &lt;tr&gt;       &lt;td class&#x3D;\&quot;text-blue\&quot;&gt;FINRA Trace&lt;/th&gt;       &lt;td&gt;BTDS: US Corporate Bonds&lt;/td&gt;       &lt;td&gt;Delayed 4h&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td class&#x3D;\&quot;text-blue\&quot;&gt;FINRA Trace&lt;/th&gt;       &lt;td&gt;144A Bonds&lt;/td&gt;       &lt;td&gt;Delayed 4h&lt;/td&gt;     &lt;/tr&gt;   &lt;/tbody&gt; &lt;/table&gt;
     * <p><b>200</b> - successful operation
     *
     * @param isin     ISIN. (required)
     * @param date     Date: 2020-04-02. (required)
     * @param limit    Limit number of ticks returned. Maximum value: &lt;code&gt;25000&lt;/code&gt; (required)
     * @param skip     Number of ticks to skip. Use this parameter to loop through the entire data. (required)
     * @param exchange Currently support the following values: &lt;code&gt;trace&lt;/code&gt;. (required)
     * @return ResponseEntity&lt;BondTickData&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BondTickData> bondTickWithHttpInfo(String isin, LocalDate date, Long limit, Long skip, String exchange) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'isin' is set
        if (isin == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'isin' when calling bondTick");
        }

        // verify the required parameter 'date' is set
        if (date == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'date' when calling bondTick");
        }

        // verify the required parameter 'limit' is set
        if (limit == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'limit' when calling bondTick");
        }

        // verify the required parameter 'skip' is set
        if (skip == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'skip' when calling bondTick");
        }

        // verify the required parameter 'exchange' is set
        if (exchange == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'exchange' when calling bondTick");
        }

        String path = UriComponentsBuilder.fromPath("/bond/tick").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "isin", isin));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "date", date));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "skip", skip));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "exchange", exchange));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<BondTickData> returnType = new ParameterizedTypeReference<BondTickData>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Bond Yield Curve
     * Get yield curve data for Treasury bonds.
     * <p><b>200</b> - successful operation
     *
     * @param code Bond&#39;s code. You can find the list of supported code &lt;a href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1iA-lM0Kht7lsQZ7Uu_s6r2i1BbQNUNO9eGkO5-zglHg/edit?usp&#x3D;sharing\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener\&quot;&gt;here&lt;/a&gt;. (required)
     * @return BondYieldCurve
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BondYieldCurve bondYieldCurve(String code) throws RestClientException {
        return bondYieldCurveWithHttpInfo(code).getBody();
    }

    /**
     * Bond Yield Curve
     * Get yield curve data for Treasury bonds.
     * <p><b>200</b> - successful operation
     *
     * @param code Bond&#39;s code. You can find the list of supported code &lt;a href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1iA-lM0Kht7lsQZ7Uu_s6r2i1BbQNUNO9eGkO5-zglHg/edit?usp&#x3D;sharing\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener\&quot;&gt;here&lt;/a&gt;. (required)
     * @return ResponseEntity&lt;BondYieldCurve&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BondYieldCurve> bondYieldCurveWithHttpInfo(String code) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'code' is set
        if (code == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'code' when calling bondYieldCurve");
        }

        String path = UriComponentsBuilder.fromPath("/bond/yield-curve").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "code", code));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<BondYieldCurve> returnType = new ParameterizedTypeReference<BondYieldCurve>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Basic Financials
     * Get company basic financials such as margin, P/E ratio, 52-week high/low etc.
     * <p><b>200</b> - successful operation
     *
     * @param symbol Symbol of the company: AAPL. (required)
     * @param metric Metric type. Can be 1 of the following values &lt;code&gt;all&lt;/code&gt; (required)
     * @return BasicFinancials
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BasicFinancials companyBasicFinancials(String symbol, String metric) throws RestClientException {
        return companyBasicFinancialsWithHttpInfo(symbol, metric).getBody();
    }

    /**
     * Basic Financials
     * Get company basic financials such as margin, P/E ratio, 52-week high/low etc.
     * <p><b>200</b> - successful operation
     *
     * @param symbol Symbol of the company: AAPL. (required)
     * @param metric Metric type. Can be 1 of the following values &lt;code&gt;all&lt;/code&gt; (required)
     * @return ResponseEntity&lt;BasicFinancials&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BasicFinancials> companyBasicFinancialsWithHttpInfo(String symbol, String metric) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'symbol' when calling companyBasicFinancials");
        }

        // verify the required parameter 'metric' is set
        if (metric == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'metric' when calling companyBasicFinancials");
        }

        String path = UriComponentsBuilder.fromPath("/stock/metric").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "symbol", symbol));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "metric", metric));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<BasicFinancials> returnType = new ParameterizedTypeReference<BasicFinancials>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Earnings Surprises
     * Get company historical quarterly earnings surprise going back to 2000.
     * <p><b>200</b> - successful operation
     *
     * @param symbol Symbol of the company: AAPL. (required)
     * @param limit  Limit number of period returned. Leave blank to get the full history. (optional)
     * @return List&lt;EarningResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<EarningResult> companyEarnings(String symbol, Long limit) throws RestClientException {
        return companyEarningsWithHttpInfo(symbol, limit).getBody();
    }

    /**
     * Earnings Surprises
     * Get company historical quarterly earnings surprise going back to 2000.
     * <p><b>200</b> - successful operation
     *
     * @param symbol Symbol of the company: AAPL. (required)
     * @param limit  Limit number of period returned. Leave blank to get the full history. (optional)
     * @return ResponseEntity&lt;List&lt;EarningResult&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<EarningResult>> companyEarningsWithHttpInfo(String symbol, Long limit) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'symbol' when calling companyEarnings");
        }

        String path = UriComponentsBuilder.fromPath("/stock/earnings").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "symbol", symbol));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<List<EarningResult>> returnType = new ParameterizedTypeReference<List<EarningResult>>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Company Earnings Quality Score
     * &lt;p&gt;This endpoint provides Earnings Quality Score for global companies.&lt;/p&gt;&lt;p&gt; Earnings quality refers to the extent to which current earnings predict future earnings. \&quot;High-quality\&quot; earnings are expected to persist, while \&quot;low-quality\&quot; earnings do not. A higher score means a higher earnings quality&lt;/p&gt;&lt;p&gt;Finnhub uses a proprietary model which takes into consideration 4 criteria:&lt;/p&gt; &lt;ul style&#x3D;\&quot;list-style-type: unset; margin-left: 30px;\&quot;&gt;&lt;li&gt;Profitability&lt;/li&gt;&lt;li&gt;Growth&lt;/li&gt;&lt;li&gt;Cash Generation &amp; Capital Allocation&lt;/li&gt;&lt;li&gt;Leverage&lt;/li&gt;&lt;/ul&gt;&lt;br/&gt;&lt;p&gt;We then compare the metrics of each company in each category against its peers in the same industry to gauge how quality its earnings is.&lt;/p&gt;
     * <p><b>200</b> - successful operation
     *
     * @param symbol Symbol. (required)
     * @param freq   Frequency. Currently support &lt;code&gt;annual&lt;/code&gt; and &lt;code&gt;quarterly&lt;/code&gt; (required)
     * @return CompanyEarningsQualityScore
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CompanyEarningsQualityScore companyEarningsQualityScore(String symbol, String freq) throws RestClientException {
        return companyEarningsQualityScoreWithHttpInfo(symbol, freq).getBody();
    }

    /**
     * Company Earnings Quality Score
     * &lt;p&gt;This endpoint provides Earnings Quality Score for global companies.&lt;/p&gt;&lt;p&gt; Earnings quality refers to the extent to which current earnings predict future earnings. \&quot;High-quality\&quot; earnings are expected to persist, while \&quot;low-quality\&quot; earnings do not. A higher score means a higher earnings quality&lt;/p&gt;&lt;p&gt;Finnhub uses a proprietary model which takes into consideration 4 criteria:&lt;/p&gt; &lt;ul style&#x3D;\&quot;list-style-type: unset; margin-left: 30px;\&quot;&gt;&lt;li&gt;Profitability&lt;/li&gt;&lt;li&gt;Growth&lt;/li&gt;&lt;li&gt;Cash Generation &amp; Capital Allocation&lt;/li&gt;&lt;li&gt;Leverage&lt;/li&gt;&lt;/ul&gt;&lt;br/&gt;&lt;p&gt;We then compare the metrics of each company in each category against its peers in the same industry to gauge how quality its earnings is.&lt;/p&gt;
     * <p><b>200</b> - successful operation
     *
     * @param symbol Symbol. (required)
     * @param freq   Frequency. Currently support &lt;code&gt;annual&lt;/code&gt; and &lt;code&gt;quarterly&lt;/code&gt; (required)
     * @return ResponseEntity&lt;CompanyEarningsQualityScore&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CompanyEarningsQualityScore> companyEarningsQualityScoreWithHttpInfo(String symbol, String freq) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'symbol' when calling companyEarningsQualityScore");
        }

        // verify the required parameter 'freq' is set
        if (freq == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'freq' when calling companyEarningsQualityScore");
        }

        String path = UriComponentsBuilder.fromPath("/stock/earnings-quality-score").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "symbol", symbol));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "freq", freq));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<CompanyEarningsQualityScore> returnType = new ParameterizedTypeReference<CompanyEarningsQualityScore>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * EBIT Estimates
     * Get company&#39;s ebit estimates.
     * <p><b>200</b> - successful operation
     *
     * @param symbol Symbol of the company: AAPL. (required)
     * @param freq   Can take 1 of the following values: &lt;code&gt;annual, quarterly&lt;/code&gt;. Default to &lt;code&gt;quarterly&lt;/code&gt; (optional)
     * @return EbitEstimates
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EbitEstimates companyEbitEstimates(String symbol, String freq) throws RestClientException {
        return companyEbitEstimatesWithHttpInfo(symbol, freq).getBody();
    }

    /**
     * EBIT Estimates
     * Get company&#39;s ebit estimates.
     * <p><b>200</b> - successful operation
     *
     * @param symbol Symbol of the company: AAPL. (required)
     * @param freq   Can take 1 of the following values: &lt;code&gt;annual, quarterly&lt;/code&gt;. Default to &lt;code&gt;quarterly&lt;/code&gt; (optional)
     * @return ResponseEntity&lt;EbitEstimates&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<EbitEstimates> companyEbitEstimatesWithHttpInfo(String symbol, String freq) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'symbol' when calling companyEbitEstimates");
        }

        String path = UriComponentsBuilder.fromPath("/stock/ebit-estimate").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "symbol", symbol));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "freq", freq));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<EbitEstimates> returnType = new ParameterizedTypeReference<EbitEstimates>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * EBITDA Estimates
     * Get company&#39;s ebitda estimates.
     * <p><b>200</b> - successful operation
     *
     * @param symbol Symbol of the company: AAPL. (required)
     * @param freq   Can take 1 of the following values: &lt;code&gt;annual, quarterly&lt;/code&gt;. Default to &lt;code&gt;quarterly&lt;/code&gt; (optional)
     * @return EbitdaEstimates
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EbitdaEstimates companyEbitdaEstimates(String symbol, String freq) throws RestClientException {
        return companyEbitdaEstimatesWithHttpInfo(symbol, freq).getBody();
    }

    /**
     * EBITDA Estimates
     * Get company&#39;s ebitda estimates.
     * <p><b>200</b> - successful operation
     *
     * @param symbol Symbol of the company: AAPL. (required)
     * @param freq   Can take 1 of the following values: &lt;code&gt;annual, quarterly&lt;/code&gt;. Default to &lt;code&gt;quarterly&lt;/code&gt; (optional)
     * @return ResponseEntity&lt;EbitdaEstimates&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<EbitdaEstimates> companyEbitdaEstimatesWithHttpInfo(String symbol, String freq) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'symbol' when calling companyEbitdaEstimates");
        }

        String path = UriComponentsBuilder.fromPath("/stock/ebitda-estimate").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "symbol", symbol));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "freq", freq));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<EbitdaEstimates> returnType = new ParameterizedTypeReference<EbitdaEstimates>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Earnings Estimates
     * Get company&#39;s EPS estimates.
     * <p><b>200</b> - successful operation
     *
     * @param symbol Symbol of the company: AAPL. (required)
     * @param freq   Can take 1 of the following values: &lt;code&gt;annual, quarterly&lt;/code&gt;. Default to &lt;code&gt;quarterly&lt;/code&gt; (optional)
     * @return EarningsEstimates
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EarningsEstimates companyEpsEstimates(String symbol, String freq) throws RestClientException {
        return companyEpsEstimatesWithHttpInfo(symbol, freq).getBody();
    }

    /**
     * Earnings Estimates
     * Get company&#39;s EPS estimates.
     * <p><b>200</b> - successful operation
     *
     * @param symbol Symbol of the company: AAPL. (required)
     * @param freq   Can take 1 of the following values: &lt;code&gt;annual, quarterly&lt;/code&gt;. Default to &lt;code&gt;quarterly&lt;/code&gt; (optional)
     * @return ResponseEntity&lt;EarningsEstimates&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<EarningsEstimates> companyEpsEstimatesWithHttpInfo(String symbol, String freq) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'symbol' when calling companyEpsEstimates");
        }

        String path = UriComponentsBuilder.fromPath("/stock/eps-estimate").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "symbol", symbol));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "freq", freq));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<EarningsEstimates> returnType = new ParameterizedTypeReference<EarningsEstimates>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Company ESG Scores
     * &lt;p&gt;This endpoint provides ESG scores and important indicators for 7000+ global companies. The data is collected through company&#39;s public ESG disclosure and public sources.&lt;/p&gt;&lt;p&gt;Our ESG scoring models takes into account more than 150 different inputs to calculate the level of ESG risks and how well a company is managing them. A higher score means lower ESG risk or better ESG management. ESG scores are in the the range of 0-100. Some key indicators might contain letter-grade score from C- to A+ with C- is the lowest score and A+ is the highest score.&lt;/p&gt;&lt;p&gt;Historical ESG data is available for Enterprise users. &lt;a href&#x3D;\&quot;mailto:support@finnhub.io\&quot;&gt;Contact us&lt;/a&gt; to learn more.&lt;/p&gt;
     * <p><b>200</b> - successful operation
     *
     * @param symbol Symbol. (required)
     * @return CompanyESG
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CompanyESG companyEsgScore(String symbol) throws RestClientException {
        return companyEsgScoreWithHttpInfo(symbol).getBody();
    }

    /**
     * Company ESG Scores
     * &lt;p&gt;This endpoint provides ESG scores and important indicators for 7000+ global companies. The data is collected through company&#39;s public ESG disclosure and public sources.&lt;/p&gt;&lt;p&gt;Our ESG scoring models takes into account more than 150 different inputs to calculate the level of ESG risks and how well a company is managing them. A higher score means lower ESG risk or better ESG management. ESG scores are in the the range of 0-100. Some key indicators might contain letter-grade score from C- to A+ with C- is the lowest score and A+ is the highest score.&lt;/p&gt;&lt;p&gt;Historical ESG data is available for Enterprise users. &lt;a href&#x3D;\&quot;mailto:support@finnhub.io\&quot;&gt;Contact us&lt;/a&gt; to learn more.&lt;/p&gt;
     * <p><b>200</b> - successful operation
     *
     * @param symbol Symbol. (required)
     * @return ResponseEntity&lt;CompanyESG&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CompanyESG> companyEsgScoreWithHttpInfo(String symbol) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'symbol' when calling companyEsgScore");
        }

        String path = UriComponentsBuilder.fromPath("/stock/esg").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "symbol", symbol));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<CompanyESG> returnType = new ParameterizedTypeReference<CompanyESG>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Company Executive
     * Get a list of company&#39;s executives and members of the Board.
     * <p><b>200</b> - successful operation
     *
     * @param symbol Symbol of the company: AAPL. (required)
     * @return CompanyExecutive
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CompanyExecutive companyExecutive(String symbol) throws RestClientException {
        return companyExecutiveWithHttpInfo(symbol).getBody();
    }

    /**
     * Company Executive
     * Get a list of company&#39;s executives and members of the Board.
     * <p><b>200</b> - successful operation
     *
     * @param symbol Symbol of the company: AAPL. (required)
     * @return ResponseEntity&lt;CompanyExecutive&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CompanyExecutive> companyExecutiveWithHttpInfo(String symbol) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'symbol' when calling companyExecutive");
        }

        String path = UriComponentsBuilder.fromPath("/stock/executive").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "symbol", symbol));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<CompanyExecutive> returnType = new ParameterizedTypeReference<CompanyExecutive>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Company News
     * List latest company news by symbol. This endpoint is only available for North American companies.
     * <p><b>200</b> - successful operation
     *
     * @param symbol Company symbol. (required)
     * @param from   From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
     * @param to     To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
     * @return List&lt;CompanyNews&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<CompanyNews> companyNews(String symbol, LocalDate from, LocalDate to) throws RestClientException {
        return companyNewsWithHttpInfo(symbol, from, to).getBody();
    }

    /**
     * Company News
     * List latest company news by symbol. This endpoint is only available for North American companies.
     * <p><b>200</b> - successful operation
     *
     * @param symbol Company symbol. (required)
     * @param from   From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
     * @param to     To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
     * @return ResponseEntity&lt;List&lt;CompanyNews&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<CompanyNews>> companyNewsWithHttpInfo(String symbol, LocalDate from, LocalDate to) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'symbol' when calling companyNews");
        }

        // verify the required parameter 'from' is set
        if (from == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'from' when calling companyNews");
        }

        // verify the required parameter 'to' is set
        if (to == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'to' when calling companyNews");
        }

        String path = UriComponentsBuilder.fromPath("/company-news").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "symbol", symbol));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "to", to));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<List<CompanyNews>> returnType = new ParameterizedTypeReference<List<CompanyNews>>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Peers
     * Get company peers. Return a list of peers operating in the same country and sector/industry.
     * <p><b>200</b> - successful operation
     *
     * @param symbol   Symbol of the company: AAPL. (required)
     * @param grouping Specify the grouping criteria for choosing peers.Supporter values: &lt;code&gt;sector&lt;/code&gt;, &lt;code&gt;industry&lt;/code&gt;, &lt;code&gt;subIndustry&lt;/code&gt;. Default to &lt;code&gt;subIndustry&lt;/code&gt;. (optional)
     * @return List&lt;String&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<String> companyPeers(String symbol, String grouping) throws RestClientException {
        return companyPeersWithHttpInfo(symbol, grouping).getBody();
    }

    /**
     * Peers
     * Get company peers. Return a list of peers operating in the same country and sector/industry.
     * <p><b>200</b> - successful operation
     *
     * @param symbol   Symbol of the company: AAPL. (required)
     * @param grouping Specify the grouping criteria for choosing peers.Supporter values: &lt;code&gt;sector&lt;/code&gt;, &lt;code&gt;industry&lt;/code&gt;, &lt;code&gt;subIndustry&lt;/code&gt;. Default to &lt;code&gt;subIndustry&lt;/code&gt;. (optional)
     * @return ResponseEntity&lt;List&lt;String&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<String>> companyPeersWithHttpInfo(String symbol, String grouping) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'symbol' when calling companyPeers");
        }

        String path = UriComponentsBuilder.fromPath("/stock/peers").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "symbol", symbol));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "grouping", grouping));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<List<String>> returnType = new ParameterizedTypeReference<List<String>>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Company Profile
     * Get general information of a company. You can query by symbol, ISIN or CUSIP
     * <p><b>200</b> - successful operation
     *
     * @param symbol Symbol of the company: AAPL e.g. (optional)
     * @param isin   ISIN (optional)
     * @param cusip  CUSIP (optional)
     * @return CompanyProfile
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CompanyProfile companyProfile(String symbol, String isin, String cusip) throws RestClientException {
        return companyProfileWithHttpInfo(symbol, isin, cusip).getBody();
    }

    /**
     * Company Profile
     * Get general information of a company. You can query by symbol, ISIN or CUSIP
     * <p><b>200</b> - successful operation
     *
     * @param symbol Symbol of the company: AAPL e.g. (optional)
     * @param isin   ISIN (optional)
     * @param cusip  CUSIP (optional)
     * @return ResponseEntity&lt;CompanyProfile&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CompanyProfile> companyProfileWithHttpInfo(String symbol, String isin, String cusip) throws RestClientException {
        Object postBody = null;

        String path = UriComponentsBuilder.fromPath("/stock/profile").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "symbol", symbol));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "isin", isin));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cusip", cusip));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<CompanyProfile> returnType = new ParameterizedTypeReference<CompanyProfile>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Company Profile 2
     * Get general information of a company. You can query by symbol, ISIN or CUSIP. This is the free version of &lt;a href&#x3D;\&quot;#company-profile\&quot;&gt;Company Profile&lt;/a&gt;.
     * <p><b>200</b> - successful operation
     *
     * @param symbol Symbol of the company: AAPL e.g. (optional)
     * @param isin   ISIN (optional)
     * @param cusip  CUSIP (optional)
     * @return CompanyProfile2
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CompanyProfile2 companyProfile2(String symbol, String isin, String cusip) throws RestClientException {
        return companyProfile2WithHttpInfo(symbol, isin, cusip).getBody();
    }

    /**
     * Company Profile 2
     * Get general information of a company. You can query by symbol, ISIN or CUSIP. This is the free version of &lt;a href&#x3D;\&quot;#company-profile\&quot;&gt;Company Profile&lt;/a&gt;.
     * <p><b>200</b> - successful operation
     *
     * @param symbol Symbol of the company: AAPL e.g. (optional)
     * @param isin   ISIN (optional)
     * @param cusip  CUSIP (optional)
     * @return ResponseEntity&lt;CompanyProfile2&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CompanyProfile2> companyProfile2WithHttpInfo(String symbol, String isin, String cusip) throws RestClientException {
        Object postBody = null;

        String path = UriComponentsBuilder.fromPath("/stock/profile2").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "symbol", symbol));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "isin", isin));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cusip", cusip));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<CompanyProfile2> returnType = new ParameterizedTypeReference<CompanyProfile2>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Revenue Estimates
     * Get company&#39;s revenue estimates.
     * <p><b>200</b> - successful operation
     *
     * @param symbol Symbol of the company: AAPL. (required)
     * @param freq   Can take 1 of the following values: &lt;code&gt;annual, quarterly&lt;/code&gt;. Default to &lt;code&gt;quarterly&lt;/code&gt; (optional)
     * @return RevenueEstimates
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public RevenueEstimates companyRevenueEstimates(String symbol, String freq) throws RestClientException {
        return companyRevenueEstimatesWithHttpInfo(symbol, freq).getBody();
    }

    /**
     * Revenue Estimates
     * Get company&#39;s revenue estimates.
     * <p><b>200</b> - successful operation
     *
     * @param symbol Symbol of the company: AAPL. (required)
     * @param freq   Can take 1 of the following values: &lt;code&gt;annual, quarterly&lt;/code&gt;. Default to &lt;code&gt;quarterly&lt;/code&gt; (optional)
     * @return ResponseEntity&lt;RevenueEstimates&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<RevenueEstimates> companyRevenueEstimatesWithHttpInfo(String symbol, String freq) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'symbol' when calling companyRevenueEstimates");
        }

        String path = UriComponentsBuilder.fromPath("/stock/revenue-estimate").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "symbol", symbol));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "freq", freq));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<RevenueEstimates> returnType = new ParameterizedTypeReference<RevenueEstimates>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Congressional Trading
     * Get stock trades data disclosed by members of congress.
     * <p><b>200</b> - successful operation
     *
     * @param symbol Symbol of the company: AAPL. (required)
     * @param from   From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
     * @param to     To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
     * @return CongressionalTrading
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CongressionalTrading congressionalTrading(String symbol, LocalDate from, LocalDate to) throws RestClientException {
        return congressionalTradingWithHttpInfo(symbol, from, to).getBody();
    }

    /**
     * Congressional Trading
     * Get stock trades data disclosed by members of congress.
     * <p><b>200</b> - successful operation
     *
     * @param symbol Symbol of the company: AAPL. (required)
     * @param from   From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
     * @param to     To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
     * @return ResponseEntity&lt;CongressionalTrading&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CongressionalTrading> congressionalTradingWithHttpInfo(String symbol, LocalDate from, LocalDate to) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'symbol' when calling congressionalTrading");
        }

        // verify the required parameter 'from' is set
        if (from == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'from' when calling congressionalTrading");
        }

        // verify the required parameter 'to' is set
        if (to == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'to' when calling congressionalTrading");
        }

        String path = UriComponentsBuilder.fromPath("/stock/congressional-trading").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "symbol", symbol));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "to", to));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<CongressionalTrading> returnType = new ParameterizedTypeReference<CongressionalTrading>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Country Metadata
     * List all countries and metadata.
     * <p><b>200</b> - successful operation
     *
     * @return List&lt;CountryMetadata&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<CountryMetadata> country() throws RestClientException {
        return countryWithHttpInfo().getBody();
    }

    /**
     * Country Metadata
     * List all countries and metadata.
     * <p><b>200</b> - successful operation
     *
     * @return ResponseEntity&lt;List&lt;CountryMetadata&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<CountryMetadata>> countryWithHttpInfo() throws RestClientException {
        Object postBody = null;

        String path = UriComponentsBuilder.fromPath("/country").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();


        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<List<CountryMetadata>> returnType = new ParameterizedTypeReference<List<CountryMetadata>>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * COVID-19
     * Get real-time updates on the number of COVID-19 (Corona virus) cases in the US with a state-by-state breakdown. Data is sourced from CDC and reputable sources. You can also access this API &lt;a href&#x3D;\&quot;https://rapidapi.com/Finnhub/api/finnhub-real-time-covid-19\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;nofollow\&quot;&gt;here&lt;/a&gt;
     * <p><b>200</b> - successful operation
     *
     * @return List&lt;CovidInfo&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<CovidInfo> covid19() throws RestClientException {
        return covid19WithHttpInfo().getBody();
    }

    /**
     * COVID-19
     * Get real-time updates on the number of COVID-19 (Corona virus) cases in the US with a state-by-state breakdown. Data is sourced from CDC and reputable sources. You can also access this API &lt;a href&#x3D;\&quot;https://rapidapi.com/Finnhub/api/finnhub-real-time-covid-19\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;nofollow\&quot;&gt;here&lt;/a&gt;
     * <p><b>200</b> - successful operation
     *
     * @return ResponseEntity&lt;List&lt;CovidInfo&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<CovidInfo>> covid19WithHttpInfo() throws RestClientException {
        Object postBody = null;

        String path = UriComponentsBuilder.fromPath("/covid19/us").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();


        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<List<CovidInfo>> returnType = new ParameterizedTypeReference<List<CovidInfo>>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Crypto Candles
     * Get candlestick data for crypto symbols.
     * <p><b>200</b> - successful operation
     *
     * @param symbol     Use symbol returned in &lt;code&gt;/crypto/symbol&lt;/code&gt; endpoint for this field. (required)
     * @param resolution Supported resolution includes &lt;code&gt;1, 5, 15, 30, 60, D, W, M &lt;/code&gt;.Some timeframes might not be available depending on the exchange. (required)
     * @param from       UNIX timestamp. Interval initial value. (required)
     * @param to         UNIX timestamp. Interval end value. (required)
     * @return CryptoCandles
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CryptoCandles cryptoCandles(String symbol, String resolution, Long from, Long to) throws RestClientException {
        return cryptoCandlesWithHttpInfo(symbol, resolution, from, to).getBody();
    }

    /**
     * Crypto Candles
     * Get candlestick data for crypto symbols.
     * <p><b>200</b> - successful operation
     *
     * @param symbol     Use symbol returned in &lt;code&gt;/crypto/symbol&lt;/code&gt; endpoint for this field. (required)
     * @param resolution Supported resolution includes &lt;code&gt;1, 5, 15, 30, 60, D, W, M &lt;/code&gt;.Some timeframes might not be available depending on the exchange. (required)
     * @param from       UNIX timestamp. Interval initial value. (required)
     * @param to         UNIX timestamp. Interval end value. (required)
     * @return ResponseEntity&lt;CryptoCandles&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CryptoCandles> cryptoCandlesWithHttpInfo(String symbol, String resolution, Long from, Long to) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'symbol' when calling cryptoCandles");
        }

        // verify the required parameter 'resolution' is set
        if (resolution == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'resolution' when calling cryptoCandles");
        }

        // verify the required parameter 'from' is set
        if (from == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'from' when calling cryptoCandles");
        }

        // verify the required parameter 'to' is set
        if (to == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'to' when calling cryptoCandles");
        }

        String path = UriComponentsBuilder.fromPath("/crypto/candle").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "symbol", symbol));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "resolution", resolution));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "to", to));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<CryptoCandles> returnType = new ParameterizedTypeReference<CryptoCandles>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Crypto Exchanges
     * List supported crypto exchanges
     * <p><b>200</b> - successful operation
     *
     * @return List&lt;String&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<String> cryptoExchanges() throws RestClientException {
        return cryptoExchangesWithHttpInfo().getBody();
    }

    /**
     * Crypto Exchanges
     * List supported crypto exchanges
     * <p><b>200</b> - successful operation
     *
     * @return ResponseEntity&lt;List&lt;String&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<String>> cryptoExchangesWithHttpInfo() throws RestClientException {
        Object postBody = null;

        String path = UriComponentsBuilder.fromPath("/crypto/exchange").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();


        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<List<String>> returnType = new ParameterizedTypeReference<List<String>>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Crypto Profile
     * Get crypto&#39;s profile.
     * <p><b>200</b> - successful operation
     *
     * @param symbol Crypto symbol such as BTC or ETH. (required)
     * @return CryptoProfile
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CryptoProfile cryptoProfile(String symbol) throws RestClientException {
        return cryptoProfileWithHttpInfo(symbol).getBody();
    }

    /**
     * Crypto Profile
     * Get crypto&#39;s profile.
     * <p><b>200</b> - successful operation
     *
     * @param symbol Crypto symbol such as BTC or ETH. (required)
     * @return ResponseEntity&lt;CryptoProfile&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CryptoProfile> cryptoProfileWithHttpInfo(String symbol) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'symbol' when calling cryptoProfile");
        }

        String path = UriComponentsBuilder.fromPath("/crypto/profile").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "symbol", symbol));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<CryptoProfile> returnType = new ParameterizedTypeReference<CryptoProfile>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Crypto Symbol
     * List supported crypto symbols by exchange
     * <p><b>200</b> - successful operation
     *
     * @param exchange Exchange you want to get the list of symbols from. (required)
     * @return List&lt;CryptoSymbol&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<CryptoSymbol> cryptoSymbols(String exchange) throws RestClientException {
        return cryptoSymbolsWithHttpInfo(exchange).getBody();
    }

    /**
     * Crypto Symbol
     * List supported crypto symbols by exchange
     * <p><b>200</b> - successful operation
     *
     * @param exchange Exchange you want to get the list of symbols from. (required)
     * @return ResponseEntity&lt;List&lt;CryptoSymbol&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<CryptoSymbol>> cryptoSymbolsWithHttpInfo(String exchange) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'exchange' is set
        if (exchange == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'exchange' when calling cryptoSymbols");
        }

        String path = UriComponentsBuilder.fromPath("/crypto/symbol").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "exchange", exchange));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<List<CryptoSymbol>> returnType = new ParameterizedTypeReference<List<CryptoSymbol>>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Earnings Calendar
     * Get historical and coming earnings release. EPS and Revenue in this endpoint are non-GAAP, which means they are adjusted to exclude some one-time or unusual items. This is the same data investors usually react to and talked about on the media. Estimates are sourced from both sell-side and buy-side analysts.
     * <p><b>200</b> - successful operation
     *
     * @param from          From date: 2020-03-15. (optional)
     * @param to            To date: 2020-03-16. (optional)
     * @param symbol        Filter by symbol: AAPL. (optional)
     * @param international Set to &lt;code&gt;true&lt;/code&gt; to include international markets. Default value is &lt;code&gt;false&lt;/code&gt; (optional)
     * @return EarningsCalendar
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EarningsCalendar earningsCalendar(LocalDate from, LocalDate to, String symbol, Boolean international) throws RestClientException {
        return earningsCalendarWithHttpInfo(from, to, symbol, international).getBody();
    }

    /**
     * Earnings Calendar
     * Get historical and coming earnings release. EPS and Revenue in this endpoint are non-GAAP, which means they are adjusted to exclude some one-time or unusual items. This is the same data investors usually react to and talked about on the media. Estimates are sourced from both sell-side and buy-side analysts.
     * <p><b>200</b> - successful operation
     *
     * @param from          From date: 2020-03-15. (optional)
     * @param to            To date: 2020-03-16. (optional)
     * @param symbol        Filter by symbol: AAPL. (optional)
     * @param international Set to &lt;code&gt;true&lt;/code&gt; to include international markets. Default value is &lt;code&gt;false&lt;/code&gt; (optional)
     * @return ResponseEntity&lt;EarningsCalendar&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<EarningsCalendar> earningsCalendarWithHttpInfo(LocalDate from, LocalDate to, String symbol, Boolean international) throws RestClientException {
        Object postBody = null;

        String path = UriComponentsBuilder.fromPath("/calendar/earnings").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "to", to));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "symbol", symbol));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "international", international));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<EarningsCalendar> returnType = new ParameterizedTypeReference<EarningsCalendar>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Economic Calendar
     * &lt;p&gt;Get recent and upcoming economic releases.&lt;/p&gt;&lt;p&gt;Historical events and surprises are available for Enterprise clients.&lt;/p&gt;
     * <p><b>200</b> - successful operation
     *
     * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (optional)
     * @param to   To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (optional)
     * @return EconomicCalendar
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EconomicCalendar economicCalendar(LocalDate from, LocalDate to) throws RestClientException {
        return economicCalendarWithHttpInfo(from, to).getBody();
    }

    /**
     * Economic Calendar
     * &lt;p&gt;Get recent and upcoming economic releases.&lt;/p&gt;&lt;p&gt;Historical events and surprises are available for Enterprise clients.&lt;/p&gt;
     * <p><b>200</b> - successful operation
     *
     * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (optional)
     * @param to   To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (optional)
     * @return ResponseEntity&lt;EconomicCalendar&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<EconomicCalendar> economicCalendarWithHttpInfo(LocalDate from, LocalDate to) throws RestClientException {
        Object postBody = null;

        String path = UriComponentsBuilder.fromPath("/calendar/economic").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "to", to));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<EconomicCalendar> returnType = new ParameterizedTypeReference<EconomicCalendar>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Economic Code
     * List codes of supported economic data.
     * <p><b>200</b> - successful operation
     *
     * @return List&lt;EconomicCode&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<EconomicCode> economicCode() throws RestClientException {
        return economicCodeWithHttpInfo().getBody();
    }

    /**
     * Economic Code
     * List codes of supported economic data.
     * <p><b>200</b> - successful operation
     *
     * @return ResponseEntity&lt;List&lt;EconomicCode&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<EconomicCode>> economicCodeWithHttpInfo() throws RestClientException {
        Object postBody = null;

        String path = UriComponentsBuilder.fromPath("/economic/code").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();


        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<List<EconomicCode>> returnType = new ParameterizedTypeReference<List<EconomicCode>>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Economic Data
     * Get economic data.
     * <p><b>200</b> - successful operation
     *
     * @param code Economic code. (required)
     * @return EconomicData
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EconomicData economicData(String code) throws RestClientException {
        return economicDataWithHttpInfo(code).getBody();
    }

    /**
     * Economic Data
     * Get economic data.
     * <p><b>200</b> - successful operation
     *
     * @param code Economic code. (required)
     * @return ResponseEntity&lt;EconomicData&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<EconomicData> economicDataWithHttpInfo(String code) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'code' is set
        if (code == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'code' when calling economicData");
        }

        String path = UriComponentsBuilder.fromPath("/economic").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "code", code));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<EconomicData> returnType = new ParameterizedTypeReference<EconomicData>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * ETFs Country Exposure
     * Get ETF country exposure data.
     * <p><b>200</b> - successful operation
     *
     * @param symbol ETF symbol. (optional)
     * @param isin   ETF isin. (optional)
     * @return ETFsCountryExposure
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ETFsCountryExposure etfsCountryExposure(String symbol, String isin) throws RestClientException {
        return etfsCountryExposureWithHttpInfo(symbol, isin).getBody();
    }

    /**
     * ETFs Country Exposure
     * Get ETF country exposure data.
     * <p><b>200</b> - successful operation
     *
     * @param symbol ETF symbol. (optional)
     * @param isin   ETF isin. (optional)
     * @return ResponseEntity&lt;ETFsCountryExposure&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ETFsCountryExposure> etfsCountryExposureWithHttpInfo(String symbol, String isin) throws RestClientException {
        Object postBody = null;

        String path = UriComponentsBuilder.fromPath("/etf/country").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "symbol", symbol));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "isin", isin));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<ETFsCountryExposure> returnType = new ParameterizedTypeReference<ETFsCountryExposure>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * ETFs Holdings
     * Get full ETF holdings/constituents. This endpoint has global coverage. Widget only shows top 10 holdings. A list of supported ETFs can be found &lt;a href&#x3D;\&quot;/api/v1/etf/list?token&#x3D;\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.
     * <p><b>200</b> - successful operation
     *
     * @param symbol ETF symbol. (optional)
     * @param isin   ETF isin. (optional)
     * @param skip   Skip the first n results. You can use this parameter to query historical constituents data. The latest result is returned if skip&#x3D;0 or not set. (optional)
     * @param date   Query holdings by date. You can use either this param or &lt;code&gt;skip&lt;/code&gt; param, not both. (optional)
     * @return ETFsHoldings
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ETFsHoldings etfsHoldings(String symbol, String isin, Long skip, String date) throws RestClientException {
        return etfsHoldingsWithHttpInfo(symbol, isin, skip, date).getBody();
    }

    /**
     * ETFs Holdings
     * Get full ETF holdings/constituents. This endpoint has global coverage. Widget only shows top 10 holdings. A list of supported ETFs can be found &lt;a href&#x3D;\&quot;/api/v1/etf/list?token&#x3D;\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.
     * <p><b>200</b> - successful operation
     *
     * @param symbol ETF symbol. (optional)
     * @param isin   ETF isin. (optional)
     * @param skip   Skip the first n results. You can use this parameter to query historical constituents data. The latest result is returned if skip&#x3D;0 or not set. (optional)
     * @param date   Query holdings by date. You can use either this param or &lt;code&gt;skip&lt;/code&gt; param, not both. (optional)
     * @return ResponseEntity&lt;ETFsHoldings&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ETFsHoldings> etfsHoldingsWithHttpInfo(String symbol, String isin, Long skip, String date) throws RestClientException {
        Object postBody = null;

        String path = UriComponentsBuilder.fromPath("/etf/holdings").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "symbol", symbol));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "isin", isin));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "skip", skip));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "date", date));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<ETFsHoldings> returnType = new ParameterizedTypeReference<ETFsHoldings>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * ETFs Profile
     * Get ETF profile information. This endpoint has global coverage. A list of supported ETFs can be found &lt;a href&#x3D;\&quot;/api/v1/etf/list?token&#x3D;\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.
     * <p><b>200</b> - successful operation
     *
     * @param symbol ETF symbol. (optional)
     * @param isin   ETF isin. (optional)
     * @return ETFsProfile
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ETFsProfile etfsProfile(String symbol, String isin) throws RestClientException {
        return etfsProfileWithHttpInfo(symbol, isin).getBody();
    }

    /**
     * ETFs Profile
     * Get ETF profile information. This endpoint has global coverage. A list of supported ETFs can be found &lt;a href&#x3D;\&quot;/api/v1/etf/list?token&#x3D;\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.
     * <p><b>200</b> - successful operation
     *
     * @param symbol ETF symbol. (optional)
     * @param isin   ETF isin. (optional)
     * @return ResponseEntity&lt;ETFsProfile&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ETFsProfile> etfsProfileWithHttpInfo(String symbol, String isin) throws RestClientException {
        Object postBody = null;

        String path = UriComponentsBuilder.fromPath("/etf/profile").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "symbol", symbol));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "isin", isin));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<ETFsProfile> returnType = new ParameterizedTypeReference<ETFsProfile>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * ETFs Sector Exposure
     * Get ETF sector exposure data.
     * <p><b>200</b> - successful operation
     *
     * @param symbol ETF symbol. (optional)
     * @param isin   ETF isin. (optional)
     * @return ETFsSectorExposure
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ETFsSectorExposure etfsSectorExposure(String symbol, String isin) throws RestClientException {
        return etfsSectorExposureWithHttpInfo(symbol, isin).getBody();
    }

    /**
     * ETFs Sector Exposure
     * Get ETF sector exposure data.
     * <p><b>200</b> - successful operation
     *
     * @param symbol ETF symbol. (optional)
     * @param isin   ETF isin. (optional)
     * @return ResponseEntity&lt;ETFsSectorExposure&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ETFsSectorExposure> etfsSectorExposureWithHttpInfo(String symbol, String isin) throws RestClientException {
        Object postBody = null;

        String path = UriComponentsBuilder.fromPath("/etf/sector").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "symbol", symbol));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "isin", isin));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<ETFsSectorExposure> returnType = new ParameterizedTypeReference<ETFsSectorExposure>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * FDA Committee Meeting Calendar
     * FDA&#39;s advisory committees are established to provide functions which support the agency&#39;s mission of protecting and promoting the public health, while meeting the requirements set forth in the Federal Advisory Committee Act. Committees are either mandated by statute or established at the discretion of the Department of Health and Human Services. Each committee is subject to renewal at two-year intervals unless the committee charter states otherwise.
     * <p><b>200</b> - successful operation
     *
     * @return List&lt;FDAComitteeMeeting&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<FDAComitteeMeeting> fdaCommitteeMeetingCalendar() throws RestClientException {
        return fdaCommitteeMeetingCalendarWithHttpInfo().getBody();
    }

    /**
     * FDA Committee Meeting Calendar
     * FDA&#39;s advisory committees are established to provide functions which support the agency&#39;s mission of protecting and promoting the public health, while meeting the requirements set forth in the Federal Advisory Committee Act. Committees are either mandated by statute or established at the discretion of the Department of Health and Human Services. Each committee is subject to renewal at two-year intervals unless the committee charter states otherwise.
     * <p><b>200</b> - successful operation
     *
     * @return ResponseEntity&lt;List&lt;FDAComitteeMeeting&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<FDAComitteeMeeting>> fdaCommitteeMeetingCalendarWithHttpInfo() throws RestClientException {
        Object postBody = null;

        String path = UriComponentsBuilder.fromPath("/fda-advisory-committee-calendar").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();


        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<List<FDAComitteeMeeting>> returnType = new ParameterizedTypeReference<List<FDAComitteeMeeting>>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * SEC Filings
     * List company&#39;s filing. Limit to 250 documents at a time. This data is available for bulk download on &lt;a href&#x3D;\&quot;https://www.kaggle.com/finnhub/sec-filings\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Kaggle SEC Filings database&lt;/a&gt;.
     * <p><b>200</b> - successful operation
     *
     * @param symbol       Symbol. Leave &lt;code&gt;symbol&lt;/code&gt;,&lt;code&gt;cik&lt;/code&gt; and &lt;code&gt;accessNumber&lt;/code&gt; empty to list latest filings. (optional)
     * @param cik          CIK. (optional)
     * @param accessNumber Access number of a specific report you want to retrieve data from. (optional)
     * @param form         Filter by form. You can use this value &lt;code&gt;NT 10-K&lt;/code&gt; to find non-timely filings for a company. (optional)
     * @param from         From date: 2020-03-15. (optional)
     * @param to           To date: 2020-03-16. (optional)
     * @return List&lt;Filing&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Filing> filings(String symbol, String cik, String accessNumber, String form, LocalDate from, LocalDate to) throws RestClientException {
        return filingsWithHttpInfo(symbol, cik, accessNumber, form, from, to).getBody();
    }

    /**
     * SEC Filings
     * List company&#39;s filing. Limit to 250 documents at a time. This data is available for bulk download on &lt;a href&#x3D;\&quot;https://www.kaggle.com/finnhub/sec-filings\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Kaggle SEC Filings database&lt;/a&gt;.
     * <p><b>200</b> - successful operation
     *
     * @param symbol       Symbol. Leave &lt;code&gt;symbol&lt;/code&gt;,&lt;code&gt;cik&lt;/code&gt; and &lt;code&gt;accessNumber&lt;/code&gt; empty to list latest filings. (optional)
     * @param cik          CIK. (optional)
     * @param accessNumber Access number of a specific report you want to retrieve data from. (optional)
     * @param form         Filter by form. You can use this value &lt;code&gt;NT 10-K&lt;/code&gt; to find non-timely filings for a company. (optional)
     * @param from         From date: 2020-03-15. (optional)
     * @param to           To date: 2020-03-16. (optional)
     * @return ResponseEntity&lt;List&lt;Filing&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Filing>> filingsWithHttpInfo(String symbol, String cik, String accessNumber, String form, LocalDate from, LocalDate to) throws RestClientException {
        Object postBody = null;

        String path = UriComponentsBuilder.fromPath("/stock/filings").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "symbol", symbol));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cik", cik));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "accessNumber", accessNumber));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "form", form));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "to", to));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<List<Filing>> returnType = new ParameterizedTypeReference<List<Filing>>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * SEC Sentiment Analysis
     * Get sentiment analysis of 10-K and 10-Q filings from SEC. An abnormal increase in the number of positive/negative words in filings can signal a significant change in the company&#39;s stock price in the upcoming 4 quarters. We make use of &lt;a href&#x3D; \&quot;https://sraf.nd.edu/textual-analysis/resources/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Loughran and McDonald Sentiment Word Lists&lt;/a&gt; to calculate the sentiment for each filing.
     * <p><b>200</b> - successful operation
     *
     * @param accessNumber Access number of a specific report you want to retrieve data from. (required)
     * @return SECSentimentAnalysis
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SECSentimentAnalysis filingsSentiment(String accessNumber) throws RestClientException {
        return filingsSentimentWithHttpInfo(accessNumber).getBody();
    }

    /**
     * SEC Sentiment Analysis
     * Get sentiment analysis of 10-K and 10-Q filings from SEC. An abnormal increase in the number of positive/negative words in filings can signal a significant change in the company&#39;s stock price in the upcoming 4 quarters. We make use of &lt;a href&#x3D; \&quot;https://sraf.nd.edu/textual-analysis/resources/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Loughran and McDonald Sentiment Word Lists&lt;/a&gt; to calculate the sentiment for each filing.
     * <p><b>200</b> - successful operation
     *
     * @param accessNumber Access number of a specific report you want to retrieve data from. (required)
     * @return ResponseEntity&lt;SECSentimentAnalysis&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SECSentimentAnalysis> filingsSentimentWithHttpInfo(String accessNumber) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'accessNumber' is set
        if (accessNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accessNumber' when calling filingsSentiment");
        }

        String path = UriComponentsBuilder.fromPath("/stock/filings-sentiment").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "accessNumber", accessNumber));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<SECSentimentAnalysis> returnType = new ParameterizedTypeReference<SECSentimentAnalysis>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Financial Statements
     * &lt;p&gt;Get standardized balance sheet, income statement and cash flow for global companies going back 30+ years. Data is sourced from original filings most of which made available through &lt;a href&#x3D;\&quot;#filings\&quot;&gt;SEC Filings&lt;/a&gt; and &lt;a href&#x3D;\&quot;#international-filings\&quot;&gt;International Filings&lt;/a&gt; endpoints.&lt;/p&gt;&lt;p&gt;&lt;i&gt;Wondering why our standardized data is different from Bloomberg, Reuters, Factset, S&amp;P or Yahoo Finance ? Check out our &lt;a href&#x3D;\&quot;/faq\&quot;&gt;FAQ page&lt;/a&gt; to learn more&lt;/i&gt;&lt;/p&gt;
     * <p><b>200</b> - successful operation
     *
     * @param symbol    Symbol of the company: AAPL. (required)
     * @param statement Statement can take 1 of these values &lt;code&gt;bs, ic, cf&lt;/code&gt; for Balance Sheet, Income Statement, Cash Flow respectively. (required)
     * @param freq      Frequency can take 1 of these values &lt;code&gt;annual, quarterly, ttm, ytd&lt;/code&gt;.  TTM (Trailing Twelve Months) option is available for Income Statement and Cash Flow. YTD (Year To Date) option is only available for Cash Flow. (required)
     * @return FinancialStatements
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public FinancialStatements financials(String symbol, String statement, String freq) throws RestClientException {
        return financialsWithHttpInfo(symbol, statement, freq).getBody();
    }

    /**
     * Financial Statements
     * &lt;p&gt;Get standardized balance sheet, income statement and cash flow for global companies going back 30+ years. Data is sourced from original filings most of which made available through &lt;a href&#x3D;\&quot;#filings\&quot;&gt;SEC Filings&lt;/a&gt; and &lt;a href&#x3D;\&quot;#international-filings\&quot;&gt;International Filings&lt;/a&gt; endpoints.&lt;/p&gt;&lt;p&gt;&lt;i&gt;Wondering why our standardized data is different from Bloomberg, Reuters, Factset, S&amp;P or Yahoo Finance ? Check out our &lt;a href&#x3D;\&quot;/faq\&quot;&gt;FAQ page&lt;/a&gt; to learn more&lt;/i&gt;&lt;/p&gt;
     * <p><b>200</b> - successful operation
     *
     * @param symbol    Symbol of the company: AAPL. (required)
     * @param statement Statement can take 1 of these values &lt;code&gt;bs, ic, cf&lt;/code&gt; for Balance Sheet, Income Statement, Cash Flow respectively. (required)
     * @param freq      Frequency can take 1 of these values &lt;code&gt;annual, quarterly, ttm, ytd&lt;/code&gt;.  TTM (Trailing Twelve Months) option is available for Income Statement and Cash Flow. YTD (Year To Date) option is only available for Cash Flow. (required)
     * @return ResponseEntity&lt;FinancialStatements&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<FinancialStatements> financialsWithHttpInfo(String symbol, String statement, String freq) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'symbol' when calling financials");
        }

        // verify the required parameter 'statement' is set
        if (statement == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'statement' when calling financials");
        }

        // verify the required parameter 'freq' is set
        if (freq == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'freq' when calling financials");
        }

        String path = UriComponentsBuilder.fromPath("/stock/financials").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "symbol", symbol));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "statement", statement));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "freq", freq));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<FinancialStatements> returnType = new ParameterizedTypeReference<FinancialStatements>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Financials As Reported
     * Get financials as reported. This data is available for bulk download on &lt;a href&#x3D;\&quot;https://www.kaggle.com/finnhub/reported-financials\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Kaggle SEC Financials database&lt;/a&gt;.
     * <p><b>200</b> - successful operation
     *
     * @param symbol       Symbol. (optional)
     * @param cik          CIK. (optional)
     * @param accessNumber Access number of a specific report you want to retrieve financials from. (optional)
     * @param freq         Frequency. Can be either &lt;code&gt;annual&lt;/code&gt; or &lt;code&gt;quarterly&lt;/code&gt;. Default to &lt;code&gt;annual&lt;/code&gt;. (optional)
     * @param from         From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. Filter for endDate. (optional)
     * @param to           To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. Filter for endDate. (optional)
     * @return FinancialsAsReported
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public FinancialsAsReported financialsReported(String symbol, String cik, String accessNumber, String freq, LocalDate from, LocalDate to) throws RestClientException {
        return financialsReportedWithHttpInfo(symbol, cik, accessNumber, freq, from, to).getBody();
    }

    /**
     * Financials As Reported
     * Get financials as reported. This data is available for bulk download on &lt;a href&#x3D;\&quot;https://www.kaggle.com/finnhub/reported-financials\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Kaggle SEC Financials database&lt;/a&gt;.
     * <p><b>200</b> - successful operation
     *
     * @param symbol       Symbol. (optional)
     * @param cik          CIK. (optional)
     * @param accessNumber Access number of a specific report you want to retrieve financials from. (optional)
     * @param freq         Frequency. Can be either &lt;code&gt;annual&lt;/code&gt; or &lt;code&gt;quarterly&lt;/code&gt;. Default to &lt;code&gt;annual&lt;/code&gt;. (optional)
     * @param from         From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. Filter for endDate. (optional)
     * @param to           To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. Filter for endDate. (optional)
     * @return ResponseEntity&lt;FinancialsAsReported&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<FinancialsAsReported> financialsReportedWithHttpInfo(String symbol, String cik, String accessNumber, String freq, LocalDate from, LocalDate to) throws RestClientException {
        Object postBody = null;

        String path = UriComponentsBuilder.fromPath("/stock/financials-reported").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "symbol", symbol));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cik", cik));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "accessNumber", accessNumber));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "freq", freq));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "to", to));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<FinancialsAsReported> returnType = new ParameterizedTypeReference<FinancialsAsReported>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Forex Candles
     * Get candlestick data for forex symbols.
     * <p><b>200</b> - successful operation
     *
     * @param symbol     Use symbol returned in &lt;code&gt;/forex/symbol&lt;/code&gt; endpoint for this field. (required)
     * @param resolution Supported resolution includes &lt;code&gt;1, 5, 15, 30, 60, D, W, M &lt;/code&gt;.Some timeframes might not be available depending on the exchange. (required)
     * @param from       UNIX timestamp. Interval initial value. (required)
     * @param to         UNIX timestamp. Interval end value. (required)
     * @return ForexCandles
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ForexCandles forexCandles(String symbol, String resolution, Long from, Long to) throws RestClientException {
        return forexCandlesWithHttpInfo(symbol, resolution, from, to).getBody();
    }

    /**
     * Forex Candles
     * Get candlestick data for forex symbols.
     * <p><b>200</b> - successful operation
     *
     * @param symbol     Use symbol returned in &lt;code&gt;/forex/symbol&lt;/code&gt; endpoint for this field. (required)
     * @param resolution Supported resolution includes &lt;code&gt;1, 5, 15, 30, 60, D, W, M &lt;/code&gt;.Some timeframes might not be available depending on the exchange. (required)
     * @param from       UNIX timestamp. Interval initial value. (required)
     * @param to         UNIX timestamp. Interval end value. (required)
     * @return ResponseEntity&lt;ForexCandles&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ForexCandles> forexCandlesWithHttpInfo(String symbol, String resolution, Long from, Long to) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'symbol' when calling forexCandles");
        }

        // verify the required parameter 'resolution' is set
        if (resolution == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'resolution' when calling forexCandles");
        }

        // verify the required parameter 'from' is set
        if (from == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'from' when calling forexCandles");
        }

        // verify the required parameter 'to' is set
        if (to == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'to' when calling forexCandles");
        }

        String path = UriComponentsBuilder.fromPath("/forex/candle").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "symbol", symbol));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "resolution", resolution));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "to", to));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<ForexCandles> returnType = new ParameterizedTypeReference<ForexCandles>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Forex Exchanges
     * List supported forex exchanges
     * <p><b>200</b> - successful operation
     *
     * @return List&lt;String&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<String> forexExchanges() throws RestClientException {
        return forexExchangesWithHttpInfo().getBody();
    }

    /**
     * Forex Exchanges
     * List supported forex exchanges
     * <p><b>200</b> - successful operation
     *
     * @return ResponseEntity&lt;List&lt;String&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<String>> forexExchangesWithHttpInfo() throws RestClientException {
        Object postBody = null;

        String path = UriComponentsBuilder.fromPath("/forex/exchange").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();


        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<List<String>> returnType = new ParameterizedTypeReference<List<String>>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Forex rates
     * Get rates for all forex pairs. Ideal for currency conversion
     * <p><b>200</b> - successful operation
     *
     * @param base Base currency. Default to EUR. (optional)
     * @param date Date. Leave blank to get the latest data. (optional)
     * @return Forexrates
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Forexrates forexRates(String base, String date) throws RestClientException {
        return forexRatesWithHttpInfo(base, date).getBody();
    }

    /**
     * Forex rates
     * Get rates for all forex pairs. Ideal for currency conversion
     * <p><b>200</b> - successful operation
     *
     * @param base Base currency. Default to EUR. (optional)
     * @param date Date. Leave blank to get the latest data. (optional)
     * @return ResponseEntity&lt;Forexrates&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Forexrates> forexRatesWithHttpInfo(String base, String date) throws RestClientException {
        Object postBody = null;

        String path = UriComponentsBuilder.fromPath("/forex/rates").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "base", base));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "date", date));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<Forexrates> returnType = new ParameterizedTypeReference<Forexrates>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Forex Symbol
     * List supported forex symbols.
     * <p><b>200</b> - successful operation
     *
     * @param exchange Exchange you want to get the list of symbols from. (required)
     * @return List&lt;ForexSymbol&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<ForexSymbol> forexSymbols(String exchange) throws RestClientException {
        return forexSymbolsWithHttpInfo(exchange).getBody();
    }

    /**
     * Forex Symbol
     * List supported forex symbols.
     * <p><b>200</b> - successful operation
     *
     * @param exchange Exchange you want to get the list of symbols from. (required)
     * @return ResponseEntity&lt;List&lt;ForexSymbol&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<ForexSymbol>> forexSymbolsWithHttpInfo(String exchange) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'exchange' is set
        if (exchange == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'exchange' when calling forexSymbols");
        }

        String path = UriComponentsBuilder.fromPath("/forex/symbol").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "exchange", exchange));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<List<ForexSymbol>> returnType = new ParameterizedTypeReference<List<ForexSymbol>>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Fund Ownership
     * Get a full list fund and institutional investors of a company in descending order of the number of shares held. Data is sourced from &lt;code&gt;13F form&lt;/code&gt;, &lt;code&gt;Schedule 13D&lt;/code&gt; and &lt;code&gt;13G&lt;/code&gt; for US market, &lt;code&gt;UK Share Register&lt;/code&gt; for UK market, &lt;code&gt;SEDI&lt;/code&gt; for Canadian market and equivalent filings for other international markets.
     * <p><b>200</b> - successful operation
     *
     * @param symbol Symbol of the company: AAPL. (required)
     * @param limit  Limit number of results. Leave empty to get the full list. (optional)
     * @return FundOwnership
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public FundOwnership fundOwnership(String symbol, Long limit) throws RestClientException {
        return fundOwnershipWithHttpInfo(symbol, limit).getBody();
    }

    /**
     * Fund Ownership
     * Get a full list fund and institutional investors of a company in descending order of the number of shares held. Data is sourced from &lt;code&gt;13F form&lt;/code&gt;, &lt;code&gt;Schedule 13D&lt;/code&gt; and &lt;code&gt;13G&lt;/code&gt; for US market, &lt;code&gt;UK Share Register&lt;/code&gt; for UK market, &lt;code&gt;SEDI&lt;/code&gt; for Canadian market and equivalent filings for other international markets.
     * <p><b>200</b> - successful operation
     *
     * @param symbol Symbol of the company: AAPL. (required)
     * @param limit  Limit number of results. Leave empty to get the full list. (optional)
     * @return ResponseEntity&lt;FundOwnership&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<FundOwnership> fundOwnershipWithHttpInfo(String symbol, Long limit) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'symbol' when calling fundOwnership");
        }

        String path = UriComponentsBuilder.fromPath("/stock/fund-ownership").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "symbol", symbol));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<FundOwnership> returnType = new ParameterizedTypeReference<FundOwnership>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Download Filings
     * &lt;p&gt;Download filings using document ids.&lt;/p&gt;
     *
     * @param documentId Document&#39;s id. Note that this is different from filingId as 1 filing can contain multiple documents. (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void globalFilingsDownload(String documentId) throws RestClientException {
        globalFilingsDownloadWithHttpInfo(documentId);
    }

    /**
     * Download Filings
     * &lt;p&gt;Download filings using document ids.&lt;/p&gt;
     *
     * @param documentId Document&#39;s id. Note that this is different from filingId as 1 filing can contain multiple documents. (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> globalFilingsDownloadWithHttpInfo(String documentId) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'documentId' is set
        if (documentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'documentId' when calling globalFilingsDownload");
        }

        String path = UriComponentsBuilder.fromPath("/global-filings/download").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "documentId", documentId));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Global Filings Search
     * &lt;p&gt;Search for best-matched filings across global companies&#39; filings, transcripts and press releases. You can filter by anything from symbol, ISIN to form type, and document sources.&lt;/p&gt;&lt;p&gt;This endpoint will return a list of documents that match your search criteria. If you would like to get the excerpts as well, please set &lt;code&gt;highlighted&lt;/code&gt; to &lt;code&gt;true&lt;/code&gt;. Once you have the list of documents, you can get a list of excerpts and positions to highlight the document using the &lt;code&gt;/search-in-filing&lt;/code&gt; endpoint&lt;/p&gt;
     * <p><b>200</b> - successful operation
     *
     * @param search Search body (optional)
     * @return SearchResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SearchResponse globalFilingsSearch(SearchBody search) throws RestClientException {
        return globalFilingsSearchWithHttpInfo(search).getBody();
    }

    /**
     * Global Filings Search
     * &lt;p&gt;Search for best-matched filings across global companies&#39; filings, transcripts and press releases. You can filter by anything from symbol, ISIN to form type, and document sources.&lt;/p&gt;&lt;p&gt;This endpoint will return a list of documents that match your search criteria. If you would like to get the excerpts as well, please set &lt;code&gt;highlighted&lt;/code&gt; to &lt;code&gt;true&lt;/code&gt;. Once you have the list of documents, you can get a list of excerpts and positions to highlight the document using the &lt;code&gt;/search-in-filing&lt;/code&gt; endpoint&lt;/p&gt;
     * <p><b>200</b> - successful operation
     *
     * @param search Search body (optional)
     * @return ResponseEntity&lt;SearchResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SearchResponse> globalFilingsSearchWithHttpInfo(SearchBody search) throws RestClientException {
        Object postBody = search;

        String path = UriComponentsBuilder.fromPath("/global-filings/search").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();


        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<SearchResponse> returnType = new ParameterizedTypeReference<SearchResponse>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Search Filter
     * &lt;p&gt;Get available values for each filter in search body.&lt;/p&gt;
     * <p><b>200</b> - successful operation
     *
     * @param field  Field to get available filters. Available filters are \&quot;countries\&quot;, \&quot;exchanges\&quot;, \&quot;exhibits\&quot;, \&quot;forms\&quot;, \&quot;gics\&quot;, \&quot;naics\&quot;, \&quot;caps\&quot;, \&quot;acts\&quot;, and \&quot;sort\&quot;. (required)
     * @param source Get available forms for each source. (optional)
     * @return SearchFilter
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SearchFilter globalFilingsSearchFilter(String field, String source) throws RestClientException {
        return globalFilingsSearchFilterWithHttpInfo(field, source).getBody();
    }

    /**
     * Search Filter
     * &lt;p&gt;Get available values for each filter in search body.&lt;/p&gt;
     * <p><b>200</b> - successful operation
     *
     * @param field  Field to get available filters. Available filters are \&quot;countries\&quot;, \&quot;exchanges\&quot;, \&quot;exhibits\&quot;, \&quot;forms\&quot;, \&quot;gics\&quot;, \&quot;naics\&quot;, \&quot;caps\&quot;, \&quot;acts\&quot;, and \&quot;sort\&quot;. (required)
     * @param source Get available forms for each source. (optional)
     * @return ResponseEntity&lt;SearchFilter&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SearchFilter> globalFilingsSearchFilterWithHttpInfo(String field, String source) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'field' is set
        if (field == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'field' when calling globalFilingsSearchFilter");
        }

        String path = UriComponentsBuilder.fromPath("/global-filings/filter").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "field", field));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "source", source));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<SearchFilter> returnType = new ParameterizedTypeReference<SearchFilter>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Indices Constituents
     * Get a list of index&#39;s constituents. A list of supported indices for this endpoint can be found &lt;a href&#x3D;\&quot;/api/v1/index/list?token&#x3D;\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.
     * <p><b>200</b> - successful operation
     *
     * @param symbol symbol (required)
     * @return IndicesConstituents
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public IndicesConstituents indicesConstituents(String symbol) throws RestClientException {
        return indicesConstituentsWithHttpInfo(symbol).getBody();
    }

    /**
     * Indices Constituents
     * Get a list of index&#39;s constituents. A list of supported indices for this endpoint can be found &lt;a href&#x3D;\&quot;/api/v1/index/list?token&#x3D;\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.
     * <p><b>200</b> - successful operation
     *
     * @param symbol symbol (required)
     * @return ResponseEntity&lt;IndicesConstituents&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<IndicesConstituents> indicesConstituentsWithHttpInfo(String symbol) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'symbol' when calling indicesConstituents");
        }

        String path = UriComponentsBuilder.fromPath("/index/constituents").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "symbol", symbol));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<IndicesConstituents> returnType = new ParameterizedTypeReference<IndicesConstituents>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Indices Historical Constituents
     * Get full history of index&#39;s constituents including symbols and dates of joining and leaving the Index. Currently support &lt;code&gt;^GSPC&lt;/code&gt;, &lt;code&gt;^NDX&lt;/code&gt;, &lt;code&gt;^DJI&lt;/code&gt;
     * <p><b>200</b> - successful operation
     *
     * @param symbol symbol (required)
     * @return IndicesHistoricalConstituents
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public IndicesHistoricalConstituents indicesHistoricalConstituents(String symbol) throws RestClientException {
        return indicesHistoricalConstituentsWithHttpInfo(symbol).getBody();
    }

    /**
     * Indices Historical Constituents
     * Get full history of index&#39;s constituents including symbols and dates of joining and leaving the Index. Currently support &lt;code&gt;^GSPC&lt;/code&gt;, &lt;code&gt;^NDX&lt;/code&gt;, &lt;code&gt;^DJI&lt;/code&gt;
     * <p><b>200</b> - successful operation
     *
     * @param symbol symbol (required)
     * @return ResponseEntity&lt;IndicesHistoricalConstituents&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<IndicesHistoricalConstituents> indicesHistoricalConstituentsWithHttpInfo(String symbol) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'symbol' when calling indicesHistoricalConstituents");
        }

        String path = UriComponentsBuilder.fromPath("/index/historical-constituents").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "symbol", symbol));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<IndicesHistoricalConstituents> returnType = new ParameterizedTypeReference<IndicesHistoricalConstituents>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Insider Sentiment
     * Get insider sentiment data for US companies calculated using method discussed &lt;a href&#x3D;\&quot;https://medium.com/@stock-api/finnhub-insiders-sentiment-analysis-cc43f9f64b3a\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. The MSPR ranges from -100 for the most negative to 100 for the most positive which can signal price changes in the coming 30-90 days.
     * <p><b>200</b> - successful operation
     *
     * @param symbol Symbol of the company: AAPL. (required)
     * @param from   From date: 2020-03-15. (required)
     * @param to     To date: 2020-03-16. (required)
     * @return InsiderSentiments
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InsiderSentiments insiderSentiment(String symbol, LocalDate from, LocalDate to) throws RestClientException {
        return insiderSentimentWithHttpInfo(symbol, from, to).getBody();
    }

    /**
     * Insider Sentiment
     * Get insider sentiment data for US companies calculated using method discussed &lt;a href&#x3D;\&quot;https://medium.com/@stock-api/finnhub-insiders-sentiment-analysis-cc43f9f64b3a\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. The MSPR ranges from -100 for the most negative to 100 for the most positive which can signal price changes in the coming 30-90 days.
     * <p><b>200</b> - successful operation
     *
     * @param symbol Symbol of the company: AAPL. (required)
     * @param from   From date: 2020-03-15. (required)
     * @param to     To date: 2020-03-16. (required)
     * @return ResponseEntity&lt;InsiderSentiments&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InsiderSentiments> insiderSentimentWithHttpInfo(String symbol, LocalDate from, LocalDate to) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'symbol' when calling insiderSentiment");
        }

        // verify the required parameter 'from' is set
        if (from == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'from' when calling insiderSentiment");
        }

        // verify the required parameter 'to' is set
        if (to == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'to' when calling insiderSentiment");
        }

        String path = UriComponentsBuilder.fromPath("/stock/insider-sentiment").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "symbol", symbol));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "to", to));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<InsiderSentiments> returnType = new ParameterizedTypeReference<InsiderSentiments>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Insider Transactions
     * Company insider transactions data sourced from &lt;code&gt;Form 3,4,5&lt;/code&gt;, SEDI and relevant companies&#39; filings. This endpoint covers US, UK, Canada, Australia, India, and all major EU markets. Limit to 100 transactions per API call.
     * <p><b>200</b> - successful operation
     *
     * @param symbol Symbol of the company: AAPL. Leave this param blank to get the latest transactions. (required)
     * @param from   From date: 2020-03-15. (optional)
     * @param to     To date: 2020-03-16. (optional)
     * @return InsiderTransactions
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InsiderTransactions insiderTransactions(String symbol, LocalDate from, LocalDate to) throws RestClientException {
        return insiderTransactionsWithHttpInfo(symbol, from, to).getBody();
    }

    /**
     * Insider Transactions
     * Company insider transactions data sourced from &lt;code&gt;Form 3,4,5&lt;/code&gt;, SEDI and relevant companies&#39; filings. This endpoint covers US, UK, Canada, Australia, India, and all major EU markets. Limit to 100 transactions per API call.
     * <p><b>200</b> - successful operation
     *
     * @param symbol Symbol of the company: AAPL. Leave this param blank to get the latest transactions. (required)
     * @param from   From date: 2020-03-15. (optional)
     * @param to     To date: 2020-03-16. (optional)
     * @return ResponseEntity&lt;InsiderTransactions&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InsiderTransactions> insiderTransactionsWithHttpInfo(String symbol, LocalDate from, LocalDate to) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'symbol' when calling insiderTransactions");
        }

        String path = UriComponentsBuilder.fromPath("/stock/insider-transactions").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "symbol", symbol));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "to", to));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<InsiderTransactions> returnType = new ParameterizedTypeReference<InsiderTransactions>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Institutional Ownership
     * Get a list institutional investors&#39; positions for a particular stock overtime. Data from 13-F filings. Limit to 1 year of data at a time.
     * <p><b>200</b> - successful operation
     *
     * @param symbol Filter by symbol. (required)
     * @param cusip  Filter by CUSIP. (required)
     * @param from   From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
     * @param to     To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
     * @return InstitutionalOwnership
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InstitutionalOwnership institutionalOwnership(String symbol, String cusip, String from, String to) throws RestClientException {
        return institutionalOwnershipWithHttpInfo(symbol, cusip, from, to).getBody();
    }

    /**
     * Institutional Ownership
     * Get a list institutional investors&#39; positions for a particular stock overtime. Data from 13-F filings. Limit to 1 year of data at a time.
     * <p><b>200</b> - successful operation
     *
     * @param symbol Filter by symbol. (required)
     * @param cusip  Filter by CUSIP. (required)
     * @param from   From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
     * @param to     To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
     * @return ResponseEntity&lt;InstitutionalOwnership&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InstitutionalOwnership> institutionalOwnershipWithHttpInfo(String symbol, String cusip, String from, String to) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'symbol' when calling institutionalOwnership");
        }

        // verify the required parameter 'cusip' is set
        if (cusip == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cusip' when calling institutionalOwnership");
        }

        // verify the required parameter 'from' is set
        if (from == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'from' when calling institutionalOwnership");
        }

        // verify the required parameter 'to' is set
        if (to == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'to' when calling institutionalOwnership");
        }

        String path = UriComponentsBuilder.fromPath("/institutional/ownership").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "symbol", symbol));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cusip", cusip));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "to", to));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<InstitutionalOwnership> returnType = new ParameterizedTypeReference<InstitutionalOwnership>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Institutional Portfolio
     * Get the holdings/portfolio data of institutional investors from 13-F filings. Limit to 1 year of data at a time. You can get a list of supported CIK &lt;a href&#x3D;\&quot;/api/v1/institutional/list?token&#x3D;\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.
     * <p><b>200</b> - successful operation
     *
     * @param cik  Fund&#39;s CIK. (required)
     * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
     * @param to   To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
     * @return InstitutionalPortfolio
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InstitutionalPortfolio institutionalPortfolio(String cik, String from, String to) throws RestClientException {
        return institutionalPortfolioWithHttpInfo(cik, from, to).getBody();
    }

    /**
     * Institutional Portfolio
     * Get the holdings/portfolio data of institutional investors from 13-F filings. Limit to 1 year of data at a time. You can get a list of supported CIK &lt;a href&#x3D;\&quot;/api/v1/institutional/list?token&#x3D;\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.
     * <p><b>200</b> - successful operation
     *
     * @param cik  Fund&#39;s CIK. (required)
     * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
     * @param to   To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
     * @return ResponseEntity&lt;InstitutionalPortfolio&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InstitutionalPortfolio> institutionalPortfolioWithHttpInfo(String cik, String from, String to) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'cik' is set
        if (cik == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cik' when calling institutionalPortfolio");
        }

        // verify the required parameter 'from' is set
        if (from == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'from' when calling institutionalPortfolio");
        }

        // verify the required parameter 'to' is set
        if (to == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'to' when calling institutionalPortfolio");
        }

        String path = UriComponentsBuilder.fromPath("/institutional/portfolio").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cik", cik));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "to", to));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<InstitutionalPortfolio> returnType = new ParameterizedTypeReference<InstitutionalPortfolio>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Institutional Profile
     * Get a list of well-known institutional investors. Currently support 60+ profiles.
     * <p><b>200</b> - successful operation
     *
     * @param cik Filter by CIK. Leave blank to get the full list. (optional)
     * @return InstitutionalProfile
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InstitutionalProfile institutionalProfile(String cik) throws RestClientException {
        return institutionalProfileWithHttpInfo(cik).getBody();
    }

    /**
     * Institutional Profile
     * Get a list of well-known institutional investors. Currently support 60+ profiles.
     * <p><b>200</b> - successful operation
     *
     * @param cik Filter by CIK. Leave blank to get the full list. (optional)
     * @return ResponseEntity&lt;InstitutionalProfile&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InstitutionalProfile> institutionalProfileWithHttpInfo(String cik) throws RestClientException {
        Object postBody = null;

        String path = UriComponentsBuilder.fromPath("/institutional/profile").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cik", cik));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<InstitutionalProfile> returnType = new ParameterizedTypeReference<InstitutionalProfile>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * International Filings
     * List filings for international companies. Limit to 250 documents at a time. These are the documents we use to source our fundamental data. Only support SEDAR and UK Companies House for normal usage. Enterprise clients who need access to the full filings for global markets should contact us for the access.
     * <p><b>200</b> - successful operation
     *
     * @param symbol  Symbol. Leave empty to list latest filings. (optional)
     * @param country Filter by country using country&#39;s 2-letter code. (optional)
     * @return List&lt;InternationalFiling&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<InternationalFiling> internationalFilings(String symbol, String country) throws RestClientException {
        return internationalFilingsWithHttpInfo(symbol, country).getBody();
    }

    /**
     * International Filings
     * List filings for international companies. Limit to 250 documents at a time. These are the documents we use to source our fundamental data. Only support SEDAR and UK Companies House for normal usage. Enterprise clients who need access to the full filings for global markets should contact us for the access.
     * <p><b>200</b> - successful operation
     *
     * @param symbol  Symbol. Leave empty to list latest filings. (optional)
     * @param country Filter by country using country&#39;s 2-letter code. (optional)
     * @return ResponseEntity&lt;List&lt;InternationalFiling&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<InternationalFiling>> internationalFilingsWithHttpInfo(String symbol, String country) throws RestClientException {
        Object postBody = null;

        String path = UriComponentsBuilder.fromPath("/stock/international-filings").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "symbol", symbol));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "country", country));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<List<InternationalFiling>> returnType = new ParameterizedTypeReference<List<InternationalFiling>>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Investment Themes (Thematic Investing)
     * &lt;p&gt;Thematic investing involves creating a portfolio (or portion of a portfolio) by gathering together a collection of companies involved in certain areas that you predict will generate above-market returns over the long term. Themes can be based on a concept such as ageing populations or a sub-sector such as robotics, and drones. Thematic investing focuses on predicted long-term trends rather than specific companies or sectors, enabling investors to access structural, one-off shifts that can change an entire industry.&lt;/p&gt;&lt;p&gt;This endpoint will help you get portfolios of different investment themes that are changing our life and are the way of the future.&lt;/p&gt;&lt;p&gt;A full list of themes supported can be found &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1ULj9xDh4iPoQj279M084adZ2_S852ttRthKKJ7madYc/edit?usp&#x3D;sharing\&quot;&gt;here&lt;/a&gt;. The theme coverage and portfolios are updated bi-weekly by our analysts. Our approach excludes penny, super-small cap and illiquid stocks.&lt;/p&gt;
     * <p><b>200</b> - successful operation
     *
     * @param theme Investment theme. A full list of themes supported can be found &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1ULj9xDh4iPoQj279M084adZ2_S852ttRthKKJ7madYc/edit?usp&#x3D;sharing\&quot;&gt;here&lt;/a&gt;. (required)
     * @return InvestmentThemes
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InvestmentThemes investmentThemes(String theme) throws RestClientException {
        return investmentThemesWithHttpInfo(theme).getBody();
    }

    /**
     * Investment Themes (Thematic Investing)
     * &lt;p&gt;Thematic investing involves creating a portfolio (or portion of a portfolio) by gathering together a collection of companies involved in certain areas that you predict will generate above-market returns over the long term. Themes can be based on a concept such as ageing populations or a sub-sector such as robotics, and drones. Thematic investing focuses on predicted long-term trends rather than specific companies or sectors, enabling investors to access structural, one-off shifts that can change an entire industry.&lt;/p&gt;&lt;p&gt;This endpoint will help you get portfolios of different investment themes that are changing our life and are the way of the future.&lt;/p&gt;&lt;p&gt;A full list of themes supported can be found &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1ULj9xDh4iPoQj279M084adZ2_S852ttRthKKJ7madYc/edit?usp&#x3D;sharing\&quot;&gt;here&lt;/a&gt;. The theme coverage and portfolios are updated bi-weekly by our analysts. Our approach excludes penny, super-small cap and illiquid stocks.&lt;/p&gt;
     * <p><b>200</b> - successful operation
     *
     * @param theme Investment theme. A full list of themes supported can be found &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1ULj9xDh4iPoQj279M084adZ2_S852ttRthKKJ7madYc/edit?usp&#x3D;sharing\&quot;&gt;here&lt;/a&gt;. (required)
     * @return ResponseEntity&lt;InvestmentThemes&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InvestmentThemes> investmentThemesWithHttpInfo(String theme) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'theme' is set
        if (theme == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'theme' when calling investmentThemes");
        }

        String path = UriComponentsBuilder.fromPath("/stock/investment-theme").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "theme", theme));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<InvestmentThemes> returnType = new ParameterizedTypeReference<InvestmentThemes>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * IPO Calendar
     * Get recent and upcoming IPO.
     * <p><b>200</b> - successful operation
     *
     * @param from From date: 2020-03-15. (required)
     * @param to   To date: 2020-03-16. (required)
     * @return IPOCalendar
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public IPOCalendar ipoCalendar(LocalDate from, LocalDate to) throws RestClientException {
        return ipoCalendarWithHttpInfo(from, to).getBody();
    }

    /**
     * IPO Calendar
     * Get recent and upcoming IPO.
     * <p><b>200</b> - successful operation
     *
     * @param from From date: 2020-03-15. (required)
     * @param to   To date: 2020-03-16. (required)
     * @return ResponseEntity&lt;IPOCalendar&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<IPOCalendar> ipoCalendarWithHttpInfo(LocalDate from, LocalDate to) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'from' is set
        if (from == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'from' when calling ipoCalendar");
        }

        // verify the required parameter 'to' is set
        if (to == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'to' when calling ipoCalendar");
        }

        String path = UriComponentsBuilder.fromPath("/calendar/ipo").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "to", to));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<IPOCalendar> returnType = new ParameterizedTypeReference<IPOCalendar>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * ISIN Change
     * Get a list of ISIN changes for EU-listed securities. Limit to 2000 events at a time.
     * <p><b>200</b> - successful operation
     *
     * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
     * @param to   To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
     * @return IsinChange
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public IsinChange isinChange(String from, String to) throws RestClientException {
        return isinChangeWithHttpInfo(from, to).getBody();
    }

    /**
     * ISIN Change
     * Get a list of ISIN changes for EU-listed securities. Limit to 2000 events at a time.
     * <p><b>200</b> - successful operation
     *
     * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
     * @param to   To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
     * @return ResponseEntity&lt;IsinChange&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<IsinChange> isinChangeWithHttpInfo(String from, String to) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'from' is set
        if (from == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'from' when calling isinChange");
        }

        // verify the required parameter 'to' is set
        if (to == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'to' when calling isinChange");
        }

        String path = UriComponentsBuilder.fromPath("/ca/isin-change").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "to", to));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<IsinChange> returnType = new ParameterizedTypeReference<IsinChange>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Market Holiday
     * Get a list of holidays for global exchanges.
     * <p><b>200</b> - successful operation
     *
     * @param exchange Exchange code. (required)
     * @return MarketHoliday
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public MarketHoliday marketHoliday(String exchange) throws RestClientException {
        return marketHolidayWithHttpInfo(exchange).getBody();
    }

    /**
     * Market Holiday
     * Get a list of holidays for global exchanges.
     * <p><b>200</b> - successful operation
     *
     * @param exchange Exchange code. (required)
     * @return ResponseEntity&lt;MarketHoliday&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<MarketHoliday> marketHolidayWithHttpInfo(String exchange) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'exchange' is set
        if (exchange == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'exchange' when calling marketHoliday");
        }

        String path = UriComponentsBuilder.fromPath("/stock/market-holiday").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "exchange", exchange));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<MarketHoliday> returnType = new ParameterizedTypeReference<MarketHoliday>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Market News
     * Get latest market news.
     * <p><b>200</b> - successful operation
     *
     * @param category This parameter can be 1 of the following values &lt;code&gt;general, forex, crypto, merger&lt;/code&gt;. (required)
     * @param minId    Use this field to get only news after this ID. Default to 0 (optional)
     * @return List&lt;MarketNews&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<MarketNews> marketNews(String category, Long minId) throws RestClientException {
        return marketNewsWithHttpInfo(category, minId).getBody();
    }

    /**
     * Market News
     * Get latest market news.
     * <p><b>200</b> - successful operation
     *
     * @param category This parameter can be 1 of the following values &lt;code&gt;general, forex, crypto, merger&lt;/code&gt;. (required)
     * @param minId    Use this field to get only news after this ID. Default to 0 (optional)
     * @return ResponseEntity&lt;List&lt;MarketNews&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<MarketNews>> marketNewsWithHttpInfo(String category, Long minId) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'category' is set
        if (category == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'category' when calling marketNews");
        }

        String path = UriComponentsBuilder.fromPath("/news").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "category", category));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "minId", minId));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<List<MarketNews>> returnType = new ParameterizedTypeReference<List<MarketNews>>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Market Status
     * Get current market status for global exchanges (whether exchanges are open or close).
     * <p><b>200</b> - successful operation
     *
     * @param exchange Exchange code. (required)
     * @return MarketStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public MarketStatus marketStatus(String exchange) throws RestClientException {
        return marketStatusWithHttpInfo(exchange).getBody();
    }

    /**
     * Market Status
     * Get current market status for global exchanges (whether exchanges are open or close).
     * <p><b>200</b> - successful operation
     *
     * @param exchange Exchange code. (required)
     * @return ResponseEntity&lt;MarketStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<MarketStatus> marketStatusWithHttpInfo(String exchange) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'exchange' is set
        if (exchange == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'exchange' when calling marketStatus");
        }

        String path = UriComponentsBuilder.fromPath("/stock/market-status").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "exchange", exchange));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<MarketStatus> returnType = new ParameterizedTypeReference<MarketStatus>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Mutual Funds Country Exposure
     * Get Mutual Funds country exposure data.
     * <p><b>200</b> - successful operation
     *
     * @param symbol Symbol. (optional)
     * @param isin   Fund&#39;s isin. (optional)
     * @return MutualFundCountryExposure
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public MutualFundCountryExposure mutualFundCountryExposure(String symbol, String isin) throws RestClientException {
        return mutualFundCountryExposureWithHttpInfo(symbol, isin).getBody();
    }

    /**
     * Mutual Funds Country Exposure
     * Get Mutual Funds country exposure data.
     * <p><b>200</b> - successful operation
     *
     * @param symbol Symbol. (optional)
     * @param isin   Fund&#39;s isin. (optional)
     * @return ResponseEntity&lt;MutualFundCountryExposure&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<MutualFundCountryExposure> mutualFundCountryExposureWithHttpInfo(String symbol, String isin) throws RestClientException {
        Object postBody = null;

        String path = UriComponentsBuilder.fromPath("/mutual-fund/country").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "symbol", symbol));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "isin", isin));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<MutualFundCountryExposure> returnType = new ParameterizedTypeReference<MutualFundCountryExposure>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Mutual Funds EET
     * Get EET data for EU funds. For PAIs data, please see the EET PAI endpoint.
     * <p><b>200</b> - successful operation
     *
     * @param isin ISIN. (required)
     * @return MutualFundEet
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public MutualFundEet mutualFundEet(String isin) throws RestClientException {
        return mutualFundEetWithHttpInfo(isin).getBody();
    }

    /**
     * Mutual Funds EET
     * Get EET data for EU funds. For PAIs data, please see the EET PAI endpoint.
     * <p><b>200</b> - successful operation
     *
     * @param isin ISIN. (required)
     * @return ResponseEntity&lt;MutualFundEet&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<MutualFundEet> mutualFundEetWithHttpInfo(String isin) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'isin' is set
        if (isin == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'isin' when calling mutualFundEet");
        }

        String path = UriComponentsBuilder.fromPath("/mutual-fund/eet").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "isin", isin));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<MutualFundEet> returnType = new ParameterizedTypeReference<MutualFundEet>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Mutual Funds EET PAI
     * Get EET PAI data for EU funds.
     * <p><b>200</b> - successful operation
     *
     * @param isin ISIN. (required)
     * @return MutualFundEetPai
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public MutualFundEetPai mutualFundEetPai(String isin) throws RestClientException {
        return mutualFundEetPaiWithHttpInfo(isin).getBody();
    }

    /**
     * Mutual Funds EET PAI
     * Get EET PAI data for EU funds.
     * <p><b>200</b> - successful operation
     *
     * @param isin ISIN. (required)
     * @return ResponseEntity&lt;MutualFundEetPai&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<MutualFundEetPai> mutualFundEetPaiWithHttpInfo(String isin) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'isin' is set
        if (isin == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'isin' when calling mutualFundEetPai");
        }

        String path = UriComponentsBuilder.fromPath("/mutual-fund/eet-pai").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "isin", isin));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<MutualFundEetPai> returnType = new ParameterizedTypeReference<MutualFundEetPai>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Mutual Funds Holdings
     * Get full Mutual Funds holdings/constituents. This endpoint covers both US and global mutual funds. For international funds, you must query the data using ISIN. A list of supported funds can be found &lt;a href&#x3D;\&quot;/api/v1/mutual-fund/list?token&#x3D;\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.
     * <p><b>200</b> - successful operation
     *
     * @param symbol Fund&#39;s symbol. (optional)
     * @param isin   Fund&#39;s isin. (optional)
     * @param skip   Skip the first n results. You can use this parameter to query historical constituents data. The latest result is returned if skip&#x3D;0 or not set. (optional)
     * @return MutualFundHoldings
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public MutualFundHoldings mutualFundHoldings(String symbol, String isin, Long skip) throws RestClientException {
        return mutualFundHoldingsWithHttpInfo(symbol, isin, skip).getBody();
    }

    /**
     * Mutual Funds Holdings
     * Get full Mutual Funds holdings/constituents. This endpoint covers both US and global mutual funds. For international funds, you must query the data using ISIN. A list of supported funds can be found &lt;a href&#x3D;\&quot;/api/v1/mutual-fund/list?token&#x3D;\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.
     * <p><b>200</b> - successful operation
     *
     * @param symbol Fund&#39;s symbol. (optional)
     * @param isin   Fund&#39;s isin. (optional)
     * @param skip   Skip the first n results. You can use this parameter to query historical constituents data. The latest result is returned if skip&#x3D;0 or not set. (optional)
     * @return ResponseEntity&lt;MutualFundHoldings&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<MutualFundHoldings> mutualFundHoldingsWithHttpInfo(String symbol, String isin, Long skip) throws RestClientException {
        Object postBody = null;

        String path = UriComponentsBuilder.fromPath("/mutual-fund/holdings").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "symbol", symbol));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "isin", isin));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "skip", skip));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<MutualFundHoldings> returnType = new ParameterizedTypeReference<MutualFundHoldings>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Mutual Funds Profile
     * Get mutual funds profile information. This endpoint covers both US and global mutual funds. For international funds, you must query the data using ISIN. A list of supported funds can be found &lt;a href&#x3D;\&quot;/api/v1/mutual-fund/list?token&#x3D;\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.
     * <p><b>200</b> - successful operation
     *
     * @param symbol Fund&#39;s symbol. (optional)
     * @param isin   Fund&#39;s isin. (optional)
     * @return MutualFundProfile
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public MutualFundProfile mutualFundProfile(String symbol, String isin) throws RestClientException {
        return mutualFundProfileWithHttpInfo(symbol, isin).getBody();
    }

    /**
     * Mutual Funds Profile
     * Get mutual funds profile information. This endpoint covers both US and global mutual funds. For international funds, you must query the data using ISIN. A list of supported funds can be found &lt;a href&#x3D;\&quot;/api/v1/mutual-fund/list?token&#x3D;\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.
     * <p><b>200</b> - successful operation
     *
     * @param symbol Fund&#39;s symbol. (optional)
     * @param isin   Fund&#39;s isin. (optional)
     * @return ResponseEntity&lt;MutualFundProfile&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<MutualFundProfile> mutualFundProfileWithHttpInfo(String symbol, String isin) throws RestClientException {
        Object postBody = null;

        String path = UriComponentsBuilder.fromPath("/mutual-fund/profile").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "symbol", symbol));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "isin", isin));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<MutualFundProfile> returnType = new ParameterizedTypeReference<MutualFundProfile>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Mutual Funds Sector Exposure
     * Get Mutual Funds sector exposure data.
     * <p><b>200</b> - successful operation
     *
     * @param symbol Mutual Fund symbol. (optional)
     * @param isin   Fund&#39;s isin. (optional)
     * @return MutualFundSectorExposure
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public MutualFundSectorExposure mutualFundSectorExposure(String symbol, String isin) throws RestClientException {
        return mutualFundSectorExposureWithHttpInfo(symbol, isin).getBody();
    }

    /**
     * Mutual Funds Sector Exposure
     * Get Mutual Funds sector exposure data.
     * <p><b>200</b> - successful operation
     *
     * @param symbol Mutual Fund symbol. (optional)
     * @param isin   Fund&#39;s isin. (optional)
     * @return ResponseEntity&lt;MutualFundSectorExposure&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<MutualFundSectorExposure> mutualFundSectorExposureWithHttpInfo(String symbol, String isin) throws RestClientException {
        Object postBody = null;

        String path = UriComponentsBuilder.fromPath("/mutual-fund/sector").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "symbol", symbol));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "isin", isin));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<MutualFundSectorExposure> returnType = new ParameterizedTypeReference<MutualFundSectorExposure>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * News Sentiment
     * Get company&#39;s news sentiment and statistics. This endpoint is only available for US companies.
     * <p><b>200</b> - successful operation
     *
     * @param symbol Company symbol. (required)
     * @return NewsSentiment
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public NewsSentiment newsSentiment(String symbol) throws RestClientException {
        return newsSentimentWithHttpInfo(symbol).getBody();
    }

    /**
     * News Sentiment
     * Get company&#39;s news sentiment and statistics. This endpoint is only available for US companies.
     * <p><b>200</b> - successful operation
     *
     * @param symbol Company symbol. (required)
     * @return ResponseEntity&lt;NewsSentiment&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<NewsSentiment> newsSentimentWithHttpInfo(String symbol) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'symbol' when calling newsSentiment");
        }

        String path = UriComponentsBuilder.fromPath("/news-sentiment").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "symbol", symbol));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<NewsSentiment> returnType = new ParameterizedTypeReference<NewsSentiment>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Ownership
     * Get a full list of shareholders of a company in descending order of the number of shares held. Data is sourced from &lt;code&gt;13F form&lt;/code&gt;, &lt;code&gt;Schedule 13D&lt;/code&gt; and &lt;code&gt;13G&lt;/code&gt; for US market, &lt;code&gt;UK Share Register&lt;/code&gt; for UK market, &lt;code&gt;SEDI&lt;/code&gt; for Canadian market and equivalent filings for other international markets.
     * <p><b>200</b> - successful operation
     *
     * @param symbol Symbol of the company: AAPL. (required)
     * @param limit  Limit number of results. Leave empty to get the full list. (optional)
     * @return Ownership
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Ownership ownership(String symbol, Long limit) throws RestClientException {
        return ownershipWithHttpInfo(symbol, limit).getBody();
    }

    /**
     * Ownership
     * Get a full list of shareholders of a company in descending order of the number of shares held. Data is sourced from &lt;code&gt;13F form&lt;/code&gt;, &lt;code&gt;Schedule 13D&lt;/code&gt; and &lt;code&gt;13G&lt;/code&gt; for US market, &lt;code&gt;UK Share Register&lt;/code&gt; for UK market, &lt;code&gt;SEDI&lt;/code&gt; for Canadian market and equivalent filings for other international markets.
     * <p><b>200</b> - successful operation
     *
     * @param symbol Symbol of the company: AAPL. (required)
     * @param limit  Limit number of results. Leave empty to get the full list. (optional)
     * @return ResponseEntity&lt;Ownership&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Ownership> ownershipWithHttpInfo(String symbol, Long limit) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'symbol' when calling ownership");
        }

        String path = UriComponentsBuilder.fromPath("/stock/ownership").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "symbol", symbol));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<Ownership> returnType = new ParameterizedTypeReference<Ownership>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Pattern Recognition
     * Run pattern recognition algorithm on a symbol. Support double top/bottom, triple top/bottom, head and shoulders, triangle, wedge, channel, flag, and candlestick patterns.
     * <p><b>200</b> - successful operation
     *
     * @param symbol     Symbol (required)
     * @param resolution Supported resolution includes &lt;code&gt;1, 5, 15, 30, 60, D, W, M &lt;/code&gt;.Some timeframes might not be available depending on the exchange. (required)
     * @return PatternRecognition
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PatternRecognition patternRecognition(String symbol, String resolution) throws RestClientException {
        return patternRecognitionWithHttpInfo(symbol, resolution).getBody();
    }

    /**
     * Pattern Recognition
     * Run pattern recognition algorithm on a symbol. Support double top/bottom, triple top/bottom, head and shoulders, triangle, wedge, channel, flag, and candlestick patterns.
     * <p><b>200</b> - successful operation
     *
     * @param symbol     Symbol (required)
     * @param resolution Supported resolution includes &lt;code&gt;1, 5, 15, 30, 60, D, W, M &lt;/code&gt;.Some timeframes might not be available depending on the exchange. (required)
     * @return ResponseEntity&lt;PatternRecognition&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PatternRecognition> patternRecognitionWithHttpInfo(String symbol, String resolution) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'symbol' when calling patternRecognition");
        }

        // verify the required parameter 'resolution' is set
        if (resolution == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'resolution' when calling patternRecognition");
        }

        String path = UriComponentsBuilder.fromPath("/scan/pattern").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "symbol", symbol));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "resolution", resolution));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<PatternRecognition> returnType = new ParameterizedTypeReference<PatternRecognition>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Major Press Releases
     * &lt;p&gt;Get latest major press releases of a company. This data can be used to highlight the most significant events comprised of mostly press releases sourced from the exchanges, BusinessWire, AccessWire, GlobeNewswire, Newsfile, and PRNewswire.&lt;/p&gt;&lt;p&gt;Full-text press releases data is available for Enterprise clients. &lt;a href&#x3D;\&quot;mailto:support@finnhub.io\&quot;&gt;Contact Us&lt;/a&gt; to learn more.&lt;/p&gt;
     * <p><b>200</b> - successful operation
     *
     * @param symbol Company symbol. (required)
     * @param from   From time: 2020-01-01. (optional)
     * @param to     To time: 2020-01-05. (optional)
     * @return PressRelease
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PressRelease pressReleases(String symbol, LocalDate from, LocalDate to) throws RestClientException {
        return pressReleasesWithHttpInfo(symbol, from, to).getBody();
    }

    /**
     * Major Press Releases
     * &lt;p&gt;Get latest major press releases of a company. This data can be used to highlight the most significant events comprised of mostly press releases sourced from the exchanges, BusinessWire, AccessWire, GlobeNewswire, Newsfile, and PRNewswire.&lt;/p&gt;&lt;p&gt;Full-text press releases data is available for Enterprise clients. &lt;a href&#x3D;\&quot;mailto:support@finnhub.io\&quot;&gt;Contact Us&lt;/a&gt; to learn more.&lt;/p&gt;
     * <p><b>200</b> - successful operation
     *
     * @param symbol Company symbol. (required)
     * @param from   From time: 2020-01-01. (optional)
     * @param to     To time: 2020-01-05. (optional)
     * @return ResponseEntity&lt;PressRelease&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PressRelease> pressReleasesWithHttpInfo(String symbol, LocalDate from, LocalDate to) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'symbol' when calling pressReleases");
        }

        String path = UriComponentsBuilder.fromPath("/press-releases").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "symbol", symbol));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "to", to));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<PressRelease> returnType = new ParameterizedTypeReference<PressRelease>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Price Metrics
     * Get company price performance statistics such as 52-week high/low, YTD return and much more.
     * <p><b>200</b> - successful operation
     *
     * @param symbol Symbol of the company: AAPL. (required)
     * @param date   Get data on a specific date in the past. The data is available weekly so your date will be automatically adjusted to the last day of that week. (optional)
     * @return PriceMetrics
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PriceMetrics priceMetrics(String symbol, String date) throws RestClientException {
        return priceMetricsWithHttpInfo(symbol, date).getBody();
    }

    /**
     * Price Metrics
     * Get company price performance statistics such as 52-week high/low, YTD return and much more.
     * <p><b>200</b> - successful operation
     *
     * @param symbol Symbol of the company: AAPL. (required)
     * @param date   Get data on a specific date in the past. The data is available weekly so your date will be automatically adjusted to the last day of that week. (optional)
     * @return ResponseEntity&lt;PriceMetrics&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PriceMetrics> priceMetricsWithHttpInfo(String symbol, String date) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'symbol' when calling priceMetrics");
        }

        String path = UriComponentsBuilder.fromPath("/stock/price-metric").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "symbol", symbol));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "date", date));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<PriceMetrics> returnType = new ParameterizedTypeReference<PriceMetrics>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Price Target
     * Get latest price target consensus.
     * <p><b>200</b> - successful operation
     *
     * @param symbol Symbol of the company: AAPL. (required)
     * @return PriceTarget
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PriceTarget priceTarget(String symbol) throws RestClientException {
        return priceTargetWithHttpInfo(symbol).getBody();
    }

    /**
     * Price Target
     * Get latest price target consensus.
     * <p><b>200</b> - successful operation
     *
     * @param symbol Symbol of the company: AAPL. (required)
     * @return ResponseEntity&lt;PriceTarget&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PriceTarget> priceTargetWithHttpInfo(String symbol) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'symbol' when calling priceTarget");
        }

        String path = UriComponentsBuilder.fromPath("/stock/price-target").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "symbol", symbol));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<PriceTarget> returnType = new ParameterizedTypeReference<PriceTarget>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Quote
     * &lt;p&gt;Get real-time quote data for US stocks. Constant polling is not recommended. Use websocket if you need real-time updates.&lt;/p&gt;&lt;p&gt;Real-time stock prices for international markets are supported for Enterprise clients via our partner&#39;s feed. &lt;a href&#x3D;\&quot;mailto:support@finnhub.io\&quot;&gt;Contact Us&lt;/a&gt; to learn more.&lt;/p&gt;
     * <p><b>200</b> - successful operation
     *
     * @param symbol Symbol (required)
     * @return Quote
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Quote quote(String symbol) throws RestClientException {
        return quoteWithHttpInfo(symbol).getBody();
    }

    /**
     * Quote
     * &lt;p&gt;Get real-time quote data for US stocks. Constant polling is not recommended. Use websocket if you need real-time updates.&lt;/p&gt;&lt;p&gt;Real-time stock prices for international markets are supported for Enterprise clients via our partner&#39;s feed. &lt;a href&#x3D;\&quot;mailto:support@finnhub.io\&quot;&gt;Contact Us&lt;/a&gt; to learn more.&lt;/p&gt;
     * <p><b>200</b> - successful operation
     *
     * @param symbol Symbol (required)
     * @return ResponseEntity&lt;Quote&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Quote> quoteWithHttpInfo(String symbol) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'symbol' when calling quote");
        }

        String path = UriComponentsBuilder.fromPath("/quote").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "symbol", symbol));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<Quote> returnType = new ParameterizedTypeReference<Quote>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Recommendation Trends
     * Get latest analyst recommendation trends for a company.
     * <p><b>200</b> - successful operation
     *
     * @param symbol Symbol of the company: AAPL. (required)
     * @return List&lt;RecommendationTrend&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<RecommendationTrend> recommendationTrends(String symbol) throws RestClientException {
        return recommendationTrendsWithHttpInfo(symbol).getBody();
    }

    /**
     * Recommendation Trends
     * Get latest analyst recommendation trends for a company.
     * <p><b>200</b> - successful operation
     *
     * @param symbol Symbol of the company: AAPL. (required)
     * @return ResponseEntity&lt;List&lt;RecommendationTrend&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<RecommendationTrend>> recommendationTrendsWithHttpInfo(String symbol) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'symbol' when calling recommendationTrends");
        }

        String path = UriComponentsBuilder.fromPath("/stock/recommendation").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "symbol", symbol));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<List<RecommendationTrend>> returnType = new ParameterizedTypeReference<List<RecommendationTrend>>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Revenue Breakdown
     * Get revenue breakdown by product. This dataset is only available for US companies which disclose their revenue breakdown in the annual or quarterly reports.
     * <p><b>200</b> - successful operation
     *
     * @param symbol Symbol. (optional)
     * @param cik    CIK. (optional)
     * @return RevenueBreakdown
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public RevenueBreakdown revenueBreakdown(String symbol, String cik) throws RestClientException {
        return revenueBreakdownWithHttpInfo(symbol, cik).getBody();
    }

    /**
     * Revenue Breakdown
     * Get revenue breakdown by product. This dataset is only available for US companies which disclose their revenue breakdown in the annual or quarterly reports.
     * <p><b>200</b> - successful operation
     *
     * @param symbol Symbol. (optional)
     * @param cik    CIK. (optional)
     * @return ResponseEntity&lt;RevenueBreakdown&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<RevenueBreakdown> revenueBreakdownWithHttpInfo(String symbol, String cik) throws RestClientException {
        Object postBody = null;

        String path = UriComponentsBuilder.fromPath("/stock/revenue-breakdown").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "symbol", symbol));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cik", cik));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<RevenueBreakdown> returnType = new ParameterizedTypeReference<RevenueBreakdown>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Search In Filing
     * &lt;p&gt;Get a list of excerpts and highlight positions within a document using your query.&lt;/p&gt;
     * <p><b>200</b> - successful operation
     *
     * @param search Search body (optional)
     * @return InFilingResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InFilingResponse searchInFiling(InFilingSearchBody search) throws RestClientException {
        return searchInFilingWithHttpInfo(search).getBody();
    }

    /**
     * Search In Filing
     * &lt;p&gt;Get a list of excerpts and highlight positions within a document using your query.&lt;/p&gt;
     * <p><b>200</b> - successful operation
     *
     * @param search Search body (optional)
     * @return ResponseEntity&lt;InFilingResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InFilingResponse> searchInFilingWithHttpInfo(InFilingSearchBody search) throws RestClientException {
        Object postBody = search;

        String path = UriComponentsBuilder.fromPath("/global-filings/search-in-filing").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();


        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<InFilingResponse> returnType = new ParameterizedTypeReference<InFilingResponse>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Sector Metrics
     * Get ratios for different sectors and regions/indices.
     * <p><b>200</b> - successful operation
     *
     * @param region Region. A list of supported values for this field can be found &lt;a href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1afedyv7yWJ-z7pMjaAZK-f6ENY3mI3EBCk95QffpoHw/edit?usp&#x3D;sharing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. (required)
     * @return SectorMetric
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SectorMetric sectorMetric(String region) throws RestClientException {
        return sectorMetricWithHttpInfo(region).getBody();
    }

    /**
     * Sector Metrics
     * Get ratios for different sectors and regions/indices.
     * <p><b>200</b> - successful operation
     *
     * @param region Region. A list of supported values for this field can be found &lt;a href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1afedyv7yWJ-z7pMjaAZK-f6ENY3mI3EBCk95QffpoHw/edit?usp&#x3D;sharing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. (required)
     * @return ResponseEntity&lt;SectorMetric&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SectorMetric> sectorMetricWithHttpInfo(String region) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'region' is set
        if (region == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'region' when calling sectorMetric");
        }

        String path = UriComponentsBuilder.fromPath("/sector/metrics").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "region", region));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<SectorMetric> returnType = new ParameterizedTypeReference<SectorMetric>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Similarity Index
     * &lt;p&gt;Calculate the textual difference between a company&#39;s 10-K / 10-Q reports and the same type of report in the previous year using Cosine Similarity. For example, this endpoint compares 2019&#39;s 10-K with 2018&#39;s 10-K. Companies breaking from its routines in disclosure of financial condition and risk analysis section can signal a significant change in the company&#39;s stock price in the upcoming 4 quarters.&lt;/p&gt;
     * <p><b>200</b> - successful operation
     *
     * @param symbol Symbol. Required if cik is empty (optional)
     * @param cik    CIK. Required if symbol is empty (optional)
     * @param freq   &lt;code&gt;annual&lt;/code&gt; or &lt;code&gt;quarterly&lt;/code&gt;. Default to &lt;code&gt;annual&lt;/code&gt; (optional)
     * @return SimilarityIndex
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SimilarityIndex similarityIndex(String symbol, String cik, String freq) throws RestClientException {
        return similarityIndexWithHttpInfo(symbol, cik, freq).getBody();
    }

    /**
     * Similarity Index
     * &lt;p&gt;Calculate the textual difference between a company&#39;s 10-K / 10-Q reports and the same type of report in the previous year using Cosine Similarity. For example, this endpoint compares 2019&#39;s 10-K with 2018&#39;s 10-K. Companies breaking from its routines in disclosure of financial condition and risk analysis section can signal a significant change in the company&#39;s stock price in the upcoming 4 quarters.&lt;/p&gt;
     * <p><b>200</b> - successful operation
     *
     * @param symbol Symbol. Required if cik is empty (optional)
     * @param cik    CIK. Required if symbol is empty (optional)
     * @param freq   &lt;code&gt;annual&lt;/code&gt; or &lt;code&gt;quarterly&lt;/code&gt;. Default to &lt;code&gt;annual&lt;/code&gt; (optional)
     * @return ResponseEntity&lt;SimilarityIndex&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SimilarityIndex> similarityIndexWithHttpInfo(String symbol, String cik, String freq) throws RestClientException {
        Object postBody = null;

        String path = UriComponentsBuilder.fromPath("/stock/similarity-index").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "symbol", symbol));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cik", cik));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "freq", freq));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<SimilarityIndex> returnType = new ParameterizedTypeReference<SimilarityIndex>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Social Sentiment
     * &lt;p&gt;Get social sentiment for stocks on Reddit and Twitter.&lt;/p&gt;
     * <p><b>200</b> - successful operation
     *
     * @param symbol Company symbol. (required)
     * @param from   From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (optional)
     * @param to     To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (optional)
     * @return SocialSentiment
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SocialSentiment socialSentiment(String symbol, LocalDate from, LocalDate to) throws RestClientException {
        return socialSentimentWithHttpInfo(symbol, from, to).getBody();
    }

    /**
     * Social Sentiment
     * &lt;p&gt;Get social sentiment for stocks on Reddit and Twitter.&lt;/p&gt;
     * <p><b>200</b> - successful operation
     *
     * @param symbol Company symbol. (required)
     * @param from   From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (optional)
     * @param to     To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (optional)
     * @return ResponseEntity&lt;SocialSentiment&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SocialSentiment> socialSentimentWithHttpInfo(String symbol, LocalDate from, LocalDate to) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'symbol' when calling socialSentiment");
        }

        String path = UriComponentsBuilder.fromPath("/stock/social-sentiment").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "symbol", symbol));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "to", to));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<SocialSentiment> returnType = new ParameterizedTypeReference<SocialSentiment>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Dividends 2 (Basic)
     * Get global dividends data.
     * <p><b>200</b> - successful operation
     *
     * @param symbol Symbol. (required)
     * @return Dividends2
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Dividends2 stockBasicDividends(String symbol) throws RestClientException {
        return stockBasicDividendsWithHttpInfo(symbol).getBody();
    }

    /**
     * Dividends 2 (Basic)
     * Get global dividends data.
     * <p><b>200</b> - successful operation
     *
     * @param symbol Symbol. (required)
     * @return ResponseEntity&lt;Dividends2&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Dividends2> stockBasicDividendsWithHttpInfo(String symbol) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'symbol' when calling stockBasicDividends");
        }

        String path = UriComponentsBuilder.fromPath("/stock/dividend2").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "symbol", symbol));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<Dividends2> returnType = new ParameterizedTypeReference<Dividends2>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Last Bid-Ask
     * Get last bid/ask data for US stocks.
     * <p><b>200</b> - successful operation
     *
     * @param symbol Symbol. (required)
     * @return LastBidAsk
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public LastBidAsk stockBidask(String symbol) throws RestClientException {
        return stockBidaskWithHttpInfo(symbol).getBody();
    }

    /**
     * Last Bid-Ask
     * Get last bid/ask data for US stocks.
     * <p><b>200</b> - successful operation
     *
     * @param symbol Symbol. (required)
     * @return ResponseEntity&lt;LastBidAsk&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<LastBidAsk> stockBidaskWithHttpInfo(String symbol) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'symbol' when calling stockBidask");
        }

        String path = UriComponentsBuilder.fromPath("/stock/bidask").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "symbol", symbol));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<LastBidAsk> returnType = new ParameterizedTypeReference<LastBidAsk>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Stock Candles
     * &lt;p&gt;Get candlestick data (OHLCV) for stocks.&lt;/p&gt;&lt;p&gt;Daily data will be adjusted for Splits. Intraday data will remain unadjusted. Only 1 month of intraday will be returned at a time. If you need more historical intraday data, please use the from and to params iteratively to request more data.&lt;/p&gt;
     * <p><b>200</b> - successful operation
     *
     * @param symbol     Symbol. (required)
     * @param resolution Supported resolution includes &lt;code&gt;1, 5, 15, 30, 60, D, W, M &lt;/code&gt;.Some timeframes might not be available depending on the exchange. (required)
     * @param from       UNIX timestamp. Interval initial value. (required)
     * @param to         UNIX timestamp. Interval end value. (required)
     * @return StockCandles
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StockCandles stockCandles(String symbol, String resolution, Long from, Long to) throws RestClientException {
        return stockCandlesWithHttpInfo(symbol, resolution, from, to).getBody();
    }

    /**
     * Stock Candles
     * &lt;p&gt;Get candlestick data (OHLCV) for stocks.&lt;/p&gt;&lt;p&gt;Daily data will be adjusted for Splits. Intraday data will remain unadjusted. Only 1 month of intraday will be returned at a time. If you need more historical intraday data, please use the from and to params iteratively to request more data.&lt;/p&gt;
     * <p><b>200</b> - successful operation
     *
     * @param symbol     Symbol. (required)
     * @param resolution Supported resolution includes &lt;code&gt;1, 5, 15, 30, 60, D, W, M &lt;/code&gt;.Some timeframes might not be available depending on the exchange. (required)
     * @param from       UNIX timestamp. Interval initial value. (required)
     * @param to         UNIX timestamp. Interval end value. (required)
     * @return ResponseEntity&lt;StockCandles&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<StockCandles> stockCandlesWithHttpInfo(String symbol, String resolution, Long from, Long to) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'symbol' when calling stockCandles");
        }

        // verify the required parameter 'resolution' is set
        if (resolution == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'resolution' when calling stockCandles");
        }

        // verify the required parameter 'from' is set
        if (from == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'from' when calling stockCandles");
        }

        // verify the required parameter 'to' is set
        if (to == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'to' when calling stockCandles");
        }

        String path = UriComponentsBuilder.fromPath("/stock/candle").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "symbol", symbol));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "resolution", resolution));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "to", to));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<StockCandles> returnType = new ParameterizedTypeReference<StockCandles>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Dividends
     * Get dividends data for common stocks going back 30 years.
     * <p><b>200</b> - successful operation
     *
     * @param symbol Symbol. (required)
     * @param from   YYYY-MM-DD. (required)
     * @param to     YYYY-MM-DD. (required)
     * @return List&lt;Dividends&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Dividends> stockDividends(String symbol, LocalDate from, LocalDate to) throws RestClientException {
        return stockDividendsWithHttpInfo(symbol, from, to).getBody();
    }

    /**
     * Dividends
     * Get dividends data for common stocks going back 30 years.
     * <p><b>200</b> - successful operation
     *
     * @param symbol Symbol. (required)
     * @param from   YYYY-MM-DD. (required)
     * @param to     YYYY-MM-DD. (required)
     * @return ResponseEntity&lt;List&lt;Dividends&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Dividends>> stockDividendsWithHttpInfo(String symbol, LocalDate from, LocalDate to) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'symbol' when calling stockDividends");
        }

        // verify the required parameter 'from' is set
        if (from == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'from' when calling stockDividends");
        }

        // verify the required parameter 'to' is set
        if (to == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'to' when calling stockDividends");
        }

        String path = UriComponentsBuilder.fromPath("/stock/dividend").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "symbol", symbol));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "to", to));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<List<Dividends>> returnType = new ParameterizedTypeReference<List<Dividends>>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Senate Lobbying
     * Get a list of reported lobbying activities in the Senate and the House.
     * <p><b>200</b> - successful operation
     *
     * @param symbol Symbol. (required)
     * @param from   From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
     * @param to     To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
     * @return LobbyingResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public LobbyingResult stockLobbying(String symbol, LocalDate from, LocalDate to) throws RestClientException {
        return stockLobbyingWithHttpInfo(symbol, from, to).getBody();
    }

    /**
     * Senate Lobbying
     * Get a list of reported lobbying activities in the Senate and the House.
     * <p><b>200</b> - successful operation
     *
     * @param symbol Symbol. (required)
     * @param from   From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
     * @param to     To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
     * @return ResponseEntity&lt;LobbyingResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<LobbyingResult> stockLobbyingWithHttpInfo(String symbol, LocalDate from, LocalDate to) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'symbol' when calling stockLobbying");
        }

        // verify the required parameter 'from' is set
        if (from == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'from' when calling stockLobbying");
        }

        // verify the required parameter 'to' is set
        if (to == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'to' when calling stockLobbying");
        }

        String path = UriComponentsBuilder.fromPath("/stock/lobbying").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "symbol", symbol));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "to", to));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<LobbyingResult> returnType = new ParameterizedTypeReference<LobbyingResult>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Historical NBBO
     * &lt;p&gt;Get historical best bid and offer for US stocks, LSE, TSX, Euronext and Deutsche Borse.&lt;/p&gt;&lt;p&gt;For US market, this endpoint only serves historical NBBO from the beginning of 2020. To download more historical data, please visit our bulk download page in the Dashboard &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;/dashboard/download\&quot;,&gt;here&lt;/a&gt;.&lt;/p&gt;
     * <p><b>200</b> - successful operation
     *
     * @param symbol Symbol. (required)
     * @param date   Date: 2020-04-02. (required)
     * @param limit  Limit number of ticks returned. Maximum value: &lt;code&gt;25000&lt;/code&gt; (required)
     * @param skip   Number of ticks to skip. Use this parameter to loop through the entire data. (required)
     * @return HistoricalNBBO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public HistoricalNBBO stockNbbo(String symbol, LocalDate date, Long limit, Long skip) throws RestClientException {
        return stockNbboWithHttpInfo(symbol, date, limit, skip).getBody();
    }

    /**
     * Historical NBBO
     * &lt;p&gt;Get historical best bid and offer for US stocks, LSE, TSX, Euronext and Deutsche Borse.&lt;/p&gt;&lt;p&gt;For US market, this endpoint only serves historical NBBO from the beginning of 2020. To download more historical data, please visit our bulk download page in the Dashboard &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;/dashboard/download\&quot;,&gt;here&lt;/a&gt;.&lt;/p&gt;
     * <p><b>200</b> - successful operation
     *
     * @param symbol Symbol. (required)
     * @param date   Date: 2020-04-02. (required)
     * @param limit  Limit number of ticks returned. Maximum value: &lt;code&gt;25000&lt;/code&gt; (required)
     * @param skip   Number of ticks to skip. Use this parameter to loop through the entire data. (required)
     * @return ResponseEntity&lt;HistoricalNBBO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<HistoricalNBBO> stockNbboWithHttpInfo(String symbol, LocalDate date, Long limit, Long skip) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'symbol' when calling stockNbbo");
        }

        // verify the required parameter 'date' is set
        if (date == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'date' when calling stockNbbo");
        }

        // verify the required parameter 'limit' is set
        if (limit == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'limit' when calling stockNbbo");
        }

        // verify the required parameter 'skip' is set
        if (skip == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'skip' when calling stockNbbo");
        }

        String path = UriComponentsBuilder.fromPath("/stock/bbo").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "symbol", symbol));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "date", date));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "skip", skip));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<HistoricalNBBO> returnType = new ParameterizedTypeReference<HistoricalNBBO>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Splits
     * Get splits data for stocks.
     * <p><b>200</b> - successful operation
     *
     * @param symbol Symbol. (required)
     * @param from   YYYY-MM-DD. (required)
     * @param to     YYYY-MM-DD. (required)
     * @return List&lt;Split&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Split> stockSplits(String symbol, LocalDate from, LocalDate to) throws RestClientException {
        return stockSplitsWithHttpInfo(symbol, from, to).getBody();
    }

    /**
     * Splits
     * Get splits data for stocks.
     * <p><b>200</b> - successful operation
     *
     * @param symbol Symbol. (required)
     * @param from   YYYY-MM-DD. (required)
     * @param to     YYYY-MM-DD. (required)
     * @return ResponseEntity&lt;List&lt;Split&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Split>> stockSplitsWithHttpInfo(String symbol, LocalDate from, LocalDate to) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'symbol' when calling stockSplits");
        }

        // verify the required parameter 'from' is set
        if (from == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'from' when calling stockSplits");
        }

        // verify the required parameter 'to' is set
        if (to == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'to' when calling stockSplits");
        }

        String path = UriComponentsBuilder.fromPath("/stock/split").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "symbol", symbol));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "to", to));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<List<Split>> returnType = new ParameterizedTypeReference<List<Split>>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Stock Symbol
     * List supported stocks. We use the following symbology to identify stocks on Finnhub &lt;code&gt;Exchange_Ticker.Exchange_Code&lt;/code&gt;. A list of supported exchange codes can be found &lt;a href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1I3pBxjfXB056-g_JYf_6o3Rns3BV2kMGG1nCatb91ls/edit?usp&#x3D;sharing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.
     * <p><b>200</b> - successful operation
     *
     * @param exchange     Exchange you want to get the list of symbols from. List of exchange codes can be found &lt;a href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1I3pBxjfXB056-g_JYf_6o3Rns3BV2kMGG1nCatb91ls/edit?usp&#x3D;sharing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. (required)
     * @param mic          Filter by MIC code. (optional)
     * @param securityType Filter by security type used by OpenFigi standard. (optional)
     * @param currency     Filter by currency. (optional)
     * @return List&lt;StockSymbol&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<StockSymbol> stockSymbols(String exchange, String mic, String securityType, String currency) throws RestClientException {
        return stockSymbolsWithHttpInfo(exchange, mic, securityType, currency).getBody();
    }

    /**
     * Stock Symbol
     * List supported stocks. We use the following symbology to identify stocks on Finnhub &lt;code&gt;Exchange_Ticker.Exchange_Code&lt;/code&gt;. A list of supported exchange codes can be found &lt;a href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1I3pBxjfXB056-g_JYf_6o3Rns3BV2kMGG1nCatb91ls/edit?usp&#x3D;sharing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.
     * <p><b>200</b> - successful operation
     *
     * @param exchange     Exchange you want to get the list of symbols from. List of exchange codes can be found &lt;a href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1I3pBxjfXB056-g_JYf_6o3Rns3BV2kMGG1nCatb91ls/edit?usp&#x3D;sharing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. (required)
     * @param mic          Filter by MIC code. (optional)
     * @param securityType Filter by security type used by OpenFigi standard. (optional)
     * @param currency     Filter by currency. (optional)
     * @return ResponseEntity&lt;List&lt;StockSymbol&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<StockSymbol>> stockSymbolsWithHttpInfo(String exchange, String mic, String securityType, String currency) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'exchange' is set
        if (exchange == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'exchange' when calling stockSymbols");
        }

        String path = UriComponentsBuilder.fromPath("/stock/symbol").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "exchange", exchange));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "mic", mic));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "securityType", securityType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "currency", currency));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<List<StockSymbol>> returnType = new ParameterizedTypeReference<List<StockSymbol>>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Tick Data
     * &lt;p&gt;Get historical tick data for global exchanges.&lt;/p&gt;&lt;p&gt;For more historical tick data, you can visit our bulk download page in the Dashboard &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;/dashboard/download\&quot;,&gt;here&lt;/a&gt; to speed up the download process.&lt;/p&gt;&lt;table class&#x3D;\&quot;table table-hover\&quot;&gt;   &lt;thead&gt;     &lt;tr&gt;       &lt;th&gt;Exchange&lt;/th&gt;       &lt;th&gt;Segment&lt;/th&gt;       &lt;th&gt;Delay&lt;/th&gt;     &lt;/tr&gt;   &lt;/thead&gt;   &lt;tbody&gt;     &lt;tr&gt;       &lt;td class&#x3D;\&quot;text-blue\&quot;&gt;US CTA/UTP&lt;/th&gt;       &lt;td&gt;Full SIP&lt;/td&gt;       &lt;td&gt;End-of-day&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td class&#x3D;\&quot;text-blue\&quot;&gt;TSX&lt;/th&gt;       &lt;td&gt;&lt;ul&gt;&lt;li&gt;TSX&lt;/li&gt;&lt;li&gt;TSX Venture&lt;/li&gt;&lt;li&gt;Index&lt;/li&gt;&lt;/ul&gt;&lt;/td&gt;       &lt;td&gt;End-of-day&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td class&#x3D;\&quot;text-blue\&quot;&gt;LSE&lt;/th&gt;       &lt;td&gt;&lt;ul&gt;&lt;li&gt;London Stock Exchange (L)&lt;/li&gt;&lt;li&gt;LSE International (L)&lt;/li&gt;&lt;li&gt;LSE European (L)&lt;/li&gt;&lt;/ul&gt;&lt;/td&gt;       &lt;td&gt;15 minute&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td class&#x3D;\&quot;text-blue\&quot;&gt;Euronext&lt;/th&gt;       &lt;td&gt;&lt;ul&gt; &lt;li&gt;Euronext Paris (PA)&lt;/li&gt; &lt;li&gt;Euronext Amsterdam (AS)&lt;/li&gt; &lt;li&gt;Euronext Lisbon (LS)&lt;/li&gt; &lt;li&gt;Euronext Brussels (BR)&lt;/li&gt; &lt;li&gt;Euronext Oslo (OL)&lt;/li&gt; &lt;li&gt;Euronext London (LN)&lt;/li&gt; &lt;li&gt;Euronext Dublin (IR)&lt;/li&gt; &lt;li&gt;Index&lt;/li&gt; &lt;li&gt;Warrant&lt;/li&gt;&lt;/ul&gt;&lt;/td&gt;       &lt;td&gt;End-of-day&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td class&#x3D;\&quot;text-blue\&quot;&gt;Deutsche Börse&lt;/th&gt;       &lt;td&gt;&lt;ul&gt; &lt;li&gt;Frankfurt (F)&lt;/li&gt; &lt;li&gt;Xetra (DE)&lt;/li&gt; &lt;li&gt;Duesseldorf (DU)&lt;/li&gt; &lt;li&gt;Hamburg (HM)&lt;/li&gt; &lt;li&gt;Berlin (BE)&lt;/li&gt; &lt;li&gt;Hanover (HA)&lt;/li&gt; &lt;li&gt;Stoxx (SX)&lt;/li&gt; &lt;li&gt;TradeGate (TG)&lt;/li&gt; &lt;li&gt;Zertifikate (SC)&lt;/li&gt; &lt;li&gt;Index&lt;/li&gt; &lt;li&gt;Warrant&lt;/li&gt;&lt;/ul&gt;&lt;/td&gt;       &lt;td&gt;End-of-day&lt;/td&gt;     &lt;/tr&gt;   &lt;/tbody&gt; &lt;/table&gt;
     * <p><b>200</b> - successful operation
     *
     * @param symbol Symbol. (required)
     * @param date   Date: 2020-04-02. (required)
     * @param limit  Limit number of ticks returned. Maximum value: &lt;code&gt;25000&lt;/code&gt; (required)
     * @param skip   Number of ticks to skip. Use this parameter to loop through the entire data. (required)
     * @return TickData
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TickData stockTick(String symbol, LocalDate date, Long limit, Long skip) throws RestClientException {
        return stockTickWithHttpInfo(symbol, date, limit, skip).getBody();
    }

    /**
     * Tick Data
     * &lt;p&gt;Get historical tick data for global exchanges.&lt;/p&gt;&lt;p&gt;For more historical tick data, you can visit our bulk download page in the Dashboard &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;/dashboard/download\&quot;,&gt;here&lt;/a&gt; to speed up the download process.&lt;/p&gt;&lt;table class&#x3D;\&quot;table table-hover\&quot;&gt;   &lt;thead&gt;     &lt;tr&gt;       &lt;th&gt;Exchange&lt;/th&gt;       &lt;th&gt;Segment&lt;/th&gt;       &lt;th&gt;Delay&lt;/th&gt;     &lt;/tr&gt;   &lt;/thead&gt;   &lt;tbody&gt;     &lt;tr&gt;       &lt;td class&#x3D;\&quot;text-blue\&quot;&gt;US CTA/UTP&lt;/th&gt;       &lt;td&gt;Full SIP&lt;/td&gt;       &lt;td&gt;End-of-day&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td class&#x3D;\&quot;text-blue\&quot;&gt;TSX&lt;/th&gt;       &lt;td&gt;&lt;ul&gt;&lt;li&gt;TSX&lt;/li&gt;&lt;li&gt;TSX Venture&lt;/li&gt;&lt;li&gt;Index&lt;/li&gt;&lt;/ul&gt;&lt;/td&gt;       &lt;td&gt;End-of-day&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td class&#x3D;\&quot;text-blue\&quot;&gt;LSE&lt;/th&gt;       &lt;td&gt;&lt;ul&gt;&lt;li&gt;London Stock Exchange (L)&lt;/li&gt;&lt;li&gt;LSE International (L)&lt;/li&gt;&lt;li&gt;LSE European (L)&lt;/li&gt;&lt;/ul&gt;&lt;/td&gt;       &lt;td&gt;15 minute&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td class&#x3D;\&quot;text-blue\&quot;&gt;Euronext&lt;/th&gt;       &lt;td&gt;&lt;ul&gt; &lt;li&gt;Euronext Paris (PA)&lt;/li&gt; &lt;li&gt;Euronext Amsterdam (AS)&lt;/li&gt; &lt;li&gt;Euronext Lisbon (LS)&lt;/li&gt; &lt;li&gt;Euronext Brussels (BR)&lt;/li&gt; &lt;li&gt;Euronext Oslo (OL)&lt;/li&gt; &lt;li&gt;Euronext London (LN)&lt;/li&gt; &lt;li&gt;Euronext Dublin (IR)&lt;/li&gt; &lt;li&gt;Index&lt;/li&gt; &lt;li&gt;Warrant&lt;/li&gt;&lt;/ul&gt;&lt;/td&gt;       &lt;td&gt;End-of-day&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td class&#x3D;\&quot;text-blue\&quot;&gt;Deutsche Börse&lt;/th&gt;       &lt;td&gt;&lt;ul&gt; &lt;li&gt;Frankfurt (F)&lt;/li&gt; &lt;li&gt;Xetra (DE)&lt;/li&gt; &lt;li&gt;Duesseldorf (DU)&lt;/li&gt; &lt;li&gt;Hamburg (HM)&lt;/li&gt; &lt;li&gt;Berlin (BE)&lt;/li&gt; &lt;li&gt;Hanover (HA)&lt;/li&gt; &lt;li&gt;Stoxx (SX)&lt;/li&gt; &lt;li&gt;TradeGate (TG)&lt;/li&gt; &lt;li&gt;Zertifikate (SC)&lt;/li&gt; &lt;li&gt;Index&lt;/li&gt; &lt;li&gt;Warrant&lt;/li&gt;&lt;/ul&gt;&lt;/td&gt;       &lt;td&gt;End-of-day&lt;/td&gt;     &lt;/tr&gt;   &lt;/tbody&gt; &lt;/table&gt;
     * <p><b>200</b> - successful operation
     *
     * @param symbol Symbol. (required)
     * @param date   Date: 2020-04-02. (required)
     * @param limit  Limit number of ticks returned. Maximum value: &lt;code&gt;25000&lt;/code&gt; (required)
     * @param skip   Number of ticks to skip. Use this parameter to loop through the entire data. (required)
     * @return ResponseEntity&lt;TickData&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TickData> stockTickWithHttpInfo(String symbol, LocalDate date, Long limit, Long skip) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'symbol' when calling stockTick");
        }

        // verify the required parameter 'date' is set
        if (date == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'date' when calling stockTick");
        }

        // verify the required parameter 'limit' is set
        if (limit == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'limit' when calling stockTick");
        }

        // verify the required parameter 'skip' is set
        if (skip == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'skip' when calling stockTick");
        }

        String path = UriComponentsBuilder.fromPath("/stock/tick").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "symbol", symbol));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "date", date));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "skip", skip));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<TickData> returnType = new ParameterizedTypeReference<TickData>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * USA Spending
     * Get a list of government&#39;s spending activities from USASpending dataset for public companies. This dataset can help you identify companies that win big government contracts which is extremely important for industries such as Defense, Aerospace, and Education.
     * <p><b>200</b> - successful operation
     *
     * @param symbol Symbol. (required)
     * @param from   From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. Filter for &lt;code&gt;actionDate&lt;/code&gt; (required)
     * @param to     To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. Filter for &lt;code&gt;actionDate&lt;/code&gt; (required)
     * @return UsaSpendingResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UsaSpendingResult stockUsaSpending(String symbol, LocalDate from, LocalDate to) throws RestClientException {
        return stockUsaSpendingWithHttpInfo(symbol, from, to).getBody();
    }

    /**
     * USA Spending
     * Get a list of government&#39;s spending activities from USASpending dataset for public companies. This dataset can help you identify companies that win big government contracts which is extremely important for industries such as Defense, Aerospace, and Education.
     * <p><b>200</b> - successful operation
     *
     * @param symbol Symbol. (required)
     * @param from   From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. Filter for &lt;code&gt;actionDate&lt;/code&gt; (required)
     * @param to     To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. Filter for &lt;code&gt;actionDate&lt;/code&gt; (required)
     * @return ResponseEntity&lt;UsaSpendingResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<UsaSpendingResult> stockUsaSpendingWithHttpInfo(String symbol, LocalDate from, LocalDate to) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'symbol' when calling stockUsaSpending");
        }

        // verify the required parameter 'from' is set
        if (from == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'from' when calling stockUsaSpending");
        }

        // verify the required parameter 'to' is set
        if (to == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'to' when calling stockUsaSpending");
        }

        String path = UriComponentsBuilder.fromPath("/stock/usa-spending").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "symbol", symbol));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "to", to));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<UsaSpendingResult> returnType = new ParameterizedTypeReference<UsaSpendingResult>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * USPTO Patents
     * List USPTO patents for companies. Limit to 250 records per API call.
     * <p><b>200</b> - successful operation
     *
     * @param symbol Symbol. (required)
     * @param from   From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
     * @param to     To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
     * @return UsptoPatentResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UsptoPatentResult stockUsptoPatent(String symbol, LocalDate from, LocalDate to) throws RestClientException {
        return stockUsptoPatentWithHttpInfo(symbol, from, to).getBody();
    }

    /**
     * USPTO Patents
     * List USPTO patents for companies. Limit to 250 records per API call.
     * <p><b>200</b> - successful operation
     *
     * @param symbol Symbol. (required)
     * @param from   From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
     * @param to     To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
     * @return ResponseEntity&lt;UsptoPatentResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<UsptoPatentResult> stockUsptoPatentWithHttpInfo(String symbol, LocalDate from, LocalDate to) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'symbol' when calling stockUsptoPatent");
        }

        // verify the required parameter 'from' is set
        if (from == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'from' when calling stockUsptoPatent");
        }

        // verify the required parameter 'to' is set
        if (to == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'to' when calling stockUsptoPatent");
        }

        String path = UriComponentsBuilder.fromPath("/stock/uspto-patent").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "symbol", symbol));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "to", to));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<UsptoPatentResult> returnType = new ParameterizedTypeReference<UsptoPatentResult>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * H1-B Visa Application
     * Get a list of H1-B and Permanent visa applications for companies from the DOL. The data is updated quarterly.
     * <p><b>200</b> - successful operation
     *
     * @param symbol Symbol. (required)
     * @param from   From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. Filter on the &lt;code&gt;beginDate&lt;/code&gt; column. (required)
     * @param to     To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. Filter on the &lt;code&gt;beginDate&lt;/code&gt; column. (required)
     * @return VisaApplicationResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public VisaApplicationResult stockVisaApplication(String symbol, LocalDate from, LocalDate to) throws RestClientException {
        return stockVisaApplicationWithHttpInfo(symbol, from, to).getBody();
    }

    /**
     * H1-B Visa Application
     * Get a list of H1-B and Permanent visa applications for companies from the DOL. The data is updated quarterly.
     * <p><b>200</b> - successful operation
     *
     * @param symbol Symbol. (required)
     * @param from   From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. Filter on the &lt;code&gt;beginDate&lt;/code&gt; column. (required)
     * @param to     To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. Filter on the &lt;code&gt;beginDate&lt;/code&gt; column. (required)
     * @return ResponseEntity&lt;VisaApplicationResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<VisaApplicationResult> stockVisaApplicationWithHttpInfo(String symbol, LocalDate from, LocalDate to) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'symbol' when calling stockVisaApplication");
        }

        // verify the required parameter 'from' is set
        if (from == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'from' when calling stockVisaApplication");
        }

        // verify the required parameter 'to' is set
        if (to == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'to' when calling stockVisaApplication");
        }

        String path = UriComponentsBuilder.fromPath("/stock/visa-application").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "symbol", symbol));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "to", to));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<VisaApplicationResult> returnType = new ParameterizedTypeReference<VisaApplicationResult>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Supply Chain Relationships
     * &lt;p&gt;This endpoint provides an overall map of public companies&#39; key customers and suppliers. The data offers a deeper look into a company&#39;s supply chain and how products are created. The data will help investors manage risk, limit exposure or generate alpha-generating ideas and trading insights.&lt;/p&gt;
     * <p><b>200</b> - successful operation
     *
     * @param symbol Symbol. (required)
     * @return SupplyChainRelationships
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SupplyChainRelationships supplyChainRelationships(String symbol) throws RestClientException {
        return supplyChainRelationshipsWithHttpInfo(symbol).getBody();
    }

    /**
     * Supply Chain Relationships
     * &lt;p&gt;This endpoint provides an overall map of public companies&#39; key customers and suppliers. The data offers a deeper look into a company&#39;s supply chain and how products are created. The data will help investors manage risk, limit exposure or generate alpha-generating ideas and trading insights.&lt;/p&gt;
     * <p><b>200</b> - successful operation
     *
     * @param symbol Symbol. (required)
     * @return ResponseEntity&lt;SupplyChainRelationships&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SupplyChainRelationships> supplyChainRelationshipsWithHttpInfo(String symbol) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'symbol' when calling supplyChainRelationships");
        }

        String path = UriComponentsBuilder.fromPath("/stock/supply-chain").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "symbol", symbol));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<SupplyChainRelationships> returnType = new ParameterizedTypeReference<SupplyChainRelationships>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Support/Resistance
     * Get support and resistance levels for a symbol.
     * <p><b>200</b> - successful operation
     *
     * @param symbol     Symbol (required)
     * @param resolution Supported resolution includes &lt;code&gt;1, 5, 15, 30, 60, D, W, M &lt;/code&gt;.Some timeframes might not be available depending on the exchange. (required)
     * @return SupportResistance
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SupportResistance supportResistance(String symbol, String resolution) throws RestClientException {
        return supportResistanceWithHttpInfo(symbol, resolution).getBody();
    }

    /**
     * Support/Resistance
     * Get support and resistance levels for a symbol.
     * <p><b>200</b> - successful operation
     *
     * @param symbol     Symbol (required)
     * @param resolution Supported resolution includes &lt;code&gt;1, 5, 15, 30, 60, D, W, M &lt;/code&gt;.Some timeframes might not be available depending on the exchange. (required)
     * @return ResponseEntity&lt;SupportResistance&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SupportResistance> supportResistanceWithHttpInfo(String symbol, String resolution) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'symbol' when calling supportResistance");
        }

        // verify the required parameter 'resolution' is set
        if (resolution == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'resolution' when calling supportResistance");
        }

        String path = UriComponentsBuilder.fromPath("/scan/support-resistance").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "symbol", symbol));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "resolution", resolution));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<SupportResistance> returnType = new ParameterizedTypeReference<SupportResistance>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Symbol Change
     * Get a list of symbol changes for US-listed, EU-listed, NSE and ASX securities. Limit to 2000 events at a time.
     * <p><b>200</b> - successful operation
     *
     * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
     * @param to   To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
     * @return SymbolChange
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SymbolChange symbolChange(String from, String to) throws RestClientException {
        return symbolChangeWithHttpInfo(from, to).getBody();
    }

    /**
     * Symbol Change
     * Get a list of symbol changes for US-listed, EU-listed, NSE and ASX securities. Limit to 2000 events at a time.
     * <p><b>200</b> - successful operation
     *
     * @param from From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
     * @param to   To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. (required)
     * @return ResponseEntity&lt;SymbolChange&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SymbolChange> symbolChangeWithHttpInfo(String from, String to) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'from' is set
        if (from == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'from' when calling symbolChange");
        }

        // verify the required parameter 'to' is set
        if (to == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'to' when calling symbolChange");
        }

        String path = UriComponentsBuilder.fromPath("/ca/symbol-change").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "to", to));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<SymbolChange> returnType = new ParameterizedTypeReference<SymbolChange>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Symbol Lookup
     * Search for best-matching symbols based on your query. You can input anything from symbol, security&#39;s name to ISIN and Cusip.
     * <p><b>200</b> - successful operation
     *
     * @param q Query text can be symbol, name, isin, or cusip. (required)
     * @return SymbolLookup
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SymbolLookup symbolSearch(String q) throws RestClientException {
        return symbolSearchWithHttpInfo(q).getBody();
    }

    /**
     * Symbol Lookup
     * Search for best-matching symbols based on your query. You can input anything from symbol, security&#39;s name to ISIN and Cusip.
     * <p><b>200</b> - successful operation
     *
     * @param q Query text can be symbol, name, isin, or cusip. (required)
     * @return ResponseEntity&lt;SymbolLookup&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SymbolLookup> symbolSearchWithHttpInfo(String q) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'q' is set
        if (q == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'q' when calling symbolSearch");
        }

        String path = UriComponentsBuilder.fromPath("/search").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "q", q));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<SymbolLookup> returnType = new ParameterizedTypeReference<SymbolLookup>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Technical Indicators
     * Return technical indicator with price data. List of supported indicators can be found &lt;a href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1ylUvKHVYN2E87WdwIza8ROaCpd48ggEl1k5i5SgA29k/edit?usp&#x3D;sharing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.
     * <p><b>200</b> - successful operation
     *
     * @param symbol          symbol (required)
     * @param resolution      Supported resolution includes &lt;code&gt;1, 5, 15, 30, 60, D, W, M &lt;/code&gt;.Some timeframes might not be available depending on the exchange. (required)
     * @param from            UNIX timestamp. Interval initial value. (required)
     * @param to              UNIX timestamp. Interval end value. (required)
     * @param indicator       Indicator name. Full list can be found &lt;a href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1ylUvKHVYN2E87WdwIza8ROaCpd48ggEl1k5i5SgA29k/edit?usp&#x3D;sharing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. (required)
     * @param indicatorFields Check out &lt;a href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1ylUvKHVYN2E87WdwIza8ROaCpd48ggEl1k5i5SgA29k/edit?usp&#x3D;sharing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;this page&lt;/a&gt; to see which indicators and params are supported. (optional)
     * @return TechnicalIndicator
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TechnicalIndicator technicalIndicator(String symbol, String resolution, Long from, Long to, String indicator, IndicatorFields indicatorFields) throws RestClientException {
        return technicalIndicatorWithHttpInfo(symbol, resolution, from, to, indicator, indicatorFields).getBody();
    }

    /**
     * Technical Indicators
     * Return technical indicator with price data. List of supported indicators can be found &lt;a href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1ylUvKHVYN2E87WdwIza8ROaCpd48ggEl1k5i5SgA29k/edit?usp&#x3D;sharing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.
     * <p><b>200</b> - successful operation
     *
     * @param symbol          symbol (required)
     * @param resolution      Supported resolution includes &lt;code&gt;1, 5, 15, 30, 60, D, W, M &lt;/code&gt;.Some timeframes might not be available depending on the exchange. (required)
     * @param from            UNIX timestamp. Interval initial value. (required)
     * @param to              UNIX timestamp. Interval end value. (required)
     * @param indicator       Indicator name. Full list can be found &lt;a href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1ylUvKHVYN2E87WdwIza8ROaCpd48ggEl1k5i5SgA29k/edit?usp&#x3D;sharing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. (required)
     * @param indicatorFields Check out &lt;a href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1ylUvKHVYN2E87WdwIza8ROaCpd48ggEl1k5i5SgA29k/edit?usp&#x3D;sharing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;this page&lt;/a&gt; to see which indicators and params are supported. (optional)
     * @return ResponseEntity&lt;TechnicalIndicator&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TechnicalIndicator> technicalIndicatorWithHttpInfo(String symbol, String resolution, Long from, Long to, String indicator, IndicatorFields indicatorFields) throws RestClientException {
        Object postBody = indicatorFields;

        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'symbol' when calling technicalIndicator");
        }

        // verify the required parameter 'resolution' is set
        if (resolution == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'resolution' when calling technicalIndicator");
        }

        // verify the required parameter 'from' is set
        if (from == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'from' when calling technicalIndicator");
        }

        // verify the required parameter 'to' is set
        if (to == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'to' when calling technicalIndicator");
        }

        // verify the required parameter 'indicator' is set
        if (indicator == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'indicator' when calling technicalIndicator");
        }

        String path = UriComponentsBuilder.fromPath("/indicator").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "symbol", symbol));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "resolution", resolution));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "to", to));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "indicator", indicator));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<TechnicalIndicator> returnType = new ParameterizedTypeReference<TechnicalIndicator>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Earnings Call Transcripts
     * &lt;p&gt;Get earnings call transcripts, audio and participants&#39; list. Data is available for US, UK, European, Australian and Canadian companies.&lt;p&gt;15+ years of data is available with 220,000+ audio which add up to 7TB in size.&lt;/p&gt;
     * <p><b>200</b> - successful operation
     *
     * @param id Transcript&#39;s id obtained with &lt;a href&#x3D;\&quot;#transcripts-list\&quot;&gt;Transcripts List endpoint&lt;/a&gt;. (required)
     * @return EarningsCallTranscripts
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EarningsCallTranscripts transcripts(String id) throws RestClientException {
        return transcriptsWithHttpInfo(id).getBody();
    }

    /**
     * Earnings Call Transcripts
     * &lt;p&gt;Get earnings call transcripts, audio and participants&#39; list. Data is available for US, UK, European, Australian and Canadian companies.&lt;p&gt;15+ years of data is available with 220,000+ audio which add up to 7TB in size.&lt;/p&gt;
     * <p><b>200</b> - successful operation
     *
     * @param id Transcript&#39;s id obtained with &lt;a href&#x3D;\&quot;#transcripts-list\&quot;&gt;Transcripts List endpoint&lt;/a&gt;. (required)
     * @return ResponseEntity&lt;EarningsCallTranscripts&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<EarningsCallTranscripts> transcriptsWithHttpInfo(String id) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling transcripts");
        }

        String path = UriComponentsBuilder.fromPath("/stock/transcripts").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "id", id));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<EarningsCallTranscripts> returnType = new ParameterizedTypeReference<EarningsCallTranscripts>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Earnings Call Transcripts List
     * List earnings call transcripts&#39; metadata. This endpoint is available for US, UK, European, Australian and Canadian companies.
     * <p><b>200</b> - successful operation
     *
     * @param symbol Company symbol: AAPL. Leave empty to list the latest transcripts (required)
     * @return EarningsCallTranscriptsList
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EarningsCallTranscriptsList transcriptsList(String symbol) throws RestClientException {
        return transcriptsListWithHttpInfo(symbol).getBody();
    }

    /**
     * Earnings Call Transcripts List
     * List earnings call transcripts&#39; metadata. This endpoint is available for US, UK, European, Australian and Canadian companies.
     * <p><b>200</b> - successful operation
     *
     * @param symbol Company symbol: AAPL. Leave empty to list the latest transcripts (required)
     * @return ResponseEntity&lt;EarningsCallTranscriptsList&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<EarningsCallTranscriptsList> transcriptsListWithHttpInfo(String symbol) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'symbol' when calling transcriptsList");
        }

        String path = UriComponentsBuilder.fromPath("/stock/transcripts/list").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "symbol", symbol));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<EarningsCallTranscriptsList> returnType = new ParameterizedTypeReference<EarningsCallTranscriptsList>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Stock Upgrade/Downgrade
     * Get latest stock upgrade and downgrade.
     * <p><b>200</b> - successful operation
     *
     * @param symbol Symbol of the company: AAPL. If left blank, the API will return latest stock upgrades/downgrades. (optional)
     * @param from   From date: 2000-03-15. (optional)
     * @param to     To date: 2020-03-16. (optional)
     * @return List&lt;UpgradeDowngrade&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<UpgradeDowngrade> upgradeDowngrade(String symbol, LocalDate from, LocalDate to) throws RestClientException {
        return upgradeDowngradeWithHttpInfo(symbol, from, to).getBody();
    }

    /**
     * Stock Upgrade/Downgrade
     * Get latest stock upgrade and downgrade.
     * <p><b>200</b> - successful operation
     *
     * @param symbol Symbol of the company: AAPL. If left blank, the API will return latest stock upgrades/downgrades. (optional)
     * @param from   From date: 2000-03-15. (optional)
     * @param to     To date: 2020-03-16. (optional)
     * @return ResponseEntity&lt;List&lt;UpgradeDowngrade&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<UpgradeDowngrade>> upgradeDowngradeWithHttpInfo(String symbol, LocalDate from, LocalDate to) throws RestClientException {
        Object postBody = null;

        String path = UriComponentsBuilder.fromPath("/stock/upgrade-downgrade").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "symbol", symbol));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "to", to));

        final String[] accepts = {
                "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
                "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"api_key"};

        ParameterizedTypeReference<List<UpgradeDowngrade>> returnType = new ParameterizedTypeReference<List<UpgradeDowngrade>>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
