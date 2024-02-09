# Transactions

## Properties

 Name                 | Type                          | Description                                                                                                                                                                                                                       | Notes      
----------------------|-------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------
 **symbol**           | **String**                    | Symbol.                                                                                                                                                                                                                           | [optional] 
 **name**             | **String**                    | Insider&#39;s name.                                                                                                                                                                                                               | [optional] 
 **share**            | **Long**                      | Number of shares held after the transaction.                                                                                                                                                                                      | [optional] 
 **change**           | **Long**                      | Number of share changed from the last period. A positive value suggests a &lt;code&gt;BUY&lt;/code&gt; transaction. A negative value suggests a &lt;code&gt;SELL&lt;/code&gt; transaction.                                        | [optional] 
 **filingDate**       | [**LocalDate**](LocalDate.md) | Filing date.                                                                                                                                                                                                                      | [optional] 
 **transactionDate**  | [**LocalDate**](LocalDate.md) | Transaction date.                                                                                                                                                                                                                 | [optional] 
 **transactionPrice** | **Float**                     | Average transaction price.                                                                                                                                                                                                        | [optional] 
 **transactionCode**  | **String**                    | Transaction code. A list of codes and their meanings can be found &lt;a href&#x3D;\&quot;https://www.sec.gov/about/forms/form4data.pdf\&quot; target&#x3D;\&quot;_blank\&quot; rel&#x3D;\&quot;noopener\&quot;&gt;here&lt;/a&gt;. | [optional] 



