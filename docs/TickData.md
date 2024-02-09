# TickData

## Properties

 Name      | Type                                          | Description                                                                                                                                                                                                                                                                     | Notes      
-----------|-----------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------
 **s**     | **String**                                    | Symbol.                                                                                                                                                                                                                                                                         | [optional] 
 **skip**  | **Long**                                      | Number of ticks skipped.                                                                                                                                                                                                                                                        | [optional] 
 **count** | **Long**                                      | Number of ticks returned. If &lt;code&gt;count&lt;/code&gt; &lt; &lt;code&gt;limit&lt;/code&gt;, all data for that date has been returned.                                                                                                                                      | [optional] 
 **total** | **Long**                                      | Total number of ticks for that date.                                                                                                                                                                                                                                            | [optional] 
 **v**     | **List&lt;Float&gt;**                         | List of volume data.                                                                                                                                                                                                                                                            | [optional] 
 **p**     | **List&lt;Float&gt;**                         | List of price data.                                                                                                                                                                                                                                                             | [optional] 
 **t**     | **List&lt;Long&gt;**                          | List of timestamp in UNIX ms.                                                                                                                                                                                                                                                   | [optional] 
 **x**     | **List&lt;String&gt;**                        | List of venues/exchanges. A list of exchange codes can be found &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1Tj53M1svmr-hfEtbk6_NpVR1yAyGLMaH6ByYU6CG0ZY/edit?usp&#x3D;sharing\&quot;,&gt;here&lt;/a&gt;                     | [optional] 
 **c**     | [**List&lt;List&lt;String&gt;&gt;**](List.md) | List of trade conditions. A comprehensive list of trade conditions code can be found &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1PUxiSWPHSODbaTaoL2Vef6DgU-yFtlRGZf19oBb9Hp0/edit?usp&#x3D;sharing\&quot;&gt;here&lt;/a&gt; | [optional] 


