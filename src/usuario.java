public class usuario {
    public static void main(String[] args) throws Exception {
        
        smartTV smartTV = new smartTV();


        smartTV.dimunirVolume();
        smartTV.dimunirVolume();
        smartTV.dimunirVolume();
        smartTV.aumentarVolume();

        
        smartTV.mudarCanal(13);
        System.out.println("canal atual : "+ smartTV.canal);


        System.out.println("volume da tv : " + smartTV.volume);

        System.out.println("smart tv ligada? " + smartTV.ligada);
        System.out.println("canal atual : "+ smartTV.canal);
        System.out.println("volume da tv : " + smartTV.volume);




        smartTV.ligar();
        System.out.println("novo status : tv ligada? " + smartTV.ligada);

        smartTV.desligar();
        System.out.println("novo status : tv desligada ? " + smartTV.ligada);
    
}

    
}