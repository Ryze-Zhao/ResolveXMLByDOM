package zhao.demo.bomtest.model;


import java.io.Serializable;


public class Erp3DCode implements Serializable {
    private String bomClass;
    private int bigCode;
    private String middleCode;
    private String smallCode;
    private String code3D;
    private String colorCode;
    private int matCode;

    public Erp3DCode() {
    }

    public Erp3DCode(String bomClass, int bigCode, String middleCode, String smallCode, String code3D, String colorCode, int matCode) {
        this.bomClass = bomClass;
        this.bigCode = bigCode;
        this.middleCode = middleCode;
        this.smallCode = smallCode;
        this.code3D = code3D;
        this.colorCode = colorCode;
        this.matCode = matCode;
    }

    @Override
    public String toString() {
        return "Erp3DCode{" +
                "bomClass='" + bomClass + '\'' +
                ", bigCode=" + bigCode +
                ", middleCode='" + middleCode + '\'' +
                ", smallCode='" + smallCode + '\'' +
                ", code3D='" + code3D + '\'' +
                ", colorCode='" + colorCode + '\'' +
                ", matCode=" + matCode +
                '}';
    }

    public String getBomClass() {
        return bomClass;
    }

    public void setBomClass(String bomClass) {
        this.bomClass = bomClass;
    }

    public int getBigCode() {
        return bigCode;
    }

    public void setBigCode(int bigCode) {
        this.bigCode = bigCode;
    }

    public String getMiddleCode() {
        return middleCode;
    }

    public void setMiddleCode(String middleCode) {
        this.middleCode = middleCode;
    }

    public String getSmallCode() {
        return smallCode;
    }

    public void setSmallCode(String smallCode) {
        this.smallCode = smallCode;
    }

    public String getCode3D() {
        return code3D;
    }

    public void setCode3D(String code3D) {
        this.code3D = code3D;
    }

    public String getColorCode() {
        return colorCode;
    }

    public void setColorCode(String colorCode) {
        this.colorCode = colorCode;
    }

    public int getMatCode() {
        return matCode;
    }

    public void setMatCode(int matCode) {
        this.matCode = matCode;
    }
}
