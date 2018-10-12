package zhao.demo.bomtest.model;

import java.io.Serializable;

public class Transform implements Serializable {
    private float width;
    private float length;
    private float height;
    private float ax;
    private float ay;
    private float az;
    private float x;
    private float y;
    private float z;

    public Transform() {
    }

    public Transform(float width, float length, float height, float ax, float ay, float az, float x, float y, float z) {
        this.width = width;
        this.length = length;
        this.height = height;
        this.ax = ax;
        this.ay = ay;
        this.az = az;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "Transform{" +
                "width=" + width +
                ", length=" + length +
                ", height=" + height +
                ", ax=" + ax +
                ", ay=" + ay +
                ", az=" + az +
                ", x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getAx() {
        return ax;
    }

    public void setAx(float ax) {
        this.ax = ax;
    }

    public float getAy() {
        return ay;
    }

    public void setAy(float ay) {
        this.ay = ay;
    }

    public float getAz() {
        return az;
    }

    public void setAz(float az) {
        this.az = az;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
}
