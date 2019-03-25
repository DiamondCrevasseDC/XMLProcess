package ck;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Cell {

    @XmlElement
    private String cellname;

    @XmlElement
    private String formid;

    @XmlElement
    private String enabled;

    @XmlElement
    private String validate;

    @XmlElement
    private String quarter;

    @XmlElement
    private String keyword;

    @XmlElement
    private String datatype;

    @XmlElement
    private String format;

    @XmlElement
    private String canimport;

    @XmlElement
    private String condition;

    @XmlElement
    private String iscombox;

    @XmlElement
    private String colspan;

    @XmlElement
    private String rowspan;

    @XmlElement
    private String color;

    @XmlElement
    private String value;

    @XmlElement
    private String fml;

    @XmlElement
    private String isshow;

    @XmlElement
    private String width;

    @XmlElement
    private String istitle;

    @XmlElement
    private String ismeasure;

    @XmlElement
    private String iseidter;

    @XmlElement
    private String validatemsg;

    @XmlElement
    private String eitherOr;

    @XmlElement
    private String textalign;

    public Cell(String cellname, String formid, String enabled, String validate, String quarter, String keyword, String datatype, String format, String canimport, String condition, String iscombox, String colspan, String rowspan, String color, String value, String fml, String isshow, String width, String istitle, String ismeasure, String iseidter, String validatemsg, String eitherOr, String textalign) {
        this.cellname = cellname;
        this.formid = formid;
        this.enabled = enabled;
        this.validate = validate;
        this.quarter = quarter;
        this.keyword = keyword;
        this.datatype = datatype;
        this.format = format;
        this.canimport = canimport;
        this.condition = condition;
        this.iscombox = iscombox;
        this.colspan = colspan;
        this.rowspan = rowspan;
        this.color = color;
        this.value = value;
        this.fml = fml;
        this.isshow = isshow;
        this.width = width;
        this.istitle = istitle;
        this.ismeasure = ismeasure;
        this.iseidter = iseidter;
        this.validatemsg = validatemsg;
        this.eitherOr = eitherOr;
        this.textalign = textalign;
    }

    public Cell(){

    }

    public String getCellname() {
        return cellname;
    }

    public void setCellname(String cellname) {
        this.cellname = cellname;
    }

    public String getFormid() {
        return formid;
    }

    public void setFormid(String formid) {
        this.formid = formid;
    }

    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

    public String getValidate() {
        return validate;
    }

    public void setValidate(String validate) {
        this.validate = validate;
    }

    public String getQuarter() {
        return quarter;
    }

    public void setQuarter(String quarter) {
        this.quarter = quarter;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getDatatype() {
        return datatype;
    }

    public void setDatatype(String datatype) {
        this.datatype = datatype;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getCanimport() {
        return canimport;
    }

    public void setCanimport(String canimport) {
        this.canimport = canimport;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getIscombox() {
        return iscombox;
    }

    public void setIscombox(String iscombox) {
        this.iscombox = iscombox;
    }

    public String getColspan() {
        return colspan;
    }

    public void setColspan(String colspan) {
        this.colspan = colspan;
    }

    public String getRowspan() {
        return rowspan;
    }

    public void setRowspan(String rowspan) {
        this.rowspan = rowspan;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getFml() {
        return fml;
    }

    public void setFml(String fml) {
        this.fml = fml;
    }

    public String getIsshow() {
        return isshow;
    }

    public void setIsshow(String isshow) {
        this.isshow = isshow;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getIstitle() {
        return istitle;
    }

    public void setIstitle(String istitle) {
        this.istitle = istitle;
    }

    public String getIsmeasure() {
        return ismeasure;
    }

    public void setIsmeasure(String ismeasure) {
        this.ismeasure = ismeasure;
    }

    public String getIseidter() {
        return iseidter;
    }

    public void setIseidter(String iseidter) {
        this.iseidter = iseidter;
    }

    public String getValidatemsg() {
        return validatemsg;
    }

    public void setValidatemsg(String validatemsg) {
        this.validatemsg = validatemsg;
    }

    public String getEitherOr() {
        return eitherOr;
    }

    public void setEitherOr(String eitherOr) {
        this.eitherOr = eitherOr;
    }

    public String getTextalign() {
        return textalign;
    }

    public void setTextalign(String textalign) {
        this.textalign = textalign;
    }
}
