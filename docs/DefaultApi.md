# DefaultApi

All URIs are relative to *https://finnhub.io/api/v1*

 Method                                                                           | HTTP request                              | Description                            
----------------------------------------------------------------------------------|-------------------------------------------|----------------------------------------
 [**aggregateIndicator**](DefaultApi.md#aggregateIndicator)                       | **GET** /scan/technical-indicator         | Aggregate Indicators                   
 [**bondPrice**](DefaultApi.md#bondPrice)                                         | **GET** /bond/price                       | Bond price data                        
 [**bondProfile**](DefaultApi.md#bondProfile)                                     | **GET** /bond/profile                     | Bond Profile                           
 [**bondTick**](DefaultApi.md#bondTick)                                           | **GET** /bond/tick                        | Bond Tick Data                         
 [**bondYieldCurve**](DefaultApi.md#bondYieldCurve)                               | **GET** /bond/yield-curve                 | Bond Yield Curve                       
 [**companyBasicFinancials**](DefaultApi.md#companyBasicFinancials)               | **GET** /stock/metric                     | Basic Financials                       
 [**companyEarnings**](DefaultApi.md#companyEarnings)                             | **GET** /stock/earnings                   | Earnings Surprises                     
 [**companyEarningsQualityScore**](DefaultApi.md#companyEarningsQualityScore)     | **GET** /stock/earnings-quality-score     | Company Earnings Quality Score         
 [**companyEbitEstimates**](DefaultApi.md#companyEbitEstimates)                   | **GET** /stock/ebit-estimate              | EBIT Estimates                         
 [**companyEbitdaEstimates**](DefaultApi.md#companyEbitdaEstimates)               | **GET** /stock/ebitda-estimate            | EBITDA Estimates                       
 [**companyEpsEstimates**](DefaultApi.md#companyEpsEstimates)                     | **GET** /stock/eps-estimate               | Earnings Estimates                     
 [**companyEsgScore**](DefaultApi.md#companyEsgScore)                             | **GET** /stock/esg                        | Company ESG Scores                     
 [**companyExecutive**](DefaultApi.md#companyExecutive)                           | **GET** /stock/executive                  | Company Executive                      
 [**companyNews**](DefaultApi.md#companyNews)                                     | **GET** /company-news                     | Company News                           
 [**companyPeers**](DefaultApi.md#companyPeers)                                   | **GET** /stock/peers                      | Peers                                  
 [**companyProfile**](DefaultApi.md#companyProfile)                               | **GET** /stock/profile                    | Company Profile                        
 [**companyProfile2**](DefaultApi.md#companyProfile2)                             | **GET** /stock/profile2                   | Company Profile 2                      
 [**companyRevenueEstimates**](DefaultApi.md#companyRevenueEstimates)             | **GET** /stock/revenue-estimate           | Revenue Estimates                      
 [**congressionalTrading**](DefaultApi.md#congressionalTrading)                   | **GET** /stock/congressional-trading      | Congressional Trading                  
 [**country**](DefaultApi.md#country)                                             | **GET** /country                          | Country Metadata                       
 [**covid19**](DefaultApi.md#covid19)                                             | **GET** /covid19/us                       | COVID-19                               
 [**cryptoCandles**](DefaultApi.md#cryptoCandles)                                 | **GET** /crypto/candle                    | Crypto Candles                         
 [**cryptoExchanges**](DefaultApi.md#cryptoExchanges)                             | **GET** /crypto/exchange                  | Crypto Exchanges                       
 [**cryptoProfile**](DefaultApi.md#cryptoProfile)                                 | **GET** /crypto/profile                   | Crypto Profile                         
 [**cryptoSymbols**](DefaultApi.md#cryptoSymbols)                                 | **GET** /crypto/symbol                    | Crypto Symbol                          
 [**earningsCalendar**](DefaultApi.md#earningsCalendar)                           | **GET** /calendar/earnings                | Earnings Calendar                      
 [**economicCalendar**](DefaultApi.md#economicCalendar)                           | **GET** /calendar/economic                | Economic Calendar                      
 [**economicCode**](DefaultApi.md#economicCode)                                   | **GET** /economic/code                    | Economic Code                          
 [**economicData**](DefaultApi.md#economicData)                                   | **GET** /economic                         | Economic Data                          
 [**etfsCountryExposure**](DefaultApi.md#etfsCountryExposure)                     | **GET** /etf/country                      | ETFs Country Exposure                  
 [**etfsHoldings**](DefaultApi.md#etfsHoldings)                                   | **GET** /etf/holdings                     | ETFs Holdings                          
 [**etfsProfile**](DefaultApi.md#etfsProfile)                                     | **GET** /etf/profile                      | ETFs Profile                           
 [**etfsSectorExposure**](DefaultApi.md#etfsSectorExposure)                       | **GET** /etf/sector                       | ETFs Sector Exposure                   
 [**fdaCommitteeMeetingCalendar**](DefaultApi.md#fdaCommitteeMeetingCalendar)     | **GET** /fda-advisory-committee-calendar  | FDA Committee Meeting Calendar         
 [**filings**](DefaultApi.md#filings)                                             | **GET** /stock/filings                    | SEC Filings                            
 [**filingsSentiment**](DefaultApi.md#filingsSentiment)                           | **GET** /stock/filings-sentiment          | SEC Sentiment Analysis                 
 [**financials**](DefaultApi.md#financials)                                       | **GET** /stock/financials                 | Financial Statements                   
 [**financialsReported**](DefaultApi.md#financialsReported)                       | **GET** /stock/financials-reported        | Financials As Reported                 
 [**forexCandles**](DefaultApi.md#forexCandles)                                   | **GET** /forex/candle                     | Forex Candles                          
 [**forexExchanges**](DefaultApi.md#forexExchanges)                               | **GET** /forex/exchange                   | Forex Exchanges                        
 [**forexRates**](DefaultApi.md#forexRates)                                       | **GET** /forex/rates                      | Forex rates                            
 [**forexSymbols**](DefaultApi.md#forexSymbols)                                   | **GET** /forex/symbol                     | Forex Symbol                           
 [**fundOwnership**](DefaultApi.md#fundOwnership)                                 | **GET** /stock/fund-ownership             | Fund Ownership                         
 [**globalFilingsDownload**](DefaultApi.md#globalFilingsDownload)                 | **GET** /global-filings/download          | Download Filings                       
 [**globalFilingsSearch**](DefaultApi.md#globalFilingsSearch)                     | **POST** /global-filings/search           | Global Filings Search                  
 [**globalFilingsSearchFilter**](DefaultApi.md#globalFilingsSearchFilter)         | **GET** /global-filings/filter            | Search Filter                          
 [**indicesConstituents**](DefaultApi.md#indicesConstituents)                     | **GET** /index/constituents               | Indices Constituents                   
 [**indicesHistoricalConstituents**](DefaultApi.md#indicesHistoricalConstituents) | **GET** /index/historical-constituents    | Indices Historical Constituents        
 [**insiderSentiment**](DefaultApi.md#insiderSentiment)                           | **GET** /stock/insider-sentiment          | Insider Sentiment                      
 [**insiderTransactions**](DefaultApi.md#insiderTransactions)                     | **GET** /stock/insider-transactions       | Insider Transactions                   
 [**institutionalOwnership**](DefaultApi.md#institutionalOwnership)               | **GET** /institutional/ownership          | Institutional Ownership                
 [**institutionalPortfolio**](DefaultApi.md#institutionalPortfolio)               | **GET** /institutional/portfolio          | Institutional Portfolio                
 [**institutionalProfile**](DefaultApi.md#institutionalProfile)                   | **GET** /institutional/profile            | Institutional Profile                  
 [**internationalFilings**](DefaultApi.md#internationalFilings)                   | **GET** /stock/international-filings      | International Filings                  
 [**investmentThemes**](DefaultApi.md#investmentThemes)                           | **GET** /stock/investment-theme           | Investment Themes (Thematic Investing) 
 [**ipoCalendar**](DefaultApi.md#ipoCalendar)                                     | **GET** /calendar/ipo                     | IPO Calendar                           
 [**isinChange**](DefaultApi.md#isinChange)                                       | **GET** /ca/isin-change                   | ISIN Change                            
 [**marketHoliday**](DefaultApi.md#marketHoliday)                                 | **GET** /stock/market-holiday             | Market Holiday                         
 [**marketNews**](DefaultApi.md#marketNews)                                       | **GET** /news                             | Market News                            
 [**marketStatus**](DefaultApi.md#marketStatus)                                   | **GET** /stock/market-status              | Market Status                          
 [**mutualFundCountryExposure**](DefaultApi.md#mutualFundCountryExposure)         | **GET** /mutual-fund/country              | Mutual Funds Country Exposure          
 [**mutualFundEet**](DefaultApi.md#mutualFundEet)                                 | **GET** /mutual-fund/eet                  | Mutual Funds EET                       
 [**mutualFundEetPai**](DefaultApi.md#mutualFundEetPai)                           | **GET** /mutual-fund/eet-pai              | Mutual Funds EET PAI                   
 [**mutualFundHoldings**](DefaultApi.md#mutualFundHoldings)                       | **GET** /mutual-fund/holdings             | Mutual Funds Holdings                  
 [**mutualFundProfile**](DefaultApi.md#mutualFundProfile)                         | **GET** /mutual-fund/profile              | Mutual Funds Profile                   
 [**mutualFundSectorExposure**](DefaultApi.md#mutualFundSectorExposure)           | **GET** /mutual-fund/sector               | Mutual Funds Sector Exposure           
 [**newsSentiment**](DefaultApi.md#newsSentiment)                                 | **GET** /news-sentiment                   | News Sentiment                         
 [**ownership**](DefaultApi.md#ownership)                                         | **GET** /stock/ownership                  | Ownership                              
 [**patternRecognition**](DefaultApi.md#patternRecognition)                       | **GET** /scan/pattern                     | Pattern Recognition                    
 [**pressReleases**](DefaultApi.md#pressReleases)                                 | **GET** /press-releases                   | Major Press Releases                   
 [**priceMetrics**](DefaultApi.md#priceMetrics)                                   | **GET** /stock/price-metric               | Price Metrics                          
 [**priceTarget**](DefaultApi.md#priceTarget)                                     | **GET** /stock/price-target               | Price Target                           
 [**quote**](DefaultApi.md#quote)                                                 | **GET** /quote                            | Quote                                  
 [**recommendationTrends**](DefaultApi.md#recommendationTrends)                   | **GET** /stock/recommendation             | Recommendation Trends                  
 [**revenueBreakdown**](DefaultApi.md#revenueBreakdown)                           | **GET** /stock/revenue-breakdown          | Revenue Breakdown                      
 [**searchInFiling**](DefaultApi.md#searchInFiling)                               | **POST** /global-filings/search-in-filing | Search In Filing                       
 [**sectorMetric**](DefaultApi.md#sectorMetric)                                   | **GET** /sector/metrics                   | Sector Metrics                         
 [**similarityIndex**](DefaultApi.md#similarityIndex)                             | **GET** /stock/similarity-index           | Similarity Index                       
 [**socialSentiment**](DefaultApi.md#socialSentiment)                             | **GET** /stock/social-sentiment           | Social Sentiment                       
 [**stockBasicDividends**](DefaultApi.md#stockBasicDividends)                     | **GET** /stock/dividend2                  | Dividends 2 (Basic)                    
 [**stockBidask**](DefaultApi.md#stockBidask)                                     | **GET** /stock/bidask                     | Last Bid-Ask                           
 [**stockCandles**](DefaultApi.md#stockCandles)                                   | **GET** /stock/candle                     | Stock Candles                          
 [**stockDividends**](DefaultApi.md#stockDividends)                               | **GET** /stock/dividend                   | Dividends                              
 [**stockLobbying**](DefaultApi.md#stockLobbying)                                 | **GET** /stock/lobbying                   | Senate Lobbying                        
 [**stockNbbo**](DefaultApi.md#stockNbbo)                                         | **GET** /stock/bbo                        | Historical NBBO                        
 [**stockSplits**](DefaultApi.md#stockSplits)                                     | **GET** /stock/split                      | Splits                                 
 [**stockSymbols**](DefaultApi.md#stockSymbols)                                   | **GET** /stock/symbol                     | Stock Symbol                           
 [**stockTick**](DefaultApi.md#stockTick)                                         | **GET** /stock/tick                       | Tick Data                              
 [**stockUsaSpending**](DefaultApi.md#stockUsaSpending)                           | **GET** /stock/usa-spending               | USA Spending                           
 [**stockUsptoPatent**](DefaultApi.md#stockUsptoPatent)                           | **GET** /stock/uspto-patent               | USPTO Patents                          
 [**stockVisaApplication**](DefaultApi.md#stockVisaApplication)                   | **GET** /stock/visa-application           | H1-B Visa Application                  
 [**supplyChainRelationships**](DefaultApi.md#supplyChainRelationships)           | **GET** /stock/supply-chain               | Supply Chain Relationships             
 [**supportResistance**](DefaultApi.md#supportResistance)                         | **GET** /scan/support-resistance          | Support/Resistance                     
 [**symbolChange**](DefaultApi.md#symbolChange)                                   | **GET** /ca/symbol-change                 | Symbol Change                          
 [**symbolSearch**](DefaultApi.md#symbolSearch)                                   | **GET** /search                           | Symbol Lookup                          
 [**technicalIndicator**](DefaultApi.md#technicalIndicator)                       | **GET** /indicator                        | Technical Indicators                   
 [**transcripts**](DefaultApi.md#transcripts)                                     | **GET** /stock/transcripts                | Earnings Call Transcripts              
 [**transcriptsList**](DefaultApi.md#transcriptsList)                             | **GET** /stock/transcripts/list           | Earnings Call Transcripts List         
 [**upgradeDowngrade**](DefaultApi.md#upgradeDowngrade)                           | **GET** /stock/upgrade-downgrade          | Stock Upgrade/Downgrade                

<a name="aggregateIndicator"></a>

# **aggregateIndicator**

> AggregateIndicators aggregateIndicator(symbol, resolution)

Aggregate Indicators

Get aggregate signal of multiple technical indicators such as MACD, RSI, Moving Average v.v. A full list of indicators
can be found &lt;a
href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1MWuy0WuT2yVlxr1KbPdggVygMZtJfunDnhe-C0GEXYM/edit?usp&#x3D;sharing\&quot;
target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String symbol = "symbol_example"; // String | symbol
String resolution = "resolution_example"; // String | Supported resolution includes <code>1, 5, 15, 30, 60, D, W, M </code>.Some timeframes might not be available depending on the exchange.
try{
AggregateIndicators result = apiInstance.aggregateIndicator(symbol, resolution);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#aggregateIndicator");
    e.

printStackTrace();
}
```

### Parameters

 Name           | Type       | Description                                                                                                                                         | Notes 
----------------|------------|-----------------------------------------------------------------------------------------------------------------------------------------------------|-------
 **symbol**     | **String** | symbol                                                                                                                                              |
 **resolution** | **String** | Supported resolution includes &lt;code&gt;1, 5, 15, 30, 60, D, W, M &lt;/code&gt;.Some timeframes might not be available depending on the exchange. |

### Return type

[**AggregateIndicators**](AggregateIndicators.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="bondPrice"></a>

# **bondPrice**

> BondCandles bondPrice(isin, from, to)

Bond price data

&lt;p&gt;Get bond&#39;s price data. The following datasets are supported:&lt;/p&gt;&lt;table class&#x3D;\&quot;table
table-hover\&quot;&gt; &lt;thead&gt; &lt;tr&gt; &lt;th&gt;Exchange&lt;/th&gt; &lt;th&gt;Segment&lt;/th&gt;
&lt;th&gt;Delay&lt;/th&gt; &lt;/tr&gt; &lt;/thead&gt; &lt;tbody&gt; &lt;tr&gt; &lt;td
class&#x3D;\&quot;text-blue\&quot;&gt;US Government Bonds&lt;/th&gt; &lt;td&gt;Government Bonds&lt;/td&gt;
&lt;td&gt;End-of-day&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt; &lt;td class&#x3D;\&quot;text-blue\&quot;&gt;FINRA
Trace&lt;/th&gt; &lt;td&gt;BTDS: US Corporate Bonds&lt;/td&gt; &lt;td&gt;Delayed 4h&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt;
&lt;td class&#x3D;\&quot;text-blue\&quot;&gt;FINRA Trace&lt;/th&gt; &lt;td&gt;144A Bonds&lt;/td&gt; &lt;td&gt;Delayed
4h&lt;/td&gt; &lt;/tr&gt; &lt;/tbody&gt; &lt;/table&gt;

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String isin = "isin_example"; // String | ISIN.
Long from = 789L; // Long | UNIX timestamp. Interval initial value.
Long to = 789L; // Long | UNIX timestamp. Interval end value.
try{
BondCandles result = apiInstance.bondPrice(isin, from, to);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#bondPrice");
    e.

printStackTrace();
}
```

### Parameters

 Name     | Type       | Description                             | Notes 
----------|------------|-----------------------------------------|-------
 **isin** | **String** | ISIN.                                   |
 **from** | **Long**   | UNIX timestamp. Interval initial value. |
 **to**   | **Long**   | UNIX timestamp. Interval end value.     |

### Return type

[**BondCandles**](BondCandles.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="bondProfile"></a>

# **bondProfile**

> BondProfile bondProfile(isin, cusip, figi)

Bond Profile

Get general information of a bond. You can query by FIGI, ISIN or CUSIP. A list of supported bonds can be found &lt;a
href&#x3D;\&quot;/api/v1/bond/list?token&#x3D;\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String isin = "isin_example"; // String | ISIN
String cusip = "cusip_example"; // String | CUSIP
String figi = "figi_example"; // String | FIGI
try{
BondProfile result = apiInstance.bondProfile(isin, cusip, figi);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#bondProfile");
    e.

printStackTrace();
}
```

### Parameters

 Name      | Type       | Description | Notes      
-----------|------------|-------------|------------
 **isin**  | **String** | ISIN        | [optional] 
 **cusip** | **String** | CUSIP       | [optional] 
 **figi**  | **String** | FIGI        | [optional] 

### Return type

[**BondProfile**](BondProfile.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="bondTick"></a>

# **bondTick**

> BondTickData bondTick(isin, date, limit, skip, exchange)

Bond Tick Data

&lt;p&gt;Get trade-level data for bonds. The following datasets are supported:&lt;/p&gt;&lt;table
class&#x3D;\&quot;table table-hover\&quot;&gt; &lt;thead&gt; &lt;tr&gt; &lt;th&gt;Exchange&lt;/th&gt;
&lt;th&gt;Segment&lt;/th&gt; &lt;th&gt;Delay&lt;/th&gt; &lt;/tr&gt; &lt;/thead&gt; &lt;tbody&gt; &lt;tr&gt; &lt;td
class&#x3D;\&quot;text-blue\&quot;&gt;FINRA Trace&lt;/th&gt; &lt;td&gt;BTDS: US Corporate Bonds&lt;/td&gt;
&lt;td&gt;Delayed 4h&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt; &lt;td class&#x3D;\&quot;text-blue\&quot;&gt;FINRA
Trace&lt;/th&gt; &lt;td&gt;144A Bonds&lt;/td&gt; &lt;td&gt;Delayed 4h&lt;/td&gt; &lt;/tr&gt; &lt;/tbody&gt;
&lt;/table&gt;

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String isin = "isin_example"; // String | ISIN.
LocalDate date = LocalDate.now(); // LocalDate | Date: 2020-04-02.
Long limit = 789L; // Long | Limit number of ticks returned. Maximum value: <code>25000</code>
Long skip = 789L; // Long | Number of ticks to skip. Use this parameter to loop through the entire data.
String exchange = "exchange_example"; // String | Currently support the following values: <code>trace</code>.
try{
BondTickData result = apiInstance.bondTick(isin, date, limit, skip, exchange);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#bondTick");
    e.

printStackTrace();
}
```

### Parameters

 Name         | Type          | Description                                                                   | Notes 
--------------|---------------|-------------------------------------------------------------------------------|-------
 **isin**     | **String**    | ISIN.                                                                         |
 **date**     | **LocalDate** | Date: 2020-04-02.                                                             |
 **limit**    | **Long**      | Limit number of ticks returned. Maximum value: &lt;code&gt;25000&lt;/code&gt; |
 **skip**     | **Long**      | Number of ticks to skip. Use this parameter to loop through the entire data.  |
 **exchange** | **String**    | Currently support the following values: &lt;code&gt;trace&lt;/code&gt;.       |

### Return type

[**BondTickData**](BondTickData.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="bondYieldCurve"></a>

# **bondYieldCurve**

> BondYieldCurve bondYieldCurve(code)

Bond Yield Curve

Get yield curve data for Treasury bonds.

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String code = "code_example"; // String | Bond's code. You can find the list of supported code <a href=\"https://docs.google.com/spreadsheets/d/1iA-lM0Kht7lsQZ7Uu_s6r2i1BbQNUNO9eGkO5-zglHg/edit?usp=sharing\" target=\"_blank\" rel=\"noopener\">here</a>.
try{
BondYieldCurve result = apiInstance.bondYieldCurve(code);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#bondYieldCurve");
    e.

printStackTrace();
}
```

### Parameters

 Name     | Type       | Description                                                                                                                                                                                                                                                                          | Notes 
----------|------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------
 **code** | **String** | Bond&#39;s code. You can find the list of supported code &lt;a href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1iA-lM0Kht7lsQZ7Uu_s6r2i1BbQNUNO9eGkO5-zglHg/edit?usp&#x3D;sharing\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener\&quot;&gt;here&lt;/a&gt;. |

### Return type

[**BondYieldCurve**](BondYieldCurve.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="companyBasicFinancials"></a>

# **companyBasicFinancials**

> BasicFinancials companyBasicFinancials(symbol, metric)

Basic Financials

Get company basic financials such as margin, P/E ratio, 52-week high/low etc.

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String symbol = "symbol_example"; // String | Symbol of the company: AAPL.
String metric = "metric_example"; // String | Metric type. Can be 1 of the following values <code>all</code>
try{
BasicFinancials result = apiInstance.companyBasicFinancials(symbol, metric);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#companyBasicFinancials");
    e.

printStackTrace();
}
```

### Parameters

 Name       | Type       | Description                                                                | Notes 
------------|------------|----------------------------------------------------------------------------|-------
 **symbol** | **String** | Symbol of the company: AAPL.                                               |
 **metric** | **String** | Metric type. Can be 1 of the following values &lt;code&gt;all&lt;/code&gt; |

### Return type

[**BasicFinancials**](BasicFinancials.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="companyEarnings"></a>

# **companyEarnings**

> List&lt;EarningResult&gt; companyEarnings(symbol, limit)

Earnings Surprises

Get company historical quarterly earnings surprise going back to 2000.

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String symbol = "symbol_example"; // String | Symbol of the company: AAPL.
Long limit = 789L; // Long | Limit number of period returned. Leave blank to get the full history.
try{
List<EarningResult> result = apiInstance.companyEarnings(symbol, limit);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#companyEarnings");
    e.

printStackTrace();
}
```

### Parameters

 Name       | Type       | Description                                                           | Notes      
------------|------------|-----------------------------------------------------------------------|------------
 **symbol** | **String** | Symbol of the company: AAPL.                                          |
 **limit**  | **Long**   | Limit number of period returned. Leave blank to get the full history. | [optional] 

### Return type

[**List&lt;EarningResult&gt;**](EarningResult.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="companyEarningsQualityScore"></a>

# **companyEarningsQualityScore**

> CompanyEarningsQualityScore companyEarningsQualityScore(symbol, freq)

Company Earnings Quality Score

&lt;p&gt;This endpoint provides Earnings Quality Score for global companies.&lt;/p&gt;&lt;p&gt; Earnings quality refers
to the extent to which current earnings predict future earnings. \&quot;High-quality\&quot; earnings are expected to
persist, while \&quot;low-quality\&quot; earnings do not. A higher score means a higher earnings
quality&lt;/p&gt;&lt;p&gt;Finnhub uses a proprietary model which takes into consideration 4 criteria:&lt;/p&gt; &lt;ul
style&#x3D;\&quot;list-style-type: unset; margin-left:
30px;\&quot;&gt;&lt;li&gt;Profitability&lt;/li&gt;&lt;li&gt;Growth&lt;/li&gt;&lt;li&gt;Cash Generation &amp; Capital
Allocation&lt;/li&gt;&lt;li&gt;Leverage&lt;/li&gt;&lt;/ul&gt;&lt;br/&gt;&lt;p&gt;We then compare the metrics of each
company in each category against its peers in the same industry to gauge how quality its earnings is.&lt;/p&gt;

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String symbol = "symbol_example"; // String | Symbol.
String freq = "freq_example"; // String | Frequency. Currently support <code>annual</code> and <code>quarterly</code>
try{
CompanyEarningsQualityScore result = apiInstance.companyEarningsQualityScore(symbol, freq);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#companyEarningsQualityScore");
    e.

printStackTrace();
}
```

### Parameters

 Name       | Type       | Description                                                                                         | Notes 
------------|------------|-----------------------------------------------------------------------------------------------------|-------
 **symbol** | **String** | Symbol.                                                                                             |
 **freq**   | **String** | Frequency. Currently support &lt;code&gt;annual&lt;/code&gt; and &lt;code&gt;quarterly&lt;/code&gt; |

### Return type

[**CompanyEarningsQualityScore**](CompanyEarningsQualityScore.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="companyEbitEstimates"></a>

# **companyEbitEstimates**

> EbitEstimates companyEbitEstimates(symbol, freq)

EBIT Estimates

Get company&#39;s ebit estimates.

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String symbol = "symbol_example"; // String | Symbol of the company: AAPL.
String freq = "freq_example"; // String | Can take 1 of the following values: <code>annual, quarterly</code>. Default to <code>quarterly</code>
try{
EbitEstimates result = apiInstance.companyEbitEstimates(symbol, freq);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#companyEbitEstimates");
    e.

printStackTrace();
}
```

### Parameters

 Name       | Type       | Description                                                                                                                   | Notes      
------------|------------|-------------------------------------------------------------------------------------------------------------------------------|------------
 **symbol** | **String** | Symbol of the company: AAPL.                                                                                                  |
 **freq**   | **String** | Can take 1 of the following values: &lt;code&gt;annual, quarterly&lt;/code&gt;. Default to &lt;code&gt;quarterly&lt;/code&gt; | [optional] 

### Return type

[**EbitEstimates**](EbitEstimates.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="companyEbitdaEstimates"></a>

# **companyEbitdaEstimates**

> EbitdaEstimates companyEbitdaEstimates(symbol, freq)

EBITDA Estimates

Get company&#39;s ebitda estimates.

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String symbol = "symbol_example"; // String | Symbol of the company: AAPL.
String freq = "freq_example"; // String | Can take 1 of the following values: <code>annual, quarterly</code>. Default to <code>quarterly</code>
try{
EbitdaEstimates result = apiInstance.companyEbitdaEstimates(symbol, freq);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#companyEbitdaEstimates");
    e.

printStackTrace();
}
```

### Parameters

 Name       | Type       | Description                                                                                                                   | Notes      
------------|------------|-------------------------------------------------------------------------------------------------------------------------------|------------
 **symbol** | **String** | Symbol of the company: AAPL.                                                                                                  |
 **freq**   | **String** | Can take 1 of the following values: &lt;code&gt;annual, quarterly&lt;/code&gt;. Default to &lt;code&gt;quarterly&lt;/code&gt; | [optional] 

### Return type

[**EbitdaEstimates**](EbitdaEstimates.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="companyEpsEstimates"></a>

# **companyEpsEstimates**

> EarningsEstimates companyEpsEstimates(symbol, freq)

Earnings Estimates

Get company&#39;s EPS estimates.

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String symbol = "symbol_example"; // String | Symbol of the company: AAPL.
String freq = "freq_example"; // String | Can take 1 of the following values: <code>annual, quarterly</code>. Default to <code>quarterly</code>
try{
EarningsEstimates result = apiInstance.companyEpsEstimates(symbol, freq);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#companyEpsEstimates");
    e.

printStackTrace();
}
```

### Parameters

 Name       | Type       | Description                                                                                                                   | Notes      
------------|------------|-------------------------------------------------------------------------------------------------------------------------------|------------
 **symbol** | **String** | Symbol of the company: AAPL.                                                                                                  |
 **freq**   | **String** | Can take 1 of the following values: &lt;code&gt;annual, quarterly&lt;/code&gt;. Default to &lt;code&gt;quarterly&lt;/code&gt; | [optional] 

### Return type

[**EarningsEstimates**](EarningsEstimates.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="companyEsgScore"></a>

# **companyEsgScore**

> CompanyESG companyEsgScore(symbol)

Company ESG Scores

&lt;p&gt;This endpoint provides ESG scores and important indicators for 7000+ global companies. The data is collected
through company&#39;s public ESG disclosure and public sources.&lt;/p&gt;&lt;p&gt;Our ESG scoring models takes into
account more than 150 different inputs to calculate the level of ESG risks and how well a company is managing them. A
higher score means lower ESG risk or better ESG management. ESG scores are in the the range of 0-100. Some key
indicators might contain letter-grade score from C- to A+ with C- is the lowest score and A+ is the highest
score.&lt;/p&gt;&lt;p&gt;Historical ESG data is available for Enterprise users. &lt;a href&#x3D;\&quot;mailto:
support@finnhub.io\&quot;&gt;Contact us&lt;/a&gt; to learn more.&lt;/p&gt;

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String symbol = "symbol_example"; // String | Symbol.
try{
CompanyESG result = apiInstance.companyEsgScore(symbol);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#companyEsgScore");
    e.

printStackTrace();
}
```

### Parameters

 Name       | Type       | Description | Notes 
------------|------------|-------------|-------
 **symbol** | **String** | Symbol.     |

### Return type

[**CompanyESG**](CompanyESG.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="companyExecutive"></a>

# **companyExecutive**

> CompanyExecutive companyExecutive(symbol)

Company Executive

Get a list of company&#39;s executives and members of the Board.

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String symbol = "symbol_example"; // String | Symbol of the company: AAPL.
try{
CompanyExecutive result = apiInstance.companyExecutive(symbol);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#companyExecutive");
    e.

printStackTrace();
}
```

### Parameters

 Name       | Type       | Description                  | Notes 
------------|------------|------------------------------|-------
 **symbol** | **String** | Symbol of the company: AAPL. |

### Return type

[**CompanyExecutive**](CompanyExecutive.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="companyNews"></a>

# **companyNews**

> List&lt;CompanyNews&gt; companyNews(symbol, from, to)

Company News

List latest company news by symbol. This endpoint is only available for North American companies.

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String symbol = "symbol_example"; // String | Company symbol.
LocalDate from = LocalDate.now(); // LocalDate | From date <code>YYYY-MM-DD</code>.
LocalDate to = LocalDate.now(); // LocalDate | To date <code>YYYY-MM-DD</code>.
try{
List<CompanyNews> result = apiInstance.companyNews(symbol, from, to);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#companyNews");
    e.

printStackTrace();
}
```

### Parameters

 Name       | Type          | Description                                    | Notes 
------------|---------------|------------------------------------------------|-------
 **symbol** | **String**    | Company symbol.                                |
 **from**   | **LocalDate** | From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. |
 **to**     | **LocalDate** | To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;.   |

### Return type

[**List&lt;CompanyNews&gt;**](CompanyNews.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="companyPeers"></a>

# **companyPeers**

> List&lt;String&gt; companyPeers(symbol, grouping)

Peers

Get company peers. Return a list of peers operating in the same country and sector/industry.

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String symbol = "symbol_example"; // String | Symbol of the company: AAPL.
String grouping = "grouping_example"; // String | Specify the grouping criteria for choosing peers.Supporter values: <code>sector</code>, <code>industry</code>, <code>subIndustry</code>. Default to <code>subIndustry</code>.
try{
List<String> result = apiInstance.companyPeers(symbol, grouping);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#companyPeers");
    e.

printStackTrace();
}
```

### Parameters

 Name         | Type       | Description                                                                                                                                                                                                                   | Notes      
--------------|------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------
 **symbol**   | **String** | Symbol of the company: AAPL.                                                                                                                                                                                                  |
 **grouping** | **String** | Specify the grouping criteria for choosing peers.Supporter values: &lt;code&gt;sector&lt;/code&gt;, &lt;code&gt;industry&lt;/code&gt;, &lt;code&gt;subIndustry&lt;/code&gt;. Default to &lt;code&gt;subIndustry&lt;/code&gt;. | [optional] 

### Return type

**List&lt;String&gt;**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="companyProfile"></a>

# **companyProfile**

> CompanyProfile companyProfile(symbol, isin, cusip)

Company Profile

Get general information of a company. You can query by symbol, ISIN or CUSIP

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String symbol = "symbol_example"; // String | Symbol of the company: AAPL e.g.
String isin = "isin_example"; // String | ISIN
String cusip = "cusip_example"; // String | CUSIP
try{
CompanyProfile result = apiInstance.companyProfile(symbol, isin, cusip);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#companyProfile");
    e.

printStackTrace();
}
```

### Parameters

 Name       | Type       | Description                      | Notes      
------------|------------|----------------------------------|------------
 **symbol** | **String** | Symbol of the company: AAPL e.g. | [optional] 
 **isin**   | **String** | ISIN                             | [optional] 
 **cusip**  | **String** | CUSIP                            | [optional] 

### Return type

[**CompanyProfile**](CompanyProfile.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="companyProfile2"></a>

# **companyProfile2**

> CompanyProfile2 companyProfile2(symbol, isin, cusip)

Company Profile 2

Get general information of a company. You can query by symbol, ISIN or CUSIP. This is the free version of &lt;a
href&#x3D;\&quot;#company-profile\&quot;&gt;Company Profile&lt;/a&gt;.

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String symbol = "symbol_example"; // String | Symbol of the company: AAPL e.g.
String isin = "isin_example"; // String | ISIN
String cusip = "cusip_example"; // String | CUSIP
try{
CompanyProfile2 result = apiInstance.companyProfile2(symbol, isin, cusip);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#companyProfile2");
    e.

printStackTrace();
}
```

### Parameters

 Name       | Type       | Description                      | Notes      
------------|------------|----------------------------------|------------
 **symbol** | **String** | Symbol of the company: AAPL e.g. | [optional] 
 **isin**   | **String** | ISIN                             | [optional] 
 **cusip**  | **String** | CUSIP                            | [optional] 

### Return type

[**CompanyProfile2**](CompanyProfile2.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="companyRevenueEstimates"></a>

# **companyRevenueEstimates**

> RevenueEstimates companyRevenueEstimates(symbol, freq)

Revenue Estimates

Get company&#39;s revenue estimates.

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String symbol = "symbol_example"; // String | Symbol of the company: AAPL.
String freq = "freq_example"; // String | Can take 1 of the following values: <code>annual, quarterly</code>. Default to <code>quarterly</code>
try{
RevenueEstimates result = apiInstance.companyRevenueEstimates(symbol, freq);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#companyRevenueEstimates");
    e.

printStackTrace();
}
```

### Parameters

 Name       | Type       | Description                                                                                                                   | Notes      
------------|------------|-------------------------------------------------------------------------------------------------------------------------------|------------
 **symbol** | **String** | Symbol of the company: AAPL.                                                                                                  |
 **freq**   | **String** | Can take 1 of the following values: &lt;code&gt;annual, quarterly&lt;/code&gt;. Default to &lt;code&gt;quarterly&lt;/code&gt; | [optional] 

### Return type

[**RevenueEstimates**](RevenueEstimates.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="congressionalTrading"></a>

# **congressionalTrading**

> CongressionalTrading congressionalTrading(symbol, from, to)

Congressional Trading

Get stock trades data disclosed by members of congress.

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String symbol = "symbol_example"; // String | Symbol of the company: AAPL.
LocalDate from = LocalDate.now(); // LocalDate | From date <code>YYYY-MM-DD</code>.
LocalDate to = LocalDate.now(); // LocalDate | To date <code>YYYY-MM-DD</code>.
try{
CongressionalTrading result = apiInstance.congressionalTrading(symbol, from, to);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#congressionalTrading");
    e.

printStackTrace();
}
```

### Parameters

 Name       | Type          | Description                                    | Notes 
------------|---------------|------------------------------------------------|-------
 **symbol** | **String**    | Symbol of the company: AAPL.                   |
 **from**   | **LocalDate** | From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. |
 **to**     | **LocalDate** | To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;.   |

### Return type

[**CongressionalTrading**](CongressionalTrading.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="country"></a>

# **country**

> List&lt;CountryMetadata&gt; country()

Country Metadata

List all countries and metadata.

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
try{
List<CountryMetadata> result = apiInstance.country();
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#country");
    e.

printStackTrace();
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**List&lt;CountryMetadata&gt;**](CountryMetadata.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="covid19"></a>

# **covid19**

> List&lt;CovidInfo&gt; covid19()

COVID-19

Get real-time updates on the number of COVID-19 (Corona virus) cases in the US with a state-by-state breakdown. Data is
sourced from CDC and reputable sources. You can also access this API &lt;a
href&#x3D;\&quot;https://rapidapi.com/Finnhub/api/finnhub-real-time-covid-19\&quot; target&#x3D;\&quot;_blank\&quot;
rel&#x3D;\&quot;nofollow\&quot;&gt;here&lt;/a&gt;

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
try{
List<CovidInfo> result = apiInstance.covid19();
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#covid19");
    e.

printStackTrace();
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**List&lt;CovidInfo&gt;**](CovidInfo.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="cryptoCandles"></a>

# **cryptoCandles**

> CryptoCandles cryptoCandles(symbol, resolution, from, to)

Crypto Candles

Get candlestick data for crypto symbols.

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String symbol = "symbol_example"; // String | Use symbol returned in <code>/crypto/symbol</code> endpoint for this field.
String resolution = "resolution_example"; // String | Supported resolution includes <code>1, 5, 15, 30, 60, D, W, M </code>.Some timeframes might not be available depending on the exchange.
Long from = 789L; // Long | UNIX timestamp. Interval initial value.
Long to = 789L; // Long | UNIX timestamp. Interval end value.
try{
CryptoCandles result = apiInstance.cryptoCandles(symbol, resolution, from, to);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#cryptoCandles");
    e.

printStackTrace();
}
```

### Parameters

 Name           | Type       | Description                                                                                                                                         | Notes 
----------------|------------|-----------------------------------------------------------------------------------------------------------------------------------------------------|-------
 **symbol**     | **String** | Use symbol returned in &lt;code&gt;/crypto/symbol&lt;/code&gt; endpoint for this field.                                                             |
 **resolution** | **String** | Supported resolution includes &lt;code&gt;1, 5, 15, 30, 60, D, W, M &lt;/code&gt;.Some timeframes might not be available depending on the exchange. |
 **from**       | **Long**   | UNIX timestamp. Interval initial value.                                                                                                             |
 **to**         | **Long**   | UNIX timestamp. Interval end value.                                                                                                                 |

### Return type

[**CryptoCandles**](CryptoCandles.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="cryptoExchanges"></a>

# **cryptoExchanges**

> List&lt;String&gt; cryptoExchanges()

Crypto Exchanges

List supported crypto exchanges

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
try{
List<String> result = apiInstance.cryptoExchanges();
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#cryptoExchanges");
    e.

printStackTrace();
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

**List&lt;String&gt;**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="cryptoProfile"></a>

# **cryptoProfile**

> CryptoProfile cryptoProfile(symbol)

Crypto Profile

Get crypto&#39;s profile.

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String symbol = "symbol_example"; // String | Crypto symbol such as BTC or ETH.
try{
CryptoProfile result = apiInstance.cryptoProfile(symbol);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#cryptoProfile");
    e.

printStackTrace();
}
```

### Parameters

 Name       | Type       | Description                       | Notes 
------------|------------|-----------------------------------|-------
 **symbol** | **String** | Crypto symbol such as BTC or ETH. |

### Return type

[**CryptoProfile**](CryptoProfile.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="cryptoSymbols"></a>

# **cryptoSymbols**

> List&lt;CryptoSymbol&gt; cryptoSymbols(exchange)

Crypto Symbol

List supported crypto symbols by exchange

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String exchange = "exchange_example"; // String | Exchange you want to get the list of symbols from.
try{
List<CryptoSymbol> result = apiInstance.cryptoSymbols(exchange);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#cryptoSymbols");
    e.

printStackTrace();
}
```

### Parameters

 Name         | Type       | Description                                        | Notes 
--------------|------------|----------------------------------------------------|-------
 **exchange** | **String** | Exchange you want to get the list of symbols from. |

### Return type

[**List&lt;CryptoSymbol&gt;**](CryptoSymbol.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="earningsCalendar"></a>

# **earningsCalendar**

> EarningsCalendar earningsCalendar(from, to, symbol, international)

Earnings Calendar

Get historical and coming earnings release. EPS and Revenue in this endpoint are non-GAAP, which means they are adjusted
to exclude some one-time or unusual items. This is the same data investors usually react to and talked about on the
media. Estimates are sourced from both sell-side and buy-side analysts.

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
LocalDate from = LocalDate.now(); // LocalDate | From date: 2020-03-15.
LocalDate to = LocalDate.now(); // LocalDate | To date: 2020-03-16.
String symbol = "symbol_example"; // String | Filter by symbol: AAPL.
Boolean international = true; // Boolean | Set to <code>true</code> to include international markets. Default value is <code>false</code>
try{
EarningsCalendar result = apiInstance.earningsCalendar(from, to, symbol, international);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#earningsCalendar");
    e.

printStackTrace();
}
```

### Parameters

 Name              | Type          | Description                                                                                                            | Notes      
-------------------|---------------|------------------------------------------------------------------------------------------------------------------------|------------
 **from**          | **LocalDate** | From date: 2020-03-15.                                                                                                 | [optional] 
 **to**            | **LocalDate** | To date: 2020-03-16.                                                                                                   | [optional] 
 **symbol**        | **String**    | Filter by symbol: AAPL.                                                                                                | [optional] 
 **international** | **Boolean**   | Set to &lt;code&gt;true&lt;/code&gt; to include international markets. Default value is &lt;code&gt;false&lt;/code&gt; | [optional] 

### Return type

[**EarningsCalendar**](EarningsCalendar.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="economicCalendar"></a>

# **economicCalendar**

> EconomicCalendar economicCalendar(from, to)

Economic Calendar

&lt;p&gt;Get recent and upcoming economic releases.&lt;/p&gt;&lt;p&gt;Historical events and surprises are available for
Enterprise clients.&lt;/p&gt;

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
LocalDate from = LocalDate.now(); // LocalDate | From date <code>YYYY-MM-DD</code>.
LocalDate to = LocalDate.now(); // LocalDate | To date <code>YYYY-MM-DD</code>.
try{
EconomicCalendar result = apiInstance.economicCalendar(from, to);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#economicCalendar");
    e.

printStackTrace();
}
```

### Parameters

 Name     | Type          | Description                                    | Notes      
----------|---------------|------------------------------------------------|------------
 **from** | **LocalDate** | From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. | [optional] 
 **to**   | **LocalDate** | To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;.   | [optional] 

### Return type

[**EconomicCalendar**](EconomicCalendar.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="economicCode"></a>

# **economicCode**

> List&lt;EconomicCode&gt; economicCode()

Economic Code

List codes of supported economic data.

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
try{
List<EconomicCode> result = apiInstance.economicCode();
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#economicCode");
    e.

printStackTrace();
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**List&lt;EconomicCode&gt;**](EconomicCode.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="economicData"></a>

# **economicData**

> EconomicData economicData(code)

Economic Data

Get economic data.

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String code = "code_example"; // String | Economic code.
try{
EconomicData result = apiInstance.economicData(code);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#economicData");
    e.

printStackTrace();
}
```

### Parameters

 Name     | Type       | Description    | Notes 
----------|------------|----------------|-------
 **code** | **String** | Economic code. |

### Return type

[**EconomicData**](EconomicData.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="etfsCountryExposure"></a>

# **etfsCountryExposure**

> ETFsCountryExposure etfsCountryExposure(symbol, isin)

ETFs Country Exposure

Get ETF country exposure data.

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String symbol = "symbol_example"; // String | ETF symbol.
String isin = "isin_example"; // String | ETF isin.
try{
ETFsCountryExposure result = apiInstance.etfsCountryExposure(symbol, isin);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#etfsCountryExposure");
    e.

printStackTrace();
}
```

### Parameters

 Name       | Type       | Description | Notes      
------------|------------|-------------|------------
 **symbol** | **String** | ETF symbol. | [optional] 
 **isin**   | **String** | ETF isin.   | [optional] 

### Return type

[**ETFsCountryExposure**](ETFsCountryExposure.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="etfsHoldings"></a>

# **etfsHoldings**

> ETFsHoldings etfsHoldings(symbol, isin, skip, date)

ETFs Holdings

Get full ETF holdings/constituents. This endpoint has global coverage. Widget only shows top 10 holdings. A list of
supported ETFs can be found &lt;a href&#x3D;\&quot;/api/v1/etf/list?token&#x3D;\&quot; target&#x3D;\&quot;_
blank\&quot;&gt;here&lt;/a&gt;.

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String symbol = "symbol_example"; // String | ETF symbol.
String isin = "isin_example"; // String | ETF isin.
Long skip = 789L; // Long | Skip the first n results. You can use this parameter to query historical constituents data. The latest result is returned if skip=0 or not set.
String date = "date_example"; // String | Query holdings by date. You can use either this param or <code>skip</code> param, not both.
try{
ETFsHoldings result = apiInstance.etfsHoldings(symbol, isin, skip, date);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#etfsHoldings");
    e.

printStackTrace();
}
```

### Parameters

 Name       | Type       | Description                                                                                                                                          | Notes      
------------|------------|------------------------------------------------------------------------------------------------------------------------------------------------------|------------
 **symbol** | **String** | ETF symbol.                                                                                                                                          | [optional] 
 **isin**   | **String** | ETF isin.                                                                                                                                            | [optional] 
 **skip**   | **Long**   | Skip the first n results. You can use this parameter to query historical constituents data. The latest result is returned if skip&#x3D;0 or not set. | [optional] 
 **date**   | **String** | Query holdings by date. You can use either this param or &lt;code&gt;skip&lt;/code&gt; param, not both.                                              | [optional] 

### Return type

[**ETFsHoldings**](ETFsHoldings.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="etfsProfile"></a>

# **etfsProfile**

> ETFsProfile etfsProfile(symbol, isin)

ETFs Profile

Get ETF profile information. This endpoint has global coverage. A list of supported ETFs can be found &lt;a
href&#x3D;\&quot;/api/v1/etf/list?token&#x3D;\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String symbol = "symbol_example"; // String | ETF symbol.
String isin = "isin_example"; // String | ETF isin.
try{
ETFsProfile result = apiInstance.etfsProfile(symbol, isin);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#etfsProfile");
    e.

printStackTrace();
}
```

### Parameters

 Name       | Type       | Description | Notes      
------------|------------|-------------|------------
 **symbol** | **String** | ETF symbol. | [optional] 
 **isin**   | **String** | ETF isin.   | [optional] 

### Return type

[**ETFsProfile**](ETFsProfile.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="etfsSectorExposure"></a>

# **etfsSectorExposure**

> ETFsSectorExposure etfsSectorExposure(symbol, isin)

ETFs Sector Exposure

Get ETF sector exposure data.

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String symbol = "symbol_example"; // String | ETF symbol.
String isin = "isin_example"; // String | ETF isin.
try{
ETFsSectorExposure result = apiInstance.etfsSectorExposure(symbol, isin);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#etfsSectorExposure");
    e.

printStackTrace();
}
```

### Parameters

 Name       | Type       | Description | Notes      
------------|------------|-------------|------------
 **symbol** | **String** | ETF symbol. | [optional] 
 **isin**   | **String** | ETF isin.   | [optional] 

### Return type

[**ETFsSectorExposure**](ETFsSectorExposure.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="fdaCommitteeMeetingCalendar"></a>

# **fdaCommitteeMeetingCalendar**

> List&lt;FDAComitteeMeeting&gt; fdaCommitteeMeetingCalendar()

FDA Committee Meeting Calendar

FDA&#39;s advisory committees are established to provide functions which support the agency&#39;s mission of protecting
and promoting the public health, while meeting the requirements set forth in the Federal Advisory Committee Act.
Committees are either mandated by statute or established at the discretion of the Department of Health and Human
Services. Each committee is subject to renewal at two-year intervals unless the committee charter states otherwise.

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
try{
List<FDAComitteeMeeting> result = apiInstance.fdaCommitteeMeetingCalendar();
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#fdaCommitteeMeetingCalendar");
    e.

printStackTrace();
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**List&lt;FDAComitteeMeeting&gt;**](FDAComitteeMeeting.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="filings"></a>

# **filings**

> List&lt;Filing&gt; filings(symbol, cik, accessNumber, form, from, to)

SEC Filings

List company&#39;s filing. Limit to 250 documents at a time. This data is available for bulk download on &lt;a
href&#x3D;\&quot;https://www.kaggle.com/finnhub/sec-filings\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Kaggle SEC
Filings database&lt;/a&gt;.

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String symbol = "symbol_example"; // String | Symbol. Leave <code>symbol</code>,<code>cik</code> and <code>accessNumber</code> empty to list latest filings.
String cik = "cik_example"; // String | CIK.
String accessNumber = "accessNumber_example"; // String | Access number of a specific report you want to retrieve data from.
String form = "form_example"; // String | Filter by form. You can use this value <code>NT 10-K</code> to find non-timely filings for a company.
LocalDate from = LocalDate.now(); // LocalDate | From date: 2020-03-15.
LocalDate to = LocalDate.now(); // LocalDate | To date: 2020-03-16.
try{
List<Filing> result = apiInstance.filings(symbol, cik, accessNumber, form, from, to);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#filings");
    e.

printStackTrace();
}
```

### Parameters

 Name             | Type          | Description                                                                                                                                        | Notes      
------------------|---------------|----------------------------------------------------------------------------------------------------------------------------------------------------|------------
 **symbol**       | **String**    | Symbol. Leave &lt;code&gt;symbol&lt;/code&gt;,&lt;code&gt;cik&lt;/code&gt; and &lt;code&gt;accessNumber&lt;/code&gt; empty to list latest filings. | [optional] 
 **cik**          | **String**    | CIK.                                                                                                                                               | [optional] 
 **accessNumber** | **String**    | Access number of a specific report you want to retrieve data from.                                                                                 | [optional] 
 **form**         | **String**    | Filter by form. You can use this value &lt;code&gt;NT 10-K&lt;/code&gt; to find non-timely filings for a company.                                  | [optional] 
 **from**         | **LocalDate** | From date: 2020-03-15.                                                                                                                             | [optional] 
 **to**           | **LocalDate** | To date: 2020-03-16.                                                                                                                               | [optional] 

### Return type

[**List&lt;Filing&gt;**](Filing.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="filingsSentiment"></a>

# **filingsSentiment**

> SECSentimentAnalysis filingsSentiment(accessNumber)

SEC Sentiment Analysis

Get sentiment analysis of 10-K and 10-Q filings from SEC. An abnormal increase in the number of positive/negative words
in filings can signal a significant change in the company&#39;s stock price in the upcoming 4 quarters. We make use of
&lt;a href&#x3D; \&quot;https://sraf.nd.edu/textual-analysis/resources/\&quot; target&#x3D;\&quot;_
blank\&quot;&gt;Loughran and McDonald Sentiment Word Lists&lt;/a&gt; to calculate the sentiment for each filing.

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String accessNumber = "accessNumber_example"; // String | Access number of a specific report you want to retrieve data from.
try{
SECSentimentAnalysis result = apiInstance.filingsSentiment(accessNumber);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#filingsSentiment");
    e.

printStackTrace();
}
```

### Parameters

 Name             | Type       | Description                                                        | Notes 
------------------|------------|--------------------------------------------------------------------|-------
 **accessNumber** | **String** | Access number of a specific report you want to retrieve data from. |

### Return type

[**SECSentimentAnalysis**](SECSentimentAnalysis.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="financials"></a>

# **financials**

> FinancialStatements financials(symbol, statement, freq)

Financial Statements

&lt;p&gt;Get standardized balance sheet, income statement and cash flow for global companies going back 30+ years. Data
is sourced from original filings most of which made available through &lt;a href&#x3D;\&quot;#filings\&quot;&gt;SEC
Filings&lt;/a&gt; and &lt;a href&#x3D;\&quot;#international-filings\&quot;&gt;International Filings&lt;/a&gt;
endpoints.&lt;/p&gt;&lt;p&gt;&lt;i&gt;Wondering why our standardized data is different from Bloomberg, Reuters, Factset,
S&amp;P or Yahoo Finance ? Check out our &lt;a href&#x3D;\&quot;/faq\&quot;&gt;FAQ page&lt;/a&gt; to learn
more&lt;/i&gt;&lt;/p&gt;

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String symbol = "symbol_example"; // String | Symbol of the company: AAPL.
String statement = "statement_example"; // String | Statement can take 1 of these values <code>bs, ic, cf</code> for Balance Sheet, Income Statement, Cash Flow respectively.
String freq = "freq_example"; // String | Frequency can take 1 of these values <code>annual, quarterly, ttm, ytd</code>.  TTM (Trailing Twelve Months) option is available for Income Statement and Cash Flow. YTD (Year To Date) option is only available for Cash Flow.
try{
FinancialStatements result = apiInstance.financials(symbol, statement, freq);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#financials");
    e.

printStackTrace();
}
```

### Parameters

 Name          | Type       | Description                                                                                                                                                                                                                                 | Notes 
---------------|------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------
 **symbol**    | **String** | Symbol of the company: AAPL.                                                                                                                                                                                                                |
 **statement** | **String** | Statement can take 1 of these values &lt;code&gt;bs, ic, cf&lt;/code&gt; for Balance Sheet, Income Statement, Cash Flow respectively.                                                                                                       |
 **freq**      | **String** | Frequency can take 1 of these values &lt;code&gt;annual, quarterly, ttm, ytd&lt;/code&gt;.  TTM (Trailing Twelve Months) option is available for Income Statement and Cash Flow. YTD (Year To Date) option is only available for Cash Flow. |

### Return type

[**FinancialStatements**](FinancialStatements.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="financialsReported"></a>

# **financialsReported**

> FinancialsAsReported financialsReported(symbol, cik, accessNumber, freq, from, to)

Financials As Reported

Get financials as reported. This data is available for bulk download on &lt;a
href&#x3D;\&quot;https://www.kaggle.com/finnhub/reported-financials\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Kaggle
SEC Financials database&lt;/a&gt;.

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String symbol = "symbol_example"; // String | Symbol.
String cik = "cik_example"; // String | CIK.
String accessNumber = "accessNumber_example"; // String | Access number of a specific report you want to retrieve financials from.
String freq = "freq_example"; // String | Frequency. Can be either <code>annual</code> or <code>quarterly</code>. Default to <code>annual</code>.
LocalDate from = LocalDate.now(); // LocalDate | From date <code>YYYY-MM-DD</code>. Filter for endDate.
LocalDate to = LocalDate.now(); // LocalDate | To date <code>YYYY-MM-DD</code>. Filter for endDate.
try{
FinancialsAsReported result = apiInstance.financialsReported(symbol, cik, accessNumber, freq, from, to);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#financialsReported");
    e.

printStackTrace();
}
```

### Parameters

 Name             | Type          | Description                                                                                                                                 | Notes      
------------------|---------------|---------------------------------------------------------------------------------------------------------------------------------------------|------------
 **symbol**       | **String**    | Symbol.                                                                                                                                     | [optional] 
 **cik**          | **String**    | CIK.                                                                                                                                        | [optional] 
 **accessNumber** | **String**    | Access number of a specific report you want to retrieve financials from.                                                                    | [optional] 
 **freq**         | **String**    | Frequency. Can be either &lt;code&gt;annual&lt;/code&gt; or &lt;code&gt;quarterly&lt;/code&gt;. Default to &lt;code&gt;annual&lt;/code&gt;. | [optional] 
 **from**         | **LocalDate** | From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. Filter for endDate.                                                                          | [optional] 
 **to**           | **LocalDate** | To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. Filter for endDate.                                                                            | [optional] 

### Return type

[**FinancialsAsReported**](FinancialsAsReported.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="forexCandles"></a>

# **forexCandles**

> ForexCandles forexCandles(symbol, resolution, from, to)

Forex Candles

Get candlestick data for forex symbols.

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String symbol = "symbol_example"; // String | Use symbol returned in <code>/forex/symbol</code> endpoint for this field.
String resolution = "resolution_example"; // String | Supported resolution includes <code>1, 5, 15, 30, 60, D, W, M </code>.Some timeframes might not be available depending on the exchange.
Long from = 789L; // Long | UNIX timestamp. Interval initial value.
Long to = 789L; // Long | UNIX timestamp. Interval end value.
try{
ForexCandles result = apiInstance.forexCandles(symbol, resolution, from, to);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#forexCandles");
    e.

printStackTrace();
}
```

### Parameters

 Name           | Type       | Description                                                                                                                                         | Notes 
----------------|------------|-----------------------------------------------------------------------------------------------------------------------------------------------------|-------
 **symbol**     | **String** | Use symbol returned in &lt;code&gt;/forex/symbol&lt;/code&gt; endpoint for this field.                                                              |
 **resolution** | **String** | Supported resolution includes &lt;code&gt;1, 5, 15, 30, 60, D, W, M &lt;/code&gt;.Some timeframes might not be available depending on the exchange. |
 **from**       | **Long**   | UNIX timestamp. Interval initial value.                                                                                                             |
 **to**         | **Long**   | UNIX timestamp. Interval end value.                                                                                                                 |

### Return type

[**ForexCandles**](ForexCandles.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="forexExchanges"></a>

# **forexExchanges**

> List&lt;String&gt; forexExchanges()

Forex Exchanges

List supported forex exchanges

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
try{
List<String> result = apiInstance.forexExchanges();
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#forexExchanges");
    e.

printStackTrace();
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

**List&lt;String&gt;**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="forexRates"></a>

# **forexRates**

> Forexrates forexRates(base, date)

Forex rates

Get rates for all forex pairs. Ideal for currency conversion

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String base = "base_example"; // String | Base currency. Default to EUR.
String date = "date_example"; // String | Date. Leave blank to get the latest data.
try{
Forexrates result = apiInstance.forexRates(base, date);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#forexRates");
    e.

printStackTrace();
}
```

### Parameters

 Name     | Type       | Description                               | Notes      
----------|------------|-------------------------------------------|------------
 **base** | **String** | Base currency. Default to EUR.            | [optional] 
 **date** | **String** | Date. Leave blank to get the latest data. | [optional] 

### Return type

[**Forexrates**](Forexrates.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="forexSymbols"></a>

# **forexSymbols**

> List&lt;ForexSymbol&gt; forexSymbols(exchange)

Forex Symbol

List supported forex symbols.

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String exchange = "exchange_example"; // String | Exchange you want to get the list of symbols from.
try{
List<ForexSymbol> result = apiInstance.forexSymbols(exchange);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#forexSymbols");
    e.

printStackTrace();
}
```

### Parameters

 Name         | Type       | Description                                        | Notes 
--------------|------------|----------------------------------------------------|-------
 **exchange** | **String** | Exchange you want to get the list of symbols from. |

### Return type

[**List&lt;ForexSymbol&gt;**](ForexSymbol.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="fundOwnership"></a>

# **fundOwnership**

> FundOwnership fundOwnership(symbol, limit)

Fund Ownership

Get a full list fund and institutional investors of a company in descending order of the number of shares held. Data is
sourced from &lt;code&gt;13F form&lt;/code&gt;, &lt;code&gt;Schedule 13D&lt;/code&gt; and &lt;code&gt;13G&lt;/code&gt;
for US market, &lt;code&gt;UK Share Register&lt;/code&gt; for UK market, &lt;code&gt;SEDI&lt;/code&gt; for Canadian
market and equivalent filings for other international markets.

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String symbol = "symbol_example"; // String | Symbol of the company: AAPL.
Long limit = 789L; // Long | Limit number of results. Leave empty to get the full list.
try{
FundOwnership result = apiInstance.fundOwnership(symbol, limit);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#fundOwnership");
    e.

printStackTrace();
}
```

### Parameters

 Name       | Type       | Description                                                | Notes      
------------|------------|------------------------------------------------------------|------------
 **symbol** | **String** | Symbol of the company: AAPL.                               |
 **limit**  | **Long**   | Limit number of results. Leave empty to get the full list. | [optional] 

### Return type

[**FundOwnership**](FundOwnership.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="globalFilingsDownload"></a>

# **globalFilingsDownload**

> globalFilingsDownload(documentId)

Download Filings

&lt;p&gt;Download filings using document ids.&lt;/p&gt;

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String documentId = "documentId_example"; // String | Document's id. Note that this is different from filingId as 1 filing can contain multiple documents.
try{
        apiInstance.

globalFilingsDownload(documentId);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#globalFilingsDownload");
    e.

printStackTrace();
}
```

### Parameters

 Name           | Type       | Description                                                                                              | Notes 
----------------|------------|----------------------------------------------------------------------------------------------------------|-------
 **documentId** | **String** | Document&#39;s id. Note that this is different from filingId as 1 filing can contain multiple documents. |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="globalFilingsSearch"></a>

# **globalFilingsSearch**

> SearchResponse globalFilingsSearch(search)

Global Filings Search

&lt;p&gt;Search for best-matched filings across global companies&#39; filings, transcripts and press releases. You can
filter by anything from symbol, ISIN to form type, and document sources.&lt;/p&gt;&lt;p&gt;This endpoint will return a
list of documents that match your search criteria. If you would like to get the excerpts as well, please set
&lt;code&gt;highlighted&lt;/code&gt; to &lt;code&gt;true&lt;/code&gt;. Once you have the list of documents, you can get
a list of excerpts and positions to highlight the document using the &lt;code&gt;/search-in-filing&lt;/code&gt;
endpoint&lt;/p&gt;

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
SearchBody search = new SearchBody(); // SearchBody | Search body
try{
SearchResponse result = apiInstance.globalFilingsSearch(search);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#globalFilingsSearch");
    e.

printStackTrace();
}
```

### Parameters

 Name       | Type                            | Description | Notes      
------------|---------------------------------|-------------|------------
 **search** | [**SearchBody**](SearchBody.md) | Search body | [optional] 

### Return type

[**SearchResponse**](SearchResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="globalFilingsSearchFilter"></a>

# **globalFilingsSearchFilter**

> SearchFilter globalFilingsSearchFilter(field, source)

Search Filter

&lt;p&gt;Get available values for each filter in search body.&lt;/p&gt;

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String field = "field_example"; // String | Field to get available filters. Available filters are \"countries\", \"exchanges\", \"exhibits\", \"forms\", \"gics\", \"naics\", \"caps\", \"acts\", and \"sort\".
String source = "source_example"; // String | Get available forms for each source.
try{
SearchFilter result = apiInstance.globalFilingsSearchFilter(field, source);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#globalFilingsSearchFilter");
    e.

printStackTrace();
}
```

### Parameters

 Name       | Type       | Description                                                                                                                                                                                                                                                   | Notes      
------------|------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------
 **field**  | **String** | Field to get available filters. Available filters are \&quot;countries\&quot;, \&quot;exchanges\&quot;, \&quot;exhibits\&quot;, \&quot;forms\&quot;, \&quot;gics\&quot;, \&quot;naics\&quot;, \&quot;caps\&quot;, \&quot;acts\&quot;, and \&quot;sort\&quot;. |
 **source** | **String** | Get available forms for each source.                                                                                                                                                                                                                          | [optional] 

### Return type

[**SearchFilter**](SearchFilter.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="indicesConstituents"></a>

# **indicesConstituents**

> IndicesConstituents indicesConstituents(symbol)

Indices Constituents

Get a list of index&#39;s constituents. A list of supported indices for this endpoint can be found &lt;a
href&#x3D;\&quot;/api/v1/index/list?token&#x3D;\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String symbol = "symbol_example"; // String | symbol
try{
IndicesConstituents result = apiInstance.indicesConstituents(symbol);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#indicesConstituents");
    e.

printStackTrace();
}
```

### Parameters

 Name       | Type       | Description | Notes 
------------|------------|-------------|-------
 **symbol** | **String** | symbol      |

### Return type

[**IndicesConstituents**](IndicesConstituents.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="indicesHistoricalConstituents"></a>

# **indicesHistoricalConstituents**

> IndicesHistoricalConstituents indicesHistoricalConstituents(symbol)

Indices Historical Constituents

Get full history of index&#39;s constituents including symbols and dates of joining and leaving the Index. Currently
support &lt;code&gt;^GSPC&lt;/code&gt;, &lt;code&gt;^NDX&lt;/code&gt;, &lt;code&gt;^DJI&lt;/code&gt;

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String symbol = "symbol_example"; // String | symbol
try{
IndicesHistoricalConstituents result = apiInstance.indicesHistoricalConstituents(symbol);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#indicesHistoricalConstituents");
    e.

printStackTrace();
}
```

### Parameters

 Name       | Type       | Description | Notes 
------------|------------|-------------|-------
 **symbol** | **String** | symbol      |

### Return type

[**IndicesHistoricalConstituents**](IndicesHistoricalConstituents.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="insiderSentiment"></a>

# **insiderSentiment**

> InsiderSentiments insiderSentiment(symbol, from, to)

Insider Sentiment

Get insider sentiment data for US companies calculated using method discussed &lt;a
href&#x3D;\&quot;https://medium.com/@stock-api/finnhub-insiders-sentiment-analysis-cc43f9f64b3a\&quot;
target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. The MSPR ranges from -100 for the most negative to 100 for the most
positive which can signal price changes in the coming 30-90 days.

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String symbol = "symbol_example"; // String | Symbol of the company: AAPL.
LocalDate from = LocalDate.now(); // LocalDate | From date: 2020-03-15.
LocalDate to = LocalDate.now(); // LocalDate | To date: 2020-03-16.
try{
InsiderSentiments result = apiInstance.insiderSentiment(symbol, from, to);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#insiderSentiment");
    e.

printStackTrace();
}
```

### Parameters

 Name       | Type          | Description                  | Notes 
------------|---------------|------------------------------|-------
 **symbol** | **String**    | Symbol of the company: AAPL. |
 **from**   | **LocalDate** | From date: 2020-03-15.       |
 **to**     | **LocalDate** | To date: 2020-03-16.         |

### Return type

[**InsiderSentiments**](InsiderSentiments.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="insiderTransactions"></a>

# **insiderTransactions**

> InsiderTransactions insiderTransactions(symbol, from, to)

Insider Transactions

Company insider transactions data sourced from &lt;code&gt;Form 3,4,5&lt;/code&gt;, SEDI and relevant companies&#39;
filings. This endpoint covers US, UK, Canada, Australia, India, and all major EU markets. Limit to 100 transactions per
API call.

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String symbol = "symbol_example"; // String | Symbol of the company: AAPL. Leave this param blank to get the latest transactions.
LocalDate from = LocalDate.now(); // LocalDate | From date: 2020-03-15.
LocalDate to = LocalDate.now(); // LocalDate | To date: 2020-03-16.
try{
InsiderTransactions result = apiInstance.insiderTransactions(symbol, from, to);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#insiderTransactions");
    e.

printStackTrace();
}
```

### Parameters

 Name       | Type          | Description                                                                         | Notes      
------------|---------------|-------------------------------------------------------------------------------------|------------
 **symbol** | **String**    | Symbol of the company: AAPL. Leave this param blank to get the latest transactions. |
 **from**   | **LocalDate** | From date: 2020-03-15.                                                              | [optional] 
 **to**     | **LocalDate** | To date: 2020-03-16.                                                                | [optional] 

### Return type

[**InsiderTransactions**](InsiderTransactions.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="institutionalOwnership"></a>

# **institutionalOwnership**

> InstitutionalOwnership institutionalOwnership(symbol, cusip, from, to)

Institutional Ownership

Get a list institutional investors&#39; positions for a particular stock overtime. Data from 13-F filings. Limit to 1
year of data at a time.

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String symbol = "symbol_example"; // String | Filter by symbol.
String cusip = "cusip_example"; // String | Filter by CUSIP.
String from = "from_example"; // String | From date <code>YYYY-MM-DD</code>.
String to = "to_example"; // String | To date <code>YYYY-MM-DD</code>.
try{
InstitutionalOwnership result = apiInstance.institutionalOwnership(symbol, cusip, from, to);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#institutionalOwnership");
    e.

printStackTrace();
}
```

### Parameters

 Name       | Type       | Description                                    | Notes 
------------|------------|------------------------------------------------|-------
 **symbol** | **String** | Filter by symbol.                              |
 **cusip**  | **String** | Filter by CUSIP.                               |
 **from**   | **String** | From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. |
 **to**     | **String** | To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;.   |

### Return type

[**InstitutionalOwnership**](InstitutionalOwnership.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="institutionalPortfolio"></a>

# **institutionalPortfolio**

> InstitutionalPortfolio institutionalPortfolio(cik, from, to)

Institutional Portfolio

Get the holdings/portfolio data of institutional investors from 13-F filings. Limit to 1 year of data at a time. You can
get a list of supported CIK &lt;a href&#x3D;\&quot;/api/v1/institutional/list?token&#x3D;\&quot; target&#x3D;\&quot;_
blank\&quot;&gt;here&lt;/a&gt;.

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String cik = "cik_example"; // String | Fund's CIK.
String from = "from_example"; // String | From date <code>YYYY-MM-DD</code>.
String to = "to_example"; // String | To date <code>YYYY-MM-DD</code>.
try{
InstitutionalPortfolio result = apiInstance.institutionalPortfolio(cik, from, to);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#institutionalPortfolio");
    e.

printStackTrace();
}
```

### Parameters

 Name     | Type       | Description                                    | Notes 
----------|------------|------------------------------------------------|-------
 **cik**  | **String** | Fund&#39;s CIK.                                |
 **from** | **String** | From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. |
 **to**   | **String** | To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;.   |

### Return type

[**InstitutionalPortfolio**](InstitutionalPortfolio.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="institutionalProfile"></a>

# **institutionalProfile**

> InstitutionalProfile institutionalProfile(cik)

Institutional Profile

Get a list of well-known institutional investors. Currently support 60+ profiles.

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String cik = "cik_example"; // String | Filter by CIK. Leave blank to get the full list.
try{
InstitutionalProfile result = apiInstance.institutionalProfile(cik);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#institutionalProfile");
    e.

printStackTrace();
}
```

### Parameters

 Name    | Type       | Description                                      | Notes      
---------|------------|--------------------------------------------------|------------
 **cik** | **String** | Filter by CIK. Leave blank to get the full list. | [optional] 

### Return type

[**InstitutionalProfile**](InstitutionalProfile.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="internationalFilings"></a>

# **internationalFilings**

> List&lt;InternationalFiling&gt; internationalFilings(symbol, country)

International Filings

List filings for international companies. Limit to 250 documents at a time. These are the documents we use to source our
fundamental data. Only support SEDAR and UK Companies House for normal usage. Enterprise clients who need access to the
full filings for global markets should contact us for the access.

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String symbol = "symbol_example"; // String | Symbol. Leave empty to list latest filings.
String country = "country_example"; // String | Filter by country using country's 2-letter code.
try{
List<InternationalFiling> result = apiInstance.internationalFilings(symbol, country);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#internationalFilings");
    e.

printStackTrace();
}
```

### Parameters

 Name        | Type       | Description                                          | Notes      
-------------|------------|------------------------------------------------------|------------
 **symbol**  | **String** | Symbol. Leave empty to list latest filings.          | [optional] 
 **country** | **String** | Filter by country using country&#39;s 2-letter code. | [optional] 

### Return type

[**List&lt;InternationalFiling&gt;**](InternationalFiling.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="investmentThemes"></a>

# **investmentThemes**

> InvestmentThemes investmentThemes(theme)

Investment Themes (Thematic Investing)

&lt;p&gt;Thematic investing involves creating a portfolio (or portion of a portfolio) by gathering together a collection
of companies involved in certain areas that you predict will generate above-market returns over the long term. Themes
can be based on a concept such as ageing populations or a sub-sector such as robotics, and drones. Thematic investing
focuses on predicted long-term trends rather than specific companies or sectors, enabling investors to access
structural, one-off shifts that can change an entire industry.&lt;/p&gt;&lt;p&gt;This endpoint will help you get
portfolios of different investment themes that are changing our life and are the way of the future.&lt;/p&gt;&lt;p&gt;A
full list of themes supported can be found &lt;a target&#x3D;\&quot;_blank\&quot;
href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1ULj9xDh4iPoQj279M084adZ2_S852ttRthKKJ7madYc/edit?usp&#x3D;sharing\&quot;&gt;here&lt;/a&gt;.
The theme coverage and portfolios are updated bi-weekly by our analysts. Our approach excludes penny, super-small cap
and illiquid stocks.&lt;/p&gt;

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String theme = "theme_example"; // String | Investment theme. A full list of themes supported can be found <a target=\"_blank\" href=\"https://docs.google.com/spreadsheets/d/1ULj9xDh4iPoQj279M084adZ2_S852ttRthKKJ7madYc/edit?usp=sharing\">here</a>.
try{
InvestmentThemes result = apiInstance.investmentThemes(theme);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#investmentThemes");
    e.

printStackTrace();
}
```

### Parameters

 Name      | Type       | Description                                                                                                                                                                                                                                                | Notes 
-----------|------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------
 **theme** | **String** | Investment theme. A full list of themes supported can be found &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1ULj9xDh4iPoQj279M084adZ2_S852ttRthKKJ7madYc/edit?usp&#x3D;sharing\&quot;&gt;here&lt;/a&gt;. |

### Return type

[**InvestmentThemes**](InvestmentThemes.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="ipoCalendar"></a>

# **ipoCalendar**

> IPOCalendar ipoCalendar(from, to)

IPO Calendar

Get recent and upcoming IPO.

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
LocalDate from = LocalDate.now(); // LocalDate | From date: 2020-03-15.
LocalDate to = LocalDate.now(); // LocalDate | To date: 2020-03-16.
try{
IPOCalendar result = apiInstance.ipoCalendar(from, to);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#ipoCalendar");
    e.

printStackTrace();
}
```

### Parameters

 Name     | Type          | Description            | Notes 
----------|---------------|------------------------|-------
 **from** | **LocalDate** | From date: 2020-03-15. |
 **to**   | **LocalDate** | To date: 2020-03-16.   |

### Return type

[**IPOCalendar**](IPOCalendar.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="isinChange"></a>

# **isinChange**

> IsinChange isinChange(from, to)

ISIN Change

Get a list of ISIN changes for EU-listed securities. Limit to 2000 events at a time.

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String from = "from_example"; // String | From date <code>YYYY-MM-DD</code>.
String to = "to_example"; // String | To date <code>YYYY-MM-DD</code>.
try{
IsinChange result = apiInstance.isinChange(from, to);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#isinChange");
    e.

printStackTrace();
}
```

### Parameters

 Name     | Type       | Description                                    | Notes 
----------|------------|------------------------------------------------|-------
 **from** | **String** | From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. |
 **to**   | **String** | To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;.   |

### Return type

[**IsinChange**](IsinChange.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="marketHoliday"></a>

# **marketHoliday**

> MarketHoliday marketHoliday(exchange)

Market Holiday

Get a list of holidays for global exchanges.

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String exchange = "exchange_example"; // String | Exchange code.
try{
MarketHoliday result = apiInstance.marketHoliday(exchange);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#marketHoliday");
    e.

printStackTrace();
}
```

### Parameters

 Name         | Type       | Description    | Notes 
--------------|------------|----------------|-------
 **exchange** | **String** | Exchange code. |

### Return type

[**MarketHoliday**](MarketHoliday.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="marketNews"></a>

# **marketNews**

> List&lt;MarketNews&gt; marketNews(category, minId)

Market News

Get latest market news.

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String category = "category_example"; // String | This parameter can be 1 of the following values <code>general, forex, crypto, merger</code>.
Long minId = 789L; // Long | Use this field to get only news after this ID. Default to 0
try{
List<MarketNews> result = apiInstance.marketNews(category, minId);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#marketNews");
    e.

printStackTrace();
}
```

### Parameters

 Name         | Type       | Description                                                                                              | Notes      
--------------|------------|----------------------------------------------------------------------------------------------------------|------------
 **category** | **String** | This parameter can be 1 of the following values &lt;code&gt;general, forex, crypto, merger&lt;/code&gt;. |
 **minId**    | **Long**   | Use this field to get only news after this ID. Default to 0                                              | [optional] 

### Return type

[**List&lt;MarketNews&gt;**](MarketNews.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="marketStatus"></a>

# **marketStatus**

> MarketStatus marketStatus(exchange)

Market Status

Get current market status for global exchanges (whether exchanges are open or close).

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String exchange = "exchange_example"; // String | Exchange code.
try{
MarketStatus result = apiInstance.marketStatus(exchange);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#marketStatus");
    e.

printStackTrace();
}
```

### Parameters

 Name         | Type       | Description    | Notes 
--------------|------------|----------------|-------
 **exchange** | **String** | Exchange code. |

### Return type

[**MarketStatus**](MarketStatus.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="mutualFundCountryExposure"></a>

# **mutualFundCountryExposure**

> MutualFundCountryExposure mutualFundCountryExposure(symbol, isin)

Mutual Funds Country Exposure

Get Mutual Funds country exposure data.

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String symbol = "symbol_example"; // String | Symbol.
String isin = "isin_example"; // String | Fund's isin.
try{
MutualFundCountryExposure result = apiInstance.mutualFundCountryExposure(symbol, isin);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#mutualFundCountryExposure");
    e.

printStackTrace();
}
```

### Parameters

 Name       | Type       | Description      | Notes      
------------|------------|------------------|------------
 **symbol** | **String** | Symbol.          | [optional] 
 **isin**   | **String** | Fund&#39;s isin. | [optional] 

### Return type

[**MutualFundCountryExposure**](MutualFundCountryExposure.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="mutualFundEet"></a>

# **mutualFundEet**

> MutualFundEet mutualFundEet(isin)

Mutual Funds EET

Get EET data for EU funds. For PAIs data, please see the EET PAI endpoint.

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String isin = "isin_example"; // String | ISIN.
try{
MutualFundEet result = apiInstance.mutualFundEet(isin);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#mutualFundEet");
    e.

printStackTrace();
}
```

### Parameters

 Name     | Type       | Description | Notes 
----------|------------|-------------|-------
 **isin** | **String** | ISIN.       |

### Return type

[**MutualFundEet**](MutualFundEet.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="mutualFundEetPai"></a>

# **mutualFundEetPai**

> MutualFundEetPai mutualFundEetPai(isin)

Mutual Funds EET PAI

Get EET PAI data for EU funds.

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String isin = "isin_example"; // String | ISIN.
try{
MutualFundEetPai result = apiInstance.mutualFundEetPai(isin);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#mutualFundEetPai");
    e.

printStackTrace();
}
```

### Parameters

 Name     | Type       | Description | Notes 
----------|------------|-------------|-------
 **isin** | **String** | ISIN.       |

### Return type

[**MutualFundEetPai**](MutualFundEetPai.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="mutualFundHoldings"></a>

# **mutualFundHoldings**

> MutualFundHoldings mutualFundHoldings(symbol, isin, skip)

Mutual Funds Holdings

Get full Mutual Funds holdings/constituents. This endpoint covers both US and global mutual funds. For international
funds, you must query the data using ISIN. A list of supported funds can be found &lt;a
href&#x3D;\&quot;/api/v1/mutual-fund/list?token&#x3D;\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String symbol = "symbol_example"; // String | Fund's symbol.
String isin = "isin_example"; // String | Fund's isin.
Long skip = 789L; // Long | Skip the first n results. You can use this parameter to query historical constituents data. The latest result is returned if skip=0 or not set.
try{
MutualFundHoldings result = apiInstance.mutualFundHoldings(symbol, isin, skip);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#mutualFundHoldings");
    e.

printStackTrace();
}
```

### Parameters

 Name       | Type       | Description                                                                                                                                          | Notes      
------------|------------|------------------------------------------------------------------------------------------------------------------------------------------------------|------------
 **symbol** | **String** | Fund&#39;s symbol.                                                                                                                                   | [optional] 
 **isin**   | **String** | Fund&#39;s isin.                                                                                                                                     | [optional] 
 **skip**   | **Long**   | Skip the first n results. You can use this parameter to query historical constituents data. The latest result is returned if skip&#x3D;0 or not set. | [optional] 

### Return type

[**MutualFundHoldings**](MutualFundHoldings.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="mutualFundProfile"></a>

# **mutualFundProfile**

> MutualFundProfile mutualFundProfile(symbol, isin)

Mutual Funds Profile

Get mutual funds profile information. This endpoint covers both US and global mutual funds. For international funds, you
must query the data using ISIN. A list of supported funds can be found &lt;a
href&#x3D;\&quot;/api/v1/mutual-fund/list?token&#x3D;\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String symbol = "symbol_example"; // String | Fund's symbol.
String isin = "isin_example"; // String | Fund's isin.
try{
MutualFundProfile result = apiInstance.mutualFundProfile(symbol, isin);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#mutualFundProfile");
    e.

printStackTrace();
}
```

### Parameters

 Name       | Type       | Description        | Notes      
------------|------------|--------------------|------------
 **symbol** | **String** | Fund&#39;s symbol. | [optional] 
 **isin**   | **String** | Fund&#39;s isin.   | [optional] 

### Return type

[**MutualFundProfile**](MutualFundProfile.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="mutualFundSectorExposure"></a>

# **mutualFundSectorExposure**

> MutualFundSectorExposure mutualFundSectorExposure(symbol, isin)

Mutual Funds Sector Exposure

Get Mutual Funds sector exposure data.

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String symbol = "symbol_example"; // String | Mutual Fund symbol.
String isin = "isin_example"; // String | Fund's isin.
try{
MutualFundSectorExposure result = apiInstance.mutualFundSectorExposure(symbol, isin);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#mutualFundSectorExposure");
    e.

printStackTrace();
}
```

### Parameters

 Name       | Type       | Description         | Notes      
------------|------------|---------------------|------------
 **symbol** | **String** | Mutual Fund symbol. | [optional] 
 **isin**   | **String** | Fund&#39;s isin.    | [optional] 

### Return type

[**MutualFundSectorExposure**](MutualFundSectorExposure.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="newsSentiment"></a>

# **newsSentiment**

> NewsSentiment newsSentiment(symbol)

News Sentiment

Get company&#39;s news sentiment and statistics. This endpoint is only available for US companies.

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String symbol = "symbol_example"; // String | Company symbol.
try{
NewsSentiment result = apiInstance.newsSentiment(symbol);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#newsSentiment");
    e.

printStackTrace();
}
```

### Parameters

 Name       | Type       | Description     | Notes 
------------|------------|-----------------|-------
 **symbol** | **String** | Company symbol. |

### Return type

[**NewsSentiment**](NewsSentiment.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="ownership"></a>

# **ownership**

> Ownership ownership(symbol, limit)

Ownership

Get a full list of shareholders of a company in descending order of the number of shares held. Data is sourced from
&lt;code&gt;13F form&lt;/code&gt;, &lt;code&gt;Schedule 13D&lt;/code&gt; and &lt;code&gt;13G&lt;/code&gt; for US market,
&lt;code&gt;UK Share Register&lt;/code&gt; for UK market, &lt;code&gt;SEDI&lt;/code&gt; for Canadian market and
equivalent filings for other international markets.

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String symbol = "symbol_example"; // String | Symbol of the company: AAPL.
Long limit = 789L; // Long | Limit number of results. Leave empty to get the full list.
try{
Ownership result = apiInstance.ownership(symbol, limit);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#ownership");
    e.

printStackTrace();
}
```

### Parameters

 Name       | Type       | Description                                                | Notes      
------------|------------|------------------------------------------------------------|------------
 **symbol** | **String** | Symbol of the company: AAPL.                               |
 **limit**  | **Long**   | Limit number of results. Leave empty to get the full list. | [optional] 

### Return type

[**Ownership**](Ownership.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="patternRecognition"></a>

# **patternRecognition**

> PatternRecognition patternRecognition(symbol, resolution)

Pattern Recognition

Run pattern recognition algorithm on a symbol. Support double top/bottom, triple top/bottom, head and shoulders,
triangle, wedge, channel, flag, and candlestick patterns.

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String symbol = "symbol_example"; // String | Symbol
String resolution = "resolution_example"; // String | Supported resolution includes <code>1, 5, 15, 30, 60, D, W, M </code>.Some timeframes might not be available depending on the exchange.
try{
PatternRecognition result = apiInstance.patternRecognition(symbol, resolution);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#patternRecognition");
    e.

printStackTrace();
}
```

### Parameters

 Name           | Type       | Description                                                                                                                                         | Notes 
----------------|------------|-----------------------------------------------------------------------------------------------------------------------------------------------------|-------
 **symbol**     | **String** | Symbol                                                                                                                                              |
 **resolution** | **String** | Supported resolution includes &lt;code&gt;1, 5, 15, 30, 60, D, W, M &lt;/code&gt;.Some timeframes might not be available depending on the exchange. |

### Return type

[**PatternRecognition**](PatternRecognition.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="pressReleases"></a>

# **pressReleases**

> PressRelease pressReleases(symbol, from, to)

Major Press Releases

&lt;p&gt;Get latest major press releases of a company. This data can be used to highlight the most significant events
comprised of mostly press releases sourced from the exchanges, BusinessWire, AccessWire, GlobeNewswire, Newsfile, and
PRNewswire.&lt;/p&gt;&lt;p&gt;Full-text press releases data is available for Enterprise clients. &lt;a
href&#x3D;\&quot;mailto:support@finnhub.io\&quot;&gt;Contact Us&lt;/a&gt; to learn more.&lt;/p&gt;

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String symbol = "symbol_example"; // String | Company symbol.
LocalDate from = LocalDate.now(); // LocalDate | From time: 2020-01-01.
LocalDate to = LocalDate.now(); // LocalDate | To time: 2020-01-05.
try{
PressRelease result = apiInstance.pressReleases(symbol, from, to);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#pressReleases");
    e.

printStackTrace();
}
```

### Parameters

 Name       | Type          | Description            | Notes      
------------|---------------|------------------------|------------
 **symbol** | **String**    | Company symbol.        |
 **from**   | **LocalDate** | From time: 2020-01-01. | [optional] 
 **to**     | **LocalDate** | To time: 2020-01-05.   | [optional] 

### Return type

[**PressRelease**](PressRelease.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="priceMetrics"></a>

# **priceMetrics**

> PriceMetrics priceMetrics(symbol, date)

Price Metrics

Get company price performance statistics such as 52-week high/low, YTD return and much more.

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String symbol = "symbol_example"; // String | Symbol of the company: AAPL.
String date = "date_example"; // String | Get data on a specific date in the past. The data is available weekly so your date will be automatically adjusted to the last day of that week.
try{
PriceMetrics result = apiInstance.priceMetrics(symbol, date);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#priceMetrics");
    e.

printStackTrace();
}
```

### Parameters

 Name       | Type       | Description                                                                                                                                     | Notes      
------------|------------|-------------------------------------------------------------------------------------------------------------------------------------------------|------------
 **symbol** | **String** | Symbol of the company: AAPL.                                                                                                                    |
 **date**   | **String** | Get data on a specific date in the past. The data is available weekly so your date will be automatically adjusted to the last day of that week. | [optional] 

### Return type

[**PriceMetrics**](PriceMetrics.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="priceTarget"></a>

# **priceTarget**

> PriceTarget priceTarget(symbol)

Price Target

Get latest price target consensus.

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String symbol = "symbol_example"; // String | Symbol of the company: AAPL.
try{
PriceTarget result = apiInstance.priceTarget(symbol);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#priceTarget");
    e.

printStackTrace();
}
```

### Parameters

 Name       | Type       | Description                  | Notes 
------------|------------|------------------------------|-------
 **symbol** | **String** | Symbol of the company: AAPL. |

### Return type

[**PriceTarget**](PriceTarget.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="quote"></a>

# **quote**

> Quote quote(symbol)

Quote

&lt;p&gt;Get real-time quote data for US stocks. Constant polling is not recommended. Use websocket if you need
real-time updates.&lt;/p&gt;&lt;p&gt;Real-time stock prices for international markets are supported for Enterprise
clients via our partner&#39;s feed. &lt;a href&#x3D;\&quot;mailto:support@finnhub.io\&quot;&gt;Contact Us&lt;/a&gt; to
learn more.&lt;/p&gt;

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String symbol = "symbol_example"; // String | Symbol
try{
Quote result = apiInstance.quote(symbol);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#quote");
    e.

printStackTrace();
}
```

### Parameters

 Name       | Type       | Description | Notes 
------------|------------|-------------|-------
 **symbol** | **String** | Symbol      |

### Return type

[**Quote**](Quote.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="recommendationTrends"></a>

# **recommendationTrends**

> List&lt;RecommendationTrend&gt; recommendationTrends(symbol)

Recommendation Trends

Get latest analyst recommendation trends for a company.

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String symbol = "symbol_example"; // String | Symbol of the company: AAPL.
try{
List<RecommendationTrend> result = apiInstance.recommendationTrends(symbol);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#recommendationTrends");
    e.

printStackTrace();
}
```

### Parameters

 Name       | Type       | Description                  | Notes 
------------|------------|------------------------------|-------
 **symbol** | **String** | Symbol of the company: AAPL. |

### Return type

[**List&lt;RecommendationTrend&gt;**](RecommendationTrend.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="revenueBreakdown"></a>

# **revenueBreakdown**

> RevenueBreakdown revenueBreakdown(symbol, cik)

Revenue Breakdown

Get revenue breakdown by product. This dataset is only available for US companies which disclose their revenue breakdown
in the annual or quarterly reports.

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String symbol = "symbol_example"; // String | Symbol.
String cik = "cik_example"; // String | CIK.
try{
RevenueBreakdown result = apiInstance.revenueBreakdown(symbol, cik);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#revenueBreakdown");
    e.

printStackTrace();
}
```

### Parameters

 Name       | Type       | Description | Notes      
------------|------------|-------------|------------
 **symbol** | **String** | Symbol.     | [optional] 
 **cik**    | **String** | CIK.        | [optional] 

### Return type

[**RevenueBreakdown**](RevenueBreakdown.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="searchInFiling"></a>

# **searchInFiling**

> InFilingResponse searchInFiling(search)

Search In Filing

&lt;p&gt;Get a list of excerpts and highlight positions within a document using your query.&lt;/p&gt;

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
InFilingSearchBody search = new InFilingSearchBody(); // InFilingSearchBody | Search body
try{
InFilingResponse result = apiInstance.searchInFiling(search);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#searchInFiling");
    e.

printStackTrace();
}
```

### Parameters

 Name       | Type                                            | Description | Notes      
------------|-------------------------------------------------|-------------|------------
 **search** | [**InFilingSearchBody**](InFilingSearchBody.md) | Search body | [optional] 

### Return type

[**InFilingResponse**](InFilingResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="sectorMetric"></a>

# **sectorMetric**

> SectorMetric sectorMetric(region)

Sector Metrics

Get ratios for different sectors and regions/indices.

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String region = "region_example"; // String | Region. A list of supported values for this field can be found <a href=\"https://docs.google.com/spreadsheets/d/1afedyv7yWJ-z7pMjaAZK-f6ENY3mI3EBCk95QffpoHw/edit?usp=sharing\" target=\"_blank\">here</a>.
try{
SectorMetric result = apiInstance.sectorMetric(region);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#sectorMetric");
    e.

printStackTrace();
}
```

### Parameters

 Name       | Type       | Description                                                                                                                                                                                                                                                | Notes 
------------|------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------
 **region** | **String** | Region. A list of supported values for this field can be found &lt;a href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1afedyv7yWJ-z7pMjaAZK-f6ENY3mI3EBCk95QffpoHw/edit?usp&#x3D;sharing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. |

### Return type

[**SectorMetric**](SectorMetric.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="similarityIndex"></a>

# **similarityIndex**

> SimilarityIndex similarityIndex(symbol, cik, freq)

Similarity Index

&lt;p&gt;Calculate the textual difference between a company&#39;s 10-K / 10-Q reports and the same type of report in the
previous year using Cosine Similarity. For example, this endpoint compares 2019&#39;s 10-K with 2018&#39;s 10-K.
Companies breaking from its routines in disclosure of financial condition and risk analysis section can signal a
significant change in the company&#39;s stock price in the upcoming 4 quarters.&lt;/p&gt;

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String symbol = "symbol_example"; // String | Symbol. Required if cik is empty
String cik = "cik_example"; // String | CIK. Required if symbol is empty
String freq = "freq_example"; // String | <code>annual</code> or <code>quarterly</code>. Default to <code>annual</code>
try{
SimilarityIndex result = apiInstance.similarityIndex(symbol, cik, freq);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#similarityIndex");
    e.

printStackTrace();
}
```

### Parameters

 Name       | Type       | Description                                                                                                       | Notes      
------------|------------|-------------------------------------------------------------------------------------------------------------------|------------
 **symbol** | **String** | Symbol. Required if cik is empty                                                                                  | [optional] 
 **cik**    | **String** | CIK. Required if symbol is empty                                                                                  | [optional] 
 **freq**   | **String** | &lt;code&gt;annual&lt;/code&gt; or &lt;code&gt;quarterly&lt;/code&gt;. Default to &lt;code&gt;annual&lt;/code&gt; | [optional] 

### Return type

[**SimilarityIndex**](SimilarityIndex.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="socialSentiment"></a>

# **socialSentiment**

> SocialSentiment socialSentiment(symbol, from, to)

Social Sentiment

&lt;p&gt;Get social sentiment for stocks on Reddit and Twitter.&lt;/p&gt;

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String symbol = "symbol_example"; // String | Company symbol.
LocalDate from = LocalDate.now(); // LocalDate | From date <code>YYYY-MM-DD</code>.
LocalDate to = LocalDate.now(); // LocalDate | To date <code>YYYY-MM-DD</code>.
try{
SocialSentiment result = apiInstance.socialSentiment(symbol, from, to);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#socialSentiment");
    e.

printStackTrace();
}
```

### Parameters

 Name       | Type          | Description                                    | Notes      
------------|---------------|------------------------------------------------|------------
 **symbol** | **String**    | Company symbol.                                |
 **from**   | **LocalDate** | From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. | [optional] 
 **to**     | **LocalDate** | To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;.   | [optional] 

### Return type

[**SocialSentiment**](SocialSentiment.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="stockBasicDividends"></a>

# **stockBasicDividends**

> Dividends2 stockBasicDividends(symbol)

Dividends 2 (Basic)

Get global dividends data.

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String symbol = "symbol_example"; // String | Symbol.
try{
Dividends2 result = apiInstance.stockBasicDividends(symbol);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#stockBasicDividends");
    e.

printStackTrace();
}
```

### Parameters

 Name       | Type       | Description | Notes 
------------|------------|-------------|-------
 **symbol** | **String** | Symbol.     |

### Return type

[**Dividends2**](Dividends2.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="stockBidask"></a>

# **stockBidask**

> LastBidAsk stockBidask(symbol)

Last Bid-Ask

Get last bid/ask data for US stocks.

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String symbol = "symbol_example"; // String | Symbol.
try{
LastBidAsk result = apiInstance.stockBidask(symbol);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#stockBidask");
    e.

printStackTrace();
}
```

### Parameters

 Name       | Type       | Description | Notes 
------------|------------|-------------|-------
 **symbol** | **String** | Symbol.     |

### Return type

[**LastBidAsk**](LastBidAsk.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="stockCandles"></a>

# **stockCandles**

> StockCandles stockCandles(symbol, resolution, from, to)

Stock Candles

&lt;p&gt;Get candlestick data (OHLCV) for stocks.&lt;/p&gt;&lt;p&gt;Daily data will be adjusted for Splits. Intraday
data will remain unadjusted. Only 1 month of intraday will be returned at a time. If you need more historical intraday
data, please use the from and to params iteratively to request more data.&lt;/p&gt;

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String symbol = "symbol_example"; // String | Symbol.
String resolution = "resolution_example"; // String | Supported resolution includes <code>1, 5, 15, 30, 60, D, W, M </code>.Some timeframes might not be available depending on the exchange.
Long from = 789L; // Long | UNIX timestamp. Interval initial value.
Long to = 789L; // Long | UNIX timestamp. Interval end value.
try{
StockCandles result = apiInstance.stockCandles(symbol, resolution, from, to);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#stockCandles");
    e.

printStackTrace();
}
```

### Parameters

 Name           | Type       | Description                                                                                                                                         | Notes 
----------------|------------|-----------------------------------------------------------------------------------------------------------------------------------------------------|-------
 **symbol**     | **String** | Symbol.                                                                                                                                             |
 **resolution** | **String** | Supported resolution includes &lt;code&gt;1, 5, 15, 30, 60, D, W, M &lt;/code&gt;.Some timeframes might not be available depending on the exchange. |
 **from**       | **Long**   | UNIX timestamp. Interval initial value.                                                                                                             |
 **to**         | **Long**   | UNIX timestamp. Interval end value.                                                                                                                 |

### Return type

[**StockCandles**](StockCandles.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="stockDividends"></a>

# **stockDividends**

> List&lt;Dividends&gt; stockDividends(symbol, from, to)

Dividends

Get dividends data for common stocks going back 30 years.

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String symbol = "symbol_example"; // String | Symbol.
LocalDate from = LocalDate.now(); // LocalDate | YYYY-MM-DD.
LocalDate to = LocalDate.now(); // LocalDate | YYYY-MM-DD.
try{
List<Dividends> result = apiInstance.stockDividends(symbol, from, to);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#stockDividends");
    e.

printStackTrace();
}
```

### Parameters

 Name       | Type          | Description | Notes 
------------|---------------|-------------|-------
 **symbol** | **String**    | Symbol.     |
 **from**   | **LocalDate** | YYYY-MM-DD. |
 **to**     | **LocalDate** | YYYY-MM-DD. |

### Return type

[**List&lt;Dividends&gt;**](Dividends.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="stockLobbying"></a>

# **stockLobbying**

> LobbyingResult stockLobbying(symbol, from, to)

Senate Lobbying

Get a list of reported lobbying activities in the Senate and the House.

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String symbol = "symbol_example"; // String | Symbol.
LocalDate from = LocalDate.now(); // LocalDate | From date <code>YYYY-MM-DD</code>.
LocalDate to = LocalDate.now(); // LocalDate | To date <code>YYYY-MM-DD</code>.
try{
LobbyingResult result = apiInstance.stockLobbying(symbol, from, to);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#stockLobbying");
    e.

printStackTrace();
}
```

### Parameters

 Name       | Type          | Description                                    | Notes 
------------|---------------|------------------------------------------------|-------
 **symbol** | **String**    | Symbol.                                        |
 **from**   | **LocalDate** | From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. |
 **to**     | **LocalDate** | To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;.   |

### Return type

[**LobbyingResult**](LobbyingResult.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="stockNbbo"></a>

# **stockNbbo**

> HistoricalNBBO stockNbbo(symbol, date, limit, skip)

Historical NBBO

&lt;p&gt;Get historical best bid and offer for US stocks, LSE, TSX, Euronext and Deutsche Borse.&lt;/p&gt;&lt;p&gt;For
US market, this endpoint only serves historical NBBO from the beginning of 2020. To download more historical data,
please visit our bulk download page in the Dashboard &lt;a target&#x3D;\&quot;_blank\&quot;
href&#x3D;\&quot;/dashboard/download\&quot;,&gt;here&lt;/a&gt;.&lt;/p&gt;

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String symbol = "symbol_example"; // String | Symbol.
LocalDate date = LocalDate.now(); // LocalDate | Date: 2020-04-02.
Long limit = 789L; // Long | Limit number of ticks returned. Maximum value: <code>25000</code>
Long skip = 789L; // Long | Number of ticks to skip. Use this parameter to loop through the entire data.
try{
HistoricalNBBO result = apiInstance.stockNbbo(symbol, date, limit, skip);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#stockNbbo");
    e.

printStackTrace();
}
```

### Parameters

 Name       | Type          | Description                                                                   | Notes 
------------|---------------|-------------------------------------------------------------------------------|-------
 **symbol** | **String**    | Symbol.                                                                       |
 **date**   | **LocalDate** | Date: 2020-04-02.                                                             |
 **limit**  | **Long**      | Limit number of ticks returned. Maximum value: &lt;code&gt;25000&lt;/code&gt; |
 **skip**   | **Long**      | Number of ticks to skip. Use this parameter to loop through the entire data.  |

### Return type

[**HistoricalNBBO**](HistoricalNBBO.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="stockSplits"></a>

# **stockSplits**

> List&lt;Split&gt; stockSplits(symbol, from, to)

Splits

Get splits data for stocks.

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String symbol = "symbol_example"; // String | Symbol.
LocalDate from = LocalDate.now(); // LocalDate | YYYY-MM-DD.
LocalDate to = LocalDate.now(); // LocalDate | YYYY-MM-DD.
try{
List<Split> result = apiInstance.stockSplits(symbol, from, to);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#stockSplits");
    e.

printStackTrace();
}
```

### Parameters

 Name       | Type          | Description | Notes 
------------|---------------|-------------|-------
 **symbol** | **String**    | Symbol.     |
 **from**   | **LocalDate** | YYYY-MM-DD. |
 **to**     | **LocalDate** | YYYY-MM-DD. |

### Return type

[**List&lt;Split&gt;**](Split.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="stockSymbols"></a>

# **stockSymbols**

> List&lt;StockSymbol&gt; stockSymbols(exchange, mic, securityType, currency)

Stock Symbol

List supported stocks. We use the following symbology to identify stocks on Finnhub
&lt;code&gt;Exchange_Ticker.Exchange_Code&lt;/code&gt;. A list of supported exchange codes can be found &lt;a
href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1I3pBxjfXB056-g_JYf_6o3Rns3BV2kMGG1nCatb91ls/edit?usp&#x3D;sharing\&quot;
target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String exchange = "exchange_example"; // String | Exchange you want to get the list of symbols from. List of exchange codes can be found <a href=\"https://docs.google.com/spreadsheets/d/1I3pBxjfXB056-g_JYf_6o3Rns3BV2kMGG1nCatb91ls/edit?usp=sharing\" target=\"_blank\">here</a>.
String mic = "mic_example"; // String | Filter by MIC code.
String securityType = "securityType_example"; // String | Filter by security type used by OpenFigi standard.
String currency = "currency_example"; // String | Filter by currency.
try{
List<StockSymbol> result = apiInstance.stockSymbols(exchange, mic, securityType, currency);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#stockSymbols");
    e.

printStackTrace();
}
```

### Parameters

 Name             | Type       | Description                                                                                                                                                                                                                                                                        | Notes      
------------------|------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------
 **exchange**     | **String** | Exchange you want to get the list of symbols from. List of exchange codes can be found &lt;a href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1I3pBxjfXB056-g_JYf_6o3Rns3BV2kMGG1nCatb91ls/edit?usp&#x3D;sharing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. |
 **mic**          | **String** | Filter by MIC code.                                                                                                                                                                                                                                                                | [optional] 
 **securityType** | **String** | Filter by security type used by OpenFigi standard.                                                                                                                                                                                                                                 | [optional] 
 **currency**     | **String** | Filter by currency.                                                                                                                                                                                                                                                                | [optional] 

### Return type

[**List&lt;StockSymbol&gt;**](StockSymbol.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="stockTick"></a>

# **stockTick**

> TickData stockTick(symbol, date, limit, skip)

Tick Data

&lt;p&gt;Get historical tick data for global exchanges.&lt;/p&gt;&lt;p&gt;For more historical tick data, you can visit
our bulk download page in the Dashboard &lt;a target&#x3D;\&quot;_blank\&quot;
href&#x3D;\&quot;/dashboard/download\&quot;,&gt;here&lt;/a&gt; to speed up the download process.&lt;/p&gt;&lt;table
class&#x3D;\&quot;table table-hover\&quot;&gt; &lt;thead&gt; &lt;tr&gt; &lt;th&gt;Exchange&lt;/th&gt;
&lt;th&gt;Segment&lt;/th&gt; &lt;th&gt;Delay&lt;/th&gt; &lt;/tr&gt; &lt;/thead&gt; &lt;tbody&gt; &lt;tr&gt; &lt;td
class&#x3D;\&quot;text-blue\&quot;&gt;US CTA/UTP&lt;/th&gt; &lt;td&gt;Full SIP&lt;/td&gt;
&lt;td&gt;End-of-day&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt; &lt;td class&#x3D;\&quot;text-blue\&quot;&gt;TSX&lt;/th&gt;
&lt;td&gt;&lt;ul&gt;&lt;li&gt;TSX&lt;/li&gt;&lt;li&gt;TSX
Venture&lt;/li&gt;&lt;li&gt;Index&lt;/li&gt;&lt;/ul&gt;&lt;/td&gt; &lt;td&gt;End-of-day&lt;/td&gt; &lt;/tr&gt;
&lt;tr&gt; &lt;td class&#x3D;\&quot;text-blue\&quot;&gt;LSE&lt;/th&gt; &lt;td&gt;&lt;ul&gt;&lt;li&gt;London Stock
Exchange (L)&lt;/li&gt;&lt;li&gt;LSE International (L)&lt;/li&gt;&lt;li&gt;LSE European (L)
&lt;/li&gt;&lt;/ul&gt;&lt;/td&gt; &lt;td&gt;15 minute&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt; &lt;td
class&#x3D;\&quot;text-blue\&quot;&gt;Euronext&lt;/th&gt; &lt;td&gt;&lt;ul&gt; &lt;li&gt;Euronext Paris (PA)&lt;/li&gt;
&lt;li&gt;Euronext Amsterdam (AS)&lt;/li&gt; &lt;li&gt;Euronext Lisbon (LS)&lt;/li&gt; &lt;li&gt;Euronext Brussels (BR)
&lt;/li&gt; &lt;li&gt;Euronext Oslo (OL)&lt;/li&gt; &lt;li&gt;Euronext London (LN)&lt;/li&gt; &lt;li&gt;Euronext
Dublin (IR)&lt;/li&gt; &lt;li&gt;Index&lt;/li&gt; &lt;li&gt;Warrant&lt;/li&gt;&lt;/ul&gt;&lt;/td&gt;
&lt;td&gt;End-of-day&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt; &lt;td class&#x3D;\&quot;text-blue\&quot;&gt;Deutsche
Börse&lt;/th&gt; &lt;td&gt;&lt;ul&gt; &lt;li&gt;Frankfurt (F)&lt;/li&gt; &lt;li&gt;Xetra (DE)&lt;/li&gt;
&lt;li&gt;Duesseldorf (DU)&lt;/li&gt; &lt;li&gt;Hamburg (HM)&lt;/li&gt; &lt;li&gt;Berlin (BE)&lt;/li&gt;
&lt;li&gt;Hanover (HA)&lt;/li&gt; &lt;li&gt;Stoxx (SX)&lt;/li&gt; &lt;li&gt;TradeGate (TG)&lt;/li&gt;
&lt;li&gt;Zertifikate (SC)&lt;/li&gt; &lt;li&gt;Index&lt;/li&gt; &lt;li&gt;Warrant&lt;/li&gt;&lt;/ul&gt;&lt;/td&gt;
&lt;td&gt;End-of-day&lt;/td&gt; &lt;/tr&gt; &lt;/tbody&gt; &lt;/table&gt;

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String symbol = "symbol_example"; // String | Symbol.
LocalDate date = LocalDate.now(); // LocalDate | Date: 2020-04-02.
Long limit = 789L; // Long | Limit number of ticks returned. Maximum value: <code>25000</code>
Long skip = 789L; // Long | Number of ticks to skip. Use this parameter to loop through the entire data.
try{
TickData result = apiInstance.stockTick(symbol, date, limit, skip);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#stockTick");
    e.

printStackTrace();
}
```

### Parameters

 Name       | Type          | Description                                                                   | Notes 
------------|---------------|-------------------------------------------------------------------------------|-------
 **symbol** | **String**    | Symbol.                                                                       |
 **date**   | **LocalDate** | Date: 2020-04-02.                                                             |
 **limit**  | **Long**      | Limit number of ticks returned. Maximum value: &lt;code&gt;25000&lt;/code&gt; |
 **skip**   | **Long**      | Number of ticks to skip. Use this parameter to loop through the entire data.  |

### Return type

[**TickData**](TickData.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="stockUsaSpending"></a>

# **stockUsaSpending**

> UsaSpendingResult stockUsaSpending(symbol, from, to)

USA Spending

Get a list of government&#39;s spending activities from USASpending dataset for public companies. This dataset can help
you identify companies that win big government contracts which is extremely important for industries such as Defense,
Aerospace, and Education.

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String symbol = "symbol_example"; // String | Symbol.
LocalDate from = LocalDate.now(); // LocalDate | From date <code>YYYY-MM-DD</code>. Filter for <code>actionDate</code>
LocalDate to = LocalDate.now(); // LocalDate | To date <code>YYYY-MM-DD</code>. Filter for <code>actionDate</code>
try{
UsaSpendingResult result = apiInstance.stockUsaSpending(symbol, from, to);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#stockUsaSpending");
    e.

printStackTrace();
}
```

### Parameters

 Name       | Type          | Description                                                                                   | Notes 
------------|---------------|-----------------------------------------------------------------------------------------------|-------
 **symbol** | **String**    | Symbol.                                                                                       |
 **from**   | **LocalDate** | From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. Filter for &lt;code&gt;actionDate&lt;/code&gt; |
 **to**     | **LocalDate** | To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. Filter for &lt;code&gt;actionDate&lt;/code&gt;   |

### Return type

[**UsaSpendingResult**](UsaSpendingResult.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="stockUsptoPatent"></a>

# **stockUsptoPatent**

> UsptoPatentResult stockUsptoPatent(symbol, from, to)

USPTO Patents

List USPTO patents for companies. Limit to 250 records per API call.

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String symbol = "symbol_example"; // String | Symbol.
LocalDate from = LocalDate.now(); // LocalDate | From date <code>YYYY-MM-DD</code>.
LocalDate to = LocalDate.now(); // LocalDate | To date <code>YYYY-MM-DD</code>.
try{
UsptoPatentResult result = apiInstance.stockUsptoPatent(symbol, from, to);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#stockUsptoPatent");
    e.

printStackTrace();
}
```

### Parameters

 Name       | Type          | Description                                    | Notes 
------------|---------------|------------------------------------------------|-------
 **symbol** | **String**    | Symbol.                                        |
 **from**   | **LocalDate** | From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. |
 **to**     | **LocalDate** | To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;.   |

### Return type

[**UsptoPatentResult**](UsptoPatentResult.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="stockVisaApplication"></a>

# **stockVisaApplication**

> VisaApplicationResult stockVisaApplication(symbol, from, to)

H1-B Visa Application

Get a list of H1-B and Permanent visa applications for companies from the DOL. The data is updated quarterly.

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String symbol = "symbol_example"; // String | Symbol.
LocalDate from = LocalDate.now(); // LocalDate | From date <code>YYYY-MM-DD</code>. Filter on the <code>beginDate</code> column.
LocalDate to = LocalDate.now(); // LocalDate | To date <code>YYYY-MM-DD</code>. Filter on the <code>beginDate</code> column.
try{
VisaApplicationResult result = apiInstance.stockVisaApplication(symbol, from, to);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#stockVisaApplication");
    e.

printStackTrace();
}
```

### Parameters

 Name       | Type          | Description                                                                                             | Notes 
------------|---------------|---------------------------------------------------------------------------------------------------------|-------
 **symbol** | **String**    | Symbol.                                                                                                 |
 **from**   | **LocalDate** | From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. Filter on the &lt;code&gt;beginDate&lt;/code&gt; column. |
 **to**     | **LocalDate** | To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. Filter on the &lt;code&gt;beginDate&lt;/code&gt; column.   |

### Return type

[**VisaApplicationResult**](VisaApplicationResult.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="supplyChainRelationships"></a>

# **supplyChainRelationships**

> SupplyChainRelationships supplyChainRelationships(symbol)

Supply Chain Relationships

&lt;p&gt;This endpoint provides an overall map of public companies&#39; key customers and suppliers. The data offers a
deeper look into a company&#39;s supply chain and how products are created. The data will help investors manage risk,
limit exposure or generate alpha-generating ideas and trading insights.&lt;/p&gt;

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String symbol = "symbol_example"; // String | Symbol.
try{
SupplyChainRelationships result = apiInstance.supplyChainRelationships(symbol);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#supplyChainRelationships");
    e.

printStackTrace();
}
```

### Parameters

 Name       | Type       | Description | Notes 
------------|------------|-------------|-------
 **symbol** | **String** | Symbol.     |

### Return type

[**SupplyChainRelationships**](SupplyChainRelationships.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="supportResistance"></a>

# **supportResistance**

> SupportResistance supportResistance(symbol, resolution)

Support/Resistance

Get support and resistance levels for a symbol.

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String symbol = "symbol_example"; // String | Symbol
String resolution = "resolution_example"; // String | Supported resolution includes <code>1, 5, 15, 30, 60, D, W, M </code>.Some timeframes might not be available depending on the exchange.
try{
SupportResistance result = apiInstance.supportResistance(symbol, resolution);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#supportResistance");
    e.

printStackTrace();
}
```

### Parameters

 Name           | Type       | Description                                                                                                                                         | Notes 
----------------|------------|-----------------------------------------------------------------------------------------------------------------------------------------------------|-------
 **symbol**     | **String** | Symbol                                                                                                                                              |
 **resolution** | **String** | Supported resolution includes &lt;code&gt;1, 5, 15, 30, 60, D, W, M &lt;/code&gt;.Some timeframes might not be available depending on the exchange. |

### Return type

[**SupportResistance**](SupportResistance.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="symbolChange"></a>

# **symbolChange**

> SymbolChange symbolChange(from, to)

Symbol Change

Get a list of symbol changes for US-listed, EU-listed, NSE and ASX securities. Limit to 2000 events at a time.

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String from = "from_example"; // String | From date <code>YYYY-MM-DD</code>.
String to = "to_example"; // String | To date <code>YYYY-MM-DD</code>.
try{
SymbolChange result = apiInstance.symbolChange(from, to);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#symbolChange");
    e.

printStackTrace();
}
```

### Parameters

 Name     | Type       | Description                                    | Notes 
----------|------------|------------------------------------------------|-------
 **from** | **String** | From date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;. |
 **to**   | **String** | To date &lt;code&gt;YYYY-MM-DD&lt;/code&gt;.   |

### Return type

[**SymbolChange**](SymbolChange.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="symbolSearch"></a>

# **symbolSearch**

> SymbolLookup symbolSearch(q)

Symbol Lookup

Search for best-matching symbols based on your query. You can input anything from symbol, security&#39;s name to ISIN
and Cusip.

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String q = "q_example"; // String | Query text can be symbol, name, isin, or cusip.
try{
SymbolLookup result = apiInstance.symbolSearch(q);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#symbolSearch");
    e.

printStackTrace();
}
```

### Parameters

 Name  | Type       | Description                                     | Notes 
-------|------------|-------------------------------------------------|-------
 **q** | **String** | Query text can be symbol, name, isin, or cusip. |

### Return type

[**SymbolLookup**](SymbolLookup.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="technicalIndicator"></a>

# **technicalIndicator**

> TechnicalIndicator technicalIndicator(symbol, resolution, from, to, indicator, indicatorFields)

Technical Indicators

Return technical indicator with price data. List of supported indicators can be found &lt;a
href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1ylUvKHVYN2E87WdwIza8ROaCpd48ggEl1k5i5SgA29k/edit?usp&#x3D;sharing\&quot;
target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String symbol = "symbol_example"; // String | symbol
String resolution = "resolution_example"; // String | Supported resolution includes <code>1, 5, 15, 30, 60, D, W, M </code>.Some timeframes might not be available depending on the exchange.
Long from = 789L; // Long | UNIX timestamp. Interval initial value.
Long to = 789L; // Long | UNIX timestamp. Interval end value.
String indicator = "indicator_example"; // String | Indicator name. Full list can be found <a href=\"https://docs.google.com/spreadsheets/d/1ylUvKHVYN2E87WdwIza8ROaCpd48ggEl1k5i5SgA29k/edit?usp=sharing\" target=\"_blank\">here</a>.
IndicatorFields indicatorFields = new IndicatorFields(); // IndicatorFields | Check out <a href=\"https://docs.google.com/spreadsheets/d/1ylUvKHVYN2E87WdwIza8ROaCpd48ggEl1k5i5SgA29k/edit?usp=sharing\" target=\"_blank\">this page</a> to see which indicators and params are supported.
try{
TechnicalIndicator result = apiInstance.technicalIndicator(symbol, resolution, from, to, indicator, indicatorFields);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#technicalIndicator");
    e.

printStackTrace();
}
```

### Parameters

 Name                | Type                                      | Description                                                                                                                                                                                                                                                 | Notes      
---------------------|-------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------
 **symbol**          | **String**                                | symbol                                                                                                                                                                                                                                                      |
 **resolution**      | **String**                                | Supported resolution includes &lt;code&gt;1, 5, 15, 30, 60, D, W, M &lt;/code&gt;.Some timeframes might not be available depending on the exchange.                                                                                                         |
 **from**            | **Long**                                  | UNIX timestamp. Interval initial value.                                                                                                                                                                                                                     |
 **to**              | **Long**                                  | UNIX timestamp. Interval end value.                                                                                                                                                                                                                         |
 **indicator**       | **String**                                | Indicator name. Full list can be found &lt;a href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1ylUvKHVYN2E87WdwIza8ROaCpd48ggEl1k5i5SgA29k/edit?usp&#x3D;sharing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.                          |
 **indicatorFields** | [**IndicatorFields**](IndicatorFields.md) | Check out &lt;a href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1ylUvKHVYN2E87WdwIza8ROaCpd48ggEl1k5i5SgA29k/edit?usp&#x3D;sharing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;this page&lt;/a&gt; to see which indicators and params are supported. | [optional] 

### Return type

[**TechnicalIndicator**](TechnicalIndicator.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="transcripts"></a>

# **transcripts**

> EarningsCallTranscripts transcripts(id)

Earnings Call Transcripts

&lt;p&gt;Get earnings call transcripts, audio and participants&#39; list. Data is available for US, UK, European,
Australian and Canadian companies.&lt;p&gt;15+ years of data is available with 220,000+ audio which add up to 7TB in
size.&lt;/p&gt;

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | Transcript's id obtained with <a href=\"#transcripts-list\">Transcripts List endpoint</a>.
try{
EarningsCallTranscripts result = apiInstance.transcripts(id);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#transcripts");
    e.

printStackTrace();
}
```

### Parameters

 Name   | Type       | Description                                                                                                               | Notes 
--------|------------|---------------------------------------------------------------------------------------------------------------------------|-------
 **id** | **String** | Transcript&#39;s id obtained with &lt;a href&#x3D;\&quot;#transcripts-list\&quot;&gt;Transcripts List endpoint&lt;/a&gt;. |

### Return type

[**EarningsCallTranscripts**](EarningsCallTranscripts.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="transcriptsList"></a>

# **transcriptsList**

> EarningsCallTranscriptsList transcriptsList(symbol)

Earnings Call Transcripts List

List earnings call transcripts&#39; metadata. This endpoint is available for US, UK, European, Australian and Canadian
companies.

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String symbol = "symbol_example"; // String | Company symbol: AAPL. Leave empty to list the latest transcripts
try{
EarningsCallTranscriptsList result = apiInstance.transcriptsList(symbol);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#transcriptsList");
    e.

printStackTrace();
}
```

### Parameters

 Name       | Type       | Description                                                      | Notes 
------------|------------|------------------------------------------------------------------|-------
 **symbol** | **String** | Company symbol: AAPL. Leave empty to list the latest transcripts |

### Return type

[**EarningsCallTranscriptsList**](EarningsCallTranscriptsList.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="upgradeDowngrade"></a>

# **upgradeDowngrade**

> List&lt;UpgradeDowngrade&gt; upgradeDowngrade(symbol, from, to)

Stock Upgrade/Downgrade

Get latest stock upgrade and downgrade.

### Example

```java
// Import classes:
//import de.fwidder.finnhub4j.ApiClient;
//import de.fwidder.finnhub.restclient.ApiException;
//import de.fwidder.finnhub.restclient.Configuration;
//import de.fwidder.finnhub.restclient.auth.*;
//import api.de.fwidder.finnhub.restclient.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.

setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String symbol = "symbol_example"; // String | Symbol of the company: AAPL. If left blank, the API will return latest stock upgrades/downgrades.
LocalDate from = LocalDate.now(); // LocalDate | From date: 2000-03-15.
LocalDate to = LocalDate.now(); // LocalDate | To date: 2020-03-16.
try{
List<UpgradeDowngrade> result = apiInstance.upgradeDowngrade(symbol, from, to);
    System.out.

println(result);
}catch(
ApiException e){
        System.err.

println("Exception when calling DefaultApi#upgradeDowngrade");
    e.

printStackTrace();
}
```

### Parameters

 Name       | Type          | Description                                                                                       | Notes      
------------|---------------|---------------------------------------------------------------------------------------------------|------------
 **symbol** | **String**    | Symbol of the company: AAPL. If left blank, the API will return latest stock upgrades/downgrades. | [optional] 
 **from**   | **LocalDate** | From date: 2000-03-15.                                                                            | [optional] 
 **to**     | **LocalDate** | To date: 2020-03-16.                                                                              | [optional] 

### Return type

[**List&lt;UpgradeDowngrade&gt;**](UpgradeDowngrade.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

