package Lesson10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DichVuBaiHat {
    public List<BaiHat> danhSachBaiHat;

    public DichVuBaiHat() {
        this.danhSachBaiHat = new ArrayList<>();
    }

    // Hàm thêm bài hát
    public String themBaiHat(BaiHat baiHat) {
        if (baiHat.getDoDai() <= 0) {
            return "Lỗi: Độ dài bài hát phải là số nguyên dương.";
        }

        danhSachBaiHat.add(baiHat);
        return "Bài hát đã được thêm vào danh sách.";
    }

    // Hàm xóa bài hát theo id
    public String xoaBaiHat(String id) {
        boolean found = false;

        for (Iterator<BaiHat> iterator = danhSachBaiHat.iterator(); iterator.hasNext();) {
            BaiHat baiHat = iterator.next();
            if (baiHat.getId().equals(id)) {
                iterator.remove();
                found = true;
                break;
            }
        }

        if (found) {
            return "Bài hát đã được xóa.";
        } else {
            return "Không tìm thấy bài hát";
        }
    }

    // Hàm in danh sách bài hát
    public void inDanhSachBaiHat() {
        if (danhSachBaiHat.isEmpty()) {
            System.out.println("Danh sách bài hát hiện đang trống.");
            return;
        }

        System.out.println("Danh sách bài hát:");
        for (BaiHat baiHat : danhSachBaiHat) {
            System.out.println(baiHat);
        }
    }


}
