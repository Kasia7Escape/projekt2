package algorytmy;

import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj ilość złotych:");
        int zlote = scanner.nextInt();
        System.out.println("podaj ilość groszy");
        int grosze = scanner.nextInt();



        //ilość banknotów 200
        int dwiescie = zlote/200;
        //ilośc banknotów 100
        int sto = (zlote - dwiescie*200) / 100;
        //ilość 50tek
        int piecdziesiat = (zlote - dwiescie*200 - sto*100)/50;
        //ilosc 20tek
        int dwadziescia = (zlote -dwiescie*200 - sto*100 - piecdziesiat*50)/20;
        //ilość 10tek
        int dzisiec = (zlote -dwiescie*200 - sto*100 - piecdziesiat*50 - dwadziescia*20)/10;
        int piec = (zlote -dwiescie*200 - sto*100 - piecdziesiat*50 - dwadziescia*20 - dzisiec*10)/5;
        int dwa = (zlote -dwiescie*200 - sto*100 - piecdziesiat*50 - dwadziescia*20 - dzisiec*10 - piec*5)/2;
        int jeden = (zlote -dwiescie*200 - sto*100 - piecdziesiat*50 - dwadziescia*20 - dzisiec*10 - piec*5 - dwa*2);

        //ilość 50 groszy
        int gr50 = grosze/50;
        int gr20 = (grosze - gr50*50)/20;
        int gr10 = (grosze - gr50*50 - gr20*20)/10;
        int gr5 = (grosze - gr50*50 - gr20*20 - gr10*10)/5;
        int gr2 = (grosze - gr50*50 - gr20*20 - gr10*10 - gr5*5)/2;
        int gr1 = (grosze - gr50*50 - gr20*20 - gr10*10 - gr5*5 - gr2*2);


        System.out.println("należy wziąć: "+ dwiescie+ " banknotów 200zł, " + sto + " banknotów 100zł, " + piecdziesiat + " banknotów 50zł, "
        + dwadziescia + " banknotów 20zł, " + dzisiec + " banknotów 10zł, " + piec +" monety 5zł, " + dwa + " monety 2zł, " + jeden + " monety 1 zł, " + gr50 + " razy 50gr, "
        + gr20 + " razy 20gr, " + gr10 + " razy 10gr," + gr5 + " razy 5 gr," + gr2 + " razy 2gr," + gr1 + " razy 1grosz");

    }

}


