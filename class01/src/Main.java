class Sports {
    String getName() {
        return "Generic Sports";
    }

    void getNumberOfTeamMembers() {
        System.out.println("Each team has n players in " + getName());
    }
}

class Soccer extends Sports {
    @Override
    String getName() {
        return "Soccer Class";
    }

    @Override
    void getNumberOfTeamMembers() {
        System.out.println("Each team has 11 players in " + getName());
    }
}

public class Main {
    public static void main(String[] args) {

        Sports game1 = new Sports();
        Soccer game = new Soccer();
        System.out.println("Generic Sports");
        game1.getNumberOfTeamMembers();
        System.out.println("Soccer Class");
        game.getNumberOfTeamMembers();
    }
}
