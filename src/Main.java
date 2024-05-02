public class Main {
    public static void main(String[] args) {

        Gafanhoto g[] = new Gafanhoto[2];

        Video v[] = new Video[3];

        Visualizacao vis [] = new Visualizacao[5];
        //vis [0] = new Visualizacao(g[0], v[2]);
        System.out.println(vis[0].toString());
        vis[0].avaliar();
        //vis[1] = new Visualizacao(g[0], v[1]);
        vis[0].avaliar(35.0f);
        System.out.println(vis[0].toString());



        System.out.println("---------GAFANHOTO---------");

        g[0] = new Gafanhoto("Jubileu", 22, "M", "Juju");
        g[1] = new Gafanhoto("Maria", 35, "F", "Mama");

        System.out.println(g[0].toString());
        System.out.println(g[1].toString());

        System.out.println("---------------------------");



        System.out.println("---------VÍDEO DO CURSO---------");

        v [0] = new Video("Aula 1 de POO");
        v [1] = new Video("Aula 12 de PHP");
        v [2] = new Video("Aula 10 de HTML5");

        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());

        System.out.println("---------------------------");


        System.out.println("---------FILME---------");

        System.out.println(vis.toString());

        System.out.println("---------------------------");



    }
}