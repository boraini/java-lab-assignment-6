package labassignment5;

class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String toString() {
        return String.format("<Date: %d/%d/%d", day, month, year);
    }

    public boolean equals(Object o) {
        if (o instanceof Date other) return this == other || day == other.day && month == other.month && year == other.year;
        else return false;
    }
 }
