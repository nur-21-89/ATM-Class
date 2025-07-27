package UcuncuHafta;

public class ATM {
    private String usingName;
    private String accountNumber;
    private String password;
    private double bakiye;

    public ATM (String usingName, String accountNumber, String password,double bakiye){
        this.usingName = usingName;
        this.accountNumber = accountNumber;
        this.password = password;
        this.bakiye =bakiye;
    }
    public String getUsingName() {
        return usingName;
    }

    public String setUsingName(String usingName) {
        this.usingName = usingName;
        return usingName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    public void paraYatirma(double yatirilacakMiktar){
        bakiye += yatirilacakMiktar;
    }

    public void paraCekme (double cekilecekMiktar){
        if(this.bakiye < cekilecekMiktar){
            System.out.println("Para Çekimi İçin Yetersiz Bakiye!");
        }else {
            bakiye -= cekilecekMiktar;
        }
    }
    void printInfo (){
       System.out.println("İsminiz: "+this.usingName);
       System.out.println("Hesap Numaranız:"+this.accountNumber);
       System.out.println("Şifreniz:"+this.password);
       System.out.println("Bakiyeniz: "+this.bakiye);
   }
}



