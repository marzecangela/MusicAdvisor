import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Option option = new Option();
        boolean isNotBye = true;
        boolean isAuthorized = false;
        while (isNotBye) {
            String userOption = scanner.next();
            if (userOption.equals("auth") || isAuthorized || userOption.equals("exit")) {
                switch (userOption) {
                    case "new":
                        option.printNewOption();
                        break;
                    case "featured":
                        option.printFeaturedOption();
                        break;
                    case "categories":
                        option.printCategoriesOption();
                        break;
                    case "playlists":
                        String type = scanner.next();
                        option.printPlaylistByType(type);
                        break;
                    case "auth":
                        isAuthorized = true;
                        option.printAuthorizeSuccess();
                        break;
                    case "exit":
                        System.out.println("---GOODBYE!---");
                        isNotBye = false;
                        break;
                }
            } else {
                System.out.println("Please, provide access for application.");
            }
        }

    }
}
