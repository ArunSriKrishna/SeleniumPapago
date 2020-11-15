# SeleniumPapago
<img src="https://camo.githubusercontent.com/bfa4382ee7e27108a0ca2cb7990c32bdbbf650faa43140f9e9ba62101cf74c96/68747470733a2f2f70617061676f2e6e617665722e636f6d2f37396130326635373965343361343232663765633235616563343466343563662e737667" alt="official website" width="320" data-canonical-src="https://papago.naver.com/79a02f579e43a422f7ec25aec44f45cf.svg" style="max-width:100%;">
a Java-Selenium script to translate a input text using Papago Translate by web-scraping without using the Naver API<br>



### Prerequisites
Requires ChromeDriver and Selenium Package.<br>
- Download the ChromeDriver: https://chromedriver.chromium.org/<br>
- Download Selenium for Java: https://www.selenium.dev/downloads/<br><br>


### Usage
- Initialize string 'chrome_driver_location' to the location of ChromeDriver
- Assign source_lang (input language-code) and trans_lang (output language-code) to language[index] by refering to table below
- Assign source (input source-text)
<pre>
$ javac SeleniumPapago.java
$ java SeleniumPapago
</pre>


### language[index]
|Language Code|	Description|	Index|
|----|----|----|
|auto| Detect Language|	0|
|ko|	Korean|	1|
|en|	English|	2|
|ja|	Japanese|	3|
|zh-CN|	Chinese Simplified|	4|
|zh-TW|	Chinese Traditional|	5|
|es|	Spanish|	6|
|fr|	French|	7|
|de|	German|	8|
|ru|	Russian|	9|
|pt|	Portuguese|	10|
|it|	Italian|	11|
|vi|	Vietnamese|	12|
|th|	Thai|	13|
|id|	Indonesian|	14|
|hi|	Hindi|	15|
