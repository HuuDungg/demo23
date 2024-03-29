package Lesson10;

public class BaiHat {
    // Các thuộc tính
    private String id;
    private String tenBH;
    private String tenCaSi;
    private int doDai;
    private String tenNhacSi;

    // Constructor mặc định
    public BaiHat() {
    }

    // Constructor có tham số
    public BaiHat(String id, String tenBH, String tenCaSi, int doDai, String tenNhacSi) {
        this.id = id;
        this.tenBH = tenBH;
        this.tenCaSi = tenCaSi;
        this.doDai = doDai;
        this.tenNhacSi = tenNhacSi;
    }

    // Getter và Setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenBH() {
        return tenBH;
    }

    public void setTenBH(String tenBH) {
        this.tenBH = tenBH;
    }

    public String getTenCaSi() {
        return tenCaSi;
    }

    public void setTenCaSi(String tenCaSi) {
        this.tenCaSi = tenCaSi;
    }

    public int getDoDai() {
        return doDai;
    }

    public void setDoDai(int doDai) {
        this.doDai = doDai;
    }

    public String getTenNhacSi() {
        return tenNhacSi;
    }

    public void setTenNhacSi(String tenNhacSi) {
        this.tenNhacSi = tenNhacSi;
    }

    // Phương thức toString để hiển thị thông tin của bài hát
    @Override
    public String toString() {
        return "BaiHat{" +
                "id='" + id + '\'' +
                ", tenBH='" + tenBH + '\'' +
                ", tenCaSi='" + tenCaSi + '\'' +
                ", doDai=" + doDai +
                ", tenNhacSi='" + tenNhacSi + '\'' +
                '}';
    }
}

