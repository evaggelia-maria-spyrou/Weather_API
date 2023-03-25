
package model.geocoding;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "af",
    "ar",
    "ascii",
    "az",
    "bg",
    "ca",
    "da",
    "de",
    "el",
    "en",
    "eu",
    "fa",
    "feature_name",
    "fi",
    "fr",
    "gl",
    "he",
    "hi",
    "hr",
    "hu",
    "id",
    "it",
    "ja",
    "la",
    "lt",
    "mk",
    "nl",
    "no",
    "pl",
    "pt",
    "ro",
    "ru",
    "sk",
    "sl",
    "sr",
    "th",
    "tr",
    "vi",
    "zu"
})
public class LocalNames {

    @JsonProperty("af")
    private String af;
    @JsonProperty("ar")
    private String ar;
    @JsonProperty("ascii")
    private String ascii;
    @JsonProperty("az")
    private String az;
    @JsonProperty("bg")
    private String bg;
    @JsonProperty("ca")
    private String ca;
    @JsonProperty("da")
    private String da;
    @JsonProperty("de")
    private String de;
    @JsonProperty("el")
    private String el;
    @JsonProperty("en")
    private String en;
    @JsonProperty("eu")
    private String eu;
    @JsonProperty("fa")
    private String fa;
    @JsonProperty("feature_name")
    private String featureName;
    @JsonProperty("fi")
    private String fi;
    @JsonProperty("fr")
    private String fr;
    @JsonProperty("gl")
    private String gl;
    @JsonProperty("he")
    private String he;
    @JsonProperty("hi")
    private String hi;
    @JsonProperty("hr")
    private String hr;
    @JsonProperty("hu")
    private String hu;
    @JsonProperty("id")
    private String id;
    @JsonProperty("it")
    private String it;
    @JsonProperty("ja")
    private String ja;
    @JsonProperty("la")
    private String la;
    @JsonProperty("lt")
    private String lt;
    @JsonProperty("mk")
    private String mk;
    @JsonProperty("nl")
    private String nl;
    @JsonProperty("no")
    private String no;
    @JsonProperty("pl")
    private String pl;
    @JsonProperty("pt")
    private String pt;
    @JsonProperty("ro")
    private String ro;
    @JsonProperty("ru")
    private String ru;
    @JsonProperty("sk")
    private String sk;
    @JsonProperty("sl")
    private String sl;
    @JsonProperty("sr")
    private String sr;
    @JsonProperty("th")
    private String th;
    @JsonProperty("tr")
    private String tr;
    @JsonProperty("vi")
    private String vi;
    @JsonProperty("zu")
    private String zu;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("af")
    public String getAf() {
        return af;
    }

    @JsonProperty("af")
    public void setAf(String af) {
        this.af = af;
    }

    @JsonProperty("ar")
    public String getAr() {
        return ar;
    }

    @JsonProperty("ar")
    public void setAr(String ar) {
        this.ar = ar;
    }

    @JsonProperty("ascii")
    public String getAscii() {
        return ascii;
    }

    @JsonProperty("ascii")
    public void setAscii(String ascii) {
        this.ascii = ascii;
    }

    @JsonProperty("az")
    public String getAz() {
        return az;
    }

    @JsonProperty("az")
    public void setAz(String az) {
        this.az = az;
    }

    @JsonProperty("bg")
    public String getBg() {
        return bg;
    }

    @JsonProperty("bg")
    public void setBg(String bg) {
        this.bg = bg;
    }

    @JsonProperty("ca")
    public String getCa() {
        return ca;
    }

    @JsonProperty("ca")
    public void setCa(String ca) {
        this.ca = ca;
    }

    @JsonProperty("da")
    public String getDa() {
        return da;
    }

    @JsonProperty("da")
    public void setDa(String da) {
        this.da = da;
    }

    @JsonProperty("de")
    public String getDe() {
        return de;
    }

    @JsonProperty("de")
    public void setDe(String de) {
        this.de = de;
    }

    @JsonProperty("el")
    public String getEl() {
        return el;
    }

    @JsonProperty("el")
    public void setEl(String el) {
        this.el = el;
    }

    @JsonProperty("en")
    public String getEn() {
        return en;
    }

    @JsonProperty("en")
    public void setEn(String en) {
        this.en = en;
    }

    @JsonProperty("eu")
    public String getEu() {
        return eu;
    }

    @JsonProperty("eu")
    public void setEu(String eu) {
        this.eu = eu;
    }

    @JsonProperty("fa")
    public String getFa() {
        return fa;
    }

