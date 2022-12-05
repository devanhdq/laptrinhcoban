package GK;

public class ItemPackage {
    String name;
    double weight;
    double price;
    Specification specification;
    Manufactor manufactor;

    Date productionDate;
    Date expireDate;

    public ItemPackage(String name, double weight, double price, Specification specification, Manufactor manufactor, Date productionDate, Date expireDate) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.specification = specification;
        this.manufactor = manufactor;
        this.productionDate = productionDate;
        this.expireDate = expireDate;
    }

    public boolean heavyMoreThan(ItemPackage that) {
        return this.weight > that.weight;
    }

    public boolean inCity(String city) {
        return this.manufactor.city.equals(city);
    }

    public double volumn() {
        return this.specification.height * this.specification.width * this.specification.length;
    }

    public boolean productionBefore(Date date) {
        return this.productionDate.before(date);
    }

    public boolean isExpire() {
        Date expireDateNow = new Date(16, 12, 2021);
        return expireDateNow.before(this.expireDate);
    }

    public double discount() {
        if (this.isExpire()) {
            return this.price * 80 / 100;
        } else if (!this.isExpire() && this.productionDate.before(new Date(1, 6, 2022))) {
            return this.price * 25 / 100;
        } else {
            return this.price * 5 / 100;
        }
    }

    public double discountPrice() {
        return this.price - this.discount();
    }


}
