public class DatabaseAkun{
    
    private Akun[] akun;
    
    public DatabaseAkun(){
        akun = new Akun[10];
        akun[0] = new Akun(12345, 123, 100000.00);
        akun[1] = new Akun(56789, 987, 987000.500);
    }
    
    public Akun getAkun(int accountNumber)
    {
        for ( Akun i : akun )
        {
            if ( i.getNomorRek() == accountNumber )
            return i;
        }
        return null;
    }
    
    public boolean verifyAccount(int rekUser, int passUser){
        Akun akunUser = getAkun(rekUser);
        if (akunUser != null){
            return akunUser.cek(passUser);

        } else{
            return false;
        }
    }
    
    public double getSaldo(int rekUser){
        return getAkun(rekUser).getSaldo();
    }
    
    public void belanja(int rekUser, double harga){
        getAkun(rekUser).belanjaan(harga);
    }
}