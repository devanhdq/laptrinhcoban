public class MovieTheater {


    //giá vé, giá thu của mỗi 1 khách hàng
    double giaVe;


    // giá cố định rạp phải trả - tạm hiểu là tiền tổ chức
    double chiPhiCoDinh;

    // ngoài sô tiền tổ chức cố dịnh mà rạp phải trả thì với mỗi khách rạp phải trả thêm số tiền nào đó
    double chiPhiCongThemChoMoiKhach;


    public MovieTheater(double giaVe, double chiPhiCoDinh, double chiPhiCongThemChoMoiKhach) {
        this.giaVe = giaVe;
        this.chiPhiCoDinh = chiPhiCoDinh;
        this.chiPhiCongThemChoMoiKhach = chiPhiCongThemChoMoiKhach;
    }

    public double totalProfit(int customerSize) {
//        tổng lợi nhuận =  tông thu - chi phí tổ chức,
//        chi phí tổ chức = chi phí cố định  + chi phí phát sinh khi có thêm khách
        double totalPrice = customerSize * this.giaVe;
        double chiPhiToChuc = this.chiPhiCoDinh + (customerSize * chiPhiCongThemChoMoiKhach);
        return totalPrice - chiPhiToChuc;
    }
}
