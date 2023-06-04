import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mounth, day;
        boolean isError = false;
        String burc = "";
        Scanner inp = new Scanner(System.in);
        System.out.print("Doğduğunuz ayı giriniz: ");
        mounth = inp.nextInt();
        System.out.print("Doğduğunuz günü giriniz: ");
        day = inp.nextInt();

        if (mounth == 1) {
            if (day >= 1 && day <= 31) {
                if (day <= 21) {
                    burc = "Oğlak";
                } else {
                    burc = "Kova";
                }
            } else {
                isError = true;
            }
        }
        if (mounth == 2) {
            if (day >= 1 && day <= 28) {
                if (day < 20) {
                    burc = "Kova";
                } else {
                    burc = "Balık";
                }
            } else {
                isError = true;
            }
        }
        if (mounth == 3) {
            if (day >= 1 && day <= 31) {
                if (day < 21) {
                    burc = "Balık";
                } else {
                    burc = "Koç";
                }
            } else {
                isError = true;
            }
        }
        if (mounth == 4) {
            if (day >= 1 && day <= 30) {
                if (day < 21) {
                    burc = "Koç";
                } else {
                    burc = "Boğa";
                }
            } else {
                isError = true;
            }
        }
        if (mounth == 5) {
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    burc = "Boğa";
                } else {
                    burc = "İkizler";
                }
            } else {
                isError = true;
            }
        }
        if (mounth == 6) {
            if (day >= 1 && day <= 30) {
                if (day < 23) {
                    burc = "İkizler";
                } else {
                    burc = "Yengeç";
                }
            } else {
                isError = true;
            }
        }
        if (mounth == 7) {
            if (day >= 1 && day <= 31) {
                if (day < 23) {
                    burc = "Yengeç";
                } else {
                    burc = "Aslan";
                }
            } else {
                isError = true;
            }
        }
        if (mounth == 8) {
            if (day >= 1 && day <= 31) {
                if (day < 23) {
                    burc = "Aslan";
                } else {
                    burc = "Başak";
                }
            } else {
                isError = true;
            }
        }
        if (mounth == 9) {
            if (day >= 1 && day <= 30) {
                if (day < 23) {
                    burc = "Başak";
                } else {
                    burc = "Terazi";
                }
            } else {
                isError = true;
            }
        }
        if (mounth == 10) {
            if (day >= 1 && day <= 30) {
                if (day < 23) {
                    burc = "Terazi";
                } else {
                    burc = "Akrep";
                }
            } else {
                isError = true;
            }
        }
        if (mounth == 11) {
            if (day >= 1 && day <= 30) {
                if (day < 22) {
                    burc = "Akrep";
                } else {
                    burc = "Yay";
                }
            } else {
                isError = true;
            }

        }
        if (mounth == 12) {
            if (day >= 1 && day <= 30) {
                if (day < 22) {
                    burc = "Yay";
                } else {
                    burc = "Oğlak";
                }
            } else {
                isError = true;
            }
        }
        if (mounth > 12 || isError) {
            System.out.print("Hatalı giriş yaptınız, tekrar deneyiniz!");
        } else {
            System.out.print("Burcunuz: " + burc);
        }
    }
}