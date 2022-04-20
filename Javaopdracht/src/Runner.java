public class Runner {
    public static void main(String[] args) {

        View view = new View("RekenmachineEAPB");
        Model model = new Model();
        Controller home = new Controller(view, model);
    }
}
