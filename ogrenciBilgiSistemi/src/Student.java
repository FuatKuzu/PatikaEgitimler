public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat,int sozluMat,int fizik,int sozluFizik,int kimya,int sozluKimya) {

        if ((mat >= 0 && mat <= 100)||(sozluMat>=0&&sozluMat<=100)) {
            this.mat.note = mat;
            this.mat.sozluNote=sozluMat;
        }

        if ((fizik >= 0 && fizik <= 100)||(sozluFizik>=0&&sozluFizik<=100)) {
            this.fizik.note = fizik;
            this.fizik.sozluNote=sozluFizik;
        }

        if ((kimya >= 0 && kimya <= 100)||(sozluKimya>=0&&sozluKimya<=100)) {
            this.kimya.note = kimya;
            this.kimya.sozluNote=sozluKimya;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = ((this.fizik.note*this.fizik.notePercent)+ (this.fizik.sozluNote*this.fizik.sozluPercent))
                + ((this.kimya.note*this.kimya.notePercent)+(this.kimya.sozluNote*this.kimya.sozluPercent))
                + ((this.mat.note*this.mat.notePercent)+(this.mat.sozluNote*this.mat.sozluPercent)) / 3.0;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Matematik Sözlü Notu : " + this.mat.sozluNote);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Fizik Sözlü Notu : " + this.fizik.sozluNote);
        System.out.println("Kimya Notu : " + this.kimya.note);
        System.out.println("Kimya Sözlü Notu : " + this.kimya.sozluNote);
    }

}