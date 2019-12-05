
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int pv, int kk, int vv) {
        this.day = pv;
        this.month = kk;
        this.year = vv;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {

        if (this.year < compared.year) {
            return true;
        }
        if (this.year == compared.year && this.month < compared.month
                && this.day < compared.day) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    public int differenceInYears(MyDate comparedDate) {
        int a;
        MyDate coppier = new MyDate(this.day, this.month, this.year);
        MyDate clone = new MyDate(comparedDate.day, comparedDate.month, comparedDate.year);

        if (this.month - comparedDate.month == 0 || this.month - comparedDate.month == 1) {
            a = coppier.year - clone.year;
            if (this.day > comparedDate.day && this.year > comparedDate.year 
                    || this.day - comparedDate.day == 0 
                    || this.day < comparedDate.day && this.year < comparedDate.year) {
                return Math.abs(a);
            }else{
            
            
            return Math.abs(a) - 1;
            }
        }

        a = coppier.year - clone.year;
        return Math.abs(a) ;
    }

    /*
     * In assignment 92 method differneceInYears was added to MyDate 
     * Copy the method here since it eases this assignment considerably.
     */
}
