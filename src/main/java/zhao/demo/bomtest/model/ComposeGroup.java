package zhao.demo.bomtest.model;



import java.io.Serializable;


public class ComposeGroup implements Serializable {
    private String ID;
    private String groupID;
    private String name;
    private String goodsType;
    private int bigClass;
    private String baseMat;
    private String baseName;
    private String colorNumber;
    private String colorName;
    private String funcType;
    private float width;
    private float height;
    private float depth;
    private int nodeID;
    private String crmFlow;
    private String subType;
    private int nearWall;
    private int roomNumber;
    private Erp3DCode erp3DCode;
    private VarList varList;
    private Transform transform;

    public ComposeGroup() {
    }

    public ComposeGroup(String ID, String groupID, String name, String goodsType, int bigClass, String baseMat, String baseName, String colorNumber, String colorName, String funcType, float width, float height, float depth, int nodeID, String crmFlow, String subType, int nearWall, int roomNumber, Erp3DCode erp3DCode, VarList varList, Transform transform) {
        this.ID = ID;
        this.groupID = groupID;
        this.name = name;
        this.goodsType = goodsType;
        this.bigClass = bigClass;
        this.baseMat = baseMat;
        this.baseName = baseName;
        this.colorNumber = colorNumber;
        this.colorName = colorName;
        this.funcType = funcType;
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.nodeID = nodeID;
        this.crmFlow = crmFlow;
        this.subType = subType;
        this.nearWall = nearWall;
        this.roomNumber = roomNumber;
        this.erp3DCode = erp3DCode;
        this.varList = varList;
        this.transform = transform;
    }

    @Override
    public String toString() {
        return "ComposeGroup{" +
                "ID='" + ID + '\'' +
                ", groupID='" + groupID + '\'' +
                ", name='" + name + '\'' +
                ", goodsType='" + goodsType + '\'' +
                ", bigClass=" + bigClass +
                ", baseMat='" + baseMat + '\'' +
                ", baseName='" + baseName + '\'' +
                ", colorNumber='" + colorNumber + '\'' +
                ", colorName='" + colorName + '\'' +
                ", funcType='" + funcType + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", depth=" + depth +
                ", nodeID=" + nodeID +
                ", crmFlow='" + crmFlow + '\'' +
                ", subType='" + subType + '\'' +
                ", nearWall=" + nearWall +
                ", roomNumber=" + roomNumber +
                ", erp3DCode=" + erp3DCode +
                ", varList=" + varList +
                ", transform=" + transform +
                '}';
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getGroupID() {
        return groupID;
    }

    public void setGroupID(String groupID) {
        this.groupID = groupID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }

    public int getBigClass() {
        return bigClass;
    }

    public void setBigClass(int bigClass) {
        this.bigClass = bigClass;
    }

    public String getBaseMat() {
        return baseMat;
    }

    public void setBaseMat(String baseMat) {
        this.baseMat = baseMat;
    }

    public String getBaseName() {
        return baseName;
    }

    public void setBaseName(String baseName) {
        this.baseName = baseName;
    }

    public String getColorNumber() {
        return colorNumber;
    }

    public void setColorNumber(String colorNumber) {
        this.colorNumber = colorNumber;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    public String getFuncType() {
        return funcType;
    }

    public void setFuncType(String funcType) {
        this.funcType = funcType;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getDepth() {
        return depth;
    }

    public void setDepth(float depth) {
        this.depth = depth;
    }

    public int getNodeID() {
        return nodeID;
    }

    public void setNodeID(int nodeID) {
        this.nodeID = nodeID;
    }

    public String getCrmFlow() {
        return crmFlow;
    }

    public void setCrmFlow(String crmFlow) {
        this.crmFlow = crmFlow;
    }

    public String getSubType() {
        return subType;
    }

    public void setSubType(String subType) {
        this.subType = subType;
    }

    public int getNearWall() {
        return nearWall;
    }

    public void setNearWall(int nearWall) {
        this.nearWall = nearWall;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Erp3DCode getErp3DCode() {
        return erp3DCode;
    }

    public void setErp3DCode(Erp3DCode erp3DCode) {
        this.erp3DCode = erp3DCode;
    }

    public VarList getVarList() {
        return varList;
    }

    public void setVarList(VarList varList) {
        this.varList = varList;
    }

    public Transform getTransform() {
        return transform;
    }

    public void setTransform(Transform transform) {
        this.transform = transform;
    }
}
