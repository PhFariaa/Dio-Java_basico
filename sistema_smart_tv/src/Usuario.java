public class Usuario {
    public static void main(String[] args) throws Exception {
        smartTv smartTv = new smartTv();
        System.out.println("Como esta a Tv nesse momento: ");
        System.out.println("A tv esta ligada? " + smartTv.ligada);
        System.out.println("Qual o canal da Tv? " + smartTv.canal);
        System.out.println("Qual o volume? " + smartTv.volume);
        
        System.out.println("");


        smartTv.ligar();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();

        System.out.println("Novo Status da TV: ");
        System.out.println("A tv esta ligada? " + smartTv.ligada);
        System.out.println("Qual o canal da Tv? " + smartTv.canal);
        System.out.println("Qual o volume? " + smartTv.volume);
        

       
}
}