    @JsonProperty("fa")
    public void setFa(String fa) {
        this.fa = fa;
    }

    @JsonProperty("feature_name")
    public String getFeatureName() {
        return featureName;
    }

    @JsonProperty("feature_name")
    public void setFeatureName(String featureName) {
        this.featureName = featureName;
    }

    @JsonProperty("fi")
    public String getFi() {
        return fi;
    }

    @JsonProperty("fi")
    public void setFi(String fi) {
        this.fi = fi;
    }

    @JsonProperty("fr")
    public String getFr() {
        return fr;
    }

    @JsonProperty("fr")
    public void setFr(String fr) {
        this.fr = fr;
    }

    @JsonProperty("gl")
    public String getGl() {
        return gl;
    }

    @JsonProperty("gl")
    public void setGl(String gl) {
        this.gl = gl;
    }

    @JsonProperty("he")
    public String getHe() {
        return he;
    }

    @JsonProperty("he")
    public void setHe(String he) {
        this.he = he;
    }

    @JsonProperty("hi")
    public String getHi() {
        return hi;
    }

    @JsonProperty("hi")
    public void setHi(String hi) {
        this.hi = hi;
    }

    @JsonProperty("hr")
    public String getHr() {
        return hr;
    }

    @JsonProperty("hr")
    public void setHr(String hr) {
        this.hr = hr;
    }

    @JsonProperty("hu")
    public String getHu() {
        return hu;
    }

    @JsonProperty("hu")
    public void setHu(String hu) {
        this.hu = hu;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("it")
    public String getIt() {
        return it;
    }

    @JsonProperty("it")
    public void setIt(String it) {
        this.it = it;
    }

    @JsonProperty("ja")
    public String getJa() {
        return ja;
    }

    @JsonProperty("ja")
    public void setJa(String ja) {
        this.ja = ja;
    }

    @JsonProperty("la")
    public String getLa() {
        return la;
    }

    @JsonProperty("la")
    public void setLa(String la) {
        this.la = la;
    }

    @JsonProperty("lt")
    public String getLt() {
        return lt;
    }

    @JsonProperty("lt")
    public void setLt(String lt) {
        this.lt = lt;
    }

    @JsonProperty("mk")
    public String getMk() {
        return mk;
    }

    @JsonProperty("mk")
    public void setMk(String mk) {
        this.mk = mk;
    }

    @JsonProperty("nl")
    public String getNl() {
        return nl;
    }

    @JsonProperty("nl")
    public void setNl(String nl) {
        this.nl = nl;
    }

    @JsonProperty("no")
    public String getNo() {
        return no;
    }

    @JsonProperty("no")
    public void setNo(String no) {
        this.no = no;
    }

    @JsonProperty("pl")
    public String getPl() {
        return pl;
    }

    @JsonProperty("pl")
    public void setPl(String pl) {
        this.pl = pl;
    }

    @JsonProperty("pt")
    public String getPt() {
        return pt;
    }

    @JsonProperty("pt")
    public void setPt(String pt) {
        this.pt = pt;
    }

    @JsonProperty("ro")
    public String getRo() {
        return ro;
    }

    @JsonProperty("ro")
    public void setRo(String ro) {
        this.ro = ro;
    }

    @JsonProperty("ru")
    public String getRu() {
        return ru;
    }

    @JsonProperty("ru")
    public void setRu(String ru) {
        this.ru = ru;
    }

    @JsonProperty("sk")
    public String getSk() {
        return sk;
    }

    @JsonProperty("sk")
    public void setSk(String sk) {
        this.sk = sk;
    }

    @JsonProperty("sl")
    public String getSl() {
        return sl;
    }

    @JsonProperty("sl")
    public void setSl(String sl) {
        this.sl = sl;
    }

    @JsonProperty("sr")
    public String getSr() {
        return sr;
    }

    @JsonProperty("sr")
    public void setSr(String sr) {
        this.sr = sr;
    }

    @JsonProperty("th")
    public String getTh() {
        return th;
    }

    @JsonProperty("th")
    public void setTh(String th) {
        this.th = th;
    }

    @JsonProperty("tr")
    public String getTr() {
        return tr;
    }

    @JsonProperty("tr")
    public void setTr(String tr) {
        this.tr = tr;
    }

    @JsonProperty("vi")
    public String getVi() {
        return vi;
    }

    @JsonProperty("vi")
    public void setVi(String vi) {
        this.vi = vi;
    }

    @JsonProperty("zu")
    public String getZu() {
        return zu;
    }

    @JsonProperty("zu")
    public void setZu(String zu) {
        this.zu = zu;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
