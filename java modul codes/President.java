package uz.pdp.extratasksforrepublic;

public class President extends  Person{
    private  int yearActive;
//1981-yilda ish faoliyatini boshlagan;
    public void PrintJob(){
        System.out.println("Hokim vazifasini bajargan, Bosh vazir lavozimida ham ishlagan!");
    }


    public President() {
    }

    public President(int yearActive) {
        this.yearActive = yearActive;
    }

    public int getYearActive() {
        return yearActive;
    }

    public void setYearActive(int yearActive) {
        this.yearActive = yearActive;
    }
}
