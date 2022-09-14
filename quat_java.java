public class Quat {
    String thuongHieu, loai;
    float gia;
    int congSuat, capDo;

    public Quat(String thuongHieu, String loai, float gia, int congSuat){
        this.thuongHieu = thuongHieuquat;
        this.loai = loai;
        this.gia = gia;
        this.congSuat = congSuatquat;
    }


    void chuyenSo(int so){
        capDo = so;
        if(so == 0){
            System.out.println("Quat đã tat");
            System.out.println("tốc đổ của quạt đang ở: " + so);
        }
        else {
            System.out.println("Quat đang bật");
            System.out.println("tốc độ của quạt đang ở: " + so);
        }
    }
    void hienthi(){
        System.out.println("Hien thi thong so cua Quat:");
        System.out.println("Thuong hieu cua quat: " + thuongHieuquat);
        System.out.println("Loai: " + loai);
        System.out.println("Gia: " + gia + "$");
        System.out.println("Cong Suat: " + congSuatquat + "w");
    }
    void chuyenTrangThaiQuay(boolean quayNgang){
        if(quayNgang == true)
            System.out.println("Quat dang quay");
        else
            System.out.println("Quat dung yen");
    }

    public static void main(String[] args){
        Quat quatdat = new Quat("dat", "Quat Nuoc", 100f, 100);
        quatdat.hienthi();
        System.out.println("\n Hiện thị  trang thai cua Quat:");
        quatdat.chuyenSo(3);
        quatdat.chuyenTrangThaiQuay(false);
    }
}
