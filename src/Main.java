public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Menu menu=new Menu();
        boolean bandera=true;
        Logica logica=new Logica();
        while (bandera){
            int opciones= menu.menu();

            switch (opciones){
                case 1:

                    logica.añadir();
                    break;

                case 2:
                    logica.buscar();
                    break;
                case 3:
                    logica.mayor();
                    break;
                case 4:
                    logica.menor();
            }
        }

    }
}