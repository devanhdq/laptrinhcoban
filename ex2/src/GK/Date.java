package GK;

public class Date {
    int date;
    int month;
    int year;

    public Date(int date, int month, int year) {
        this.date = date;
        this.month = month;
        this.year = year;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return date + " - " + month + " - " + year;
    }

    public boolean before(Date that) {
        if (that.year < this.year) {
            return true;
        } else if (that.year == this.year && that.month < this.month) {
            return true;
        } else if (that.year == this.year && that.month == this.month && that.date < this.date) {
            return true;
        } else {
            return false;
        }
    }
}
