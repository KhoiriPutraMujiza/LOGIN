import java.util.Scanner;

public class LoginKhoiri {
    public String Code[] = {"KM123","KM321","KM1432","KM7890","KM5686"};
    public String Captcha;
    public int hitung = -1;
    public LoginKhoiri(){
        String id;
        String password;
        System.out.println("SELAMAT DATANG DI KHOIRI MART");
        System.out.println("===================================================");
        System.out.println("Log in  ");
            do{
                Scanner khoir=new Scanner(System.in);
                System.out.print("Username         : ");
                id = khoir.next();
                System.out.print("Password         : ");
                password = khoir.next();
                if(id.equalsIgnoreCase("khoirimart") && password.equals("semangat123")){
                    int random = 0;
                    String k;
                    do{
                        if(random>0){
                            System.out.println("Captcha Salah !!!");
                        }
                        random++;
                        hitung ++;
                        hitung %=3;
                        System.out.println("Kode Captcha     : " + Code[hitung]);
                        System.out.print("Entry Captcha    : ");
                        Scanner KM1 = new Scanner(System.in);
                        Captcha = KM1.next();

                    }while(!Captcha.equals(Code[hitung]));


                    System.out.println("Akun Anda Berhasil Terverifikasi");
                    break;
                }else{
                    System.out.println("Coba Lagi");
                }
            }while(!id.equals("khoirimart") || !password.equals("semangat123"));  
    }
}
