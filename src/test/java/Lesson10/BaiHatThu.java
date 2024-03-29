package Lesson10;

import org.junit.jupiter.api.Assertions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class BaiHatThu {
    DichVuBaiHat dichVuBaiHat = new DichVuBaiHat();
    @BeforeMethod
    public void beforeTest(){
        List<BaiHat> list = dichVuBaiHat.danhSachBaiHat;
        list.add(new BaiHat("1", "Em gái mưa", "Hương Tràm", 74, "Khắc Hưng"));
        list.add(new BaiHat("2", "Em gái nắng", "Nhan Tràm", 48, "Đục Hưng"));
        list.add(new BaiHat("3", "Em gái nồm", "Hương thơm", 4797, "Đả Hưng"));
    }
    //them thanh cong
    @Test
    public void test01(){
        BaiHat baiHat1 = new BaiHat("BH001", "Em gái mưa", "Hương Tràm", 4, "Khắc Hưng");
        Assertions.assertEquals(dichVuBaiHat.themBaiHat(baiHat1), "Bài hát đã được thêm vào danh sách.");
    }

    //them 0 thanh cong
    @Test
    public void test0tr1(){
        BaiHat baiHat1 = new BaiHat("BH002", "Em gái mưa", "Hương Tràm", -4, "Khắc Hưng");
        Assertions.assertEquals(dichVuBaiHat.themBaiHat(baiHat1), "Lỗi: Độ dài bài hát phải là số nguyên dương.");
    }

    //xoa thanh cong
    @Test
    public void test0trr1(){
        Assertions.assertEquals(dichVuBaiHat.xoaBaiHat("1"), "Bài hát đã được xóa.");
    }

    //xoa 0 thanh cong
    @Test
    public void test0hfghtrr1(){
        Assertions.assertEquals(dichVuBaiHat.xoaBaiHat("retydhd1"), "Không tìm thấy bài hát");
    }


    @AfterMethod
    public void afterTest(){
        dichVuBaiHat.inDanhSachBaiHat();
    }
}
