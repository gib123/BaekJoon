package bronze.iii.no2884;

class AlarmTime {
    int H, M;

    public AlarmTime() {

    }

    public int getHour() {
        return H;
    }
    public int getMin() {
        return M;
    }
    public void setTime(int h, int m) {
        calcTime(h, m);
    }

    void calcTime(int h, int m) {
        H = h;
        M = m;

        if (M >= 45 && M < 60)
            M -= 45;
        else if (M < 45 && M >= 0) {
            M = 60 - (45 - M);
            H -= 1;
        }

        if (H == -1)
            H = 23;
    }
}