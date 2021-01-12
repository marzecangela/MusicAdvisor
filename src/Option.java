public class Option {

    void printNewOption(){
        System.out.println("---NEW RELEASES---");
        System.out.println("Mountains [Sia, Diplo, Labrinth]");
        System.out.println("Runaway [Lil Peep]");
        System.out.println("The Greatest Show [Panic! At The Disco]");
        System.out.println("All Out Life [Slipknot]");
    }

    void printFeaturedOption(){
        System.out.println("---FEATURED---");
        System.out.println("Mellow Morning");
        System.out.println("Wake Up and Smell the Coffee");
        System.out.println("-Monday Motivation");
        System.out.println("Songs to Sing in the Shower");
    }

    void printCategoriesOption(){
        System.out.println("---CATEGORIES---");
        System.out.println("Top Lists");
        System.out.println("Pop");
        System.out.println("Mood");
        System.out.println("Latin");
    }

    void printPlaylistByType(String type){
        System.out.printf("---%s PLAYLISTS---\n", type.toUpperCase());
        System.out.println("Walk Like A Badass");
        System.out.println("Rage Beats");
        System.out.println("Arab Mood Booster");
        System.out.println("Sunday Stroll");
    }

    void printAuthorizeSuccess(){
        System.out.println("https://accounts.spotify.com/authorize?client_id=HereClientID&redirect_uri=https://www.example.com&response_type=code");
        System.out.println("---SUCCESS---");
    }
}
