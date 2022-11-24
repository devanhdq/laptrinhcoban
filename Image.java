public class Image {
    int width;
    int height;
    String source;
    String quantity;

    public Image(int width, int height, String source, String quantity) {
        this.width = width;
        this.height = height;
        this.source = source;
        this.quantity = quantity;
    }


    // xác định chiều cao có lớn hơn chiều dài hay không?
    public boolean isPortrait() {
        return this.height > this.width;
    }


    //    có bao nhiêu pixels trong bức ảnh (cái này là tính diện tích =  height * width)
    public double size() {
        return this.height * this.width;
    }


    //    xác định xem 1 tấm ảnh có lớn hơn 1 tấm ảnh khác hay không (so sánh diện tích của 2 tấm ảnh)
    public boolean isLarger(Image that) {
        return this.size() > that.size();
    }

    /*
     xác định size của bức ảnh,
     - nếu mà nỏ hn 10.000 thì là "small"
     - nếu từ 10.001 -> 1.000.000. thì "medium"
     - nếu lớn hơn thì "large"
     * */
    public String sizeString() {
        if (this.size() < 10000) {
            return "small";
        } else if (this.size() > 10000 && this.size() < 1000000) {
            return "medium";
        } else {
            return "large";
        }
    }

}
