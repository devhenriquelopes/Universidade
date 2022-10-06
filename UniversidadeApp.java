import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import java.util.Scanner;
public class UniversidadeApp {
    public static void main(String[] args) {
        UniversidadePolo universpolo1 = new UniversidadePolo("Jorge Amado","Centro","100");
        UniversidadeInterior universinterior1 = new UniversidadeInterior("Juazeiro","Alto Cruzeiro",125000.0f);
Scanner in=new Scanner(System.in);

        int cadastro=0;
        while(cadastro==0){
            System.out.println("digite 1 para universidade Polo, 2 Para Universidade Interior ou 3 Para sair");
                cadastro =in.nextInt();
    if (cadastro==1){
        System.out.println(universpolo1.toString());
        }
    if (cadastro==2{          System.out.println(universinterior1.toString());  } else{
            System.out.println ("Fim");
}
}

}
