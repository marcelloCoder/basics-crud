package pacotecomplemento.primeirojava_5bcc;

import java.util.Calendar;

import static java.lang.Character.digit;


public class Pessoa{
    //Atributos
    private String nome;
    private int diaNasc, mesNasc, anoNasc;
    private String cpf;

    //Métodos get e set
    public String getNome() {
        return nome;
    }

    public void setNome(String novoNome) {
        nome = novoNome;
    }
    
    public String getDataNasc(){
        return (diaNasc<10? "0": "") + diaNasc + "/" + 
               (mesNasc<10? "0": "") + mesNasc + "/" + 
               anoNasc;
    }
    
    public void setDataNasc(int dn, int mn, int an){
        diaNasc = dn;
        mesNasc = mn;
        anoNasc = an;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    //Métodos auxiliares
    private int calculaIdade(){
        int id, da, ma, aa;
        
        Calendar hoje = Calendar.getInstance();
        
        da = hoje.get(Calendar.DAY_OF_MONTH);
        ma = hoje.get(Calendar.MONTH + 1);
        aa = hoje.get(Calendar.YEAR);
        
        id = aa - anoNasc;
        if (ma < mesNasc) id--;
        else if((ma == mesNasc) && (da < diaNasc)) id--;
        
        return id;
    }
    
    private int calculaIdade2(){
        int id, da, aa, dn;
        
        Calendar data = Calendar.getInstance();
        da = data.get(Calendar.DAY_OF_YEAR);
        aa = data.get(Calendar.YEAR);
        data.set(anoNasc, mesNasc-1, diaNasc);
        dn = data.get(Calendar.DAY_OF_YEAR);
        
        id = aa - anoNasc;
        if(da > dn) id--;
        
        return id;
    }
    
    public int getIdade(){
        return calculaIdade();
    }
    
    private static boolean algumNaoNumerico(String cpf){
        String digitos = "0123456789";
        
        for(int i=0; i<cpf.length(); i++)
            if(digitos.indexOf(cpf.charAt(i)) == -1)
                return true;
        
        return false;
    }
    
    private static boolean digitosIguais(String cpf){
        char[] charCpf = cpf.toCharArray();
        for(int i = 1; i < cpf.length(); i++)
            if(charCpf[i] != charCpf[0])
                return false;
        return true;
    }
    
    public static int validaCpf(String cpf){
        int i;
        int soma = 0;
        int resto = 0;
        int digitoGerado1, digitoGerado2;
        char[] charCpf;
        
        if(cpf.length() != 11) return 1;
        else if(algumNaoNumerico(cpf)) return 2;
        else if(digitosIguais(cpf)) return 3;
        else{
            charCpf = cpf.toCharArray();
            //Gerando o primeiro dígito verificador
            for(i = 0; i < cpf.length()-2; i++)
                soma += digit(charCpf[i], 10)*(10-i);
            resto = soma%11;
            if(resto<2) digitoGerado1 = 0;
            else digitoGerado1 = 11 - resto;
            //Gerando o segundo dígito verificador;
            soma = 0;
            for(i = 0; i < cpf.length()-2; i++)
                soma += digit(charCpf[i], 10) * (11-i);
            soma += digitoGerado1*2;
            resto = soma%11;
            if(resto<2) digitoGerado2 = 0;
            else digitoGerado2 = 11 - resto;
            //Verificando se os dígitos gerados batem
            if((digit(charCpf[9], 10) != digitoGerado1) ||
               (digit(charCpf[10], 10) != digitoGerado2))
                return 4;
        }//Fim do else checagem dos dígitos verificadores
        return 0;
    } //Fim validaCpf
    
} //Fim classe Pessoa

