package zhao.demo.bomtest.model;


import java.io.Serializable;
import java.util.List;



public class SceneBOM implements Serializable {

    private int count;
    private String rooms;
    private String orderCode;
    private float bomVersion;
    private String fileCode;
    private int updateNumber;
    private List<WallData> wallList;
    private SelParts selParts;

    public SceneBOM() {
    }

    public SceneBOM(int count, String rooms, String orderCode, float bomVersion, String fileCode, int updateNumber, List<WallData> wallList, SelParts selParts) {
        this.count = count;
        this.rooms = rooms;
        this.orderCode = orderCode;
        this.bomVersion = bomVersion;
        this.fileCode = fileCode;
        this.updateNumber = updateNumber;
        this.wallList = wallList;
        this.selParts = selParts;
    }

    @Override
    public String toString() {
        return "SceneBOM{" +
                "count=" + count +
                ", rooms='" + rooms + '\'' +
                ", orderCode='" + orderCode + '\'' +
                ", bomVersion=" + bomVersion +
                ", fileCode='" + fileCode + '\'' +
                ", updateNumber=" + updateNumber +
                ", wallList=" + wallList +
                ", selParts=" + selParts +
                '}';
    }

    public String getRooms() {
        return rooms;
    }

    public void setRooms(String rooms) {
        this.rooms = rooms;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public float getBomVersion() {
        return bomVersion;
    }

    public void setBomVersion(float bomVersion) {
        this.bomVersion = bomVersion;
    }

    public String getFileCode() {
        return fileCode;
    }

    public void setFileCode(String fileCode) {
        this.fileCode = fileCode;
    }

    public int getUpdateNumber() {
        return updateNumber;
    }

    public void setUpdateNumber(int updateNumber) {
        this.updateNumber = updateNumber;
    }

    public List<WallData> getWallList() {
        return wallList;
    }

    public void setWallList(List<WallData> wallList) {
        this.wallList = wallList;
    }

    public SelParts getSelParts() {
        return selParts;
    }

    public void setSelParts(SelParts selParts) {
        this.selParts = selParts;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
